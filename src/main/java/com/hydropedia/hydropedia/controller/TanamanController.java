/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;
import com.hydropedia.hydropedia.model.Tanaman;
import com.hydropedia.hydropedia.service.TanamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Ryan
 */

@RestController
@RequestMapping("/api/tanaman")
public class TanamanController {

    @Autowired
    private TanamanService tanamanService;

    @GetMapping
    public ResponseEntity<List<Tanaman>> getAllTanaman() {
        return ResponseEntity.ok(tanamanService.tampilSemuaTanaman());
    }

    @PostMapping
    public ResponseEntity<Tanaman> tambahTanaman(@RequestBody Tanaman tanaman) {
        return ResponseEntity.ok(tanamanService.tambahTanaman(tanaman));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tanaman> updateTanaman(
            @PathVariable int id,
            @RequestBody Tanaman tanaman) {

        return ResponseEntity.ok(
                tanamanService.ubahTanaman(id, tanaman)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> hapusTanaman(@PathVariable int id) {

        tanamanService.hapusTanaman(id);

        return ResponseEntity.ok("Tanaman berhasil dihapus");
    }
}
