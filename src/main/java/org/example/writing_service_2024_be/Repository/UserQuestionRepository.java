package org.example.writing_service_2024_be.Repository;

import org.example.writing_service_2024_be.domain.UserQuestion;
import org.example.writing_service_2024_be.domain.User;
import org.example.writing_service_2024_be.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuestionRepository extends JpaRepository<UserQuestion, Long> {
    boolean existsByUserAndQuestion(User user, Question question);
}
