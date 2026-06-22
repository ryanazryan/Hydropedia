/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.service;

import com.hydropedia.hydropedia.model.JenisTanaman;
import com.hydropedia.hydropedia.model.Tanaman;
import com.hydropedia.hydropedia.repository.JenisTanamanRepository;
import com.hydropedia.hydropedia.repository.TanamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author Ryan
 */
@Service
public class TanamanService {
    @Autowired
    private TanamanRepository tanamanRepository;

    @Autowired
    private JenisTanamanRepository jenisTanamanRepository;

    // === CRUD JENIS TANAMAN ===
    public JenisTanaman tambahJenis(JenisTanaman jenis) {
        return jenisTanamanRepository.save(jenis);
    }

    public List<JenisTanaman> tampilSemuaJenis() {
        return jenisTanamanRepository.findAll();
    }

    public void hapusJenis(int id) {
        jenisTanamanRepository.deleteById(id);
    }

    // === CRUD TANAMAN ===
    public Tanaman tambahTanaman(Tanaman tanaman) {
        return tanamanRepository.save(tanaman);
    }

    public List<Tanaman> tampilSemuaTanaman() {
        return tanamanRepository.findAll();
    }

    public Tanaman ubahTanaman(int id, Tanaman tanamanBaru) {
        return tanamanRepository.findById(id).map(tanaman -> {
            tanaman.setNamaTanaman(tanamanBaru.getNamaTanaman());
            tanaman.setEstimasiUmur(tanamanBaru.getEstimasiUmur());
            tanaman.setPhIdealMin(tanamanBaru.getPhIdealMin());
            tanaman.setPhIdealMax(tanamanBaru.getPhIdealMax());
            tanaman.setNutrisiIdeal(tanamanBaru.getNutrisiIdeal());
            tanaman.setJenisTanaman(tanamanBaru.getJenisTanaman());
            return tanamanRepository.save(tanaman);
        }).orElseThrow(() -> new RuntimeException("Tanaman tidak ditemukan dengan id " + id));
    }

    public void hapusTanaman(int id) {
        tanamanRepository.deleteById(id);
    }
}
