/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.Army.Enums;

/**
 *
 * @author Andrew Gobert
 */
public enum Rank {
    PRIVATE("Private"), PSC("PSC"), PFC("PFC"), SPECIALIST("Specialist"), CORPORAL("Corporal"), SERGEANT("Sargeant"), SS("SS"), SFC("SFC"),
    MS("MS"), FS("FS"), SM("SM"), CSM("CSM"), SGA("SGA"), ADMIRAL("Admiral");
    
    public final String Rank;
    Rank(String rank){
        this.Rank = rank;
    }
}
