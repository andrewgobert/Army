/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.Army.Enums;

/**
 *
 * @author Andrew Gobert
 */
public enum Crew {
    Captain("Captain"), Engineer("Engineer"), COOK("Cook"), STEWARD("Steward"), MEDIC("Medic"), MATE("Mate"), GUNNER("Gunner");
    
    public final String Rank;
    Crew(String rank){
        this.Rank = rank;
    }
}
