package com.ufes.ordenacao.service;

import com.ufes.ordenacao.business.metodos_ordenacao.BubbleSortStrategy;
import com.ufes.ordenacao.business.metodos_ordenacao.MetodoOrdenacaoStrategy;
import com.ufes.ordenacao.model.Resultado;
import com.ufes.ordenacao.business.metodos_ordenacao.SelectionSortStrategy;
import java.util.ArrayList;
import java.util.List;


public class MetodosOrdenacaoService {
    private List<MetodoOrdenacaoStrategy> metodos;

    public MetodosOrdenacaoService() {
        this.metodos = new ArrayList<>();
        this.metodos.add(new BubbleSortStrategy());
        this.metodos.add(new SelectionSortStrategy());
    }

    public List<MetodoOrdenacaoStrategy> getMetodos() {
        return this.metodos;
    }
    
    public Resultado ordenar(String nome, List<Double> numeros, boolean ordem){
        try{
            Resultado resultado = null;
            for(MetodoOrdenacaoStrategy m : this.metodos){
                if(m.getNome().equals(nome)){
                    if(ordem)
                        resultado = m.ordenarCrescente(numeros);
                    else
                        resultado = m.ordenarDecrescente(numeros);
                    break;
                }
            }
            return resultado;
        }catch(Exception e){
            throw new RuntimeException(
            "Erro: metodo de orndenação inválido"
            );
        }
        
    }
    
    
    
}
