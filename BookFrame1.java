import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookFrame1 extends Frame implements WindowListener,ActionListener{

    JTextField title2 = new JTextField();
    JTextField bookTitleA = new JTextField();
    JTextField bookAuthorA = new JTextField();
    JButton nowAdd = new JButton();

  public BookFrame1(String title) {
    setLayout(null);
    setBackground(Color.blue);
    addWindowListener(this);

    Font font1 = new Font("SansSerif", Font.BOLD, 50);
    title2.setBackground(Color.yellow);
    title2.setForeground(Color.gray);
    title2.setEditable(false);
    title2.setBounds(250,90,500,100);
    title2.setText("      Add Book");
    title2.setFont(font1);
    add(main);

  }
  public void actionPerformed(ActionEvent e) {

    }

  public static void main(String[] args) {
    Frame frame4 = new familyLibrary("Add Book");
    frame4.setSize(1000,700);
    frame4.setVisible(true);
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
