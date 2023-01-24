/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Generic;


/**
 *
 * @author Andrew Gobert
 */
public class Employment <a, b> {
    private a number;
    private b armor;
    public void setEmployment(a number, b armor){
        this.number = number;
        this.armor = armor;
    }
    public a getNumber(){
        return this.number;
    }
    public b getArmor(){
        return this.armor;
    }
}
