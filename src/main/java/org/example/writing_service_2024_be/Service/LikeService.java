package org.example.writing_service_2024_be.Service;

import org.example.writing_service_2024_be.domain.Like;
import org.example.writing_service_2024_be.Repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public Like addLike(Like like) {
        return likeRepository.save(like);
    }

    public Optional<Like> getLikeById(Long likeId) {
        return likeRepository.findById(likeId);
    }

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    public void deleteLike(Long likeId) {
        likeRepository.deleteById(likeId);
    }
}
