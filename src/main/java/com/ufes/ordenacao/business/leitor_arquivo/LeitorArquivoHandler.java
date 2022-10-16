/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author eloy
 */
public interface LeitorArquivoHandler {
    public void setProximo(LeitorArquivoHandler handler);
    
    public List<Double> handlerRequest(String path) throws FileNotFoundException, IOException;
   

}
