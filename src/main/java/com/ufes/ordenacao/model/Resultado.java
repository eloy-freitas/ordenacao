
package com.ufes.ordenacao.model;

import java.util.List;

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
