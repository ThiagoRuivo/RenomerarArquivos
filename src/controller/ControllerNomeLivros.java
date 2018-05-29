package controller;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.ModelNomeLivros;
import view.ViewNomeLivros;

public class ControllerNomeLivros {
  //<editor-fold defaultstate="collapsed" desc="Campos">
  private int num;
  private final String PATH = "..\\src\\main\\ArquivoBase.txt";
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Construtores">
  public void ControllerNomeLivros () {
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
  public void iniciarControllerNomeLivros (ViewNomeLivros view) {
    //setPathAutores(view.getTxtAutores());
    setCaminhoIniciais(view.getTxtAutores(), view.getTxtArquivos());
    estadoIniciarTextField(view);
    carregarAutores(view.getTxtAutores().getText(), view.getCboAutor());
    inserirColunasTabela(view.getTblLivros());
    txtDisciplina(view);
    //ordenarAutores(view.getTxtAutores().getText(), view.getCboAutor());
    txtTitulo(view);
    cboAutor(view);
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Dinâmica da View">
  public void desabilitarCampos () { 
  }
  public void agrguparBotoes () { 
  }
  public void fechar () {
  }
  public void limpar (ViewNomeLivros view) {
    view.getTxtTitulo().setText("");
  }
  public void validar () {
  }
  public void buscar () { 
  }
  public void ativarTextField (JTextField txt, boolean isAtivo) {
    txt.setEnabled(isAtivo);
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Demais métodos">

  //<editor-fold defaultstate="collapsed" desc="Ações dos botões">
  public void btnSalvar () {
  }
  public void btnLimpar () {
  }
  public void btnBuscar () {
  }
  public void btnFechar (ViewNomeLivros view) {
    view.dispose();
  }
  public void btnProcurarArquivos (JTable tbl, JTextField txt) {
    selecionarPasta(txt);
    carregarArquivos(tbl, txt.getText());
  }
  public void btnProcurarAutores (JTextField txt, JComboBox cbo) {
    selecionarArquivo(txt, "txt", cbo);
  }
  public void btnAdicionarAutor (String path, JComboBox cbo) {
    adicionarAutor(path, cbo);
  }
  public void btnRenomear (ViewNomeLivros view) {
    gravarArquivo(view);
    limpar(view);
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Eventos">

  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Listerner's">
  public void txtTitulo (ViewNomeLivros view) {
    view.getTxtTitulo().getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
    });
  }
  public void txtDisciplina (ViewNomeLivros view) {
    view.getTxtDisciplina().getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
      @Override
      public void removeUpdate(DocumentEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
      @Override
      public void changedUpdate(DocumentEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
    });
  }
  public void cboAutor (ViewNomeLivros view) {
    ItemListener lst = new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        view.getTxtArquivoFinal().setText(montarNomeArquivoFinal(view));
      }
    };
    view.getCboAutor().addItemListener(lst);
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Privados">
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
  private void estadoIniciarTextField (ViewNomeLivros view) {
    ativarTextField(view.getTxtArquivos(), false);
    ativarTextField(view.getTxtAutores(), false);
    ativarTextField(view.getTxtArquivoOriginal(), false);
    ativarTextField(view.getTxtArquivoFinal(), false);
  }
  private void setCaminhoIniciais (JTextField txtAutores, JTextField txtArquivos) {
    ModelNomeLivros model = new ModelNomeLivros();
    String[] caminhos = model.selecionarCaminhoOrigem(PATH);
    txtAutores.setText(caminhos[6]);
    txtArquivos.setText(caminhos[5]);
  }
  private void carregarArquivos (JTable tbl, String path) {
    DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
    int tamanho = dtm.getRowCount();
    for (int i = 0; i < tamanho; i++) {
      dtm.removeRow(0);
    }
    ModelNomeLivros model = new ModelNomeLivros();
    if (!"".equals(path)) {
      File[] arquivos = model.selectAll(path);
      for (int i = 0; i < arquivos.length; i++) {
        String[] linha = new String[2];
        linha[0] = arquivos[i].getAbsolutePath();
        linha[1] = arquivos[i].getName();
        dtm.addRow(linha);
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
  private void carregarAutores (String path, JComboBox cbo) {
    ItemListener[] lst = cbo.getItemListeners();
    cbo.removeItemListener(lst[0]);
    ModelNomeLivros model = new ModelNomeLivros();
    if (!"".equals(path)) {
      String[] autores = model.selectAutores(path);
      cbo.removeAllItems();
      for (int i = 0; i < autores.length; i++) {
        String nome = String.format("%s - %s", autores[i], montarNomeAutor(autores[i]));
        cbo.addItem(nome);
      }
    }
    cbo.addItemListener(lst[0]);
  }
  private String montarNomeAutor (String nome) {
    String retorno = new String();
    nome = nome.trim();
    String[] aux = nome.split(" ");
    int last = aux.length - 1;
    if (last == 0) {
      retorno += String.format("%s. ", aux[last].toUpperCase());
    } else {
      retorno += String.format("%s, ", aux[last].toUpperCase());
    }
    for (int i = 0; i < aux.length - 1; i++) {
      retorno += String.format("%s. ", aux[i].charAt(0));
    }
    return retorno;
  }
  private void adicionarAutor (String path, JComboBox cbo) {
    ItemListener[] lst = cbo.getItemListeners();
    cbo.removeItemListener(lst[0]);
    ModelNomeLivros model = new ModelNomeLivros();
    String nome = JOptionPane.showInputDialog(null, "Nome do autor:");
    if ((!"".equals(path)) && (!"".equals(nome))) {
      model.insertAutor(path, nome);
      carregarAutores(path, cbo);
      ordenarAutores(path, cbo);
    }
    cbo.addItemListener(lst[0]);
  }
  private String montarCaminhoAbsolutoFinal (ViewNomeLivros view) {
    String arquivo = view.getTxtArquivoOriginal().getText();
    int inicial = arquivo.lastIndexOf(".");
    int fim = arquivo.length();
    String ext = arquivo.substring(inicial, fim);
    String path = String.format("%s%s%s", view.getTxtArquivos().getText(), view.getTxtArquivoFinal().getText(), ext);
    return path;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Púlblicos">
  public void imprimirPublic () {
    System.out.println("");
  }
  public void selecionarArquivo (JTextField txt, String ext, JComboBox cbo) {
    JFileChooser sela = new JFileChooser("C:\\");
    sela.setFileSelectionMode(JFileChooser.FILES_ONLY);
    sela.setFileFilter(new FileNameExtensionFilter(".txt", ext));
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION) {
      txt.setText(sela.getSelectedFile().getAbsolutePath() + "\\");
      carregarAutores(txt.getText(), cbo);
    }
  }
  public void selecionarPasta (JTextField txt) {
    JFileChooser sela = new JFileChooser("E:\\Meus Arquivos\\Livros Filosofia");
    sela.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION) {
      txt.setText(sela.getSelectedFile().getAbsolutePath() + "\\");
    }
  }
  public void carregarAlteracao (ViewNomeLivros view) {
    DefaultTableModel dtm = (DefaultTableModel) view.getTblLivros().getModel();
    int linha = view.getTblLivros().getSelectedRow();
    if (linha >= 0) {
      view.getTxtArquivoOriginal().setText((String) dtm.getValueAt(linha, 0));
    }
  }
  public String montarNomeArquivoFinal (ViewNomeLivros view) {
    String retorno = new String();
    String fullName = (String) view.getCboAutor().getSelectedItem();
    String[] aux = fullName.split(" - ");
    if (!"".equals(view.getTxtDisciplina().getText())) {
      retorno += String.format("%s - ", view.getTxtDisciplina().getText());
    }
    retorno += String.format("%s", aux[1]);
    retorno += String.format("%s", view.getTxtTitulo().getText());
    return retorno;
  }
  public void gravarArquivo (ViewNomeLivros view) {
    if ((!"".equals(view.getTxtArquivos().getText())) && 
        (!"".equals(view.getTxtArquivoFinal().getText())) &&
        (!"".equals(view.getTxtArquivoOriginal().getText()))&&
        (!"".equals(view.getTxtTitulo().getText()))) {
      String nomeNovo = montarCaminhoAbsolutoFinal(view);
      ModelNomeLivros model = new ModelNomeLivros();
      model.renomearArquivo(nomeNovo, view.getTxtArquivoOriginal().getText());
      int linha = view.getTblLivros().getSelectedRow();
      carregarArquivos(view.getTblLivros(), view.getTxtArquivos().getText());
      view.getTblLivros().addRowSelectionInterval(linha + 1, linha + 1);
      carregarAlteracao(view);
      view.getTxtTitulo().requestFocus();
    }
  }
  public void ordenarAutores (String path, JComboBox cbo) {
    ModelNomeLivros model = new ModelNomeLivros();
    ItemListener[] lst = cbo.getItemListeners();
    cbo.removeItemListener(lst[0]);
    if (!"".equals(path)) {
      String[] autores = model.selectAutores(path);
      Arrays.sort(autores);
      model.inseriAutoresOrdenados(autores, path);
      carregarAutores(path, cbo);
    }
    cbo.addItemListener(lst[0]);
  }
  //</editor-fold>

  //</editor-fold>

}