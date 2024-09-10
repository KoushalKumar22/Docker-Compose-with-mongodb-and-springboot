package com.Example.DockerComposeDemo.Controller;

import com.Example.DockerComposeDemo.Repository.ProfileRepository;
import com.Example.DockerComposeDemo.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileController {
    @Autowired
    ProfileRepository profileRepository;

    @GetMapping("/test")
    public String test(){
        return "This Is a Test run";
    }
    @PostMapping("/save")
    public String save(@RequestBody Profile profile){
        profileRepository.save(profile);
        return "Data Saved";
    }
    @GetMapping("/all")
    public List<Profile> findAll(){
        return profileRepository.findAll();
    }
    @GetMapping("/id{id}")
    public Optional<Profile> findById(@PathVariable int id){
        return profileRepository.findById(id);
    }
    @GetMapping("/name/{name}")
    public List<Profile> findByName(@PathVariable String name){
        return profileRepository.findByName(name);
    }
}
