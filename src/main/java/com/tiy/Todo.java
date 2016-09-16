package com.tiy;

import javax.persistence.*;

/**
 * Created by jfabiano on 9/15/2016.
 */
@Entity//the Game class is an entity connected to the games name value in the DB
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue
    int id;//identity/serial

    @ManyToOne//(optional== false) is a 1 to many relationship
            User user;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    boolean isDone = false;

//    @Column(nullable = false)
//    String platform;
//
//    @Column(nullable = false)
//    String genre;
//
//    @Column(nullable = false)
//    int releaseYear;

    public Todo() {
    }

    public Todo(String name, User user) {
        this.name = name;
        this.user = user;
        //this.isDone = isDone;
//        this.platform = platform;
//        this.genre = genre;
//        this.releaseYear = releaseYear;

    }

    public Todo(String name, User user, boolean isDone) {
        this.name = name;
        this.user = user;
        this.isDone = isDone;
//        this.platform = platform;
//        this.genre = genre;
//        this.releaseYear = releaseYear;

    }
}

