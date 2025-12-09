package com.programes.controller;

import java.net.HttpCookie;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programes.Epmloyee;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RestControllerNew {

	@RequestMapping("/getRequest")
	public String fethRequest() {

		System.out.println("this is API");

		return "Api created";

	}

	@GetMapping("/app/{id}")
	public Epmloyee fethRequest1(@PathVariable(value = "id") int id) {

		System.out.println("this is API");

		List<Epmloyee> emplList = new ArrayList();

		emplList.add(new Epmloyee(1, "rahul", "it", "pune", "9922396598"));
		emplList.add(new Epmloyee(1, "ramesh", "cs", "vai", "9933445566"));
		emplList.add(new Epmloyee(1, "amol", "tech", "mumbai", "3344443322"));
		emplList.add(new Epmloyee(1, "prashant", "it", "pune", "7766554433"));

		emplList.get(id);

		ResponseEntity<Epmloyee> responseEntity = new ResponseEntity<Epmloyee>(HttpStatus.OK);

		return emplList.get(id);

	}

	public static void main(String[] args) {

		Integer[] intArr = { 1, 2, 6, 5, 4, 3 };

		Integer integer = Arrays.asList(intArr).stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
				.get(0);

		System.out.println(integer);

	}

}
