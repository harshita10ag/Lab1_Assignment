package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Trainee;

public interface TraineeJPARepository extends JpaRepository<Trainee,Long> {

}
