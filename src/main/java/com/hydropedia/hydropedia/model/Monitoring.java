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
@Table(name = "monitoring")
public class Monitoring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMonitoring;

    private Double ph;
    private Double nutrisi;
    private Double suhu;
    private Double kelembaban;

    public Monitoring() {
    }

    public Integer getIdMonitoring() {
        return idMonitoring;
    }

    public void setIdMonitoring(Integer idMonitoring) {
        this.idMonitoring = idMonitoring;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getNutrisi() {
        return nutrisi;
    }

    public void setNutrisi(Double nutrisi) {
        this.nutrisi = nutrisi;
    }

    public Double getSuhu() {
        return suhu;
    }

    public void setSuhu(Double suhu) {
        this.suhu = suhu;
    }

    public Double getKelembaban() {
        return kelembaban;
    }

    public void setKelembaban(Double kelembaban) {
        this.kelembaban = kelembaban;
    }
}