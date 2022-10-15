/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.ordenacao.model;

import java.util.List;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author eloy
 */
public class Resultado {
    
    public List<Double> numeros;
    public Duration tempo;

    public Resultado(List<Double> numeros, Duration tempo) {
        this.numeros = numeros;
        this.tempo = tempo;
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public String getTempo() {
        double seconds = this.tempo.toMillis()/ Math.pow(10, 3);
        String result = String.format("%05f segundos", seconds);
        return result;
        
    }
    
    
    
}
