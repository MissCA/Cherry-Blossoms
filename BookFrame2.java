import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookFrame2 extends Frame implements WindowListener,ActionListener{

  public BookFrame2(String title){
    setLayout(null);
    setBackground(Color.blue);
    addWindowListener(this);


  }
    public void actionPerformed(ActionEvent e) {

      }

  public static void main(String[] args) {
      Frame frame3 = new familyLibrary("Delete Book");
      frame3.setSize(1000,700);
      frame3.setVisible(true);
  }
  public void windowClosing(WindowEvent e) {
          dispose();
          System.exit(0);
  }
  public void windowActivated(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}
  public void windowOpened(WindowEvent e) {}
  public void windowClosed(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}

}
