package com.ufes.ordenacao.business.metodos_ordenacao;

import com.ufes.ordenacao.model.Resultado;
import java.util.List;


public class SelectionSortStrategy extends MetodoOrdenacaoStrategy{

    public SelectionSortStrategy() {
        super("SelectionSort");
    }

    @Override
    public Resultado ordenarCrescente(List<Double> valores) {
       long inicio = System.nanoTime();
        int tamanho = valores.size();
        double menorValor = 0;
        int index = 0;
        for (int i = 0; i < tamanho - 1; i++)  {  
            index = i;  
            for (int j = i + 1; j < tamanho; j++){  
                if (valores.get(j) < valores.get(index)){  
                    index = j;
                }  
            }  
            menorValor = valores.get(index);   
            valores.set(index, valores.get(i));  
            valores.set(i, menorValor);  
        }    
        long fim = System.nanoTime();
    
        long duracao = fim - inicio;

        return new Resultado(valores, duracao);
    }

    @Override
    public Resultado ordenarDecrescente(List<Double> valores) {
       long inicio = System.nanoTime();
        int tamanho = valores.size() - 1;
        double menorValor = 0;
        int index = 0;
        for (int i = tamanho; i > 0; i--)  {  
            index = i;  
            for (int j = i - 1; j >= 0; j--){  
                if (valores.get(j) < valores.get(index)){  
                    index = j;
                }  
            }  
            menorValor = valores.get(index);   
            valores.set(index, valores.get(i));  
            valores.set(i, menorValor);  
        }    
         long fim = System.nanoTime();
    
       long duracao = fim - inicio;
       
       return new Resultado(valores, duracao);
    }
    
}
