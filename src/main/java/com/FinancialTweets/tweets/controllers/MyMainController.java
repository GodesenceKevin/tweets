package com.FinancialTweets.tweets.controllers;

import com.FinancialTweets.tweets.daoTweets.TwitterRepository;
import com.FinancialTweets.tweets.entites.Twitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyMainController {

    @Autowired
    private TwitterRepository myRepo;

    @CrossOrigin(origins = "http://localhost:4200")  // enabling cors
    @GetMapping("/hello")
    public @ResponseBody Twitter myTwitt(){
        return myRepo.getById(6);
    }

    @CrossOrigin(origins = "http://localhost:4200")  // enabling cors
    @GetMapping("/allTen")
    public @ResponseBody
    List<Twitter> myTwittPack(){
        return myRepo.findAll();
    }



}
