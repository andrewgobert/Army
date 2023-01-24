/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

import com.mycompany.Army.Enums.Flight;
import java.util.Vector;

/**
 *
 * @author Andrew Gobert
 */
public class Apache extends Helicopter {
    private String[] weapons = new String[3];
    private Flight[] position = new Flight[2];
    
    public void setWeapon(String weapon, int n){
        this.weapons[n] = weapon;
    }
    public String getWeapon(int n){
        return weapons[n];
    }
    public void setPosition(Flight Position, int n){
        this.position[n] = Position;
    }
    public Flight getPosition(int n){
        return position[n];
    }
}
