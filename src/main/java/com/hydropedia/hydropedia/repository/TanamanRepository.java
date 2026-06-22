/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.repository;

import com.hydropedia.hydropedia.model.Tanaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ryan
 */
@Repository
public interface TanamanRepository extends JpaRepository<Tanaman, Integer> {
    
}
