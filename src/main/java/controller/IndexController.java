package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.user;
import services.UserService;

@Controller
public class IndexController {
	@Autowired
	UserService userServer;
	@RequestMapping("/create4test")
	public void index(){
		for (int i = 0; i < 100; i++) {
			user u = new user();
			u.setName("name"+i);
			u.setPass("pass"+i);
			userServer.saveOrUpdate(u);
		}
	}
	
	@RequestMapping("/register")
	public String createManual(){
		return "register";
	}
	
	@RequestMapping(value = "/showall", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<ArrayList<user>> showAllUser(){
		return new ResponseEntity<ArrayList<user>>(userServer.getAll(), HttpStatus.OK);
	}
}
