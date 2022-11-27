package com.example.restservice.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.restservice.Models.User;
import com.example.restservice.Repo.UserRepo;

@RestController
public class ApiControllers {
    
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "welcome";
    }

    @GetMapping(value =  "/users")
    public List<User> gUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value="save")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "Saved. . .";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();
        updateUser.setName(user.getName());
        updateUser.setLastname(user.getLastname());
        updateUser.setRoomnum(user.getRoomnum());
        updateUser.setGuests(user.getGuests());
        userRepo.save(updateUser);
        return "Updating . . .";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deleUser = userRepo.findById(id).get();
        userRepo.delete(deleUser);
        
        return "Delete from"+id;
    }
    
}
