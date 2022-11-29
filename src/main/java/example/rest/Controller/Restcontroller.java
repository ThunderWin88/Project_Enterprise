package example.rest.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import example.rest.model.user;
import example.rest.Repo.UserRepo;

@RestController
public class Restcontroller {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<user> gUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value="/save")
    public String saveUser(@RequestBody user user) {
        userRepo.save(user);
        return "Saved. . .";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody user user){
        user updateUser = userRepo.findById(id).get();
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        updateUser.setRoomtype(user.getRoomtype());
        updateUser.setRoomnum(user.getRoomnum());
        updateUser.setGuests(user.getGuests());
        //time
        userRepo.save(updateUser);
        return "Updating . . .";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        user deleUser = userRepo.findById(id).get();
        userRepo.delete(deleUser);
        
        return "Delete from"+id;
    }

}