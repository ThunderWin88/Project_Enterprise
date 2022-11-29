package example.rest.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;


import example.rest.model.user;
import example.rest.Repo.UserRepo;

@Controller
public class RoomController {

	@Autowired
    private UserRepo userRepo;



	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("userForm", new user());
		return "bb";
	}

	@GetMapping("/rooms")
	public String rooms(Model model) {
		return "rooms";
	}

	@GetMapping("/contract")
	public String contract(Model model) {
		return "contract";
	}

	@GetMapping("/explore")
	public String explore(Model model) {
		return "explore";
	}

	@GetMapping("/index")
	public String Home(Model model) {
		return "index";
	}

	@GetMapping("/crud")
	public String registers(Model model) {
		return "crud";
	}

	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute user user, Model model) {
		System.out.println(user.toString());
		List<user> users = new ArrayList<user>();
		model.addAttribute("userForm", users);
		userRepo.save(user);
		//model.addAttribute("userForm", new user()); 
		//model.addAttribute("message", "you have registered successfully.");
		
		return "crud";
	}

    
	



}
