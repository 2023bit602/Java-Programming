/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class RolePlayingGame extends Game {
    String worldName;

    public RolePlayingGame(String worldName, String name, String releaseDate, long productionCost, long moneyInSales, String mode, String console) {
        super(name, releaseDate, productionCost, moneyInSales, mode, console);
        this.worldName = worldName;
    }
    
}
