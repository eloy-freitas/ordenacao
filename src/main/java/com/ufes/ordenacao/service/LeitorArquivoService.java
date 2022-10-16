/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.ordenacao.service;

import com.ufes.ordenacao.business.leitor_arquivo.LeitorArquivoCsvHandler;
import com.ufes.ordenacao.business.leitor_arquivo.LeitorArquivoProcessor;
import com.ufes.ordenacao.business.leitor_arquivo.LeitorArquivoTxtHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author eloy
 */
public class LeitorArquivoService {
    private LeitorArquivoProcessor arquivoProcessor ;
    
    public LeitorArquivoService() {
        this.arquivoProcessor = new LeitorArquivoProcessor();
        this.arquivoProcessor.addLeitorArquivoHandler(new LeitorArquivoCsvHandler());
        this.arquivoProcessor.addLeitorArquivoHandler(new LeitorArquivoTxtHandler());
    }
    
    public List<Double> processarArquivo(String path)  throws FileNotFoundException, IOException, Exception{
        return  arquivoProcessor.handleRequest(path);
    }
    
}
