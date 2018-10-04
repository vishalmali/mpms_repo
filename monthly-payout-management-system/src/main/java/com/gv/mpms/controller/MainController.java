package com.gv.mpms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gv.mpms.request.MainRequest;
import com.gv.mpms.response.MainReponse;

@RestController
public class MainController {

	@GetMapping("/hello")
	public ResponseEntity<MainReponse> getResponse(RequestEntity<MainRequest> requestEntity) {
		
		/*if(requestEntity.getBody().getMessage().equalsIgnoreCase("hello")) {
			return new ResponseEntity<MainReponse>(new MainReponse("Hi"), HttpStatus.OK);
		}*/
		
		return new ResponseEntity<MainReponse>(new MainReponse("hello"), HttpStatus.OK);
	}
}
