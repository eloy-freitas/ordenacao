package com.ufes.ordenacao.business.leitor_arquivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface LeitorArquivoHandler {
    public void setProximo(LeitorArquivoHandler handler);
    
    public List<Double> handlerRequest(String path) throws FileNotFoundException, IOException;
   

}
