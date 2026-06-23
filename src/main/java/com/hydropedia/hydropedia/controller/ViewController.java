/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Ryan
 */

@Controller
public class ViewController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/tanaman")
    public String tanaman() {
        return "tanaman";
    }

    @GetMapping("/monitoring")
    public String monitoring() {
        return "monitoring";
    }

    @GetMapping("/notifikasi")
    public String notifikasi() {
        return "notifikasi";
    }
}
