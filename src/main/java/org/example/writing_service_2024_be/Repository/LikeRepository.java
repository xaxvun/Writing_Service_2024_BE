package org.example.writing_service_2024_be.Repository;

import org.example.writing_service_2024_be.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    // 필요한 경우 커스텀 쿼리 메소드 추가 예정
}