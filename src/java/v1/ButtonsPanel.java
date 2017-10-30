package v1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;



public class ButtonsPanel
{
  JButton red;
  JButton green;
  JButton blue;
  JButton pink;
  JButton yellow;
  JButton orange;
  static JPanel buttonsPanel;
  GridLayout buttonsLayout;
  
  ButtonsPanel()
  {
    red = new JButton();
    green = new JButton();
    blue = new JButton();
    pink = new JButton();
    yellow = new JButton();
    orange = new JButton();
    
    red.setPreferredSize(new Dimension(60, 20));
    
    red.setBackground(Color.red);
    green.setBackground(Color.green);
    blue.setBackground(Color.blue);
    pink.setBackground(Color.pink);
    yellow.setBackground(Color.yellow);
    orange.setBackground(Color.orange);
    
    buttonsPanel = new JPanel();
    buttonsPanel.setBackground(Color.lightGray);
    
    buttonsLayout = new GridLayout(2, 3, 1, 1);
    
    buttonsPanel.setLayout(buttonsLayout);
    
    red.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        ButtonClick.buttonClick(0);
      }
    });
    green.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        ButtonClick.buttonClick(1);
      }
    });
    blue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        ButtonClick.buttonClick(2);
      }
    });
    pink.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        ButtonClick.buttonClick(3);
      }
    });
    yellow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        ButtonClick.buttonClick(4);
      }
    });
    orange.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        ButtonClick.buttonClick(5);
      }
      
    });
    buttonsPanel.add(red);
    buttonsPanel.add(green);
    buttonsPanel.add(blue);
    buttonsPanel.add(pink);
    buttonsPanel.add(yellow);
    buttonsPanel.add(orange);
  }
  
  public static JPanel getButtonsPanel()
  {
    new ButtonsPanel();
    return buttonsPanel;
  }
}
