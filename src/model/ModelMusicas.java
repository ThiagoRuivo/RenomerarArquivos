package model;

import Arquivo.Arquivo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelMusicas {
  //<editor-fold defaultstate="collapsed" desc="Campos">
  public final String TABELA = "nomeTabela";
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Construtores">
  public void ModelMusicas () {
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Get's ans Set's">
  public String getTABELA() {
    return this.TABELA;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Inicialização">
  public void iniciarModelMusicas () {
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Select, Insert, Update, Delete">
  public void select () {
  }
  public File[] selectAll (String path) {
    File novoArquivo = new File(path);
    File[] arquivos = novoArquivo.listFiles();
    return arquivos;
  }
  public void selectCount () {
  }
  public void insert () {
  }
  public void update () {
  }
  public void renomearArquivo (String novo, String antigo) {
    File arqAntigo = new File(antigo);
    File arqNovo = new File(novo);
    arqAntigo.renameTo(arqNovo);
  }
  public void delete () {
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
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Demais métodos">

  //<editor-fold defaultstate="collapsed" desc="Privados">
  private void imprimirPrivate () {
    System.out.println("");
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Púlblicos">
  public void imprimirPublic () {
    System.out.println("");
  }
  //</editor-fold>

  //</editor-fold>

}
