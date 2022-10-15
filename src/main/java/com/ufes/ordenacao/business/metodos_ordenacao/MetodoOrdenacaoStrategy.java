/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.ordenacao.business.metodos_ordenacao;

import com.ufes.ordenacao.model.Resultado;
import java.util.List;

/**
 *
 * @author eloy
 */
public abstract class MetodoOrdenacaoStrategy {
    private String nome;
    
    public MetodoOrdenacaoStrategy(String nome){
        this.nome = nome;
    }
    
    public abstract Resultado ordenarCrescente(List<Double> valores);
    
   public abstract Resultado ordenarDecrescente(List<Double> valores);

    public String getNome() {
        return nome;
    }
        
}
