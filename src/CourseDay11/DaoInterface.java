package CourseDay11;
import java.util.Collection;

public interface DaoInterface <T, K> {
    void creatNew(T t);
    Collection<T> getAll();
    T getOneById(K id);
    void update(T t);
    void deleteById(K id);
}
