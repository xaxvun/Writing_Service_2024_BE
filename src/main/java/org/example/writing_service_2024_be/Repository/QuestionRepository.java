package org.example.writing_service_2024_be.Repository;

import org.example.writing_service_2024_be.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    // 필요한 경우 커스텀 쿼리 메소드 추가 예정
    List<Question> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);
}
