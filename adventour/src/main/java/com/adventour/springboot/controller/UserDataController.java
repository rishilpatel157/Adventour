package com.adventour.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adventour.springboot.exception.ResourceNotFoundException;
import com.adventour.springboot.model.UserEntity;
import com.adventour.springboot.repository.UserDataRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class UserDataController {


	@Autowired
	UserDataRepository userDataRepository;
	
	@GetMapping("/userdata")
	public List<UserEntity> getAllData()
	{
		return userDataRepository.findAll();
	}
	
	
	
	@PostMapping("/userdata")
	public UserEntity createUserData(@RequestBody UserEntity userEntity){
		return userDataRepository.save(userEntity);
	}
	
	@GetMapping("/userdata/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable long id) throws ResourceNotFoundException {
		  UserEntity userId =  userDataRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User ID is not Exist"));
	      
		  return ResponseEntity.ok(userId);
	}
	
	@PutMapping("/userdata/{id}")
	public ResponseEntity<UserEntity>  updateUserById(@PathVariable Long id,@RequestBody UserEntity userEntity) throws ResourceNotFoundException
	{
	  UserEntity  userId = userDataRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User ID is not Exist"));
		
		userId.setCustomerName(userEntity.getCustomerName());
		userId.setCustomerNumber(userEntity.getCustomerNumber());
		userId.setCustomerEmail(userEntity.getCustomerEmail());
		userId.setAdultsCount(userEntity.getAdultsCount());
		userId.setChildCount(userEntity.getChildCount());
		userId.setTourTitle(userEntity.getTourTitle());
		
	       UserEntity updatedUser =	userDataRepository.save(userId);
		
	     return  ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("/userdata/{id}")
	public ResponseEntity<Map<String,Boolean>>  deleteUserData(@PathVariable Long id) throws ResourceNotFoundException{
		
	 UserEntity deleteData =  userDataRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User ID id not Found"));
		
	 userDataRepository.delete(deleteData);
	 
	 Map<String,Boolean> response = new HashMap<>();
		
		response.put("Deleted",Boolean.TRUE);
		
		return ResponseEntity.ok(response);
	}
	
}
