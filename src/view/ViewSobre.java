
package view;

import controller.ControllerSobre;

public class ViewSobre extends javax.swing.JFrame {
  //<editor-fold defaultstate="collapsed" desc="Campos">

  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Construtores">
  public ViewSobre() {
      initComponents();
  }
  //</editor-fold>
  
  //<editor-fold defaultstate="collapsed" desc="Get's ans Set's">
  
  //</editor-fold>

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlSuperior = new javax.swing.JPanel();
    lblLogo = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    lblDesenvolvedor = new javax.swing.JLabel();
    lblLinkedin = new javax.swing.JLabel();
    lblEndereco = new javax.swing.JLabel();
    lblCidade = new javax.swing.JLabel();
    lblEmpresa = new javax.swing.JLabel();
    lblNomeEmpresa = new javax.swing.JLabel();
    lblNomeDesenvolvedor = new javax.swing.JLabel();
    lblAtendimento = new javax.swing.JLabel();
    lblEmail = new javax.swing.JLabel();
    lblDiaAtendimento = new javax.swing.JLabel();
    lblHoraAtendimento = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pnlSuperior.setPreferredSize(new java.awt.Dimension(900, 240));
    pnlSuperior.setLayout(new java.awt.GridBagLayout());

    lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo611x200.jpg"))); // NOI18N
    lblLogo.setPreferredSize(new java.awt.Dimension(611, 200));
    pnlSuperior.add(lblLogo, new java.awt.GridBagConstraints());

    getContentPane().add(pnlSuperior, new java.awt.GridBagConstraints());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    jPanel2.setPreferredSize(new java.awt.Dimension(900, 400));
    jPanel2.setLayout(new java.awt.GridBagLayout());

    lblDesenvolvedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    lblDesenvolvedor.setForeground(new java.awt.Color(102, 102, 102));
    lblDesenvolvedor.setText("Desenvolvedor");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(30, 0, 2, 0);
    jPanel2.add(lblDesenvolvedor, gridBagConstraints);

    lblLinkedin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblLinkedin.setForeground(new java.awt.Color(51, 51, 51));
    lblLinkedin.setText("https://www.linkedin.com/in/thiago-baldykowski-02851632");
    lblLinkedin.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblLinkedin, gridBagConstraints);

    lblEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblEndereco.setForeground(new java.awt.Color(51, 51, 51));
    lblEndereco.setText("Visconde de Porto Alegre, n. 1300");
    lblEndereco.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblEndereco, gridBagConstraints);

    lblCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblCidade.setForeground(new java.awt.Color(51, 51, 51));
    lblCidade.setText("Ponta Grossa - Paraná");
    lblCidade.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblCidade, gridBagConstraints);

    lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    lblEmpresa.setForeground(new java.awt.Color(102, 102, 102));
    lblEmpresa.setText("Empresa");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
    jPanel2.add(lblEmpresa, gridBagConstraints);

    lblNomeEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblNomeEmpresa.setForeground(new java.awt.Color(51, 51, 51));
    lblNomeEmpresa.setText("Smart System");
    lblNomeEmpresa.setPreferredSize(new java.awt.Dimension(400, 20));
    lblNomeEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblNomeEmpresaMouseEntered(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblNomeEmpresa, gridBagConstraints);

    lblNomeDesenvolvedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblNomeDesenvolvedor.setForeground(new java.awt.Color(51, 51, 51));
    lblNomeDesenvolvedor.setText("Thiago Baldykowski");
    lblNomeDesenvolvedor.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblNomeDesenvolvedor, gridBagConstraints);

    lblAtendimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblAtendimento.setForeground(new java.awt.Color(51, 51, 51));
    lblAtendimento.setText("Horário de atendimento:");
    lblAtendimento.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.insets = new java.awt.Insets(30, 35, 2, 0);
    jPanel2.add(lblAtendimento, gridBagConstraints);

    lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblEmail.setForeground(new java.awt.Color(51, 51, 51));
    lblEmail.setText("thiago.baldykowski@gmail.com");
    lblEmail.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 9;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblEmail, gridBagConstraints);

    lblDiaAtendimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblDiaAtendimento.setForeground(new java.awt.Color(51, 51, 51));
    lblDiaAtendimento.setText("Segunda-feira à sexta-feira");
    lblDiaAtendimento.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 11;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblDiaAtendimento, gridBagConstraints);

    lblHoraAtendimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblHoraAtendimento.setForeground(new java.awt.Color(51, 51, 51));
    lblHoraAtendimento.setText("8:00 às 18:00");
    lblHoraAtendimento.setPreferredSize(new java.awt.Dimension(400, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.insets = new java.awt.Insets(0, 35, 2, 0);
    jPanel2.add(lblHoraAtendimento, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    getContentPane().add(jPanel2, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void lblNomeEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomeEmpresaMouseEntered
    // TODO add your handling code here:
    ControllerSobre controller = new ControllerSobre();
    controller.mudarFundo(this.lblNomeEmpresa);
  }//GEN-LAST:event_lblNomeEmpresaMouseEntered

  //<editor-fold defaultstate="collapsed" desc="Inicialização">
  public void iniciarViewSobre () {
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Demais métodos">

  //<editor-fold defaultstate="collapsed" desc="Main View">
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
        java.util.logging.Logger.getLogger(ViewSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(ViewSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(ViewSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(ViewSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewSobre().setVisible(true);
      }
    });
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Privados">
  private void imprimirPrivate () {
    System.out.println("");
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Púlblicos">
  public void imprimirPublic () {
    System.out.println("");
  }
  //</editor-fold>

  //</editor-fold>

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lblAtendimento;
  private javax.swing.JLabel lblCidade;
  private javax.swing.JLabel lblDesenvolvedor;
  private javax.swing.JLabel lblDiaAtendimento;
  private javax.swing.JLabel lblEmail;
  private javax.swing.JLabel lblEmpresa;
  private javax.swing.JLabel lblEndereco;
  private javax.swing.JLabel lblHoraAtendimento;
  private javax.swing.JLabel lblLinkedin;
  private javax.swing.JLabel lblLogo;
  private javax.swing.JLabel lblNomeDesenvolvedor;
  private javax.swing.JLabel lblNomeEmpresa;
  private javax.swing.JPanel pnlSuperior;
  // End of variables declaration//GEN-END:variables

}
