package com.programes.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RestController {

	// Duetz Bank

	@GetMapping(value = "/V1", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getMethodName(@RequestParam String param) {
		System.out.println(param);
		Map<String, Object> resMap = new HashMap<>();

		if (param.equals("pass")) {
			resMap.put("sucess", "OK");
			return resMap;
		}

		if (param.equals("full")) {
			resMap.put("currentTime", LocalDateTime.now());
			resMap.put("sucess", "OK");
			return resMap;
		}

		return ResponseEntity.badRequest().body(HttpStatus.BAD_REQUEST);
	}

	@PostMapping
	public ResponseEntity<Object> getRequest(@RequestParam String format) {
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();

	}

}
