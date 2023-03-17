/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

import com.mycompany.Army.Interfaces.Recruitment;
import com.mycompany.Army.Classes.Base;
import com.mycompany.Army.Enums.Rank;
import java.io.*;

/**
 *
 * @author Andrew Gobert
 */
public class Soldier {
    private boolean armor = false;
    private int num;
    private Rank[] rank = new Rank[50];
    
    public boolean getArm(int n){
        return this.armor;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum (int Num){
        this.num = Num;
    }
    public Rank getRank( int n){
        return this.rank[n];
    }
    public void setRank (Rank rank, int n){
        this.rank[n] = rank;
    }
    public void setArm (boolean set){
        this.armor = set;
    }
}
