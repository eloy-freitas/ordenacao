/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eloy
 */
public abstract class AbstractLeitorArquivoHandler implements LeitorArquivoHandler{
    
    protected List<Double> numerosSemOrdem;
    protected LeitorArquivoHandler proximo;

    public AbstractLeitorArquivoHandler() {
        this.numerosSemOrdem = new ArrayList<>();
        this.proximo = null;
    }
    
    @Override
    public final void setProximo(LeitorArquivoHandler handler){
        this.proximo = handler;
    };

    @Override
    public final List<Double> handlerRequest(String path) throws FileNotFoundException, IOException{
        if(verificarArquivo(path)){
            this.numerosSemOrdem = processarArquivo(path);
            return this.numerosSemOrdem;
        }else if(this.proximo != null){
            return proximo.handlerRequest(path);
        }else
            return null;
    }
    
       
    public abstract List<Double> processarArquivo(String path) throws FileNotFoundException, IOException ;
    
    public abstract boolean verificarArquivo(String path) throws FileNotFoundException;
    
}
