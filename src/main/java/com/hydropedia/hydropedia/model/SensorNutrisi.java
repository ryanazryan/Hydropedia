package com.hydropedia.hydropedia.model;

/**
 *
 * @author Ryan
 */
public class SensorNutrisi extends Sensor {
     
    public SensorNutrisi() { 
        super(); 
    }
    public SensorNutrisi(int idSensor, double nilai) { 
        super(idSensor, nilai); 
    }
    public void bacaNutrisi() {
        System.out.println("Membaca data dari Sensor Nutrisi...");
        System.out.println("Kadar nutrisi saat ini: " + getNilai() + " ppm");
    }
    @Override
    public void bacaData() {
        bacaNutrisi();
    }
}
