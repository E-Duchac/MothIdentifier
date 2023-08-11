package com.example.moths.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.moths.model.DBResponse;
import com.example.moths.model.Moth;
import com.example.moths.repository.MothRepository;

//The version of controller that uses the Repository class, not the DTO.
@RestController
@RequestMapping("/mothdb")
public class MothController_rep {
    private final MothRepository mothRepo;

    @Autowired
    public MothController_rep(MothRepository mothRepo) {
        this.mothRepo = mothRepo;
    }
    
    @PostMapping("/saveMoth")
    public ResponseEntity<String> saveMoth(@RequestBody Moth moth) {
        try {
            Moth savedMoth = mothRepo.save(moth);
            return ResponseEntity.ok("Moth saved: " + savedMoth);
        } catch (Exception e) {
            return ResponseEntity.ok("Moth not saved, error encountered: " + e.getStackTrace());
        }
    }

    @GetMapping("/findAllMoths")
    public ResponseEntity<String> findAllMoths() {
        DBResponse response = new DBResponse();
        List<Moth> allMoths = mothRepo.findAll();
        response.setMothList(allMoths);
        response.setMessage("All moths:");
        return ResponseEntity.ok("All moths: " + allMoths.toString());
    }

    @PutMapping("/updateMoth/{id}")
    public ResponseEntity<String> updateMoth(@PathVariable String mothId) {
        return ResponseEntity.ok("stubbed updateMoth");
    }

    @DeleteMapping("/deleteMoth/{id}")
    public ResponseEntity<String> deleteMoth(@PathVariable String mothId) {
        return ResponseEntity.ok("stubbed deleteMoth");
    }
}
