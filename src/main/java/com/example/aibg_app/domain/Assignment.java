package com.example.aibg_app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int a;
    private int b;
    private int c;
    private int d;

    private int trueResult;

    @OneToMany(mappedBy = "assignment")
    private List<Result> results;
}
