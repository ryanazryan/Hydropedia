/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;

import com.hydropedia.hydropedia.model.JenisTanaman;
import com.hydropedia.hydropedia.model.Tanaman;
import com.hydropedia.hydropedia.repository.JenisTanamanRepository;
import com.hydropedia.hydropedia.service.TanamanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 *
 * @author Ryan
 */

@Controller
public class TanamanController {

    @Autowired
    private TanamanService tanamanService;

    @Autowired
    private JenisTanamanRepository jenisTanamanRepository;

    @PostMapping("/tanaman/simpan")
    public String simpanTanaman(

            @RequestParam String namaTanaman,
            @RequestParam int estimasiUmur,
            @RequestParam double phIdealMin,
            @RequestParam double phIdealMax,
            @RequestParam double nutrisiIdeal,
            @RequestParam int idJenis
    ){

        Tanaman tanaman = new Tanaman();

        tanaman.setNamaTanaman(namaTanaman);
        tanaman.setEstimasiUmur(estimasiUmur);
        tanaman.setPhIdealMin(phIdealMin);
        tanaman.setPhIdealMax(phIdealMax);
        tanaman.setNutrisiIdeal(nutrisiIdeal);

        JenisTanaman jenis =
                jenisTanamanRepository
                        .findById(idJenis)
                        .orElse(null);

        tanaman.setJenisTanaman(jenis);

        tanamanService.tambahTanaman(tanaman);

        return "redirect:/tanaman";
    }

    @GetMapping("/api/tanaman")
    @ResponseBody
    public ResponseEntity<List<Tanaman>> getAllTanaman() {

        return ResponseEntity.ok(
                tanamanService.tampilSemuaTanaman()
        );
    }

    @PostMapping("/api/tanaman")
    @ResponseBody
    public ResponseEntity<Tanaman> tambahTanamanApi(
            @RequestBody Tanaman tanaman
    ) {

        return ResponseEntity.ok(
                tanamanService.tambahTanaman(tanaman)
        );
    }

    @PutMapping("/api/tanaman/{id}")
    @ResponseBody
    public ResponseEntity<Tanaman> updateTanaman(

            @PathVariable int id,
            @RequestBody Tanaman tanaman
    ) {

        return ResponseEntity.ok(
                tanamanService.ubahTanaman(id, tanaman)
        );
    }

    @DeleteMapping("/api/tanaman/{id}")
    @ResponseBody
    public ResponseEntity<String> hapusTanaman(
            @PathVariable int id
    ) {

        tanamanService.hapusTanaman(id);

        return ResponseEntity.ok(
                "Tanaman berhasil dihapus"
        );
    }
}