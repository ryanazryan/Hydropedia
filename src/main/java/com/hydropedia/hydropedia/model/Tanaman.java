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
@Table(name = "tanaman")
public class Tanaman {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTanaman;
    private String namaTanaman;
    private int estimasiUmur;
    private double phIdealMin;
    private double phIdealMax;
    private double nutrisiIdeal;
    
    private JenisTanaman jenisTanaman;
    
    public Tanaman(){
        
    }
    
    public Tanaman(int idTanaman, String namaTanaman, int estimasiUmur, double phIdealMin, double phIdealMax, double nutrisiIdeal, JenisTanaman jenisTanaman){
        this.idTanaman = idTanaman;
        this.namaTanaman = namaTanaman;
        this.estimasiUmur = estimasiUmur;
        this.phIdealMin = phIdealMin;
        this.phIdealMax = phIdealMax;
        this.nutrisiIdeal = nutrisiIdeal;
        this.jenisTanaman = jenisTanaman;
    }
    
    public void getInfoTanaman() {
        System.out.println("Nama Tanaman : " + namaTanaman);
        System.out.println("Kategori     : " + (jenisTanaman != null ? jenisTanaman.getNamaJenis() : "Belum ada kategori"));
        System.out.println("Umur Panen   : " + estimasiUmur + " hari");
        System.out.println("pH Ideal     : " + phIdealMin + " - " + phIdealMax);
        System.out.println("Nutrisi Ideal: " + nutrisiIdeal);
    }
    
    public int getIdTanaman() { 
        return idTanaman; 
    }
    
    public void setIdTanaman(int idTanaman) { 
        this.idTanaman = idTanaman; 
    }
    
    public String getNamaTanaman(){
        return namaTanaman;
    }
    
    public void setNamaTanaman(String namaTanaman){
        this.namaTanaman = namaTanaman;
    }
    
    public int getEstimasiUmur(){
        return estimasiUmur;
    }
    
    public void setEstimasiUmur(int estimasiUmur){
        this.estimasiUmur = estimasiUmur;
    }
    
    public double getPhIdealMin(){
        return phIdealMin;
    }
    
    public void setPhIdealMin(double phIdealMin){
        this.phIdealMin = phIdealMin;
    }
    
    public double getPhIdealMax(){
        return phIdealMax;
    }
    public void setPhIdealMax(double phIdealMax){
        this.phIdealMax = phIdealMax;
    }
    
    public double getNutrisiIdeal(){
        return nutrisiIdeal;
    }
    
    public void setNutrisiIdeal(double nutrisiIdeal){
        this.nutrisiIdeal = nutrisiIdeal;
    }
    
    public JenisTanaman getJenisTanaman(){
        return jenisTanaman;
    }
    
    public void setJenisTanaman(JenisTanaman jenisTanaman){
        this.jenisTanaman = jenisTanaman;
    }
}
