
package view;

import controller.ControllerOpcoes;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewOpcoes extends javax.swing.JFrame {
  /*
    Campos
  */

  /*
    Construtores
  */
  public ViewOpcoes() {
    initComponents();
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.iniciarControllerOpcoes(this);
  }
  
  /*
    Get's & Set's
  */
  //<editor-fold defaultstate="collapsed" desc="Get's and Set's">
  public JButton getBtnProcurarArquivoPasta() {
    return btnProcurarArquivoPasta;
  }
  public void setBtnProcurarArquivoPasta(JButton btnProcurarArquivoPasta) {
    this.btnProcurarArquivoPasta = btnProcurarArquivoPasta;
  }
  public JButton getBtnProcurarLivros() {
    return btnProcurarLivros;
  }
  public void setBtnProcurarLivros(JButton btnProcurarLivros) {
    this.btnProcurarLivros = btnProcurarLivros;
  }
  public JButton getBtnProcurarLote() {
    return btnProcurarLote;
  }
  public void setBtnProcurarLote(JButton btnProcurarLote) {
    this.btnProcurarLote = btnProcurarLote;
  }
  public JButton getBtnProcurarMusicas() {
    return btnProcurarMusicas;
  }
  public void setBtnProcurarMusicas(JButton btnProcurarMusicas) {
    this.btnProcurarMusicas = btnProcurarMusicas;
  }
  public JButton getBtnProcurarSelecao() {
    return btnProcurarSelecao;
  }
  public void setBtnProcurarSelecao(JButton btnProcurarSelecao) {
    this.btnProcurarSelecao = btnProcurarSelecao;
  }
  public JButton getBtnSair() {
    return btnSair;
  }
  public void setBtnSair(JButton btnSair) {
    this.btnSair = btnSair;
  }
  public JButton getBtnSalvar() {
    return btnSalvar;
  }
  public void setBtnSalvar(JButton btnSalvar) {
    this.btnSalvar = btnSalvar;
  }
  public JButton getBtnSobre() {
    return btnSobre;
  }
  public void setBtnSobre(JButton btnSobre) {
    this.btnSobre = btnSobre;
  }
  public JButton getjButton1() {
    return jButton1;
  }
  public void setjButton1(JButton jButton1) {
    this.jButton1 = jButton1;
  }
  public JLabel getLblArquivoPata() {
    return lblArquivoPasta;
  }
  public void setLblArquivoPata(JLabel lblArquivoPata) {
    this.lblArquivoPasta = lblArquivoPata;
  }
  public JLabel getLblAtualArquivoPasta() {
    return lblAtualArquivoPasta;
  }
  public void setLblAtualArquivoPasta(JLabel lblAtualArquivoPasta) {
    this.lblAtualArquivoPasta = lblAtualArquivoPasta;
  }
  public JLabel getLblAtualLivros() {
    return lblAtualLivros;
  }
  public void setLblAtualLivros(JLabel lblAtualLivros) {
    this.lblAtualLivros = lblAtualLivros;
  }
  public JLabel getLblAtualMusicas() {
    return lblAtualMusicas;
  }
  public void setLblAtualMusicas(JLabel lblAtualMusicas) {
    this.lblAtualMusicas = lblAtualMusicas;
  }
  public JLabel getLblAtualRenomearLote() {
    return lblAtualRenomearLote;
  }
  public void setLblAtualRenomearLote(JLabel lblAtualRenomearLote) {
    this.lblAtualRenomearLote = lblAtualRenomearLote;
  }
  public JLabel getLblAtualSelecao() {
    return lblAtualSelecao;
  }
  public void setLblAtualSelecao(JLabel lblAtualSelecao) {
    this.lblAtualSelecao = lblAtualSelecao;
  }
  public JLabel getLblLivros() {
    return lblLivros;
  }
  public void setLblLivros(JLabel lblLivros) {
    this.lblLivros = lblLivros;
  }
  public JLabel getLblMusicas() {
    return lblMusicas;
  }
  public void setLblMusicas(JLabel lblMusicas) {
    this.lblMusicas = lblMusicas;
  }
  public JLabel getLblRenomearLote() {
    return lblRenomearLote;
  }
  public void setLblRenomearLote(JLabel lblRenomearLote) {
    this.lblRenomearLote = lblRenomearLote;
  }
  public JLabel getLblSelecao() {
    return lblSelecao;
  }
  public void setLblSelecao(JLabel lblSelecao) {
    this.lblSelecao = lblSelecao;
  }
  public JPanel getPnlArquivoPasta() {
    return pnlArquivoPasta;
  }
  public void setPnlArquivoPasta(JPanel pnlArquivoPasta) {
    this.pnlArquivoPasta = pnlArquivoPasta;
  }
  public JPanel getPnlLivros() {
    return pnlLivros;
  }
  public void setPnlLivros(JPanel pnlLivros) {
    this.pnlLivros = pnlLivros;
  }
  public JPanel getPnlMusicas() {
    return pnlMusicas;
  }
  public void setPnlMusicas(JPanel pnlMusicas) {
    this.pnlMusicas = pnlMusicas;
  }
  public JPanel getPnlSelecao() {
    return pnlSelecao;
  }
  public void setPnlSelecao(JPanel pnlSelecao) {
    this.pnlSelecao = pnlSelecao;
  }
  public JPanel getPnlSuperior1() {
    return pnlRenomearLote;
  }
  public void setPnlSuperior1(JPanel pnlSuperior1) {
    this.pnlRenomearLote = pnlSuperior1;
  }
  public JTextField getTxtArquivoPasta() {
    return txtArquivoPasta;
  }
  public void setTxtArquivoPasta(JTextField txtArquivoPasta) {
    this.txtArquivoPasta = txtArquivoPasta;
  }
  public JTextField getTxtLivos() {
    return txtLivos;
  }
  public void setTxtLivos(JTextField txtLivos) {
    this.txtLivos = txtLivos;
  }
  public JTextField getTxtMusicas() {
    return txtMusicas;
  }
  public void setTxtMusicas(JTextField txtMusicas) {
    this.txtMusicas = txtMusicas;
  }
  public JTextField getTxtRenomearLote() {
    return txtRenomearLote;
  }
  public void setTxtRenomearLote(JTextField txtRenomearLote) {
    this.txtRenomearLote = txtRenomearLote;
  }
  public JTextField getTxtSelecao() {
    return txtSelecao;
  }
  public void setTxtSelecao(JTextField txtSelecao) {
    this.txtSelecao = txtSelecao;
  }
  public JButton getBtnAutoresProcurar() {
    return btnAutoresProcurar;
  }
  public void setBtnAutoresProcurar(JButton btnAutoresProcurar) {
    this.btnAutoresProcurar = btnAutoresProcurar;
  }
  public JButton getBtnProcurarDestino() {
    return btnProcurarDestino;
  }
  public void setBtnProcurarDestino(JButton btnProcurarDestino) {
    this.btnProcurarDestino = btnProcurarDestino;
  }
  public JButton getBtnProcurarSelecaoDestino() {
    return btnProcurarSelecaoDestino;
  }
  public void setBtnProcurarSelecaoDestino(JButton btnProcurarSelecaoDestino) {
    this.btnProcurarSelecaoDestino = btnProcurarSelecaoDestino;
  }
  public JLabel getLblArquivoPasta() {
    return lblArquivoPasta;
  }
  public void setLblArquivoPasta(JLabel lblArquivoPasta) {
    this.lblArquivoPasta = lblArquivoPasta;
  }
  public JLabel getLblArquivoPastaDestino() {
    return lblArquivoPastaDestino;
  }
  public void setLblArquivoPastaDestino(JLabel lblArquivoPastaDestino) {
    this.lblArquivoPastaDestino = lblArquivoPastaDestino;
  }
  public JLabel getLblAtualDestino() {
    return lblAtualDestino;
  }
  public void setLblAtualDestino(JLabel lblAtualDestino) {
    this.lblAtualDestino = lblAtualDestino;
  }
  public JLabel getLblAutores() {
    return lblAutores;
  }
  public void setLblAutores(JLabel lblAutores) {
    this.lblAutores = lblAutores;
  }
  public JLabel getLblAutoresAtual() {
    return lblAutoresAtual;
  }
  public void setLblAutoresAtual(JLabel lblAutoresAtual) {
    this.lblAutoresAtual = lblAutoresAtual;
  }
  public JLabel getLblSelecaoDestino() {
    return lblSelecaoDestino;
  }
  public void setLblSelecaoDestino(JLabel lblSelecaoDestino) {
    this.lblSelecaoDestino = lblSelecaoDestino;
  }
  public JLabel getLblSelecaoDestinoAtual() {
    return lblSelecaoDestinoAtual;
  }
  public void setLblSelecaoDestinoAtual(JLabel lblSelecaoDestinoAtual) {
    this.lblSelecaoDestinoAtual = lblSelecaoDestinoAtual;
  }
  public JPanel getPnlRenomearLote() {
    return pnlRenomearLote;
  }
  public void setPnlRenomearLote(JPanel pnlRenomearLote) {
    this.pnlRenomearLote = pnlRenomearLote;
  }
  public JTextField getTxtArquivoPastaDestino() {
    return txtArquivoPastaDestino;
  }
  public void setTxtArquivoPastaDestino(JTextField txtArquivoPastaDestino) {
    this.txtArquivoPastaDestino = txtArquivoPastaDestino;
  }
  public JTextField getTxtAutores() {
    return txtAutores;
  }
  public void setTxtAutores(JTextField txtAutores) {
    this.txtAutores = txtAutores;
  }
  public JTextField getTxtSelecaoDestino() {
    return txtSelecaoDestino;
  }
  public void setTxtSelecaoDestino(JTextField txtSelecaoDestino) {
    this.txtSelecaoDestino = txtSelecaoDestino;
  }
//</editor-fold>
  
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    jButton1 = new javax.swing.JButton();
    pnlArquivoPasta = new javax.swing.JPanel();
    lblArquivoPasta = new javax.swing.JLabel();
    txtArquivoPasta = new javax.swing.JTextField();
    btnProcurarArquivoPasta = new javax.swing.JButton();
    lblAtualArquivoPasta = new javax.swing.JLabel();
    lblArquivoPastaDestino = new javax.swing.JLabel();
    txtArquivoPastaDestino = new javax.swing.JTextField();
    btnProcurarDestino = new javax.swing.JButton();
    lblAtualDestino = new javax.swing.JLabel();
    pnlRenomearLote = new javax.swing.JPanel();
    lblRenomearLote = new javax.swing.JLabel();
    txtRenomearLote = new javax.swing.JTextField();
    btnProcurarLote = new javax.swing.JButton();
    lblAtualRenomearLote = new javax.swing.JLabel();
    pnlSelecao = new javax.swing.JPanel();
    lblSelecao = new javax.swing.JLabel();
    txtSelecao = new javax.swing.JTextField();
    btnProcurarSelecao = new javax.swing.JButton();
    lblAtualSelecao = new javax.swing.JLabel();
    lblSelecaoDestino = new javax.swing.JLabel();
    txtSelecaoDestino = new javax.swing.JTextField();
    btnProcurarSelecaoDestino = new javax.swing.JButton();
    lblSelecaoDestinoAtual = new javax.swing.JLabel();
    pnlLivros = new javax.swing.JPanel();
    lblLivros = new javax.swing.JLabel();
    txtLivos = new javax.swing.JTextField();
    btnProcurarLivros = new javax.swing.JButton();
    lblAtualLivros = new javax.swing.JLabel();
    lblAutores = new javax.swing.JLabel();
    txtAutores = new javax.swing.JTextField();
    lblAutoresAtual = new javax.swing.JLabel();
    btnAutoresProcurar = new javax.swing.JButton();
    pnlMusicas = new javax.swing.JPanel();
    lblMusicas = new javax.swing.JLabel();
    txtMusicas = new javax.swing.JTextField();
    btnProcurarMusicas = new javax.swing.JButton();
    lblAtualMusicas = new javax.swing.JLabel();
    btnSalvar = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();
    btnSobre = new javax.swing.JButton();

    jButton1.setText("jButton1");

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1000, 900));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlArquivoPasta.setBorder(javax.swing.BorderFactory.createTitledBorder("Arquivos em pastas"));
    pnlArquivoPasta.setPreferredSize(new java.awt.Dimension(900, 130));
    pnlArquivoPasta.setLayout(new java.awt.GridBagLayout());

    lblArquivoPasta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    lblArquivoPasta.setForeground(new java.awt.Color(0, 102, 51));
    lblArquivoPasta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblArquivoPasta.setText("Pasta de origem");
    lblArquivoPasta.setPreferredSize(new java.awt.Dimension(200, 15));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlArquivoPasta.add(lblArquivoPasta, gridBagConstraints);

    txtArquivoPasta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    txtArquivoPasta.setForeground(java.awt.SystemColor.activeCaption);
    txtArquivoPasta.setText("C:\\");
      txtArquivoPasta.setEnabled(false);
      txtArquivoPasta.setPreferredSize(new java.awt.Dimension(500, 20));
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
      pnlArquivoPasta.add(txtArquivoPasta, gridBagConstraints);

      btnProcurarArquivoPasta.setText("Procurar");
      btnProcurarArquivoPasta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnProcurarArquivoPastaActionPerformed(evt);
        }
      });
      pnlArquivoPasta.add(btnProcurarArquivoPasta, new java.awt.GridBagConstraints());

      lblAtualArquivoPasta.setForeground(new java.awt.Color(153, 153, 153));
      lblAtualArquivoPasta.setText("Caminho atual: C:\\Users\\User\\");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        pnlArquivoPasta.add(lblAtualArquivoPasta, gridBagConstraints);

        lblArquivoPastaDestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblArquivoPastaDestino.setForeground(new java.awt.Color(0, 102, 51));
        lblArquivoPastaDestino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArquivoPastaDestino.setText("Pasta de destino personalizado");
        lblArquivoPastaDestino.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        pnlArquivoPasta.add(lblArquivoPastaDestino, gridBagConstraints);

        txtArquivoPastaDestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtArquivoPastaDestino.setForeground(java.awt.SystemColor.activeCaption);
        txtArquivoPastaDestino.setText("C:\\");
          txtArquivoPastaDestino.setEnabled(false);
          txtArquivoPastaDestino.setPreferredSize(new java.awt.Dimension(500, 20));
          gridBagConstraints = new java.awt.GridBagConstraints();
          gridBagConstraints.gridx = 1;
          gridBagConstraints.gridy = 2;
          gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 20);
          pnlArquivoPasta.add(txtArquivoPastaDestino, gridBagConstraints);

          btnProcurarDestino.setText("Procurar");
          btnProcurarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              btnProcurarDestinoActionPerformed(evt);
            }
          });
          gridBagConstraints = new java.awt.GridBagConstraints();
          gridBagConstraints.gridx = 2;
          gridBagConstraints.gridy = 2;
          gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
          pnlArquivoPasta.add(btnProcurarDestino, gridBagConstraints);

          lblAtualDestino.setForeground(new java.awt.Color(153, 153, 153));
          lblAtualDestino.setText("Caminho atual: C:\\Users\\User\\");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.gridwidth = 5;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
            gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
            pnlArquivoPasta.add(lblAtualDestino, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 20);
            getContentPane().add(pnlArquivoPasta, gridBagConstraints);

            pnlRenomearLote.setBorder(javax.swing.BorderFactory.createTitledBorder("Renomear em lote"));
            pnlRenomearLote.setPreferredSize(new java.awt.Dimension(900, 85));
            pnlRenomearLote.setLayout(new java.awt.GridBagLayout());

            lblRenomearLote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            lblRenomearLote.setForeground(new java.awt.Color(0, 102, 51));
            lblRenomearLote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lblRenomearLote.setText("Caminho");
            lblRenomearLote.setPreferredSize(new java.awt.Dimension(200, 15));
            pnlRenomearLote.add(lblRenomearLote, new java.awt.GridBagConstraints());

            txtRenomearLote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            txtRenomearLote.setForeground(java.awt.SystemColor.activeCaption);
            txtRenomearLote.setText("C:\\");
              txtRenomearLote.setEnabled(false);
              txtRenomearLote.setPreferredSize(new java.awt.Dimension(500, 20));
              gridBagConstraints = new java.awt.GridBagConstraints();
              gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
              pnlRenomearLote.add(txtRenomearLote, gridBagConstraints);

              btnProcurarLote.setText("Procurar");
              btnProcurarLote.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                  btnProcurarLoteActionPerformed(evt);
                }
              });
              pnlRenomearLote.add(btnProcurarLote, new java.awt.GridBagConstraints());

              lblAtualRenomearLote.setForeground(new java.awt.Color(153, 153, 153));
              lblAtualRenomearLote.setText("Caminho atual: C:\\Users\\User\\");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = 5;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
                pnlRenomearLote.add(lblAtualRenomearLote, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
                getContentPane().add(pnlRenomearLote, gridBagConstraints);

                pnlSelecao.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleção de arquivos"));
                pnlSelecao.setPreferredSize(new java.awt.Dimension(900, 130));
                pnlSelecao.setLayout(new java.awt.GridBagLayout());

                lblSelecao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                lblSelecao.setForeground(new java.awt.Color(0, 102, 51));
                lblSelecao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblSelecao.setText("Pasta de origem");
                lblSelecao.setPreferredSize(new java.awt.Dimension(200, 15));
                pnlSelecao.add(lblSelecao, new java.awt.GridBagConstraints());

                txtSelecao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                txtSelecao.setForeground(java.awt.SystemColor.activeCaption);
                txtSelecao.setText("C:\\");
                  txtSelecao.setEnabled(false);
                  txtSelecao.setPreferredSize(new java.awt.Dimension(500, 20));
                  gridBagConstraints = new java.awt.GridBagConstraints();
                  gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                  pnlSelecao.add(txtSelecao, gridBagConstraints);

                  btnProcurarSelecao.setText("Procurar");
                  btnProcurarSelecao.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                      btnProcurarSelecaoActionPerformed(evt);
                    }
                  });
                  pnlSelecao.add(btnProcurarSelecao, new java.awt.GridBagConstraints());

                  lblAtualSelecao.setForeground(new java.awt.Color(153, 153, 153));
                  lblAtualSelecao.setText("Caminho atual: C:\\Users\\User\\");
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = 1;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                    gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
                    pnlSelecao.add(lblAtualSelecao, gridBagConstraints);

                    lblSelecaoDestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    lblSelecaoDestino.setForeground(new java.awt.Color(0, 102, 51));
                    lblSelecaoDestino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                    lblSelecaoDestino.setText("Pasta de destino personalizado");
                    lblSelecaoDestino.setPreferredSize(new java.awt.Dimension(200, 15));
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = 2;
                    gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
                    pnlSelecao.add(lblSelecaoDestino, gridBagConstraints);

                    txtSelecaoDestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    txtSelecaoDestino.setForeground(java.awt.SystemColor.activeCaption);
                    txtSelecaoDestino.setText("C:\\");
                      txtSelecaoDestino.setEnabled(false);
                      txtSelecaoDestino.setPreferredSize(new java.awt.Dimension(500, 20));
                      gridBagConstraints = new java.awt.GridBagConstraints();
                      gridBagConstraints.gridx = 1;
                      gridBagConstraints.gridy = 2;
                      gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 20);
                      pnlSelecao.add(txtSelecaoDestino, gridBagConstraints);

                      btnProcurarSelecaoDestino.setText("Procurar");
                      btnProcurarSelecaoDestino.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                          btnProcurarSelecaoDestinoActionPerformed(evt);
                        }
                      });
                      gridBagConstraints = new java.awt.GridBagConstraints();
                      gridBagConstraints.gridx = 2;
                      gridBagConstraints.gridy = 2;
                      gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
                      pnlSelecao.add(btnProcurarSelecaoDestino, gridBagConstraints);

                      lblSelecaoDestinoAtual.setForeground(new java.awt.Color(153, 153, 153));
                      lblSelecaoDestinoAtual.setText("Caminho atual: C:\\Users\\User\\");
                        gridBagConstraints = new java.awt.GridBagConstraints();
                        gridBagConstraints.gridx = 1;
                        gridBagConstraints.gridy = 3;
                        gridBagConstraints.gridwidth = 5;
                        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
                        pnlSelecao.add(lblSelecaoDestinoAtual, gridBagConstraints);

                        gridBagConstraints = new java.awt.GridBagConstraints();
                        gridBagConstraints.gridx = 0;
                        gridBagConstraints.gridy = 2;
                        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
                        getContentPane().add(pnlSelecao, gridBagConstraints);

                        pnlLivros.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome de livros"));
                        pnlLivros.setPreferredSize(new java.awt.Dimension(900, 130));
                        pnlLivros.setLayout(new java.awt.GridBagLayout());

                        lblLivros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                        lblLivros.setForeground(new java.awt.Color(0, 102, 51));
                        lblLivros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                        lblLivros.setText("Arquivos a renomear");
                        lblLivros.setPreferredSize(new java.awt.Dimension(200, 15));
                        pnlLivros.add(lblLivros, new java.awt.GridBagConstraints());

                        txtLivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                        txtLivos.setForeground(java.awt.SystemColor.activeCaption);
                        txtLivos.setText("C:\\");
                          txtLivos.setEnabled(false);
                          txtLivos.setPreferredSize(new java.awt.Dimension(500, 20));
                          gridBagConstraints = new java.awt.GridBagConstraints();
                          gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                          pnlLivros.add(txtLivos, gridBagConstraints);

                          btnProcurarLivros.setText("Procurar");
                          btnProcurarLivros.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                              btnProcurarLivrosActionPerformed(evt);
                            }
                          });
                          pnlLivros.add(btnProcurarLivros, new java.awt.GridBagConstraints());

                          lblAtualLivros.setForeground(new java.awt.Color(153, 153, 153));
                          lblAtualLivros.setText("Caminho atual: C:\\Users\\User\\");
                            gridBagConstraints = new java.awt.GridBagConstraints();
                            gridBagConstraints.gridx = 1;
                            gridBagConstraints.gridy = 1;
                            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                            gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
                            pnlLivros.add(lblAtualLivros, gridBagConstraints);

                            lblAutores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                            lblAutores.setForeground(new java.awt.Color(0, 102, 51));
                            lblAutores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                            lblAutores.setText("Local lista de autores");
                            lblAutores.setPreferredSize(new java.awt.Dimension(200, 15));
                            gridBagConstraints = new java.awt.GridBagConstraints();
                            gridBagConstraints.gridx = 0;
                            gridBagConstraints.gridy = 2;
                            gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
                            pnlLivros.add(lblAutores, gridBagConstraints);

                            txtAutores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                            txtAutores.setForeground(java.awt.SystemColor.activeCaption);
                            txtAutores.setText("C:\\");
                              txtAutores.setEnabled(false);
                              txtAutores.setPreferredSize(new java.awt.Dimension(500, 20));
                              gridBagConstraints = new java.awt.GridBagConstraints();
                              gridBagConstraints.gridx = 1;
                              gridBagConstraints.gridy = 2;
                              gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 20);
                              pnlLivros.add(txtAutores, gridBagConstraints);

                              lblAutoresAtual.setForeground(new java.awt.Color(153, 153, 153));
                              lblAutoresAtual.setText("Caminho atual: C:\\Users\\User\\");
                                gridBagConstraints = new java.awt.GridBagConstraints();
                                gridBagConstraints.gridx = 1;
                                gridBagConstraints.gridy = 3;
                                gridBagConstraints.gridwidth = 5;
                                gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                                gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
                                pnlLivros.add(lblAutoresAtual, gridBagConstraints);

                                btnAutoresProcurar.setText("Procurar");
                                btnAutoresProcurar.addActionListener(new java.awt.event.ActionListener() {
                                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btnAutoresProcurarActionPerformed(evt);
                                  }
                                });
                                gridBagConstraints = new java.awt.GridBagConstraints();
                                gridBagConstraints.gridx = 2;
                                gridBagConstraints.gridy = 2;
                                gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
                                pnlLivros.add(btnAutoresProcurar, gridBagConstraints);

                                gridBagConstraints = new java.awt.GridBagConstraints();
                                gridBagConstraints.gridx = 0;
                                gridBagConstraints.gridy = 9;
                                gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
                                getContentPane().add(pnlLivros, gridBagConstraints);

                                pnlMusicas.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome de músicas"));
                                pnlMusicas.setPreferredSize(new java.awt.Dimension(900, 85));
                                pnlMusicas.setLayout(new java.awt.GridBagLayout());

                                lblMusicas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                                lblMusicas.setForeground(new java.awt.Color(0, 102, 51));
                                lblMusicas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                                lblMusicas.setText("Carregar arquivos de músicas");
                                lblMusicas.setPreferredSize(new java.awt.Dimension(200, 15));
                                pnlMusicas.add(lblMusicas, new java.awt.GridBagConstraints());

                                txtMusicas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                                txtMusicas.setForeground(java.awt.SystemColor.activeCaption);
                                txtMusicas.setText("C:\\");
                                  txtMusicas.setEnabled(false);
                                  txtMusicas.setPreferredSize(new java.awt.Dimension(500, 20));
                                  gridBagConstraints = new java.awt.GridBagConstraints();
                                  gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                                  pnlMusicas.add(txtMusicas, gridBagConstraints);

                                  btnProcurarMusicas.setText("Procurar");
                                  btnProcurarMusicas.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                      btnProcurarMusicasActionPerformed(evt);
                                    }
                                  });
                                  pnlMusicas.add(btnProcurarMusicas, new java.awt.GridBagConstraints());

                                  lblAtualMusicas.setForeground(new java.awt.Color(153, 153, 153));
                                  lblAtualMusicas.setText("Caminho atual: C:\\Users\\User\\");
                                    gridBagConstraints = new java.awt.GridBagConstraints();
                                    gridBagConstraints.gridx = 1;
                                    gridBagConstraints.gridy = 1;
                                    gridBagConstraints.gridwidth = 5;
                                    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                                    gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
                                    pnlMusicas.add(lblAtualMusicas, gridBagConstraints);

                                    gridBagConstraints = new java.awt.GridBagConstraints();
                                    gridBagConstraints.gridx = 0;
                                    gridBagConstraints.gridy = 13;
                                    gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
                                    getContentPane().add(pnlMusicas, gridBagConstraints);

                                    btnSalvar.setText("Salvar");
                                    btnSalvar.setPreferredSize(new java.awt.Dimension(150, 23));
                                    btnSalvar.addActionListener(new java.awt.event.ActionListener() {
                                      public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnSalvarActionPerformed(evt);
                                      }
                                    });
                                    gridBagConstraints = new java.awt.GridBagConstraints();
                                    gridBagConstraints.gridx = 0;
                                    gridBagConstraints.gridy = 14;
                                    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
                                    gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
                                    getContentPane().add(btnSalvar, gridBagConstraints);

                                    btnSair.setText("Sair");
                                    btnSair.setPreferredSize(new java.awt.Dimension(150, 23));
                                    btnSair.addActionListener(new java.awt.event.ActionListener() {
                                      public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnSairActionPerformed(evt);
                                      }
                                    });
                                    gridBagConstraints = new java.awt.GridBagConstraints();
                                    gridBagConstraints.gridx = 0;
                                    gridBagConstraints.gridy = 14;
                                    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
                                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
                                    getContentPane().add(btnSair, gridBagConstraints);

                                    btnSobre.setText("Sobre");
                                    btnSobre.addActionListener(new java.awt.event.ActionListener() {
                                      public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnSobreActionPerformed(evt);
                                      }
                                    });
                                    gridBagConstraints = new java.awt.GridBagConstraints();
                                    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
                                    gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 20);
                                    getContentPane().add(btnSobre, gridBagConstraints);

                                    pack();
                                  }// </editor-fold>//GEN-END:initComponents

  private void btnProcurarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarLoteActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtRenomearLote);
  }//GEN-LAST:event_btnProcurarLoteActionPerformed

  private void btnProcurarSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarSelecaoActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtSelecao);
  }//GEN-LAST:event_btnProcurarSelecaoActionPerformed

  private void btnProcurarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarLivrosActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtLivos);
  }//GEN-LAST:event_btnProcurarLivrosActionPerformed

  private void btnProcurarMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMusicasActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtMusicas);
  }//GEN-LAST:event_btnProcurarMusicasActionPerformed

  private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.criarSobre();
  }//GEN-LAST:event_btnSobreActionPerformed

  private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.salvarCaminhos(this);
  }//GEN-LAST:event_btnSalvarActionPerformed

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.btnSair(this);
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnProcurarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarDestinoActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtArquivoPastaDestino);
  }//GEN-LAST:event_btnProcurarDestinoActionPerformed

  private void btnProcurarArquivoPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarArquivoPastaActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtArquivoPasta);
  }//GEN-LAST:event_btnProcurarArquivoPastaActionPerformed

  private void btnProcurarSelecaoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarSelecaoDestinoActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    controller.procurarPasta(this.txtSelecaoDestino);
  }//GEN-LAST:event_btnProcurarSelecaoDestinoActionPerformed

  private void btnAutoresProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresProcurarActionPerformed
    // TODO add your handling code here:
    ControllerOpcoes controller = new ControllerOpcoes();
    //controller.procurarArquivo(this.txtAutores);
    controller.procurarArquivo(this.txtAutores);
  }//GEN-LAST:event_btnAutoresProcurarActionPerformed

  /*
    Demais métodos
  */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(ViewOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(ViewOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(ViewOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ViewOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewOpcoes().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAutoresProcurar;
  private javax.swing.JButton btnProcurarArquivoPasta;
  private javax.swing.JButton btnProcurarDestino;
  private javax.swing.JButton btnProcurarLivros;
  private javax.swing.JButton btnProcurarLote;
  private javax.swing.JButton btnProcurarMusicas;
  private javax.swing.JButton btnProcurarSelecao;
  private javax.swing.JButton btnProcurarSelecaoDestino;
  private javax.swing.JButton btnSair;
  private javax.swing.JButton btnSalvar;
  private javax.swing.JButton btnSobre;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel lblArquivoPasta;
  private javax.swing.JLabel lblArquivoPastaDestino;
  private javax.swing.JLabel lblAtualArquivoPasta;
  private javax.swing.JLabel lblAtualDestino;
  private javax.swing.JLabel lblAtualLivros;
  private javax.swing.JLabel lblAtualMusicas;
  private javax.swing.JLabel lblAtualRenomearLote;
  private javax.swing.JLabel lblAtualSelecao;
  private javax.swing.JLabel lblAutores;
  private javax.swing.JLabel lblAutoresAtual;
  private javax.swing.JLabel lblLivros;
  private javax.swing.JLabel lblMusicas;
  private javax.swing.JLabel lblRenomearLote;
  private javax.swing.JLabel lblSelecao;
  private javax.swing.JLabel lblSelecaoDestino;
  private javax.swing.JLabel lblSelecaoDestinoAtual;
  private javax.swing.JPanel pnlArquivoPasta;
  private javax.swing.JPanel pnlLivros;
  private javax.swing.JPanel pnlMusicas;
  private javax.swing.JPanel pnlRenomearLote;
  private javax.swing.JPanel pnlSelecao;
  private javax.swing.JTextField txtArquivoPasta;
  private javax.swing.JTextField txtArquivoPastaDestino;
  private javax.swing.JTextField txtAutores;
  private javax.swing.JTextField txtLivos;
  private javax.swing.JTextField txtMusicas;
  private javax.swing.JTextField txtRenomearLote;
  private javax.swing.JTextField txtSelecao;
  private javax.swing.JTextField txtSelecaoDestino;
  // End of variables declaration//GEN-END:variables

}
