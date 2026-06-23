/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan
 */
@Service
public class MonitoringService {

    private final List<String> historyLog = new ArrayList<>();

    public void tambahLog(String log) {
        historyLog.add(log);
    }

    public List<String> tampilkanLog() {
        return historyLog;
    }

    public String cekStatusTanaman(double ph, double nutrisi) {

        if (ph < 5.5 || ph > 7.0) {
            return "Peringatan: pH tanaman tidak ideal";
        }

        if (nutrisi < 800) {
            return "Peringatan: Nutrisi tanaman rendah";
        }

        return "Kondisi tanaman optimal";
    }
}
