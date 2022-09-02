package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService implements IGreetings{
    @Autowired
    GreetingRepo greetingRepo;
    public Greeting addGreeting(Greeting greets){
        return greetingRepo.save(greets);
    }
    public Optional<Greeting> findGreetingID(int id){
        return greetingRepo.findById(id);
    }
    public void deleteGreetingID(int id){
        greetingRepo.deleteById(id);
    }

    public List<Greeting> findAllGreets(){
        return greetingRepo.findAll();
    }
}
