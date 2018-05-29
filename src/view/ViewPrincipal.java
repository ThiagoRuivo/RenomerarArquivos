
package view;

import controller.ControllerPrincipal;


public class ViewPrincipal extends javax.swing.JFrame {
  /*
    Campos
  */

  /*
    Construtores
  */
  public ViewPrincipal() {
    initComponents();
  }
  
  /*
    Get's & Set's
  */

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlImagemFabricante = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btnPastas = new javax.swing.JButton();
    btnSelecao = new javax.swing.JButton();
    btnLote = new javax.swing.JButton();
    btnLivros = new javax.swing.JButton();
    btnMusica = new javax.swing.JButton();
    btnOpcoes = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(500, 700));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlImagemFabricante.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlImagemFabricante.setPreferredSize(new java.awt.Dimension(400, 200));
    pnlImagemFabricante.setLayout(new java.awt.GridBagLayout());

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2400x200.png"))); // NOI18N
    jLabel1.setToolTipText("");
    pnlImagemFabricante.add(jLabel1, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 75, 0);
    getContentPane().add(pnlImagemFabricante, gridBagConstraints);

    btnPastas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnPastas.setForeground(new java.awt.Color(0, 102, 102));
    btnPastas.setText("Aquivos em pasta");
    btnPastas.setPreferredSize(new java.awt.Dimension(250, 30));
    btnPastas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPastasActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    getContentPane().add(btnPastas, gridBagConstraints);

    btnSelecao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnSelecao.setForeground(new java.awt.Color(0, 102, 102));
    btnSelecao.setText("Seleção de arquivos");
    btnSelecao.setPreferredSize(new java.awt.Dimension(250, 30));
    btnSelecao.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSelecaoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    getContentPane().add(btnSelecao, gridBagConstraints);

    btnLote.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnLote.setForeground(new java.awt.Color(0, 102, 102));
    btnLote.setText("Renomear em lote");
    btnLote.setPreferredSize(new java.awt.Dimension(250, 30));
    btnLote.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoteActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    getContentPane().add(btnLote, gridBagConstraints);

    btnLivros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnLivros.setForeground(new java.awt.Color(0, 102, 102));
    btnLivros.setText("Nome de livros");
    btnLivros.setPreferredSize(new java.awt.Dimension(250, 30));
    btnLivros.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLivrosActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    getContentPane().add(btnLivros, gridBagConstraints);

    btnMusica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnMusica.setForeground(new java.awt.Color(0, 102, 102));
    btnMusica.setText("Nome Músicas");
    btnMusica.setPreferredSize(new java.awt.Dimension(250, 30));
    btnMusica.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMusicaActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    getContentPane().add(btnMusica, gridBagConstraints);

    btnOpcoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnOpcoes.setForeground(new java.awt.Color(0, 102, 102));
    btnOpcoes.setText("Opções");
    btnOpcoes.setPreferredSize(new java.awt.Dimension(250, 30));
    btnOpcoes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpcoesActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
    getContentPane().add(btnOpcoes, gridBagConstraints);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 102, 102));
    jLabel2.setText("Desenvolvido por SmartSystem - Thiago José Baldykowski");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.insets = new java.awt.Insets(75, 0, 0, 0);
    getContentPane().add(jLabel2, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnPastasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastasActionPerformed
    // TODO add your handling code here:
    ControllerPrincipal controller = new ControllerPrincipal();
    controller.btnPastas();
  }//GEN-LAST:event_btnPastasActionPerformed

  private void btnSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoActionPerformed
    // TODO add your handling code here:
    ControllerPrincipal controller = new ControllerPrincipal();
    controller.btnSelecao();
  }//GEN-LAST:event_btnSelecaoActionPerformed

  private void btnLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoteActionPerformed
    // TODO add your handling code here:
    ControllerPrincipal controller = new ControllerPrincipal();
    controller.btnLote();
  }//GEN-LAST:event_btnLoteActionPerformed

  private void btnLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivrosActionPerformed
    // TODO add your handling code here:
    ControllerPrincipal controller = new ControllerPrincipal();
    controller.btnLivros();
  }//GEN-LAST:event_btnLivrosActionPerformed

  private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
    // TODO add your handling code here:
    ControllerPrincipal controller = new ControllerPrincipal();
    controller.btnMusica();
  }//GEN-LAST:event_btnMusicaActionPerformed

  private void btnOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcoesActionPerformed
    // TODO add your handling code here:
    ControllerPrincipal controller = new ControllerPrincipal();
    controller.btnOpcoes();
  }//GEN-LAST:event_btnOpcoesActionPerformed

  /*
    Demais métodos
  */
  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLivros;
  private javax.swing.JButton btnLote;
  private javax.swing.JButton btnMusica;
  private javax.swing.JButton btnOpcoes;
  private javax.swing.JButton btnPastas;
  private javax.swing.JButton btnSelecao;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel pnlImagemFabricante;
  // End of variables declaration//GEN-END:variables

}
