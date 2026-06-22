<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.model;

/**
 *
 * @author Ryan
 */
public class SensorNutrisi {
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
>>>>>>> Stashed changes
