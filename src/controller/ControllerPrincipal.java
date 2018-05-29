
package controller;

import view.ViewLote;
import view.ViewNomeLivros;
import view.ViewNomeMusicas;
import view.ViewOpcoes;
import view.ViewRenomearPasta;

public class ControllerPrincipal {
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
  public void btnPastas () {
    ViewRenomearPasta viewRenomear = new ViewRenomearPasta();
    viewRenomear.setSelecionarArquivos(false);
    viewRenomear.iniciar();
    viewRenomear.setLocationRelativeTo(null);
    viewRenomear.setVisible(true);
  }
  public void btnSelecao () {
    ViewRenomearPasta viewRenomear = new ViewRenomearPasta();
    viewRenomear.setSelecionarArquivos(true);
    viewRenomear.iniciar();
    viewRenomear.setLocationRelativeTo(null);
    viewRenomear.setVisible(true);
  }
  public void btnLote () {
    ViewLote view = new ViewLote();
    view.setLocationRelativeTo(null);
    view.setVisible(true);
  }
  public void btnLivros () {
    ViewNomeLivros view = new ViewNomeLivros();
    view.setLocationRelativeTo(null);
    view.setVisible(true);
  }
  public void btnMusica () {
    ViewNomeMusicas view = new ViewNomeMusicas();
    view.setLocationRelativeTo(null);
    view.setVisible(true);
  }
  public void btnOpcoes () {
    ViewOpcoes view = new ViewOpcoes();
    view.setLocationRelativeTo(null);
    view.setVisible(true);
  }
}
