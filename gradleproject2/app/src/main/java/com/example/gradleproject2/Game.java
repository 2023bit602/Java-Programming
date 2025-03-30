/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class Game extends Media {
    String mode;
    String console;

    public Game(String name, String releaseDate, long productionCost,
            long moneyInSales, String mode, String console) {
        super(name, releaseDate,productionCost, moneyInSales);
        this.mode = mode;
        this.console = console;
    }
    
    
    
}
