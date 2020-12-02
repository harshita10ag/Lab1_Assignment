package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trainee;
import com.example.demo.repository.TraineeJPARepository;

@RestController
@RequestMapping("/api/vi/trainee")
public class TraineeController {
	@Autowired
	private TraineeJPARepository traineeRepo;
	@GetMapping
	public List<Trainee> list(){
		return traineeRepo.findAll();
		
	}
	
	@GetMapping
	@RequestMapping("{traineeId}")
	public Trainee get(@PathVariable Long traineeId) {
		return traineeRepo.getOne(traineeId);
		
	}
	@PostMapping
	public Trainee create(@RequestBody final Trainee trainee) {
		return traineeRepo.saveAndFlush(trainee);
	}
//	@GetMapping
//	@RequestMapping("{traineeName}")
//	public Trainee get(@PathVariable String traineeName) {
//		return traineeRepo.getOne(traineeName);
//	}
	@RequestMapping(value = "{traineeId}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long traineeId) {
		 traineeRepo.deleteById(traineeId);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public Trainee update(@PathVariable Long id, @RequestBody Trainee trainee) {
		Trainee existTrainee=traineeRepo.getOne(id);
		BeanUtils.copyProperties(trainee, existTrainee,"traineeId");
		return traineeRepo.saveAndFlush(existTrainee);
	}

}
