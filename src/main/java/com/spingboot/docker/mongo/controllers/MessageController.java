package com.spingboot.docker.mongo.controllers;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/docker")
public class MessageController {

	@GetMapping("/hello")
	public String hello() {
		return "Your messaging is accepted..."+(Calendar.getInstance().getTime());
	}
}
