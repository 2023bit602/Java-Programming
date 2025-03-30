/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class Book extends Media {
    String author;
    String publishingHouse;

    public Book(String author, String publishingHouse, String name, String releaseDate, long productionCost, long moneyInSales) {
        super(name, releaseDate, productionCost, moneyInSales);
        this.author = author;
        this.publishingHouse = publishingHouse;
    }
    
    
    
}
