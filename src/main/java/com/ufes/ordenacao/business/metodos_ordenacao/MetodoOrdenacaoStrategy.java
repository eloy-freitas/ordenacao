package com.ufes.ordenacao.business.metodos_ordenacao;

import com.ufes.ordenacao.model.Resultado;
import java.util.List;

public abstract class MetodoOrdenacaoStrategy {
    private final String nome;
    
    public MetodoOrdenacaoStrategy(String nome){
        this.nome = nome;
    }
    
    public abstract Resultado ordenarCrescente(List<Double> valores);
    
    public abstract Resultado ordenarDecrescente(List<Double> valores);

    public final String getNome() {
        return nome;
    }
        
}
