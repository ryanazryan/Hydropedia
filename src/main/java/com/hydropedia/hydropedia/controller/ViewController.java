/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;

import com.hydropedia.hydropedia.repository.JenisTanamanRepository;
import com.hydropedia.hydropedia.repository.NotifikasiRepository;
import com.hydropedia.hydropedia.repository.TanamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Ryan
 */

@Controller
public class ViewController {
    @Autowired
    private TanamanRepository tanamanRepository;
    @Autowired
    private JenisTanamanRepository jenisTanamanRepository;
    @Autowired
    private NotifikasiRepository notifikasiRepository;
    @GetMapping("/")
    public String login() {
        return "login";
    }
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute(
                "totalTanaman",
                tanamanRepository.count()
        );
        model.addAttribute(
                "totalJenis",
                jenisTanamanRepository.count()
        );
        model.addAttribute(
                "totalNotifikasi",
                notifikasiRepository.count()
        );
        return "dashboard";
    }
    @GetMapping("/tanaman")
    public String tanaman(Model model) {

        model.addAttribute(
                "tanamanList",
                tanamanRepository.findAll()
        );
        return "tanaman";
    }
    @GetMapping("/monitoring")
    public String monitoring(Model model) {

        model.addAttribute(
                "jumlahTanaman",
                tanamanRepository.count()
        );

        model.addAttribute(
                "jumlahNotifikasi",
                notifikasiRepository.count()
        );
        return "monitoring";
    }
    @GetMapping("/notifikasi")
    public String notifikasi(Model model) {
        model.addAttribute(
                "notifikasiList",
                notifikasiRepository.findAll()
        );
        return "notifikasi";
    }
}
