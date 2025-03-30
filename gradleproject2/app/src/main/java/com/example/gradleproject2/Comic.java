/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class Comic extends Book {
    String illustrator;

    public Comic(String illustrator, String author, String publishingHouse, String name, String releaseDate, long productionCost, long moneyInSales) {
        super(author, publishingHouse, name, releaseDate, productionCost, moneyInSales);
        this.illustrator = illustrator;
    }
    
}
