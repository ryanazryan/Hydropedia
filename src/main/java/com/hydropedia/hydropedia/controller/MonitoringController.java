/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;
import com.hydropedia.hydropedia.service.MonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Ryan
 */
import java.util.List;

@RestController
@RequestMapping("/api/monitoring")
public class MonitoringController {

    @Autowired
    private MonitoringService monitoringService;

    @GetMapping("/log")
    public List<String> getLog() {
        return monitoringService.tampilkanLog();
    }

    @PostMapping("/log")
    public String tambahLog(@RequestParam String pesan) {

        monitoringService.tambahLog(pesan);

        return "Log berhasil ditambahkan";
    }

    @GetMapping("/status")
    public String cekStatus(
            @RequestParam double ph,
            @RequestParam double nutrisi) {

        return monitoringService.cekStatusTanaman(ph, nutrisi);
    }
}
