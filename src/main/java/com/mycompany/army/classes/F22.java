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
public class F22 extends Plane {
    private String[] weapon;
    private Flight[] position = new Flight[2];
    
    public void setWeaponNum(int n){
        this.weapon = new String[n];
    }
    public void setWeapon(String weapon, int n){
        this.weapon[n] = weapon;
    }
    public String getWeapon(int n){
        return this.weapon[n];
    }
    public void setPosition(Flight Position, int n){
        this.position[n] = Position;
    }
    public Flight getPosition(int n){
        return position[n];
    }
}
