package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ReceiverService;
import com.example.demo.service.dto.ReceiverDTO;

@RestController
@RequestMapping("/api")
public class ReceiverRest {

	@Autowired
	private ReceiverService receiverService;
	@GetMapping("/filtering")
	public ResponseEntity<MappingJacksonValue> retrieveSomeBean() {
		return new ResponseEntity<>(receiverService.retrieveSomeBean(),HttpStatus.OK);
	}
	
	
	@GetMapping("/get-all")
	public ResponseEntity<List<ReceiverDTO>> getAllReceiver(){
		return new ResponseEntity<> (receiverService.getAllReceiver(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<ReceiverDTO> save(@Valid @RequestBody ReceiverDTO receiverDTO){
		return new ResponseEntity<>(receiverService.save(receiverDTO),HttpStatus.CREATED);
	}
	
	@GetMapping("/get-greeting")
	public ResponseEntity<String> getGreeting(){
		return new ResponseEntity<> (receiverService.getGreeting(),HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<ReceiverDTO>> getAll(){
		return new ResponseEntity<> (receiverService.getAllReceiver(),HttpStatus.OK);
	}
	
}
