
package main;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.ViewPrincipal;

public class Main {
  /*
    Campos
  */

  /*
    Construtores
  */
  
  /*
    Main
  */
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      ViewPrincipal view = new ViewPrincipal();
      view.setLocationRelativeTo(null);
      view.setVisible(true);
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println(ex.getMessage());
    } catch (InstantiationException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println(ex.getMessage());
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println(ex.getMessage());
    } catch (UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println(ex.getMessage());
    }
//    File file = new File("E:\\Imagens\\Tiradas da Net\\FromNet\\");
//    File[] arquivos = file.listFiles();
//    for (File fileTmp : arquivos) {
//      System.out.println(fileTmp.getName());
//    }
  }

  /*
    Get's & Set's
  */

  /*
    Demais métodos
  */
}
