package com.fitFusion.springbootlibrary.controller;

import com.fitFusion.springbootlibrary.entity.FitnessClass;
import com.fitFusion.springbootlibrary.service.FitnessClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fitnessClasses")
public class FitnessClassController {

    @Autowired
    private FitnessClassService fitnessClassService;

    @GetMapping("/sorted")
    public List<FitnessClass> getSortedFitnessClasses() {
        return fitnessClassService.getSortedFitnessClasses();
    }
}