/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.Army.Enums;

/**
 *
 * @author Andrew Gobert
 */
public enum Flight {
    PILOT("Pilot"), COPILOT("Copilot"), NAVIGATOR("Navigator"), GUNNER("Gunner");
    
    public final String Position;
    Flight(String position){
        this.Position = position;
    }
}
