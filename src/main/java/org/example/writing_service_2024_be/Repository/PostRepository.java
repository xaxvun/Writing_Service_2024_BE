package org.example.writing_service_2024_be.Repository;

import org.example.writing_service_2024_be.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // 필요한 경우 커스텀 쿼리 메소드 추가 예정
}