package com.example.flyway.entity;

import javax.persistence.*;


@Entity
@Table(name = "t_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String password;
}
