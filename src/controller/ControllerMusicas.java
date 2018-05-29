package controller;

import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.ModelMusicas;
import view.ViewNomeMusicas;

public class ControllerMusicas {
  //<editor-fold defaultstate="collapsed" desc="Campos">
  private final String PATH = "..\\src\\main\\ArquivoBase.txt";
  private int num;
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Construtores">
  public void ControllerMusicas () {
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Get's ans Set's">
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Inicialização">
  public void iniciarControllerMusicas (ViewNomeMusicas view) {
    setCaminhoOrigemInicial(view.getTxtCaminhoArquivos());
    inserirColunasTabela(view.getTblArquivos());
    desabilitarCampos(view);
    txtCaminhoAbsoluto(view);
    txtArtista(view);
    txtTitulo(view);
    txtNumero(view);
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Dinâmica da View">
  public void carregarComboBox () { 
  }
  public void desabilitarCampos (ViewNomeMusicas view) {
    view.getTxtCaminhoArquivos().setEnabled(false);
    view.getTxtCaminhoAbsoluto().setEnabled(false);
    view.getTxtNovoNome().setEnabled(false);
  }
  public void agrguparBotoes () { 
  }
  public void fechar (ViewNomeMusicas view) {
    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    view.dispose();
  }
  public void limpar () {
  }
  public void validar () {
  }
  public void buscar () { 
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Demais métodos">

  //<editor-fold defaultstate="collapsed" desc="Ações dos botões">
  public void btnSalvar () {
  }
  public void btnRenomear (ViewNomeMusicas view) {
    renomearArquivo(view);
  }
  public void btnProcurar (JTextField txt, JTable tbl) {
    selecionarPasta(txt);
    carregarArquivos(tbl, txt.getText());
  }
  public void btnFechar (ViewNomeMusicas view) {
    fechar(view);
  }
  public void chkParaTodos () {
    
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Eventos">
  public void tabelaClick (JTable tbl) {
    
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Listerner's">
  private void txtCaminhoAbsoluto (ViewNomeMusicas view) {
    view.getTxtCaminhoAbsoluto().getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
    });
  }
  private void txtArtista (ViewNomeMusicas view) {
    view.getTxtArtista().getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
    });
  }
  private void txtTitulo (ViewNomeMusicas view) {
    view.getTxtTitulo().getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
    });
  }
  private void txtNumero (ViewNomeMusicas view) {
    view.getTxtNumero().getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        gerarCaminhoAbsolutoNovo(view);
      }
    });
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Privados">
  private void imprimirPrivate () {
    System.out.println("");
  }
  private void inserirColunasTabela (JTable tbl) {
    tbl.setModel(new DefaultTableModel(    
    new Object [][] { },    
    new String [] {"Caminho Absoluto", "Nome Arquivo"}){  
      boolean[] canEdit = new boolean []{    
        false, false
      };    
      @Override    
      public boolean isCellEditable(int rowIndex, int columnIndex) {    
        return canEdit [columnIndex];    
      }  
    });
  }
  private void carregarArquivos (JTable tbl, String path) {
    DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
    int tamanho = dtm.getRowCount();
    for (int i = 0; i < tamanho; i++) {
      dtm.removeRow(0);
    }
    ModelMusicas model = new ModelMusicas();
    if (!"".equals(path)) {
      File[] arquivos = model.selectAll(path);
      for (int i = 0; i < arquivos.length; i++) {
        if (arquivos[i].isFile()) {
          if (arquivos[i].getName().endsWith(".mp3") || 
              arquivos[i].getName().endsWith(".wma") ||
              arquivos[i].getName().endsWith(".wav")) {
            String[] linha = new String[2];
            linha[0] = arquivos[i].getAbsolutePath();
            linha[1] = arquivos[i].getName();
            dtm.addRow(linha);
          }
        }
      }
      tbl.setModel(dtm);
      for (int i = 0; i < tbl.getRowCount(); i++) {
        tbl.setRowHeight(23);
      }
      Dimension d = new Dimension();
      d.setSize(850, tbl.getRowCount() * 25);
      tbl.setPreferredSize(d);
    }
  }
  private String montarNomeArquivo (String artista, String nome, int numero) {
    String retorno = "";
    if (!"".equals(artista)) {
      if (!"".equals(nome)) {
        if (numero != 0) {
          retorno = String.format("%03d. %s - %s", numero, artista, nome);
        } else {
          retorno = String.format("%s - %s", artista, nome);
        }
      } else {
        if (numero != 0) {
          retorno = String.format("%03d. %s", numero, artista);
        } else {
          retorno = String.format("%s", artista);
        }
      }
    } else  {
      if (!"".equals(nome)) {
        if (numero != 0) {
          retorno = String.format("%03d. %s", numero, nome);
        } else {
          retorno = String.format("%s", nome);
        }
      } else {
        if (numero != 0) {
          retorno = String.format("%03d", numero);
        }
      }
    }
    return retorno;
  }
  private String montarCaminhoAbsoluto (String caminhoAntigo, String novoNome, String path) {
    String retorno = "";
    if ((!"".equals(caminhoAntigo) && (!"".equals(novoNome)))) {
      int inicio = caminhoAntigo.lastIndexOf(".");
      int fim = caminhoAntigo.length();
      String ext = caminhoAntigo.substring(inicio, fim);
      retorno = String.format("%s%s%s", path, novoNome, ext);
    }
    return retorno;
  }
  private void limparCampos (ViewNomeMusicas view) {
    if (view.getChkParaTodos().isSelected()) {
      view.getTxtTitulo().setText("");
      view.getTxtTitulo().requestFocus();
    } else {
      view.getTxtTitulo().setText("");
      view.getTxtArtista().setText("");
      view.getTxtNumero().setText("");
      view.getTxtArtista().requestFocus();
    }
  }
  private void renomearArquivo (ViewNomeMusicas view) {
    int linha = view.getTblArquivos().getSelectedRow();
    if (linha < 0) {
      JOptionPane.showMessageDialog(null, "Não há músicas selecionadas.");
    } else {
      if ((!"".equals(view.getTxtCaminhoAbsoluto().getText()) && (!"".equals(view.getTxtNovoNome().getText()))) ) {
        ModelMusicas model = new ModelMusicas();
        model.renomearArquivo(view.getTxtNovoNome().getText(), view.getTxtCaminhoAbsoluto().getText());
      }
    }
    carregarArquivos(view.getTblArquivos(), view.getTxtCaminhoArquivos().getText());
    System.out.println(linha);
    System.out.println(view.getTblArquivos().getRowCount());
    if (linha < view.getTblArquivos().getRowCount() - 1) {
      view.getTblArquivos().addRowSelectionInterval(linha + 1, linha + 1);
      transferirDados(view);
      if (view.getChkParaTodos().isSelected()) {
        int numero = Integer.parseInt(view.getTxtNumero().getText());
        numero++;
        view.getTxtNumero().setText(Integer.toString(numero));
      }
    } else {
      view.getTblArquivos().addRowSelectionInterval(0, 0);
      transferirDados(view);
      if (view.getChkParaTodos().isSelected()) {
        int numero = Integer.parseInt(view.getTxtNumero().getText());
        numero++;
        view.getTxtNumero().setText(Integer.toString(numero));
      }
    }
    System.out.println(view.getTblArquivos().getSelectedRow());
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Púlblicos">
  public void imprimirPublic () {
    System.out.println("");
  }
  public void selecionarPasta (JTextField txt) {
    JFileChooser sela = new JFileChooser("E:\\");
    sela.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION) {
      txt.setText(sela.getSelectedFile().getAbsolutePath() + "\\");
    }
  }
  public void transferirDados (ViewNomeMusicas view) {
    int linha = 0;
    try {
      linha = view.getTblArquivos().getSelectedRow();
      view.getTxtCaminhoAbsoluto().setText((String) view.getTblArquivos().getValueAt(linha, 0));
      view.getTxtArtista().requestFocus();
      limparCampos(view);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Não há arquivos na tabela.\n" + e);
    }
  }
  public void gerarCaminhoAbsolutoNovo (ViewNomeMusicas view) {
    int numero = 0;
    if (!"".equals(view.getTxtNumero().getText())) {
      try {
        numero = Integer.parseInt(view.getTxtNumero().getText());
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
      }
    }
    String nome = montarNomeArquivo(view.getTxtArtista().getText(), view.getTxtTitulo().getText(), numero);
    String ss = montarCaminhoAbsoluto(view.getTxtCaminhoAbsoluto().getText(), nome, view.getTxtCaminhoArquivos().getText());
    view.getTxtNovoNome().setText(ss);
  }
  public void setCaminhoOrigemInicial (JTextField txt) {
    ModelMusicas model = new ModelMusicas();
    String[] caminhos = model.selecionarCaminhoOrigem(PATH);
    txt.setText(caminhos[7]);
  }
  //</editor-fold>

  //</editor-fold>

}