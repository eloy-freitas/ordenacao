
package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class LeitorArquivoProcessor {
    private LeitorArquivoHandler first;
    private LeitorArquivoHandler sucessor;

    public LeitorArquivoProcessor() {
    }
    
    public void addLeitorArquivoHandler(LeitorArquivoHandler leitorArquivoHandler){
        if(this.first == null){
            this.first = leitorArquivoHandler;
        }else{
            this.sucessor.setProximo(leitorArquivoHandler);
        }
        sucessor = leitorArquivoHandler;
    }
    
    public List<Double> handleRequest(String path) throws FileNotFoundException, IOException{
        return this.first.handlerRequest(path);
    }
}
