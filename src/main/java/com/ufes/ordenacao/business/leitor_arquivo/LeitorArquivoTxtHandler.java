/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eloy
 */
public class LeitorArquivoTxtHandler extends AbstractLeitorArquivoHandler{
    public LeitorArquivoTxtHandler() {
        super();
    }
    
    @Override
    public List<Double> processarArquivo(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linha;
            double valor;
            while((linha = br.readLine()) != null){
                if(linha.matches("^[0-9]+.[0-9]+")){
                    this.numerosSemOrdem.add(Double.valueOf(linha));
                }

            }
            System.out.println(".txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeitorArquivoCsvHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeitorArquivoTxtHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.numerosSemOrdem;
    }

    @Override
    public boolean verificarArquivo(String path) {
        File arquivo = new File(path);
        String nome = arquivo.getName();
        if (arquivo.canRead() && nome.endsWith(".txt"))
            return true;
        else 
            return false;
    }

    
}
