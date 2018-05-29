
package view;

import controller.ControllerLote;

public class ViewLote extends javax.swing.JFrame {
  /*
    Campos
  */

  /*
    Construtores
  */
  public ViewLote() {
    initComponents();
    ControllerLote controller = new ControllerLote();
    controller.iniciarControllerLote(this);
  }
  
  /*
    Get's & Set's
  */
  public javax.swing.JButton getBtnProcurar() {
    return btnProcurar;
  }
  public void setBtnProcurar(javax.swing.JButton btnProcurar) {
    this.btnProcurar = btnProcurar;
  }
  public javax.swing.JButton getBtnRenomear() {
    return btnRenomear;
  }
  public void setBtnRenomear(javax.swing.JButton btnRenomear) {
    this.btnRenomear = btnRenomear;
  }
  public javax.swing.JButton getBtnSair() {
    return btnSair;
  }
  public void setBtnSair(javax.swing.JButton btnSair) {
    this.btnSair = btnSair;
  }
  public javax.swing.JLabel getLblCaminho() {
    return lblCaminho;
  }
  public void setLblCaminho(javax.swing.JLabel lblCaminho) {
    this.lblCaminho = lblCaminho;
  }
  public javax.swing.JPanel getPnlArquivos() {
    return pnlArquivos;
  }
  public void setPnlArquivos(javax.swing.JPanel pnlArquivos) {
    this.pnlArquivos = pnlArquivos;
  }
  public javax.swing.JPanel getPnlCaminho() {
    return pnlCaminho;
  }
  public void setPnlCaminho(javax.swing.JPanel pnlCaminho) {
    this.pnlCaminho = pnlCaminho;
  }
  public javax.swing.JScrollPane getPnlrArquivos() {
    return pnlrArquivos;
  }
  public void setPnlrArquivos(javax.swing.JScrollPane pnlrArquivos) {
    this.pnlrArquivos = pnlrArquivos;
  }
  public javax.swing.JTable getTblArquivos() {
    return tblArquivos;
  }
  public void setTblArquivos(javax.swing.JTable tblArquivos) {
    this.tblArquivos = tblArquivos;
  }
  public javax.swing.JTextField getTxtCaminho() {
    return txtCaminho;
  }
  public void setTxtCaminho(javax.swing.JTextField txtCaminho) {
    this.txtCaminho = txtCaminho;
  }
  
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlCaminho = new javax.swing.JPanel();
    lblCaminho = new javax.swing.JLabel();
    txtCaminho = new javax.swing.JTextField();
    btnProcurar = new javax.swing.JButton();
    pnlArquivos = new javax.swing.JPanel();
    pnlrArquivos = new javax.swing.JScrollPane();
    tblArquivos = new javax.swing.JTable();
    btnRenomear = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlCaminho.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlCaminho.setPreferredSize(new java.awt.Dimension(900, 75));
    pnlCaminho.setLayout(new java.awt.GridBagLayout());

    lblCaminho.setText("Caminho");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    pnlCaminho.add(lblCaminho, gridBagConstraints);

    txtCaminho.setPreferredSize(new java.awt.Dimension(500, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 4;
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
    pnlCaminho.add(txtCaminho, gridBagConstraints);

    btnProcurar.setText("Procurar");
    btnProcurar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcurarActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 0;
    pnlCaminho.add(btnProcurar, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
    getContentPane().add(pnlCaminho, gridBagConstraints);

    pnlArquivos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlArquivos.setPreferredSize(new java.awt.Dimension(900, 400));
    pnlArquivos.setLayout(new java.awt.GridBagLayout());

    pnlrArquivos.setPreferredSize(new java.awt.Dimension(850, 350));

    tblArquivos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    tblArquivos.setPreferredSize(new java.awt.Dimension(850, 345));
    pnlrArquivos.setViewportView(tblArquivos);

    pnlArquivos.add(pnlrArquivos, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
    getContentPane().add(pnlArquivos, gridBagConstraints);

    btnRenomear.setText("Renomear");
    btnRenomear.setPreferredSize(new java.awt.Dimension(150, 23));
    btnRenomear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRenomearActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
    getContentPane().add(btnRenomear, gridBagConstraints);

    btnSair.setText("Sair");
    btnSair.setPreferredSize(new java.awt.Dimension(150, 23));
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
    getContentPane().add(btnSair, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    // TODO add your handling code here:
    ControllerLote controller = new ControllerLote();
    controller.btnFechar(this);
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnRenomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenomearActionPerformed
    // TODO add your handling code here:
    ControllerLote controller = new ControllerLote();
    controller.btnRenomear(this);
  }//GEN-LAST:event_btnRenomearActionPerformed

  private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
    // TODO add your handling code here:
    ControllerLote controller = new ControllerLote();
    controller.btnProcuar(this);
  }//GEN-LAST:event_btnProcurarActionPerformed

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
        java.util.logging.Logger.getLogger(ViewLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(ViewLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(ViewLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ViewLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewLote().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcurar;
  private javax.swing.JButton btnRenomear;
  private javax.swing.JButton btnSair;
  private javax.swing.JLabel lblCaminho;
  private javax.swing.JPanel pnlArquivos;
  private javax.swing.JPanel pnlCaminho;
  private javax.swing.JScrollPane pnlrArquivos;
  private javax.swing.JTable tblArquivos;
  private javax.swing.JTextField txtCaminho;
  // End of variables declaration//GEN-END:variables

}
