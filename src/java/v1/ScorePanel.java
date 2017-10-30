package v1;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ScorePanel
{
  static JPanel scorePanel;
  static JLabel scoreLabel;
  static JLabel winLabel;
  static JLabel bestScore;
  static JLabel playAgain;
  
  ScorePanel()
  {
    scorePanel = new JPanel();
    scorePanel.setBackground(Color.lightGray);
    
    scoreLabel = new JLabel("Score is: 0 ");
    
    scorePanel.add(scoreLabel);
  }
  
  public static JPanel getScorePanel()
  {
    new ScorePanel();
    return scorePanel;
  }
}
