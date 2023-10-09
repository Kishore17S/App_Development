package kishore.demo.repository;

import kishore.demo.entity.feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface feedbackrepo extends JpaRepository<feedback,Integer> {
}
