package model;

import Arquivo.Arquivo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelNomeLivros {
  //<editor-fold defaultstate="collapsed" desc="Campos">
  public final String TABELA = "nomeTabela";
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Construtores">
  public void ModelNomeLivros () {
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Get's ans Set's">
  public String getTABELA() {
    return this.TABELA;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Inicialização">
  public void iniciarModelNomeLivros () {
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
  public String[] selectAutores (String path) {
    Arquivo arq = new Arquivo(path);
    try {
      arq.lerArquivo();
    } catch (IOException ex) {
      Logger.getLogger(ModelNomeLivros.class.getName()).log(Level.SEVERE, null, ex);
      return null;
    }
    String[] aux = arq.getConteudoLeitura().split(arq.enter());
    return aux;
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
  public void selectCount () {
  }
  public void insert () {
  }
  public void insertAutor (String path, String nome) {
    Arquivo arq = new Arquivo(path);
    try {
      arq.escreverFinalArquivo(nome);
    } catch (IOException ex) {
      Logger.getLogger(ModelNomeLivros.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  public void inseriAutoresOrdenados (String[] autores, String path) {
    Arquivo arq = new Arquivo(path);
    String conteudo = "";
    for (int i = 0; i < autores.length; i++) {
      conteudo += String.format("%s%s", autores[i], arq.enter());
    }
    arq.setConteudoEscrita(conteudo);
    arq.escreverArquivo();
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
  public boolean arquivoExiste (String path) {
    Arquivo arq = new Arquivo(path);
    return arq.arquivoExiste();
  }
  //</editor-fold>

  //</editor-fold>

}
