package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.user;
import services.UserService;

@RestController
@RequestMapping("/user")
public class userController {
	
//	@RequestMapping(value="/hello")
//	private String home() {
//		return "welcome";
//
//	}
//	

	@Autowired
	UserService userServer;
	
	@RequestMapping(value = "/showall", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public user showAllUser(){
		return new user();
		//return userServer.getAll();
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Void> addUser(@RequestBody user user){
		userServer.saveOrUpdate(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
