package CourseDay12;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class CourseDatabaseDao implements DaoInterface<Course,Integer> {



        @Override
        public void createNew(Course newCourse) {
            try(
                    Connection conn = JdbcUtils.buildConnection();
            ){
                String sqlQuery =
                        "insert into course_master(course_id,course_title,course_duration,course_provider,course_cost) values(?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                int id = newCourse.getCourseId();
                String name = newCourse.getTitle();
                int durat = newCourse.getDuration();
                double costt = newCourse.getCost();
                String provider=newCourse.getProvider();

                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, durat);
                pstmt.setDouble(5, costt);
                pstmt.setString(4,provider);
                int count = pstmt.executeUpdate();
                System.out.println(count + " record added.");
            }

            catch(Exception ex) {
                ex.printStackTrace();
            }
        }

    @Override
        public Collection<Course> getAll() {
            Collection<Course> allCourses = new ArrayList<>();
            try(
                    Connection conn = JdbcUtils.buildConnection();
            ){
                Statement stmt = conn.createStatement();

                String sqlQuery =
                        "select course_id,course_title,course_duration,course_cost,course_provider from course_master";
                ResultSet rs = 	stmt.executeQuery(sqlQuery);

                while(rs.next()) {
                    int cId = rs.getInt(1);
                    String cName = rs.getString(2);
                    int durat=rs.getInt(3);
                    double costt = rs.getDouble(4);
                    String provider = rs.getString(5);



                    Course currentCourse =
                            new Course(cId,cName,durat, provider, costt);
                    allCourses.add(currentCourse);
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }

            return allCourses;
        }

        @Override
        public Course getOneById(Integer id) {
            // TODO Auto-generated method stub
            Course foundCourse = null;
            try(
                    Connection conn = JdbcUtils.buildConnection();
            ){
                String sqlQuery =
                        "select * from course_master where course_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                pstmt.setInt(1, id);
                ResultSet rs = 	pstmt.executeQuery();
                if(rs.next()) {//If record is found
                    int cId = rs.getInt(1);
                    String cName = rs.getString(2);
                    String provider = rs.getString(4);
                    int duration = rs.getInt(3);
                    double costt=rs.getDouble(5);
                    foundCourse =
                            new Course(cId,cName,duration,provider,costt);
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
            return foundCourse;
        }



    @Override
        public void update(Course modifiedCourse) {
            try(
                    Connection conn = JdbcUtils.buildConnection();
            ){
                String sqlQuery =
                        "update course_master set course_provider=?,course_duration=? where course_id=?";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                //String name = modifiedCourse.getTitle();
                String provider= modifiedCourse.getProvider();
                int duration = modifiedCourse.getDuration();


                //pstmt.setString(1, name);
                pstmt.setString(1, provider);
                pstmt.setInt(2, duration);

                //int updateCount = pstmt.executeUpdate();
                //System.out.println(updateCount + " record updated");
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }


        }

        @Override
        public void deleteById(Integer id) {
            try(
                    Connection conn = JdbcUtils.buildConnection();
            ){
                String sqlQuery =
                        "delete from course_master where course_id=?";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                pstmt.setInt(1, id);
                int deleteCount = pstmt.executeUpdate();
                System.out.println(deleteCount + " record deleted");
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }

        }
}
