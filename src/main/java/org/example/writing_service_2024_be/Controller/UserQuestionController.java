package org.example.writing_service_2024_be.Controller;

import org.example.writing_service_2024_be.domain.UserQuestion;
import org.example.writing_service_2024_be.Service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-questions")
public class UserQuestionController {

    @Autowired
    private UserQuestionService userQuestionService;

    @PostMapping("/select")
    public ResponseEntity<UserQuestion> selectQuestion(@RequestBody UserQuestion userQuestion) {
        if (userQuestionService.hasUserSelectedQuestion(userQuestion.getUser(), userQuestion.getQuestion())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(userQuestionService.selectQuestion(userQuestion));
    }

    @GetMapping("/{userQuestionId}")
    public ResponseEntity<UserQuestion> getUserQuestionById(@PathVariable Long userQuestionId) {
        return userQuestionService.getUserQuestionById(userQuestionId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<UserQuestion>> getAllUserQuestions() {
        return ResponseEntity.ok(userQuestionService.getAllUserQuestions());
    }

    @DeleteMapping("/{userQuestionId}")
    public ResponseEntity<Void> deleteUserQuestion(@PathVariable Long userQuestionId) {
        userQuestionService.deleteUserQuestion(userQuestionId);
        return ResponseEntity.noContent().build();
    }
}
