/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class Movie extends Media {
    String director;
    String runtime;

    public Movie(String director, String runtime, String name, String releaseDate, long productionCost, long moneyInSales) {
        super(name, releaseDate, productionCost, moneyInSales);
        this.director = director;
        this.runtime = runtime;
    }
    
}
