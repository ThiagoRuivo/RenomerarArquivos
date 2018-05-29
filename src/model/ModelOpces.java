
package model;

import Arquivo.Arquivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelOpces {
  /*
    Campos
  */
  
  /*
    Construtores
  */
  
  /*
    Get's & Set's
  */
  
  /*
    Demais métodos
  */
  public String carregarArquivoBase (String path) {
    if (!"".equals(path)) {
      Arquivo arq = new Arquivo(path);
      try {
        arq.lerArquivo();
      } catch (IOException ex) {
        Logger.getLogger(ModelOpces.class.getName()).log(Level.SEVERE, null, ex);
      }
      return arq.getConteudoLeitura();
    } else {
      return "";
    }
  }
  public boolean arquivoExiste (String path) {
    boolean retorno = false;
    if (!"".equals(path)) {
      Arquivo arq = new Arquivo(path);
      if (arq.arquivoExiste()) {
        retorno = true;
      }
    }
    return retorno;
  }
  public void escreverArquivoBase (String path, String conteudo) {
    if ((!"".equals(conteudo)) && (!"".equals(path))) {
      Arquivo arq = new Arquivo(path);
      if (arq.arquivoExiste()) {
        arq.setConteudoEscrita(conteudo);
        arq.escreverArquivo();
      } else {
        arq.criarNovoArquivo(path, conteudo);
      }
    }
  }
}
