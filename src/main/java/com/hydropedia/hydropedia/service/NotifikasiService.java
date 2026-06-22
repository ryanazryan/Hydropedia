/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.service;

import com.hydropedia.hydropedia.model.Notifikasi;
import com.hydropedia.hydropedia.repository.NotifikasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author Ryan
 */
@Service
public class NotifikasiService {
    @Autowired
    private NotifikasiRepository notifikasiRepository;

    public Notifikasi cekKondisiDanKirim(double phSaatIni, double phMin, double phMax, double nutrisiSaatIni, double nutrisiIdeal) {
        String pesan = "";
        String status = "Aman";
        
        if (phSaatIni < phMin || phSaatIni > phMax) {
            pesan += "Peringatan pH! Nilai saat ini (" + phSaatIni + ") di luar batas ideal (" + phMin + " - " + phMax + "). ";
            status = "Bahaya";
        }
        if (nutrisiSaatIni < nutrisiIdeal) {
            pesan += "Peringatan Nutrisi! Nilai saat ini (" + nutrisiSaatIni + " ppm) kurang dari ideal (" + nutrisiIdeal + " ppm).";
            status = "Bahaya";
        }
        if (status.equals("Aman")) {
            pesan = "Kondisi tanaman optimal. pH dan Nutrisi terjaga dengan baik.";
        }

        Notifikasi notifBaru = new Notifikasi(pesan, status);
        notifBaru.kirimNotifikasi();

        return notifikasiRepository.save(notifBaru);
    }

    public List<Notifikasi> tampilkanRiwayat() {
        return notifikasiRepository.findAll();
    }
}
