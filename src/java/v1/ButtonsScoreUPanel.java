package v1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;



public class ButtonsScoreUPanel
{
  static JPanel buttonsScoreUPanel;
  BoxLayout buttonsScoreULayout;
  JPanel southPanel;
  JButton repaintButton;
  
  ButtonsScoreUPanel()
  {
    buttonsScoreUPanel = new JPanel();
    buttonsScoreUPanel.setBackground(Color.lightGray);
    southPanel = new JPanel();
    repaintButton = new JButton("Repaint");
    
    repaintButton.addActionListener(new ActionListener()
    {


      public void actionPerformed(ActionEvent arg0) {}


    });
    buttonsScoreULayout = new BoxLayout(buttonsScoreUPanel, 1);
    
    southPanel.setSize(100, 20);
    southPanel.setBackground(Color.lightGray);
    southPanel.add(repaintButton);
    
    buttonsScoreUPanel.setLayout(buttonsScoreULayout);
    
    buttonsScoreUPanel.add(ScorePanel.getScorePanel());
    buttonsScoreUPanel.add(ButtonsPanel.getButtonsPanel());
    buttonsScoreUPanel.add(southPanel);
  }
  
  public static JPanel getButtonsScoreUPanel()
  {
    new ButtonsScoreUPanel();
    return buttonsScoreUPanel;
  }
}
