package com.hydropedia.hydropedia.model;

/**
 *
 * @author Ryan
 */
public class SensorPH extends Sensor {
  
    public SensorPH() { 
        super(); 
    }
    public SensorPH(int idSensor, double nilai) { 
        super(idSensor, nilai); 
    }
    public void bacaPH() {
        System.out.println("Membaca data dari Sensor pH...");
        System.out.println("Nilai pH saat ini: " + getNilai());
    }
    @Override
    public void bacaData() {
        bacaPH(); 
    }
}