/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.ordenacao.model;

import java.util.List;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author eloy
 */
public class Resultado {
    
    public List<Double> numeros;
    public Long tempo;

    public Resultado(List<Double> numeros, Long tempo) {
        this.numeros = numeros;
        this.tempo = tempo;
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public String getTempo() {
        double seconds = this.tempo/Math.pow(10, 9);
        String result = String.format("%,.9f segundos", seconds);
        return result;
        
    }
    
    
    
}
