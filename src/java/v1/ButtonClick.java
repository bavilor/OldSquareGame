package v1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonClick
{
  static int best = 1000;
  
  static ArrayList<Integer> arrayOfColors = new ArrayList();
  static ArrayList<JPanel> arrayOfCells = new ArrayList();
  static ArrayList<JPanel> bufferedArrayOfCells = new ArrayList();
  
  static JPanel bufferPanel = new JPanel();
  static int score = 0;
  
  public ButtonClick() {}
  
  public static void buttonClick(int color) { arrayOfColors = CellPanel.getArrayOfColors();
    arrayOfCells = CellPanel.getArrayOfCells();
    bufferedArrayOfCells = arrayOfCells;
    
    score += 1;
    ScorePanel.scoreLabel.setText("Score is: " + score);
    
    if (color == 0) CellPanel.cellPanel.setBackground(Color.red);
    if (color == 1) CellPanel.cellPanel.setBackground(Color.green);
    if (color == 2) CellPanel.cellPanel.setBackground(Color.blue);
    if (color == 3) CellPanel.cellPanel.setBackground(Color.pink);
    if (color == 4) CellPanel.cellPanel.setBackground(Color.yellow);
    if (color == 5) { CellPanel.cellPanel.setBackground(Color.orange);
    }
    for (int i = 0; i < 100; i++)
    {
      if (!((JPanel)arrayOfCells.get(i)).isOpaque())
      {
        if ((i - 1 > 0) && (((JPanel)arrayOfCells.get(i - 1)).isOpaque()) && (((Integer)arrayOfColors.get(i - 1)).intValue() == color) && ((i - 1) % 10 != 9))
        {
          bufferPanel = (JPanel)arrayOfCells.get(i - 1);
          bufferPanel.setOpaque(false);
          arrayOfCells.set(i - 1, bufferPanel);
        }
        if ((i - 10 > 0) && (((JPanel)arrayOfCells.get(i - 10)).isOpaque()) && (((Integer)arrayOfColors.get(i - 10)).intValue() == color))
        {
          bufferPanel = (JPanel)arrayOfCells.get(i - 10);
          bufferPanel.setOpaque(false);
          arrayOfCells.set(i - 10, bufferPanel);
        }
        if ((i + 1 > 0) && (i + 1 < 99) && (((Integer)arrayOfColors.get(i + 1)).intValue() == color) && ((i + 1) % 10 != 0) && (((JPanel)arrayOfCells.get(i + 1)).isOpaque()))
        {
          bufferPanel = (JPanel)arrayOfCells.get(i + 1);
          bufferPanel.setOpaque(false);
          arrayOfCells.set(i + 1, bufferPanel);
        }
        if ((i + 10 > 0) && (i + 10 < 100) && (((Integer)arrayOfColors.get(i + 10)).intValue() == color) && (((JPanel)arrayOfCells.get(i + 10)).isOpaque()))
        {
          bufferPanel = (JPanel)arrayOfCells.get(i + 10);
          bufferPanel.setOpaque(false);
          arrayOfCells.set(i + 10, bufferPanel);
        }
      }
    }
    
    CellPanel.repainCellPanel();
    int count = 0;
    
    for (int i = 0; i < arrayOfCells.size(); i++)
    {
      if (((JPanel)arrayOfCells.get(i)).isOpaque())
      {
        count++;
        break;
      }
    }
    if (count == 0)
    {
      if (best > score)
      {
        best = score;
      }
      ScorePanel.scoreLabel.setText("Congratulations! Score is " + score);
      
      score = 0;
    }
  }
  
  public static ArrayList<JPanel> getArrayOfCells()
  {
    return arrayOfCells;
  }
}
