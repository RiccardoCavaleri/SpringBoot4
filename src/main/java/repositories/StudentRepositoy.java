package repositories;

import com.example.demo_2.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoy extends JpaRepository<Student, Long> {
}
