import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookFrame3 extends Frame implements WindowListener,ActionListener{

  public BookFrame3(String title){
    setLayout(null);
    setBackground(Color.blue);
    addWindowListener(this);

  }
  public void actionPerformed(ActionEvent e) {

    }

  public static void main(String[] args) {
    Frame frame2 = new familyLibrary("Search Books");
    frame2.setSize(1000,700);
    frame2.setVisible(true);
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
