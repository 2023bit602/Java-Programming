/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author parth-patil
 */
public class LiveAction extends Movie {
    String actor;

    public LiveAction(String actor, String director, String runtime, String name, String releaseDate, long productionCost, long moneyInSales) {
        super(director, runtime, name, releaseDate, productionCost, moneyInSales);
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "LiveAction{" + "actor=" + actor + '}';
    }
    
}
