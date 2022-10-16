
package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class LeitorArquivoProcessor {
    private LeitorArquivoHandler primeiro;
    private LeitorArquivoHandler sucessor;

    public LeitorArquivoProcessor() {
    }
    
    public void addLeitorArquivoHandler(LeitorArquivoHandler leitorArquivoHandler){
        if(this.primeiro == null){
            this.primeiro = leitorArquivoHandler;
        }else{
            this.sucessor.setProximo(leitorArquivoHandler);
        }
        sucessor = leitorArquivoHandler;
    }
    
    public List<Double> handleRequest(String path) throws FileNotFoundException, IOException{
        return this.primeiro.handlerRequest(path);
    }
}
