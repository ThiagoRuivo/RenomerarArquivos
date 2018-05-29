
package view;

import controller.ControllerRenomearPasta;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ViewRenomearPasta extends javax.swing.JFrame {
  /*
    Campos
  */
  private boolean selecionarArquivos;
  private File[] arquivos;

  /*
    Construtores
  */
  public ViewRenomearPasta() {
    initComponents();
  }
  
  /*
    Get's & Set's
  */
  public File[] getArquivos() {
    return arquivos;
  }
  public void setArquivos(File[] arquivos) {
    this.arquivos = arquivos;
  }
  public boolean isSelecionarArquivos() {
    return selecionarArquivos;
  }
  public void setSelecionarArquivos(boolean selecionarArquivos) {
    this.selecionarArquivos = selecionarArquivos;
  }
  public javax.swing.JButton getBtnRenomear() {
    return btnRenomear;
  }
  public void setBtnRenomear(javax.swing.JButton btnRenomear) {
    this.btnRenomear = btnRenomear;
  }
  public javax.swing.JButton getBtnResetarCaminhoDestino() {
    return btnResetarCaminhoDestino;
  }
  public void setBtnResetarCaminhoDestino(javax.swing.JButton btnResetarCaminhoDestino) {
    this.btnResetarCaminhoDestino = btnResetarCaminhoDestino;
  }
  public javax.swing.JButton getBtnResetarCaminhoOrigem() {
    return btnResetarCaminhoOrigem;
  }
  public void setBtnResetarCaminhoOrigem(javax.swing.JButton btnResetarCaminhoOrigem) {
    this.btnResetarCaminhoOrigem = btnResetarCaminhoOrigem;
  }
  public javax.swing.JButton getBtnSair() {
    return btnSair;
  }
  public void setBtnSair(javax.swing.JButton btnSair) {
    this.btnSair = btnSair;
  }
  public JButton getBtnProcurarDestino() {
    return btnProcurarDestino;
  }
  public void setBtnProcurarDestino(JButton btnProcurarDestino) {
    this.btnProcurarDestino = btnProcurarDestino;
  }
  public JButton getBtnProcurarOrigem() {
    return btnProcurarOrigem;
  }
  public void setBtnProcurarOrigem(JButton btnProcurarOrigem) {
    this.btnProcurarOrigem = btnProcurarOrigem;
  }
  public JRadioButton getBtrPadrao() {
    return btrPadrao;
  }
  public void setBtrPadrao(JRadioButton btrPadrao) {
    this.btrPadrao = btrPadrao;
  }
  public JRadioButton getBtrPersonalizado() {
    return btrPersonalizado;
  }
  public void setBtrPersonalizado(JRadioButton btrPersonalizado) {
    this.btrPersonalizado = btrPersonalizado;
  }
  public JComboBox<String> getCboPrimeiro() {
    return cboPrimeiro;
  }
  public void setCboPrimeiro(JComboBox<String> cboPrimeiro) {
    this.cboPrimeiro = cboPrimeiro;
  }
  public JComboBox<String> getCboQuarto() {
    return cboQuarto;
  }
  public void setCboQuarto(JComboBox<String> cboQuarto) {
    this.cboQuarto = cboQuarto;
  }
  public JComboBox<String> getCboQuinto() {
    return cboQuinto;
  }
  public void setCboQuinto(JComboBox<String> cboQuinto) {
    this.cboQuinto = cboQuinto;
  }
  public JComboBox<String> getCboSegundo() {
    return cboSegundo;
  }
  public void setCboSegundo(JComboBox<String> cboSegundo) {
    this.cboSegundo = cboSegundo;
  }
  public JComboBox<String> getCboTerceiro() {
    return cboTerceiro;
  }
  public void setCboTerceiro(JComboBox<String> cboTerceiro) {
    this.cboTerceiro = cboTerceiro;
  }
  public JCheckBox getChkPrimeiro() {
    return chkPrimeiro;
  }
  public void setChkPrimeiro(JCheckBox chkPrimeiro) {
    this.chkPrimeiro = chkPrimeiro;
  }
  public JCheckBox getChkQuarto() {
    return chkQuarto;
  }
  public void setChkQuarto(JCheckBox chkQuarto) {
    this.chkQuarto = chkQuarto;
  }
  public JCheckBox getChkQuinto() {
    return chkQuinto;
  }
  public void setChkQuinto(JCheckBox chkQuinto) {
    this.chkQuinto = chkQuinto;
  }
  public JCheckBox getChkSegundo() {
    return chkSegundo;
  }
  public void setChkSegundo(JCheckBox chkSegundo) {
    this.chkSegundo = chkSegundo;
  }
  public JCheckBox getChkTerceiro() {
    return chkTerceiro;
  }
  public void setChkTerceiro(JCheckBox chkTerceiro) {
    this.chkTerceiro = chkTerceiro;
  }
  public ButtonGroup getGbtnDestino() {
    return gbtnDestino;
  }
  public void setGbtnDestino(ButtonGroup gbtnDestino) {
    this.gbtnDestino = gbtnDestino;
  }
  public JLabel getLblCaminhoDestinoPadrao() {
    return lblCaminhoDestinoPadrao;
  }
  public void setLblCaminhoDestinoPadrao(JLabel lblCaminhoDestinoPadrao) {
    this.lblCaminhoDestinoPadrao = lblCaminhoDestinoPadrao;
  }
  public JLabel getLblCaminhoDestinoPersonalizado() {
    return lblCaminhoDestinoPersonalizado;
  }
  public void setLblCaminhoDestinoPersonalizado(JLabel lblCaminhoDestinoPersonalizado) {
    this.lblCaminhoDestinoPersonalizado = lblCaminhoDestinoPersonalizado;
  }
  public JLabel getLblCaminhoOrigem() {
    return lblCaminhoOrigem;
  }
  public void setLblCaminhoOrigem(JLabel lblCaminhoOrigem) {
    this.lblCaminhoOrigem = lblCaminhoOrigem;
  }
  public JLabel getLblPrimeiro() {
    return lblPrimeiro;
  }
  public void setLblPrimeiro(JLabel lblPrimeiro) {
    this.lblPrimeiro = lblPrimeiro;
  }
  public JLabel getLblQuarto() {
    return lblQuarto;
  }
  public void setLblQuarto(JLabel lblQuarto) {
    this.lblQuarto = lblQuarto;
  }
  public JLabel getLblQuinto() {
    return lblQuinto;
  }
  public void setLblQuinto(JLabel lblQuinto) {
    this.lblQuinto = lblQuinto;
  }
  public JLabel getLblSegundo() {
    return lblSegundo;
  }
  public void setLblSegundo(JLabel lblSegundo) {
    this.lblSegundo = lblSegundo;
  }
  public JLabel getLblTerceiro() {
    return lblTerceiro;
  }
  public void setLblTerceiro(JLabel lblTerceiro) {
    this.lblTerceiro = lblTerceiro;
  }
  public JPanel getPnlDestino() {
    return pnlDestino;
  }
  public void setPnlDestino(JPanel pnlDestino) {
    this.pnlDestino = pnlDestino;
  }
  public JPanel getPnlNomenclarura() {
    return pnlNomenclarura;
  }
  public void setPnlNomenclarura(JPanel pnlNomenclarura) {
    this.pnlNomenclarura = pnlNomenclarura;
  }
  public JPanel getPnlOrigem() {
    return pnlOrigem;
  }
  public void setPnlOrigem(JPanel pnlOrigem) {
    this.pnlOrigem = pnlOrigem;
  }
  public JTextField getTxtCaminhoDestinoPadrao() {
    return txtCaminhoDestinoPadrao;
  }
  public void setTxtCaminhoDestinoPadrao(JTextField txtCaminhoDestinoPadrao) {
    this.txtCaminhoDestinoPadrao = txtCaminhoDestinoPadrao;
  }
  public JTextField getTxtCaminhoDestinoPersonalizado() {
    return txtCaminhoDestinoPersonalizado;
  }
  public void setTxtCaminhoDestinoPersonalizado(JTextField txtCaminhoDestinoPersonalizado) {
    this.txtCaminhoDestinoPersonalizado = txtCaminhoDestinoPersonalizado;
  }
  public JTextField getTxtCaminhoOrigem() {
    return txtCaminhoOrigem;
  }
  public void setTxtCaminhoOrigem(JTextField txtCaminhoOrigem) {
    this.txtCaminhoOrigem = txtCaminhoOrigem;
  }
  public JTextField getTxtPrimeiro() {
    return txtPrimeiro;
  }
  public void setTxtPrimeiro(JTextField txtPrimeiro) {
    this.txtPrimeiro = txtPrimeiro;
  }
  public JTextField getTxtQuarto() {
    return txtQuarto;
  }
  public void setTxtQuarto(JTextField txtQuarto) {
    this.txtQuarto = txtQuarto;
  }
  public JTextField getTxtQuinto() {
    return txtQuinto;
  }
  public void setTxtQuinto(JTextField txtQuinto) {
    this.txtQuinto = txtQuinto;
  }
  public JTextField getTxtSegundo() {
    return txtSegundo;
  }
  public void setTxtSegundo(JTextField txtSegundo) {
    this.txtSegundo = txtSegundo;
  }
  public JTextField getTxtTerceiro() {
    return txtTerceiro;
  }
  public void setTxtTerceiro(JTextField txtTerceiro) {
    this.txtTerceiro = txtTerceiro;
  }
  
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    gbtnDestino = new javax.swing.ButtonGroup();
    pnlOrigem = new javax.swing.JPanel();
    lblCaminhoOrigem = new javax.swing.JLabel();
    txtCaminhoOrigem = new javax.swing.JTextField();
    btnProcurarOrigem = new javax.swing.JButton();
    btnResetarCaminhoOrigem = new javax.swing.JButton();
    pnlDestino = new javax.swing.JPanel();
    btrPadrao = new javax.swing.JRadioButton();
    lblCaminhoDestinoPadrao = new javax.swing.JLabel();
    txtCaminhoDestinoPadrao = new javax.swing.JTextField();
    btrPersonalizado = new javax.swing.JRadioButton();
    lblCaminhoDestinoPersonalizado = new javax.swing.JLabel();
    txtCaminhoDestinoPersonalizado = new javax.swing.JTextField();
    btnResetarCaminhoDestino = new javax.swing.JButton();
    btnProcurarDestino = new javax.swing.JButton();
    pnlNomenclarura = new javax.swing.JPanel();
    lblPrimeiro = new javax.swing.JLabel();
    chkPrimeiro = new javax.swing.JCheckBox();
    cboPrimeiro = new javax.swing.JComboBox<>();
    txtPrimeiro = new javax.swing.JTextField();
    lblSegundo = new javax.swing.JLabel();
    chkSegundo = new javax.swing.JCheckBox();
    cboSegundo = new javax.swing.JComboBox<>();
    txtSegundo = new javax.swing.JTextField();
    lblTerceiro = new javax.swing.JLabel();
    chkTerceiro = new javax.swing.JCheckBox();
    cboTerceiro = new javax.swing.JComboBox<>();
    txtTerceiro = new javax.swing.JTextField();
    lblQuarto = new javax.swing.JLabel();
    chkQuarto = new javax.swing.JCheckBox();
    cboQuarto = new javax.swing.JComboBox<>();
    txtQuarto = new javax.swing.JTextField();
    lblQuinto = new javax.swing.JLabel();
    chkQuinto = new javax.swing.JCheckBox();
    cboQuinto = new javax.swing.JComboBox<>();
    txtQuinto = new javax.swing.JTextField();
    btnRenomear = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1000, 600));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlOrigem.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasta Origem"));
    pnlOrigem.setPreferredSize(new java.awt.Dimension(950, 75));
    pnlOrigem.setLayout(new java.awt.GridBagLayout());

    lblCaminhoOrigem.setText("Caminho");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlOrigem.add(lblCaminhoOrigem, gridBagConstraints);

    txtCaminhoOrigem.setPreferredSize(new java.awt.Dimension(450, 20));
    pnlOrigem.add(txtCaminhoOrigem, new java.awt.GridBagConstraints());

    btnProcurarOrigem.setText("Procurar");
    btnProcurarOrigem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcurarOrigemActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
    pnlOrigem.add(btnProcurarOrigem, gridBagConstraints);

    btnResetarCaminhoOrigem.setText("Resetar");
    btnResetarCaminhoOrigem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetarCaminhoOrigemActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
    pnlOrigem.add(btnResetarCaminhoOrigem, gridBagConstraints);

    getContentPane().add(pnlOrigem, new java.awt.GridBagConstraints());

    pnlDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasta Destino"));
    pnlDestino.setPreferredSize(new java.awt.Dimension(950, 175));
    pnlDestino.setLayout(new java.awt.GridBagLayout());

    btrPadrao.setText("Padrão");
    btrPadrao.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btrPadraoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlDestino.add(btrPadrao, gridBagConstraints);

    lblCaminhoDestinoPadrao.setText("Caminho");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlDestino.add(lblCaminhoDestinoPadrao, gridBagConstraints);

    txtCaminhoDestinoPadrao.setPreferredSize(new java.awt.Dimension(450, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    pnlDestino.add(txtCaminhoDestinoPadrao, gridBagConstraints);

    btrPersonalizado.setText("Personalizado");
    btrPersonalizado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btrPersonalizadoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
    pnlDestino.add(btrPersonalizado, gridBagConstraints);

    lblCaminhoDestinoPersonalizado.setText("Caminho");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlDestino.add(lblCaminhoDestinoPersonalizado, gridBagConstraints);

    txtCaminhoDestinoPersonalizado.setPreferredSize(new java.awt.Dimension(450, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    pnlDestino.add(txtCaminhoDestinoPersonalizado, gridBagConstraints);

    btnResetarCaminhoDestino.setText("Resetar");
    btnResetarCaminhoDestino.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetarCaminhoDestinoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
    pnlDestino.add(btnResetarCaminhoDestino, gridBagConstraints);

    btnProcurarDestino.setText("Procurar");
    btnProcurarDestino.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcurarDestinoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
    pnlDestino.add(btnProcurarDestino, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    getContentPane().add(pnlDestino, gridBagConstraints);

    pnlNomenclarura.setBorder(javax.swing.BorderFactory.createTitledBorder("Nomenclatura dos arquivos"));
    pnlNomenclarura.setPreferredSize(new java.awt.Dimension(950, 175));
    pnlNomenclarura.setLayout(new java.awt.GridBagLayout());

    lblPrimeiro.setText("Primeiro");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlNomenclarura.add(lblPrimeiro, gridBagConstraints);

    chkPrimeiro.setText("Incluir");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    pnlNomenclarura.add(chkPrimeiro, gridBagConstraints);

    cboPrimeiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboPrimeiro.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    pnlNomenclarura.add(cboPrimeiro, gridBagConstraints);

    txtPrimeiro.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
    pnlNomenclarura.add(txtPrimeiro, gridBagConstraints);

    lblSegundo.setText("Segundo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlNomenclarura.add(lblSegundo, gridBagConstraints);

    chkSegundo.setText("Incluir");
    chkSegundo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        chkSegundoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    pnlNomenclarura.add(chkSegundo, gridBagConstraints);

    cboSegundo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboSegundo.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    pnlNomenclarura.add(cboSegundo, gridBagConstraints);

    txtSegundo.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
    pnlNomenclarura.add(txtSegundo, gridBagConstraints);

    lblTerceiro.setText("Terceiro");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlNomenclarura.add(lblTerceiro, gridBagConstraints);

    chkTerceiro.setText("Incluir");
    chkTerceiro.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        chkTerceiroActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    pnlNomenclarura.add(chkTerceiro, gridBagConstraints);

    cboTerceiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboTerceiro.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    pnlNomenclarura.add(cboTerceiro, gridBagConstraints);

    txtTerceiro.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
    pnlNomenclarura.add(txtTerceiro, gridBagConstraints);

    lblQuarto.setText("Quarto");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlNomenclarura.add(lblQuarto, gridBagConstraints);

    chkQuarto.setText("Incluir");
    chkQuarto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        chkQuartoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    pnlNomenclarura.add(chkQuarto, gridBagConstraints);

    cboQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboQuarto.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    pnlNomenclarura.add(cboQuarto, gridBagConstraints);

    txtQuarto.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
    pnlNomenclarura.add(txtQuarto, gridBagConstraints);

    lblQuinto.setText("Quinto");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlNomenclarura.add(lblQuinto, gridBagConstraints);

    chkQuinto.setText("Incluir");
    chkQuinto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        chkQuintoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 1;
    pnlNomenclarura.add(chkQuinto, gridBagConstraints);

    cboQuinto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboQuinto.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    pnlNomenclarura.add(cboQuinto, gridBagConstraints);

    txtQuinto.setPreferredSize(new java.awt.Dimension(165, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
    pnlNomenclarura.add(txtQuinto, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    getContentPane().add(pnlNomenclarura, gridBagConstraints);

    btnRenomear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnRenomear.setText("Renomear");
    btnRenomear.setPreferredSize(new java.awt.Dimension(150, 30));
    btnRenomear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRenomearActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    getContentPane().add(btnRenomear, gridBagConstraints);

    btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnSair.setText("Sair");
    btnSair.setPreferredSize(new java.awt.Dimension(150, 30));
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    getContentPane().add(btnSair, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void chkSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSegundoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.chkMudar(this.cboSegundo, this.txtSegundo, this.chkSegundo.isSelected());
  }//GEN-LAST:event_chkSegundoActionPerformed

  private void chkTerceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTerceiroActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.chkMudar(this.cboTerceiro, this.txtTerceiro, this.chkTerceiro.isSelected());
  }//GEN-LAST:event_chkTerceiroActionPerformed

  private void chkQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQuartoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.chkMudar(this.cboQuarto, this.txtQuarto, this.chkQuarto.isSelected());
  }//GEN-LAST:event_chkQuartoActionPerformed

  private void chkQuintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQuintoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.chkMudar(this.cboQuinto, this.txtQuinto, this.chkQuinto.isSelected());
  }//GEN-LAST:event_chkQuintoActionPerformed

  private void btrPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrPadraoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.alterarCaminhoPadraoPersonalizado(this);
  }//GEN-LAST:event_btrPadraoActionPerformed

  private void btrPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrPersonalizadoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.alterarCaminhoPadraoPersonalizado(this);
  }//GEN-LAST:event_btrPersonalizadoActionPerformed

  private void btnResetarCaminhoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarCaminhoOrigemActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.setCaminhoDestinoPadrao(this.txtCaminhoOrigem, this.selecionarArquivos);
  }//GEN-LAST:event_btnResetarCaminhoOrigemActionPerformed

  private void btnResetarCaminhoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarCaminhoDestinoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.setCaminhoDestinoPadrao(this.txtCaminhoDestinoPadrao, this.selecionarArquivos);
  }//GEN-LAST:event_btnResetarCaminhoDestinoActionPerformed

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.btnSair(this);
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnRenomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenomearActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.setLstArquivos(this.arquivos);
    controller.renomearArquivos(this);
  }//GEN-LAST:event_btnRenomearActionPerformed

  private void btnProcurarOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarOrigemActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    this.arquivos = controller.procurarCaminho(this);
  }//GEN-LAST:event_btnProcurarOrigemActionPerformed

  private void btnProcurarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarDestinoActionPerformed
    // TODO add your handling code here:
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.procurarCaminhoPersonalizado(this);
  }//GEN-LAST:event_btnProcurarDestinoActionPerformed
  /*
    Lógica de inicialização
  */
  public void iniciar () {
    ControllerRenomearPasta controller = new ControllerRenomearPasta();
    controller.iniciarView(this);
  }
  
  /*
    Demais métodos
  */
  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcurarDestino;
  private javax.swing.JButton btnProcurarOrigem;
  private javax.swing.JButton btnRenomear;
  private javax.swing.JButton btnResetarCaminhoDestino;
  private javax.swing.JButton btnResetarCaminhoOrigem;
  private javax.swing.JButton btnSair;
  private javax.swing.JRadioButton btrPadrao;
  private javax.swing.JRadioButton btrPersonalizado;
  private javax.swing.JComboBox<String> cboPrimeiro;
  private javax.swing.JComboBox<String> cboQuarto;
  private javax.swing.JComboBox<String> cboQuinto;
  private javax.swing.JComboBox<String> cboSegundo;
  private javax.swing.JComboBox<String> cboTerceiro;
  private javax.swing.JCheckBox chkPrimeiro;
  private javax.swing.JCheckBox chkQuarto;
  private javax.swing.JCheckBox chkQuinto;
  private javax.swing.JCheckBox chkSegundo;
  private javax.swing.JCheckBox chkTerceiro;
  private javax.swing.ButtonGroup gbtnDestino;
  private javax.swing.JLabel lblCaminhoDestinoPadrao;
  private javax.swing.JLabel lblCaminhoDestinoPersonalizado;
  private javax.swing.JLabel lblCaminhoOrigem;
  private javax.swing.JLabel lblPrimeiro;
  private javax.swing.JLabel lblQuarto;
  private javax.swing.JLabel lblQuinto;
  private javax.swing.JLabel lblSegundo;
  private javax.swing.JLabel lblTerceiro;
  private javax.swing.JPanel pnlDestino;
  private javax.swing.JPanel pnlNomenclarura;
  private javax.swing.JPanel pnlOrigem;
  private javax.swing.JTextField txtCaminhoDestinoPadrao;
  private javax.swing.JTextField txtCaminhoDestinoPersonalizado;
  private javax.swing.JTextField txtCaminhoOrigem;
  private javax.swing.JTextField txtPrimeiro;
  private javax.swing.JTextField txtQuarto;
  private javax.swing.JTextField txtQuinto;
  private javax.swing.JTextField txtSegundo;
  private javax.swing.JTextField txtTerceiro;
  // End of variables declaration//GEN-END:variables

}
