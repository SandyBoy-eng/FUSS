/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.system.fuss.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/dashboard")
public class Dashboard {
   
    @GetMapping(value = "/details")
    ResponseEntity<String> getDetails() {
        String successMessage = "Endpoint Success";
        return ResponseEntity.ok(successMessage);
    }
}
