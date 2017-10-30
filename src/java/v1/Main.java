package v1;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main
  extends JFrame
{
  JPanel centerEmptyPanel;
  
  Main()
  {
    centerEmptyPanel = new JPanel();
    centerEmptyPanel.setPreferredSize(new Dimension(5, 0));
    centerEmptyPanel.setBackground(Color.white);
    
    add("West", CellPanel.getCellsPanel());
    add("Center", centerEmptyPanel);
    add("East", ButtonsScoreUPanel.getButtonsScoreUPanel());
    
    setResizable(false);
    setTitle("Game v.1");
    setDefaultCloseOperation(3);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
  

  public static void main(String[] args)
  {
    new Main();
  }
}
