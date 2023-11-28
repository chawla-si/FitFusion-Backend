package com.fitFusion.springbootlibrary.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fitness_class")
@Data
public class FitnessClass implements Comparable<FitnessClass> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "trainer_id")
    private Long trainerId;

    @Column(name = "schedule_id")
    private Long scheduleId;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Override
    public int compareTo(FitnessClass other) {
        return this.className.compareTo(other.getClassName());
    }
}
