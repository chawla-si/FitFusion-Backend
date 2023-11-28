package com.fitFusion.springbootlibrary.dao;

import com.fitFusion.springbootlibrary.entity.FitnessClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessClassRepository extends JpaRepository<FitnessClass, Long> {
}
