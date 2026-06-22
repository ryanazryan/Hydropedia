/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;
import com.hydropedia.hydropedia.model.Notifikasi;
import com.hydropedia.hydropedia.service.NotifikasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 * @author Ryan
 */
@RestController
@RequestMapping("/api/notifikasi")
public class NotifikasiController {
    @Autowired
    private NotifikasiService notifikasiService;

    @GetMapping("/riwayat")
    public ResponseEntity<List<Notifikasi>> getRiwayatNotifikasi() {
        return ResponseEntity.ok(notifikasiService.tampilkanRiwayat());
    }

    @PostMapping("/cek-kondisi")
    public ResponseEntity<Notifikasi> triggerCekKondisi(
            @RequestParam double phSaatIni,
            @RequestParam double phMin,
            @RequestParam double phMax,
            @RequestParam double nutrisiSaatIni,
            @RequestParam double nutrisiIdeal) {
        
        Notifikasi hasilNotifikasi = notifikasiService.cekKondisiDanKirim(phSaatIni, phMin, phMax, nutrisiSaatIni, nutrisiIdeal);
        return ResponseEntity.ok(hasilNotifikasi);
    }
}
