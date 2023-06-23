package Day12;

import CourseDay11.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class RestaurantDatabaseDao
        implements DaoInterface<Restaurant, Integer>{

    @Override
    public void createNew(Restaurant newRestaurant) {
        try(
                Connection conn = JdbcUtils.buildConnection();
        ){
            String sqlQuery =
                    "insert into restaurant_master(rest_tid, rest_name, rest_cuisine, rest_branches) values(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
            int id = newRestaurant.getRestaurantId();
            String name = newRestaurant.getName();
            String cuisine = newRestaurant.getCuisine();
            int branches = newRestaurant.getBranchCount();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, cuisine);
            pstmt.setInt(4, branches);
            int count = pstmt.executeUpdate();
            System.out.println(count + " record added.");
        }

        catch(Exception ex) {
            ex.printStackTrace();
        }



    }

    @Override
    public Collection<Restaurant> getAll() {
        Collection<Restaurant> allRestaurants = new ArrayList<>();
        try(
                Connection conn = JdbcUtils.buildConnection();
        ){
            Statement stmt = conn.createStatement();

            String sqlQuery =
                    "select rest_tid, rest_name, rest_cuisine, rest_branches from restaurant_master";
            ResultSet rs = 	stmt.executeQuery(sqlQuery);

            while(rs.next()) {
                int restId = rs.getInt(1);
                String restName = rs.getString(2);
                String restCuisine = rs.getString(3);
                int restBranches = rs.getInt(4);

                Restaurant currentRestaurant =
                        new Restaurant(restId, restName, restCuisine, restBranches);
                allRestaurants.add(currentRestaurant);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        return allRestaurants;
    }

    @Override
    public Restaurant getOneById(Integer id) {
        // TODO Auto-generated method stub
        Restaurant foundRestaurant = null;
        try(
                Connection conn = JdbcUtils.buildConnection();
        ){
            String sqlQuery =
                    "select * from restaurant_master where rest_tid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
            pstmt.setInt(1, id);
            ResultSet rs = 	pstmt.executeQuery();
            if(rs.next()) {//If record is found
                int restId = rs.getInt(1);
                String restName = rs.getString(4);
                String restCuisine = rs.getString(3);
                int restBranches = rs.getInt(2);
                foundRestaurant =
                        new Restaurant(restId, restName, restCuisine, restBranches);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return foundRestaurant;
    }

    @Override
    public void update(Restaurant modifiedRestaurant) {
        try(
                Connection conn = JdbcUtils.buildConnection();
        ){
            String sqlQuery =
                    "update restaurant_master set rest_name=?,rest_cuisine=?,rest_branches=? where rest_tid=?";
            PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
            String name = modifiedRestaurant.getName();
            String cuisine = modifiedRestaurant.getCuisine();
            int brCount = modifiedRestaurant.getBranchCount();
            int id = modifiedRestaurant.getRestaurantId();

            pstmt.setString(1, name);
            pstmt.setString(2, cuisine);
            pstmt.setInt(3, brCount);
            pstmt.setInt(4, id);

            int updateCount = pstmt.executeUpdate();
            System.out.println(updateCount + " record updated");
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
                    "delete from restaurant_master where rest_tid=?";
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
