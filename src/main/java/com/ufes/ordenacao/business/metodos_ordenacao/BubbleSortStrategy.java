package com.ufes.ordenacao.business.metodos_ordenacao;

import com.ufes.ordenacao.model.Resultado;
import java.util.List;

public class BubbleSortStrategy extends MetodoOrdenacaoStrategy{

    public BubbleSortStrategy() {
        super("BubbleSort");
        
    }

    
    @Override
    public Resultado ordenarCrescente(List<Double> valores) {
       long inicio = System.nanoTime();
       int tamanho = valores.size();
       double aux = 0;
       for (int i = 0; i < tamanho; i++){
           for (int j = 0; j < tamanho - 1; j++){
               if (valores.get(j).compareTo(valores.get(j+1)) > 0)
                {
                    aux = valores.get(j);
                    valores.set(j,valores.get(j+1) );
                    valores.set(j+1, aux);
                }
           }
       }
       long fim = System.nanoTime();
    
       long duracao = fim - inicio;
       
       return new Resultado(valores, duracao);
    }

    @Override
    public Resultado ordenarDecrescente(List<Double> valores) {
       long inicio = System.nanoTime();
       int tamanho = valores.size() - 1;
       double aux = 0;
       for (int i = tamanho; i > 0 ; i--){
           for (int j = tamanho; j > 0 ; j--){
               if (valores.get(j).compareTo(valores.get(j-1)) > 0)
                {
                    
                    aux = valores.get(j);
                    valores.set(j,valores.get(j-1) );
                    valores.set(j-1, aux);
                }
           }
       }
       long fim = System.nanoTime();
    
       long duracao = fim - inicio;
       
       return new Resultado(valores, duracao);
    }

  
    
}
