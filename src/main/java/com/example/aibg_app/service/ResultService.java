package com.example.aibg_app.service;

import com.example.aibg_app.domain.Result;

import java.util.List;

public interface ResultService {
    List<Result> getAllResults();

    Result getResultById(Long id);

    Result saveResult(Result result);

    void deleteResult(Long id);
}
