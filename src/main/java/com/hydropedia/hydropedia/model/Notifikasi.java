/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.model;

import jakarta.persistence.*;

/**
 *
 * @author Ryan
 */
@Entity
@Table(name = "notifikasi")
public class Notifikasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotifikasi;
    
    private String pesan;
    private String status; 

    public Notifikasi() {
    }

    public Notifikasi(String pesan, String status) {
        this.pesan = pesan;
        this.status = status;
    }

    public void kirimNotifikasi() {
        System.out.println("MENGIRIM NOTIFIKASI [" + this.status + "]");
        System.out.println("Pesan: " + this.pesan);
        System.out.println("-------------------------------------------------");
    }

    public int getIdNotifikasi() { 
        return idNotifikasi; 
    }
    
    public void setIdNotifikasi(int idNotifikasi) { 
        this.idNotifikasi = idNotifikasi; 
    }

    public String getPesan() { 
        return pesan; 
    }
    
    public void setPesan(String pesan) { 
        this.pesan = pesan; 
    }

    public String getStatus() { 
        return status; 
    }
    
    public void setStatus(String status) { 
        this.status = status; 
    }
    
}
