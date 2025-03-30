/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class ShooterGame extends Game {
    String contests;

    public ShooterGame(String name, String releaseDate, long productionCost,
            long moneyInSales, String mode, String console, String contests) {
        super(name, releaseDate, productionCost, moneyInSales, mode, console);
        this.contests = contests;
    }
    
    
}
