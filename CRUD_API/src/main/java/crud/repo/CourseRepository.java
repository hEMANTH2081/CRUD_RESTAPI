package crud.repo;
 
import java.io.Serializable;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import crud.binding.Course;
 
public interface CourseRepository extends JpaRepository<Course, Serializable> {
 
}
