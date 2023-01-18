/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

import com.mycompany.Army.Enums.Crew;

/**
 *
 * @author Andrew Gobert
 */
public class Destroyer extends Ship {
    private String[] weapon = new String[3];
    private String[] members = new String[50];
    private Crew[] position = new Crew[50];
    
    public void setWeapon(String weapon, int n){
        this.weapon[n] = weapon;
    }
    public String getWeapon(int n){
        return this.weapon[n];
    }
    public void setMember(String Member, Crew Position, int n){
        this.members[n] = Member;
        this.position[n] = Position;
        setCrew();
    }
    
    public String getMember(int n){
        return this.members[n];
    }
}
