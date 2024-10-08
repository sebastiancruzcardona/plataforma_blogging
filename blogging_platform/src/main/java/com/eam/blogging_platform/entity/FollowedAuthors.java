package com.eam.blogging_platform.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "followed_authors")
public class FollowedAuthors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "follower_id")
    private User follower;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    public FollowedAuthors() {
        super();
    }

    public FollowedAuthors(long id, LocalDate creationDate, User user, User author) {
        this.id = id;
        this.creationDate = creationDate;
        this.follower = user;
        this.author = author;
    }

    public FollowedAuthors(LocalDate creationDate, User user, User author) {
        this.creationDate = creationDate;
        this.follower = user;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
