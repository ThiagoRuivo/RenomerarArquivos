
package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import libdatas.Data;
import view.ViewRenomearPasta;
import model.ModelRenomearPasta;

public class ControllerRenomearPasta {
  /*
    Campos
  */
  private final String PATH = "..\\src\\main\\ArquivoBase.txt";
  private File[] lstArquivos;
  
  /*
    Construtores
  */

  /*
    Get's & Set's
  */
  public File[] getLstArquivos() {
    return lstArquivos;
  }
  public void setLstArquivos(File[] lstArquivos) {
    this.lstArquivos = lstArquivos;
  }
  
  /*
    Demais métodos
  */
  public void iniciarView (ViewRenomearPasta view) {
    setListaOpcoes(view.getCboPrimeiro());
    setListaOpcoes(view.getCboSegundo());
    setListaOpcoes(view.getCboTerceiro());
    setListaOpcoes(view.getCboQuarto());
    setListaOpcoes(view.getCboQuinto());
    inicarCampos(view);
    itemChanged(view.getCboPrimeiro(), view.getTxtPrimeiro());
    itemChanged(view.getCboSegundo(), view.getTxtSegundo());
    itemChanged(view.getCboTerceiro(), view.getTxtTerceiro());
    itemChanged(view.getCboQuarto(), view.getTxtQuarto());
    itemChanged(view.getCboQuinto(), view.getTxtQuinto());
    iniciarCbo(view.getCboPrimeiro());
    agruparBotoes(view);
    alterarCaminhoPadraoPersonalizado(view);
    setCaminhoDestinoPadrao(view.getTxtCaminhoDestinoPadrao(), view.isSelecionarArquivos());
    setCaminhoDestinoPadrao(view.getTxtCaminhoOrigem(), view.isSelecionarArquivos());
    setCaminhoPersonalizado(view.getTxtCaminhoDestinoPersonalizado(), view.isSelecionarArquivos());
  }
  private void iniciarCbo(JComboBox cbo) {
    cbo.setSelectedIndex(1);
    cbo.setSelectedIndex(0);
  }
  public void chkMudar (JComboBox cbo, JTextField txt, Boolean valor) {
    cbo.setEnabled(valor);
    txt.setEnabled(valor);
  }
  private String[] listaOpcoes () {
    String[] lista = new String[11];
    lista[0] = "Data: dd-mm-aaaa";
    lista[1] = "Data: aaaa-mm-dd";
    lista[2] = "Data: dd.mm.aaaa";
    lista[3] = "Data: aaaa.mm.dd";
    lista[4] = "Data: ddmmaaaa";
    lista[5] = "Data: aaaammdd";
    lista[6] = "Underline: _";
    lista[7] = "Ponto: .";
    lista[8] = "Traço: -";
    lista[9] = "Espaço vazio: ";
    lista[10] = "Personalizado";
    return lista;
  }
  private void setListaOpcoes (JComboBox cbo) {
    cbo.removeAllItems();
    String[] opcoes = listaOpcoes();
    for (int i = 0; i < opcoes.length; i++) {
      cbo.addItem(opcoes[i]);
    }
  }
  private void inicarCampos (ViewRenomearPasta view) {
    view.getChkPrimeiro().setSelected(true);
    view.getChkSegundo().setSelected(false);
    view.getChkTerceiro().setSelected(false);
    view.getChkQuarto().setSelected(false);
    view.getChkQuinto().setSelected(false);
    view.getChkPrimeiro().setEnabled(false);
    view.getCboSegundo().setEnabled(false);
    view.getCboTerceiro().setEnabled(false);
    view.getCboQuarto().setEnabled(false);
    view.getCboQuinto().setEnabled(false);
    view.getTxtSegundo().setEnabled(false);
    view.getTxtTerceiro().setEnabled(false);
    view.getTxtQuarto().setEnabled(false);
    view.getTxtQuinto().setEnabled(false);
    view.getTxtCaminhoDestinoPadrao().setEnabled(false);
  }
  private String padraoNomenclatura (int valor) {
    Data da = new Data();
    String str = "";
    switch (valor) {
      case 0:
        str = String.format("%02d-%02d-%d", da.getDia(), da.getMes(), da.getAno());
        return str;
      case 1:
        str = String.format("%d-%02d-%02d", da.getAno(), da.getMes(), da.getDia());
        return str;
      case 2:
        str = String.format("%02d.%02d.%d", da.getDia(), da.getMes(), da.getAno());
        return str;
      case 3:
        str = String.format("%d.%02d.%02d", da.getAno(), da.getMes(), da.getDia());
        return str;
      case 4:
        str = String.format("%02d%02d%d", da.getDia(), da.getMes(), da.getAno());
        return str;
      case 5:
        str = String.format("%d%02d%02d", da.getAno(), da.getMes(), da.getDia());
        return str;
      case 6:
        return "_";
      case 7:
        return ".";
      case 8:
        return "-";
      case 9:
        return " ";
      case 10:
        str = "Novo";
        return str;
      default:
        return str;
    }
  }
  private void agruparBotoes (ViewRenomearPasta view) {
    view.getGbtnDestino().add(view.getBtrPadrao());
    view.getGbtnDestino().add(view.getBtrPersonalizado());
    view.getBtrPadrao().setSelected(true);
  }
  public void alterarCaminhoPadraoPersonalizado(ViewRenomearPasta view) {
    if (view.getBtrPadrao().isSelected()) {
      view.getTxtCaminhoDestinoPersonalizado().setEnabled(false);
      view.getBtnProcurarDestino().setEnabled(false);
    } else {
      view.getTxtCaminhoDestinoPadrao().setEnabled(false);
      view.getTxtCaminhoDestinoPersonalizado().setEnabled(true);
      view.getTxtCaminhoDestinoPersonalizado().requestFocus();
      view.getBtnProcurarDestino().setEnabled(true);
    }
  }
  public void setCaminhoDestinoPadrao (JTextField txt, boolean selArquivos) {
    ModelRenomearPasta model = new ModelRenomearPasta();
    String[] caminhos = model.selecionarCaminhoOrigem(PATH);
    if (selArquivos) {
      txt.setText(caminhos[2]);
    } else {
      txt.setText(caminhos[0]);
    }
    txt.requestFocus();
  }
  public void setCaminhoPersonalizado (JTextField txt, boolean selArquivos) {
    ModelRenomearPasta model = new ModelRenomearPasta();
    String[] caminhos = model.selecionarCaminhoOrigem(PATH);
    if (selArquivos) {
      txt.setText(caminhos[3]);
    } else {
      txt.setText(caminhos[1]);
    }
  }
  public void btnSair (ViewRenomearPasta view) {
    view.dispose();
  }
  private String getNomeArquivo (ViewRenomearPasta view) {
    String str = "";
    str = view.getTxtPrimeiro().getText();
    if (view.getChkSegundo().isSelected()) {
      str += String.format("%s", view.getTxtSegundo().getText());
    }
    if (view.getChkTerceiro().isSelected()) {
      str += String.format("%s", view.getTxtTerceiro().getText());
    }
    if (view.getChkQuarto().isSelected()) {
      str += String.format("%s", view.getTxtQuarto().getText());
    }
    if (view.getChkQuinto().isSelected()) {
      str += String.format("%s", view.getTxtQuinto().getText());
    }
    return str;
  }
  public void renomearArquivos (ViewRenomearPasta view) {
    ModelRenomearPasta model = new ModelRenomearPasta();
    String nome = getNomeArquivo(view);
    String nomeAbsoluto = new String();
    if (view.getBtrPadrao().isSelected()) {
      model.criarPasta(view.getTxtCaminhoDestinoPadrao().getText());
    } else {
      model.criarPasta(view.getTxtCaminhoDestinoPersonalizado().getText());
    }
    if (!view.isSelecionarArquivos()) {
      this.lstArquivos = model.getListaArquivos(view.getTxtCaminhoOrigem().getText());
    }
    if (this.lstArquivos != null) {
      for (int i = 0; i < this.lstArquivos.length; i++) {
        if (this.lstArquivos[i].isFile()) {
          int ini = this.lstArquivos[i].getName().lastIndexOf(".");
          int fin = this.lstArquivos[i].getName().length();
          String aux = this.lstArquivos[i].getName().substring(ini, fin);
          if (view.getBtrPadrao().isSelected()) {
            nomeAbsoluto = String.format("%s%s - %07d%s", view.getTxtCaminhoDestinoPadrao().getText(), nome, i + 1, aux.toLowerCase());
          } else {
            nomeAbsoluto = String.format("%s%s - %07d%s", view.getTxtCaminhoDestinoPersonalizado().getText(), nome, i + 1, aux.toLowerCase());
          }
          model.renomearArquivo(nomeAbsoluto, this.lstArquivos[i].getAbsolutePath());
        }
      }
    }
  }
  public File[] procurarCaminho (ViewRenomearPasta view) {
    JFileChooser sela = new JFileChooser(view.getTxtCaminhoOrigem().getText());
    if (view.isSelecionarArquivos()) {
      sela.setFileSelectionMode(JFileChooser.FILES_ONLY);
      sela.setMultiSelectionEnabled(true);
    } else {
      sela.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION)  {
      if (view.isSelecionarArquivos()) {
        this.lstArquivos = sela.getSelectedFiles();
        String nome = sela.getSelectedFiles()[0].getName();
        String aux = sela.getSelectedFiles()[0].getAbsolutePath().replace(nome, "");
        view.getTxtCaminhoOrigem().setText(aux);
        view.getTxtCaminhoDestinoPadrao().setText(aux + "Renomear\\");
      } else {
        view.getTxtCaminhoOrigem().setText(sela.getSelectedFile().getAbsolutePath()+ "\\");
        view.getTxtCaminhoDestinoPadrao().setText(sela.getSelectedFile().getAbsolutePath() + "\\Renomear\\");
      }
    }
    return this.lstArquivos;
  }
  public void procurarCaminhoPersonalizado (ViewRenomearPasta view) {
    JFileChooser sela = new JFileChooser(view.getTxtCaminhoOrigem().getText());
    sela.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int resposta = sela.showOpenDialog(null);
    if (resposta == JFileChooser.APPROVE_OPTION)  {
      view.getTxtCaminhoDestinoPersonalizado().setText(sela.getSelectedFile().getAbsolutePath() + "\\");
    }
  }
  /*
    Listener
  */
  public void itemChanged (JComboBox cbo, JTextField txt) {
    ItemListener lst = new ItemListener () {
      @Override
      public void itemStateChanged(ItemEvent e) {
        txt.setText(padraoNomenclatura(cbo.getSelectedIndex()));
        
      }
    };
    cbo.addItemListener(lst);
  }

 
}
