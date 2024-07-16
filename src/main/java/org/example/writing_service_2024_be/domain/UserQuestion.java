package org.example.writing_service_2024_be.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Question_id")
    private Long userQuestionId;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Question_id", nullable = false)
    private Question question;

    @Column(name = "Selected_at")
    private LocalDateTime selectedAt;



    public Long getUserQuestionId() {
        return userQuestionId;
    }

    public void setUserQuestionId(Long userQuestionId) {
        this.userQuestionId = userQuestionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public LocalDateTime getSelectedAt() {
        return selectedAt;
    }

    public void setSelectedAt(LocalDateTime selectedAt) {
        this.selectedAt = selectedAt;
    }
}

