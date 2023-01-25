/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

import com.mycompany.Army.Enums.Flight;

/**
 *
 * @author Andrew Gobert
 */
public class Blackhawk extends Helicopter {
    private int passangers;
    private String gunner[] = new String [2];
    private Flight[] position = new Flight[4];
    
    void setPassangers(int passangers){
        this.passangers = passangers;
    }
    void setGunner(String gunner, int position){
        this.gunner[position] = gunner;
    }
    int getPassangers(){
        return passangers;
    }
    String getGunner(int position){
        return gunner[position];
    }
    public void setPosition(Flight Position, int n){
        this.position[n] = Position;
    }
    public Flight getPosition(int n){
        return position[n];
    }
}
