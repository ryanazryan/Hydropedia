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
@Table(name = "jenis_tanaman")

public class JenisTanaman {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idJenis;
    private String namaJenis;
    
    public JenisTanaman(){
        
    }
    
    public JenisTanaman(int idJenis, String namaJenis){
        this.idJenis = idJenis;
        this.namaJenis = namaJenis;
    }
    
    public int getIdJenis(){
        return idJenis;
    }
    
    public void setIdJenis(int idJenis){
        this.idJenis = idJenis;
    }
    
    public String getNamaJenis(){
        return namaJenis;
    }
    
    public void setNamaJenis(String namaJenis){
        this.namaJenis = namaJenis;
    }
}
