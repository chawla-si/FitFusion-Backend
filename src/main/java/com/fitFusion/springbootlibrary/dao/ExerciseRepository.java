package com.fitFusion.springbootlibrary.dao;

import com.fitFusion.springbootlibrary.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
}
