package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeitorArquivoTxtHandler extends AbstractLeitorArquivoHandler{
    public LeitorArquivoTxtHandler() {
        super();
    }
    
    @Override
    public List<Double> processarArquivo(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha;
        while((linha = br.readLine()) != null){
            if(linha.matches("^[0-9]+.[0-9]+")){
                this.numerosSemOrdem.add(Double.valueOf(linha));
            }

        }
        return this.numerosSemOrdem;
    }

    @Override
    public boolean verificarArquivo(String path) throws FileNotFoundException{
        File arquivo = new File(path);
        String nome = arquivo.getName();
        if (arquivo.canRead() && nome.endsWith(".txt"))
            return true;
        else 
            return false;
    }

    
}
