
package controller;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.ModelLote;
import view.ViewLote;

public class ControllerLote {
  /*
    Campos
  */
  private final String PATH = "..\\src\\main\\ArquivoBase.txt";
  private String[] colunasTabelas;

  /*
    Construtores
  */

  /*
    Get's & Set's
  */
  public String[] getColunasTabelas() {
    return colunasTabelas;
  }
  public void setColunasTabelas(String[] colunasTabelas) {
    this.colunasTabelas = colunasTabelas;
  }
  
  /*
    Ação dos botões
  */
  public void btnProcuar (ViewLote view) {
    carregarArquivos(view.getTxtCaminho(), view.getTblArquivos());
  }
  public void btnFechar (ViewLote view) {
    view.dispose();
  }
  public void btnRenomear(ViewLote view) {
    renomearArquivos(view);
  }

  /*
    Demais métodos
  */
  public void iniciarControllerLote(ViewLote view) {
    view.getTxtCaminho().setEditable(false);
    carregarColunas(view.getTblArquivos());
    caregarCaminhoInicial(view);
    view.getTblArquivos().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
  public void caregarCaminhoInicial (ViewLote view) {
    ModelLote model = new ModelLote();
    String[] caminhos = model.selecionarCaminhoOrigem(PATH);
    view.getTxtCaminho().setText(caminhos[4]);
  }
  public void carregarColunas (JTable tbl) {
    tbl.setModel(new DefaultTableModel(    
     new Object [][] { },    
     new String [] {"Nome Original", "Caminho Absoluto", "Nome Novo", "Extensão"}){  
         boolean[] canEdit = new boolean []{    
             false, false, true, false
         };    
         @Override    
         public boolean isCellEditable(int rowIndex, int columnIndex) {    
             return canEdit [columnIndex];    
         }  
    });
    tbl.getColumnModel().getColumn(0).setPreferredWidth(100);
    tbl.getColumnModel().getColumn(1).setPreferredWidth(250);
    tbl.getColumnModel().getColumn(2).setPreferredWidth(250);
    tbl.getColumnModel().getColumn(3).setPreferredWidth(30);
  }
  private void carregarArquivos (JTextField txt, JTable tbl) {
    JFileChooser sela = new JFileChooser("F:\\");
    sela.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION) {
      txt.setText(sela.getSelectedFile().getAbsolutePath());
    }
    ModelLote model = new ModelLote();
    File[] listaArquivos = model.selecionarArquivos(txt.getText() + "\\");
    carregarArquivosTabela(listaArquivos, tbl);
  }
  private void carregarArquivosTabela (File[] arquivos, JTable tbl) {
    DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
    String[] linhas = new String[4];
    for (int i = 0; i < arquivos.length; i++) {
      if (arquivos[i].isFile()) {
        linhas[0] = arquivos[i].getName();
        linhas[1] = arquivos[i].getAbsolutePath();
        linhas[2] = extrairNome(arquivos[i].getName());
        linhas[3] = extrairExtensao(arquivos[i].getName());
        dtm.addRow(linhas);
      }
    }
    tbl.setModel(dtm);
    for (int i = 0; i < tbl.getRowCount(); i++) {
      tbl.setRowHeight(i, 20);
    }
  }
  public void renomearArquivos (ViewLote view) {
    DefaultTableModel dtm = (DefaultTableModel) view.getTblArquivos().getModel();
    ModelLote model = new ModelLote();
    String caminhoRaiz = view.getTxtCaminho().getText() + "\\";
    boolean valido = false;
    for (int i = 0; i < dtm.getRowCount(); i++) {
      String nomeAntigoCompleto = (String) dtm.getValueAt(i, 1);
      String nomeAntigo = (String) dtm.getValueAt(i, 0);
      String nomeNovoCompleto = caminhoRaiz + montarNomeExtensao((String) dtm.getValueAt(i, 2), (String) dtm.getValueAt(i, 3));
      String nomeNovo = (String) dtm.getValueAt(i, 2);
      if (!isNomeIgual(nomeAntigoCompleto, nomeNovoCompleto)) {
        if (isNomeValido(nomeNovo) && isNomeValido(nomeAntigo)) {
          model.renomearArquivo(nomeNovoCompleto, nomeAntigoCompleto);
          valido = true;
        }
      }
    }
    if (valido) {
      int tamanho = dtm.getRowCount();
      for (int i = 0; i < tamanho; i++) {
        dtm.removeRow(0);
      }
      File[] arquivos = model.selecionarArquivos(caminhoRaiz + "\\");
      carregarArquivosTabela(arquivos, view.getTblArquivos());
    }
  }
  private String extrairNome (String nome) {
    int ini = nome.lastIndexOf(".");
    int fin = nome.length();
    String ext = nome.substring(ini, fin);
    String auxNome = nome.replace(ext, "");
    return auxNome;
  }
  private String extrairExtensao (String nome) {
    int ini = nome.lastIndexOf(".");
    int fin = nome.length();
    String extensao = nome.substring(ini, fin);
    return extensao;
  }
  private String montarNomeExtensao (String nome, String ext) {
    return String.format("%s%s", nome, ext);
  }
  private boolean isNomeIgual (String nome1, String nome2) {
    return nome1.equals(nome2);
  }
  private boolean isNomeValido (String nome) {
    char[] aux = nome.toCharArray();
    String[] vet = new String[aux.length];
    for (int i = 0; i < aux.length; i++) {
      vet[i] = Character.toString(aux[i]);
    }
    if (vet.length == 0) {
      return false;
    }
    for (int i = 0; i < vet.length; i++) {
      if (      "\\".equals(vet[i])
              || "/".equals(vet[i])
              || ":".equals(vet[i])
              || "*".equals(vet[i])
              || "?".equals(vet[i])
              || "\"".equals(vet[i])
              || "<".equals(vet[i])
              || ">".equals(vet[i])
              || "|".equals(vet[i])) {
        return false;
      }
    }
    return true;
  }
  /*
    Listeners
  */
  
}
