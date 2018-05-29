
package view;

import controller.ControllerNomeLivros;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewNomeLivros extends javax.swing.JFrame {
  /*
    Campos
  */

  /*
    Construtores
  */
  public ViewNomeLivros() {
    initComponents();
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.iniciarControllerNomeLivros(this);
  }
  
  /*
    Get's & Set's
  */
  public JButton getBtnAdicionarAutor() {
    return btnAdicionarAutor;
  }
  public void setBtnAdicionarAutor(JButton btnAdicionarAutor) {
    this.btnAdicionarAutor = btnAdicionarAutor;
  }
  public JButton getBtnProcurarArquivos() {
    return btnProcurarArquivos;
  }
  public void setBtnProcurarArquivos(JButton btnProcurarArquivos) {
    this.btnProcurarArquivos = btnProcurarArquivos;
  }
  public JButton getBtnProcurarAutores() {
    return btnProcurarAutores;
  }
  public void setBtnProcurarAutores(JButton btnProcurarAutores) {
    this.btnProcurarAutores = btnProcurarAutores;
  }
  public JButton getBtnRenomear() {
    return btnRenomear;
  }
  public void setBtnRenomear(JButton btnRenomear) {
    this.btnRenomear = btnRenomear;
  }
  public JButton getBtnSair() {
    return btnSair;
  }
  public void setBtnSair(JButton btnSair) {
    this.btnSair = btnSair;
  }
  public JComboBox<String> getCboAutor() {
    return cboAutor;
  }
  public void setCboAutor(JComboBox<String> cboAutor) {
    this.cboAutor = cboAutor;
  }
  public JLabel getLblArquivoFinal() {
    return lblArquivoFinal;
  }
  public void setLblArquivoFinal(JLabel lblArquivoFinal) {
    this.lblArquivoFinal = lblArquivoFinal;
  }
  public JLabel getLblArquivoOriginal() {
    return lblArquivoOriginal;
  }
  public void setLblArquivoOriginal(JLabel lblArquivoOriginal) {
    this.lblArquivoOriginal = lblArquivoOriginal;
  }
  public JLabel getLblArquivos() {
    return lblArquivos;
  }
  public void setLblArquivos(JLabel lblArquivos) {
    this.lblArquivos = lblArquivos;
  }
  public JLabel getLblAutor() {
    return lblAutor;
  }
  public void setLblAutor(JLabel lblAutor) {
    this.lblAutor = lblAutor;
  }
  public JLabel getLblAutores() {
    return lblAutores;
  }
  public void setLblAutores(JLabel lblAutores) {
    this.lblAutores = lblAutores;
  }
  public JLabel getLblDisciplina() {
    return lblDisciplina;
  }
  public void setLblDisciplina(JLabel lblDisciplina) {
    this.lblDisciplina = lblDisciplina;
  }
  public JLabel getLblTitulo() {
    return lblTitulo;
  }
  public void setLblTitulo(JLabel lblTitulo) {
    this.lblTitulo = lblTitulo;
  }
  public JPanel getPnlInferior() {
    return pnlInferior;
  }
  public void setPnlInferior(JPanel pnlInferior) {
    this.pnlInferior = pnlInferior;
  }
  public JPanel getPnlSuperior() {
    return pnlSuperior;
  }
  public void setPnlSuperior(JPanel pnlSuperior) {
    this.pnlSuperior = pnlSuperior;
  }
  public JPanel getPnlTabela() {
    return pnlTabela;
  }
  public void setPnlTabela(JPanel pnlTabela) {
    this.pnlTabela = pnlTabela;
  }
  public JScrollPane getPnlrTabela() {
    return pnlrTabela;
  }
  public void setPnlrTabela(JScrollPane pnlrTabela) {
    this.pnlrTabela = pnlrTabela;
  }
  public JTable getTblLivros() {
    return tblLivros;
  }
  public void setTblLivros(JTable tblLivros) {
    this.tblLivros = tblLivros;
  }
  public JTextField getTxtArquivoFinal() {
    return txtArquivoFinal;
  }
  public void setTxtArquivoFinal(JTextField txtArquivoFinal) {
    this.txtArquivoFinal = txtArquivoFinal;
  }
  public JTextField getTxtArquivoOriginal() {
    return txtArquivoOriginal;
  }
  public void setTxtArquivoOriginal(JTextField txtArquivoOriginal) {
    this.txtArquivoOriginal = txtArquivoOriginal;
  }
  public JTextField getTxtArquivos() {
    return txtArquivos;
  }
  public void setTxtArquivos(JTextField txtArquivos) {
    this.txtArquivos = txtArquivos;
  }
  public JTextField getTxtAutores() {
    return txtAutores;
  }
  public void setTxtAutores(JTextField txtAutores) {
    this.txtAutores = txtAutores;
  }
  public JTextField getTxtDisciplina() {
    return txtDisciplina;
  }
  public void setTxtDisciplina(JTextField txtDisciplina) {
    this.txtDisciplina = txtDisciplina;
  }
  public JTextField getTxtTitulo() {
    return txtTitulo;
  }
  public void setTxtTitulo(JTextField txtTitulo) {
    this.txtTitulo = txtTitulo;
  }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlSuperior = new javax.swing.JPanel();
    lblArquivos = new javax.swing.JLabel();
    txtArquivos = new javax.swing.JTextField();
    btnProcurarArquivos = new javax.swing.JButton();
    lblAutores = new javax.swing.JLabel();
    txtAutores = new javax.swing.JTextField();
    btnProcurarAutores = new javax.swing.JButton();
    pnlTabela = new javax.swing.JPanel();
    pnlrTabela = new javax.swing.JScrollPane();
    tblLivros = new javax.swing.JTable();
    pnlInferior = new javax.swing.JPanel();
    lblArquivoOriginal = new javax.swing.JLabel();
    txtArquivoOriginal = new javax.swing.JTextField();
    lblArquivoFinal = new javax.swing.JLabel();
    txtArquivoFinal = new javax.swing.JTextField();
    lblAutor = new javax.swing.JLabel();
    cboAutor = new javax.swing.JComboBox<>();
    lblDisciplina = new javax.swing.JLabel();
    txtDisciplina = new javax.swing.JTextField();
    btnRenomear = new javax.swing.JButton();
    btnAdicionarAutor = new javax.swing.JButton();
    lblTitulo = new javax.swing.JLabel();
    txtTitulo = new javax.swing.JTextField();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1300, 900));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlSuperior.setPreferredSize(new java.awt.Dimension(900, 105));
    pnlSuperior.setLayout(new java.awt.GridBagLayout());

    lblArquivos.setText("Arquivos a renomear");
    pnlSuperior.add(lblArquivos, new java.awt.GridBagConstraints());

    txtArquivos.setPreferredSize(new java.awt.Dimension(600, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 20);
    pnlSuperior.add(txtArquivos, gridBagConstraints);

    btnProcurarArquivos.setText("Procurar");
    btnProcurarArquivos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcurarArquivosActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlSuperior.add(btnProcurarArquivos, gridBagConstraints);

    lblAutores.setText("Local lista de autores");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    pnlSuperior.add(lblAutores, gridBagConstraints);

    txtAutores.setPreferredSize(new java.awt.Dimension(600, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
    pnlSuperior.add(txtAutores, gridBagConstraints);

    btnProcurarAutores.setText("Procurar");
    btnProcurarAutores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcurarAutoresActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    pnlSuperior.add(btnProcurarAutores, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
    getContentPane().add(pnlSuperior, gridBagConstraints);

    pnlTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlTabela.setPreferredSize(new java.awt.Dimension(900, 400));
    pnlTabela.setLayout(new java.awt.GridBagLayout());

    pnlrTabela.setPreferredSize(new java.awt.Dimension(850, 350));

    tblLivros.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tblLivros.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
    tblLivros.setPreferredSize(new java.awt.Dimension(800, 300));
    tblLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tblLivros.setShowHorizontalLines(false);
    tblLivros.setShowVerticalLines(false);
    tblLivros.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblLivrosMouseClicked(evt);
      }
    });
    pnlrTabela.setViewportView(tblLivros);

    pnlTabela.add(pnlrTabela, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
    getContentPane().add(pnlTabela, gridBagConstraints);

    pnlInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlInferior.setPreferredSize(new java.awt.Dimension(1200, 150));
    pnlInferior.setLayout(new java.awt.GridBagLayout());

    lblArquivoOriginal.setText("Nome do arquivo original");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlInferior.add(lblArquivoOriginal, gridBagConstraints);

    txtArquivoOriginal.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlInferior.add(txtArquivoOriginal, gridBagConstraints);

    lblArquivoFinal.setText("Nome do arquivo final");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlInferior.add(lblArquivoFinal, gridBagConstraints);

    txtArquivoFinal.setPreferredSize(new java.awt.Dimension(1000, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlInferior.add(txtArquivoFinal, gridBagConstraints);

    lblAutor.setText("Autor");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlInferior.add(lblAutor, gridBagConstraints);

    cboAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboAutor.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlInferior.add(cboAutor, gridBagConstraints);

    lblDisciplina.setText("Disciplina");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlInferior.add(lblDisciplina, gridBagConstraints);

    txtDisciplina.setMinimumSize(new java.awt.Dimension(200, 20));
    txtDisciplina.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    pnlInferior.add(txtDisciplina, gridBagConstraints);

    btnRenomear.setText("Renomear");
    btnRenomear.setActionCommand("");
    btnRenomear.setPreferredSize(new java.awt.Dimension(125, 23));
    btnRenomear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRenomearActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
    pnlInferior.add(btnRenomear, gridBagConstraints);

    btnAdicionarAutor.setText("Adicionar Autor");
    btnAdicionarAutor.setPreferredSize(new java.awt.Dimension(125, 23));
    btnAdicionarAutor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAdicionarAutorActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 5, 0);
    pnlInferior.add(btnAdicionarAutor, gridBagConstraints);

    lblTitulo.setText("Título");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlInferior.add(lblTitulo, gridBagConstraints);

    txtTitulo.setMinimumSize(new java.awt.Dimension(200, 20));
    txtTitulo.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
    pnlInferior.add(txtTitulo, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
    getContentPane().add(pnlInferior, gridBagConstraints);

    btnSair.setText("Sair");
    btnSair.setPreferredSize(new java.awt.Dimension(150, 23));
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
    getContentPane().add(btnSair, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnProcurarArquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarArquivosActionPerformed
    // TODO add your handling code here:
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.btnProcurarArquivos(this.tblLivros, this.txtArquivos);
  }//GEN-LAST:event_btnProcurarArquivosActionPerformed

  private void btnProcurarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarAutoresActionPerformed
    // TODO add your handling code here:
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.btnProcurarAutores(this.txtAutores, this.getCboAutor());
  }//GEN-LAST:event_btnProcurarAutoresActionPerformed

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    // TODO add your handling code here:
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.btnFechar(this);
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnAdicionarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAutorActionPerformed
    // TODO add your handling code here:
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.btnAdicionarAutor(this.getTxtAutores().getText(), this.cboAutor);
  }//GEN-LAST:event_btnAdicionarAutorActionPerformed

  private void btnRenomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenomearActionPerformed
    // TODO add your handling code here:
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.btnRenomear(this);
  }//GEN-LAST:event_btnRenomearActionPerformed

  private void tblLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivrosMouseClicked
    // TODO add your handling code here:
    ControllerNomeLivros controller = new ControllerNomeLivros();
    controller.carregarAlteracao(this);
  }//GEN-LAST:event_tblLivrosMouseClicked

  /*
    Demais métodos
  */
  public void novo() {
  }
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
        java.util.logging.Logger.getLogger(ViewNomeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(ViewNomeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(ViewNomeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ViewNomeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewNomeLivros().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdicionarAutor;
  private javax.swing.JButton btnProcurarArquivos;
  private javax.swing.JButton btnProcurarAutores;
  private javax.swing.JButton btnRenomear;
  private javax.swing.JButton btnSair;
  private javax.swing.JComboBox<String> cboAutor;
  private javax.swing.JLabel lblArquivoFinal;
  private javax.swing.JLabel lblArquivoOriginal;
  private javax.swing.JLabel lblArquivos;
  private javax.swing.JLabel lblAutor;
  private javax.swing.JLabel lblAutores;
  private javax.swing.JLabel lblDisciplina;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel pnlInferior;
  private javax.swing.JPanel pnlSuperior;
  private javax.swing.JPanel pnlTabela;
  private javax.swing.JScrollPane pnlrTabela;
  private javax.swing.JTable tblLivros;
  private javax.swing.JTextField txtArquivoFinal;
  private javax.swing.JTextField txtArquivoOriginal;
  private javax.swing.JTextField txtArquivos;
  private javax.swing.JTextField txtAutores;
  private javax.swing.JTextField txtDisciplina;
  private javax.swing.JTextField txtTitulo;
  // End of variables declaration//GEN-END:variables

}
