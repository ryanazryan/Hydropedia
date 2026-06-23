/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class ManajemenTanaman implements KelolaData {
    private int idManajemen;
    
    private List <Tanaman> daftarTanaman;
    private List<Sensor> daftarSensor;
    private List<Notifikasi> daftarNotifikasi;
    
    public ManajemenTanaman(){
        daftarTanaman = new ArrayList<>();
        daftarSensor = new ArrayList<>();
        daftarNotifikasi = new ArrayList<>();
    }
    
    public int getIdManajemen(){
        return idManajemen;
    }
    
    public void setIdManajemen(int idManajemen){
        this.idManajemen = idManajemen;
    }
    
     public void tambahTanaman() {
        System.out.println("Menambah tanaman...");
    }

    public void ubahTanaman() {
        System.out.println("Mengubah tanaman...");
    }

    public void hapusTanaman() {
        System.out.println("Menghapus tanaman...");
    }

    public void tampilTanaman() {
        System.out.println("Menampilkan daftar tanaman...");
    }

    public void monitoringTanaman() {
        System.out.println("Monitoring tanaman...");
    }

    public void cekKondisi() {
        System.out.println("Mengecek kondisi tanaman...");
    }

    public void lihatNotifikasi() {
        System.out.println("Menampilkan notifikasi...");
    }

    @Override
    public void tambahData() {
        tambahTanaman();
    }

    @Override
    public void ubahData() {
        ubahTanaman();
    }

    @Override
    public void hapusData() {
        hapusTanaman();
    }

    @Override
    public void tampilData() {
        tampilTanaman();
    }
}
