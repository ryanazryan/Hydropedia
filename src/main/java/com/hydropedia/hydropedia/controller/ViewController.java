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
import com.hydropedia.hydropedia.model.Monitoring;
import com.hydropedia.hydropedia.repository.MonitoringRepository;

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
    @Autowired
    private MonitoringRepository monitoringRepository;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
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

        Monitoring latest
                = monitoringRepository
                        .findTopByOrderByIdMonitoringDesc();

        model.addAttribute(
                "monitoring",
                latest
        );

        model.addAttribute(
                "notifikasiList",
                notifikasiRepository.findAll()
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

    @GetMapping("/tanaman/tambah")
    public String tambahTanaman(Model model) {

        model.addAttribute(
                "jenisList",
                jenisTanamanRepository.findAll()
        );

        return "tanaman-form";
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
