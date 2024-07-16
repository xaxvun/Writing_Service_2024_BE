package org.example.writing_service_2024_be.Service;

import org.example.writing_service_2024_be.domain.User;
import org.example.writing_service_2024_be.domain.Question;
import org.example.writing_service_2024_be.domain.UserQuestion;
import org.example.writing_service_2024_be.Repository.UserQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserQuestionService {

    @Autowired
    private UserQuestionRepository userQuestionRepository;

    public UserQuestion selectQuestion(UserQuestion userQuestion) {
        userQuestion.setSelectedAt(LocalDateTime.now());
        return userQuestionRepository.save(userQuestion);
    }

    public boolean hasUserSelectedQuestion(User user, Question question) {
        return userQuestionRepository.existsByUserAndQuestion(user, question);
    }

    public Optional<UserQuestion> getUserQuestionById(Long userQuestionId) {
        return userQuestionRepository.findById(userQuestionId);
    }

    public List<UserQuestion> getAllUserQuestions() {
        return userQuestionRepository.findAll();
    }

    public void deleteUserQuestion(Long userQuestionId) {
        userQuestionRepository.deleteById(userQuestionId);
    }
}
