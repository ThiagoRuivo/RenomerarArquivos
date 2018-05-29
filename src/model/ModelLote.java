
package model;

import Arquivo.Arquivo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelLote {
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
  public File[] selecionarArquivos (String path) {
    File novoArquivo = new File(path);
    File[] arquivos = novoArquivo.listFiles();
    return arquivos;
  }
  public void renomearArquivo (String novo, String antigo) {
    File arqAntigo = new File(antigo);
    File arqNovo = new File(novo);
    arqAntigo.renameTo(arqNovo);
  }
  public void criarPasta (String caminho) {
    Arquivo arq = new Arquivo();
    arq.criarPasta(caminho);
  }
  public String[] selecionarCaminhoOrigem (String path) {
    if (!"".equals(path)) {
      Arquivo arq = new Arquivo(path);
      try {
        arq.lerArquivo();
      } catch (IOException ex) {
        Logger.getLogger(ModelRenomearPasta.class.getName()).log(Level.SEVERE, null, ex);
      }
      return arq.getConteudoLeitura().split(arq.enter());
    } else {
      return null;
    }
  }
}
