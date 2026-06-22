/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.model;

/**
 *
 * @author Ryan
 */
public abstract class Sensor {
    private int idSensor;
    private double nilai;

    public Sensor() {}

    public Sensor(int idSensor, double nilai) {
        this.idSensor = idSensor;
        this.nilai = nilai;
    }

    public abstract void bacaData();

    public int getIdSensor() { 
        return idSensor; 
    }
    public void setIdSensor(int idSensor) { 
        this.idSensor = idSensor; 
    }
    public double getNilai() { 
        return nilai; 
    }
    public void setNilai(double nilai) { 
        this.nilai = nilai; 
    }
}
