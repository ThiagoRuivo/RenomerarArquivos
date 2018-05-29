
package view;

import controller.ControllerMusicas;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewNomeMusicas extends javax.swing.JFrame {
  /*
    Campos
  */

  /*
    Construtores
  */
  public ViewNomeMusicas() {
    initComponents();
    ControllerMusicas controller = new ControllerMusicas();
    controller.iniciarControllerMusicas(this);
  }
  
  /*
    Get's & Set's
  */
  public JButton getBtnProcurarArquivos() {
    return btnProcurarArquivos;
  }
  public void setBtnProcurarArquivos(JButton btnProcurarArquivos) {
    this.btnProcurarArquivos = btnProcurarArquivos;
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
  public JCheckBox getChkParaTodos() {
    return chkParaTodos;
  }
  public void setChkParaTodos(JCheckBox chkParaTodos) {
    this.chkParaTodos = chkParaTodos;
  }
  public JLabel getLblArtista() {
    return lblArtista;
  }
  public void setLblArtista(JLabel lblArtista) {
    this.lblArtista = lblArtista;
  }
  public JLabel getLblCaminho() {
    return lblCaminho;
  }
  public void setLblCaminho(JLabel lblCaminho) {
    this.lblCaminho = lblCaminho;
  }
  public JLabel getLblCaminhoAbsoluto() {
    return lblCaminhoAbsoluto;
  }
  public void setLblCaminhoAbsoluto(JLabel lblCaminhoAbsoluto) {
    this.lblCaminhoAbsoluto = lblCaminhoAbsoluto;
  }
  public JLabel getLblNovoNome() {
    return lblNovoNome;
  }
  public void setLblNovoNome(JLabel lblNovoNome) {
    this.lblNovoNome = lblNovoNome;
  }
  public JLabel getLblNumero() {
    return lblNumero;
  }
  public void setLblNumero(JLabel lblNumero) {
    this.lblNumero = lblNumero;
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
  public JTable getTblArquivos() {
    return tblArquivos;
  }
  public void setTblArquivos(JTable tblArquivos) {
    this.tblArquivos = tblArquivos;
  }
  public JTextField getTxtArtista() {
    return txtArtista;
  }
  public void setTxtArtista(JTextField txtArtista) {
    this.txtArtista = txtArtista;
  }
  public JTextField getTxtCaminhoAbsoluto() {
    return txtCaminhoAbsoluto;
  }
  public void setTxtCaminhoAbsoluto(JTextField txtCaminhoAbsoluto) {
    this.txtCaminhoAbsoluto = txtCaminhoAbsoluto;
  }
  public JTextField getTxtCaminhoArquivos() {
    return txtCaminhoArquivos;
  }
  public void setTxtCaminhoArquivos(JTextField txtCaminhoArquivos) {
    this.txtCaminhoArquivos = txtCaminhoArquivos;
  }
  public JTextField getTxtNovoNome() {
    return txtNovoNome;
  }
  public void setTxtNovoNome(JTextField txtNovoNome) {
    this.txtNovoNome = txtNovoNome;
  }
  public JTextField getTxtNumero() {
    return txtNumero;
  }
  public void setTxtNumero(JTextField txtNumero) {
    this.txtNumero = txtNumero;
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
    lblCaminho = new javax.swing.JLabel();
    txtCaminhoArquivos = new javax.swing.JTextField();
    btnProcurarArquivos = new javax.swing.JButton();
    pnlTabela = new javax.swing.JPanel();
    pnlrTabela = new javax.swing.JScrollPane();
    tblArquivos = new javax.swing.JTable();
    pnlInferior = new javax.swing.JPanel();
    lblNovoNome = new javax.swing.JLabel();
    txtNovoNome = new javax.swing.JTextField();
    lblCaminhoAbsoluto = new javax.swing.JLabel();
    txtCaminhoAbsoluto = new javax.swing.JTextField();
    lblArtista = new javax.swing.JLabel();
    txtArtista = new javax.swing.JTextField();
    lblTitulo = new javax.swing.JLabel();
    txtTitulo = new javax.swing.JTextField();
    chkParaTodos = new javax.swing.JCheckBox();
    lblNumero = new javax.swing.JLabel();
    txtNumero = new javax.swing.JTextField();
    btnRenomear = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlSuperior.setPreferredSize(new java.awt.Dimension(900, 65));
    pnlSuperior.setLayout(new java.awt.GridBagLayout());

    lblCaminho.setText("Carregar arquivos de músicas");
    pnlSuperior.add(lblCaminho, new java.awt.GridBagConstraints());

    txtCaminhoArquivos.setPreferredSize(new java.awt.Dimension(600, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
    pnlSuperior.add(txtCaminhoArquivos, gridBagConstraints);

    btnProcurarArquivos.setText("Procurar");
    btnProcurarArquivos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcurarArquivosActionPerformed(evt);
      }
    });
    pnlSuperior.add(btnProcurarArquivos, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
    getContentPane().add(pnlSuperior, gridBagConstraints);

    pnlTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlTabela.setPreferredSize(new java.awt.Dimension(900, 400));
    pnlTabela.setLayout(new java.awt.GridBagLayout());

    pnlrTabela.setPreferredSize(new java.awt.Dimension(850, 350));

    tblArquivos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    tblArquivos.setPreferredSize(new java.awt.Dimension(850, 345));
    tblArquivos.setShowHorizontalLines(false);
    tblArquivos.setShowVerticalLines(false);
    tblArquivos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblArquivosMouseClicked(evt);
      }
    });
    pnlrTabela.setViewportView(tblArquivos);

    pnlTabela.add(pnlrTabela, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
    getContentPane().add(pnlTabela, gridBagConstraints);

    pnlInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlInferior.setPreferredSize(new java.awt.Dimension(900, 175));
    pnlInferior.setLayout(new java.awt.GridBagLayout());

    lblNovoNome.setText("Novo nome para o arquivo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlInferior.add(lblNovoNome, gridBagConstraints);

    txtNovoNome.setPreferredSize(new java.awt.Dimension(600, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 20, 3, 20);
    pnlInferior.add(txtNovoNome, gridBagConstraints);

    lblCaminhoAbsoluto.setText("Caminho absoluto do arquivo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlInferior.add(lblCaminhoAbsoluto, gridBagConstraints);

    txtCaminhoAbsoluto.setPreferredSize(new java.awt.Dimension(600, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 20, 3, 20);
    pnlInferior.add(txtCaminhoAbsoluto, gridBagConstraints);

    lblArtista.setText("Artista/ Banda");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlInferior.add(lblArtista, gridBagConstraints);

    txtArtista.setPreferredSize(new java.awt.Dimension(300, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 20, 3, 20);
    pnlInferior.add(txtArtista, gridBagConstraints);

    lblTitulo.setText("Título da música");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlInferior.add(lblTitulo, gridBagConstraints);

    txtTitulo.setPreferredSize(new java.awt.Dimension(300, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 20, 3, 20);
    pnlInferior.add(txtTitulo, gridBagConstraints);

    chkParaTodos.setText("Mesmo artista para todos os arquivos carregados");
    chkParaTodos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        chkParaTodosActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    pnlInferior.add(chkParaTodos, gridBagConstraints);

    lblNumero.setText("Número");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlInferior.add(lblNumero, gridBagConstraints);

    txtNumero.setPreferredSize(new java.awt.Dimension(300, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 20, 3, 20);
    pnlInferior.add(txtNumero, gridBagConstraints);

    btnRenomear.setText("Renomear");
    btnRenomear.setPreferredSize(new java.awt.Dimension(150, 23));
    btnRenomear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRenomearActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlInferior.add(btnRenomear, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
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
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 20);
    getContentPane().add(btnSair, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    // TODO add your handling code here:
    ControllerMusicas controller = new ControllerMusicas();
    controller.btnFechar(this);
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnRenomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenomearActionPerformed
    // TODO add your handling code here:
    ControllerMusicas controller = new ControllerMusicas();
    controller.btnRenomear(this);
  }//GEN-LAST:event_btnRenomearActionPerformed

  private void btnProcurarArquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarArquivosActionPerformed
    // TODO add your handling code here:
    ControllerMusicas controller = new ControllerMusicas();
    controller.btnProcurar(this.txtCaminhoArquivos, this.tblArquivos);
  }//GEN-LAST:event_btnProcurarArquivosActionPerformed

  private void chkParaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkParaTodosActionPerformed
    // TODO add your handling code here:
    ControllerMusicas controller = new ControllerMusicas();
    controller.chkParaTodos();
  }//GEN-LAST:event_chkParaTodosActionPerformed

  private void tblArquivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArquivosMouseClicked
    // TODO add your handling code here:
    ControllerMusicas controller = new ControllerMusicas();
    controller.transferirDados(this);
  }//GEN-LAST:event_tblArquivosMouseClicked

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
        java.util.logging.Logger.getLogger(ViewNomeMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(ViewNomeMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(ViewNomeMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ViewNomeMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewNomeMusicas().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcurarArquivos;
  private javax.swing.JButton btnRenomear;
  private javax.swing.JButton btnSair;
  private javax.swing.JCheckBox chkParaTodos;
  private javax.swing.JLabel lblArtista;
  private javax.swing.JLabel lblCaminho;
  private javax.swing.JLabel lblCaminhoAbsoluto;
  private javax.swing.JLabel lblNovoNome;
  private javax.swing.JLabel lblNumero;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel pnlInferior;
  private javax.swing.JPanel pnlSuperior;
  private javax.swing.JPanel pnlTabela;
  private javax.swing.JScrollPane pnlrTabela;
  private javax.swing.JTable tblArquivos;
  private javax.swing.JTextField txtArtista;
  private javax.swing.JTextField txtCaminhoAbsoluto;
  private javax.swing.JTextField txtCaminhoArquivos;
  private javax.swing.JTextField txtNovoNome;
  private javax.swing.JTextField txtNumero;
  private javax.swing.JTextField txtTitulo;
  // End of variables declaration//GEN-END:variables

}
