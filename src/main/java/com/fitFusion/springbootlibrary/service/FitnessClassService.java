package com.fitFusion.springbootlibrary.service;

import com.fitFusion.springbootlibrary.dao.FitnessClassRepository;
import com.fitFusion.springbootlibrary.entity.FitnessClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessClassService {

    @Autowired
    private FitnessClassRepository fitnessClassRepository;

    // Method to get sorted fitness classes
    public List<FitnessClass> getSortedFitnessClasses() {
        // Specify the sorting order (in this case, by class name in ascending order)
        Sort sort = Sort.by(Sort.Direction.ASC, "className");

        // Retrieve sorted fitness classes from the repository
        return fitnessClassRepository.findAll(sort);
    }
}