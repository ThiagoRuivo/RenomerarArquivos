
package controller;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import model.ModelOpces;
import view.ViewOpcoes;
import view.ViewSobre;

public class ControllerOpcoes {
  /*
    Campos
  */
  private final String PATH = "..\\src\\main\\ArquivoBase.txt";
  
  /*
    Construtores
  */
  
  /*
    Get's & Set's
  */
  
  /*
    Demais métodos
  */
  public void iniciarControllerOpcoes (ViewOpcoes view) {
    atribuirCaminhosPadrao(view);
  }
  public void criarSobre () {
    ViewSobre view = new ViewSobre();
    view.setLocationRelativeTo(null);
    view.setVisible(true);
  }
  public String[] getCaminhos (ViewOpcoes view) {
    String[] caminho = new String[8];
    if (!"".equals(view.getTxtArquivoPasta().getText())) {
      caminho[0] = view.getTxtArquivoPasta().getText();  
    }
    if (!"".equals(view.getTxtArquivoPastaDestino().getText())) {
      caminho[1] = view.getTxtArquivoPastaDestino().getText();
    }
    if (!"".equals(view.getTxtSelecao().getText())) {
      caminho[2] = view.getTxtSelecao().getText();
    }
    if (!"".equals(view.getTxtSelecaoDestino().getText())) {
      caminho[3] = view.getTxtSelecaoDestino().getText();  
    }
    if (!"".equals(view.getTxtRenomearLote().getText())) {
      caminho[4] = view.getTxtRenomearLote().getText();
    }
    if (!"".equals(view.getTxtLivos().getText())) {
      caminho[5] = view.getTxtLivos().getText();
    }
    if (!"".equals(view.getTxtAutores().getText())) {
      caminho[6] = view.getTxtAutores().getText();
    }
    if (!"".equals(view.getTxtMusicas().getText())) {
      caminho[7] = view.getTxtMusicas().getText();
    }
    return caminho;
  }
  public String montarContreudoEscrita (String[] caminhos) {
    String retorno = new String();
    for (int i = 0; i < caminhos.length; i++) {
      retorno += String.format("%s%s", caminhos[i], System.getProperty("line.separator"));
    }
    return retorno;
  }
  public void atribuirCaminhosPadrao (ViewOpcoes view) {
    String[] caminhos = carregarCaminhos();
    view.getLblAtualArquivoPasta().setText("Caminho atual:  " + caminhos[0]);
    view.getLblAtualDestino().setText("Caminho atual:  " + caminhos[1]);
    view.getLblAtualSelecao().setText("Caminho atual:  " + caminhos[2]);
    view.getLblSelecaoDestinoAtual().setText("Caminho atual:  " + caminhos[3]);
    view.getLblAtualRenomearLote().setText("Caminho atual:  " + caminhos[4]);
    view.getLblAtualLivros().setText("Caminho atual:  " + caminhos[5]);
    view.getLblAutoresAtual().setText("Caminho atual:  " + caminhos[6]);
    view.getLblAtualMusicas().setText("Caminho atual:  " + caminhos[7]);
    view.getTxtArquivoPasta().setText(caminhos[0]);
    view.getTxtArquivoPastaDestino().setText(caminhos[1]);
    view.getTxtSelecao().setText(caminhos[2]);
    view.getTxtSelecaoDestino().setText(caminhos[3]);
    view.getTxtRenomearLote().setText(caminhos[4]);
    view.getTxtLivos().setText(caminhos[5]);
    view.getTxtAutores().setText(caminhos[6]);
    view.getTxtMusicas().setText(caminhos[7]);
  }
  public String[] carregarCaminhos () {
    String conteudo = new String();
    ModelOpces model = new ModelOpces();
    boolean primeiroArquivo = model.arquivoExiste(PATH);
    if (!primeiroArquivo) {
      model.escreverArquivoBase(PATH, primeiroCaminho());
      conteudo = model.carregarArquivoBase(PATH);
    } else {
      conteudo = model.carregarArquivoBase(PATH);
    }
    String aux[] = conteudo.split(System.getProperty("line.separator"));
    return aux;
  }
  public void procurarPasta (JTextField txt) {
    JFileChooser sela = new JFileChooser("C:\\");
    sela.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION) {
      if (sela.getSelectedFile().getAbsolutePath().length() <= 3) {
        txt.setText(sela.getSelectedFile().getAbsolutePath());
      } else {
        txt.setText(sela.getSelectedFile().getAbsolutePath() + "\\");
      }
    }
  }
  public void procurarArquivo (JTextField txt) {
    JFileChooser sela = new JFileChooser("C:\\");
    sela.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION) {
      if (sela.getSelectedFile().getAbsolutePath().length() <= 3) {
        txt.setText(sela.getSelectedFile().getAbsolutePath());
      } else {
        txt.setText(sela.getSelectedFile().getAbsolutePath() + "\\");
      }
    }
  }
  public void salvarCaminhos (ViewOpcoes view) {
    String[] aux = getCaminhos(view);
    String conteudo = montarContreudoEscrita(aux);
    ModelOpces model = new ModelOpces();
    model.escreverArquivoBase(PATH, conteudo);
    atribuirCaminhosPadrao(view);
  }
  private String primeiroCaminho () {
    String retorno = new String();
    for (int i = 0; i < 8; i++) {
      retorno += String.format("%s%s", "C:\\", System.getProperty("line.separator"));
    }
    return retorno;
  }
  public void btnSair (ViewOpcoes view) {
    view.dispose();
  }
}
