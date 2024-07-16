package org.example.writing_service_2024_be.domain;
import jakarta.persistence.*;


public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Like_id")
    private Long likeId;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Post_id", nullable = false)
    private Post post;

    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}