package com.example.aibg_app.service;

import com.example.aibg_app.domain.Assignment;
import com.example.aibg_app.domain.User;

import java.util.List;

public interface AssignmentService {
    List<Assignment> getAllAssignment();

    Assignment getAssignmentById(Long id);

    Assignment saveAssignment(Assignment assignment);

    void deleteAssignment(Long id);
}
