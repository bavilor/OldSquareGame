package v1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.swing.JPanel;


public class CellPanel
{
  static JPanel cellPanel;
  static JPanel cell;
  static GridLayout cellPanelLayout;
  static int color;
  private static ArrayList<JPanel> arrayOfCells = new ArrayList();
  private static ArrayList<Integer> arrayOfColors = new ArrayList();
  
  CellPanel()
  {
    cellPanel = new JPanel();
    cellPanelLayout = new GridLayout(10, 10, 0, 0);
    
    cellPanel.setLayout(cellPanelLayout);
    
    createCells();
    
    if (arrayOfCells.isEmpty()) {
      System.out.println("Error. Please, reload the programm!");
    } else {
      for (int i = 0; i < arrayOfCells.size(); i++)
      {
        cellPanel.add((Component)arrayOfCells.get(i));
      }
    }
    startCellDraw();
  }
  


  private static void startCellDraw()
  {
    JPanel bufferedCell = new JPanel();
    if (((Integer)arrayOfColors.get(0)).intValue() == 0) {
      cellPanel.setBackground(Color.red);
      bufferedCell = (JPanel)arrayOfCells.get(0);
      bufferedCell.setOpaque(false);
      arrayOfCells.set(0, bufferedCell);
      cellPanel.repaint();
    }
    if (((Integer)arrayOfColors.get(0)).intValue() == 1) {
      cellPanel.setBackground(Color.green);
      bufferedCell = (JPanel)arrayOfCells.get(0);
      bufferedCell.setOpaque(false);
      arrayOfCells.set(0, bufferedCell);
      cellPanel.repaint();
    }
    if (((Integer)arrayOfColors.get(0)).intValue() == 2) {
      cellPanel.setBackground(Color.blue);
      bufferedCell = (JPanel)arrayOfCells.get(0);
      bufferedCell.setOpaque(false);
      arrayOfCells.set(0, bufferedCell);
      cellPanel.repaint();
    }
    if (((Integer)arrayOfColors.get(0)).intValue() == 3) {
      cellPanel.setBackground(Color.pink);
      bufferedCell = (JPanel)arrayOfCells.get(0);
      bufferedCell.setOpaque(false);
      arrayOfCells.set(0, bufferedCell);
      cellPanel.repaint();
    }
    if (((Integer)arrayOfColors.get(0)).intValue() == 4) {
      cellPanel.setBackground(Color.yellow);
      bufferedCell = (JPanel)arrayOfCells.get(0);
      bufferedCell.setOpaque(false);
      arrayOfCells.set(0, bufferedCell);
      cellPanel.repaint();
    }
    if (((Integer)arrayOfColors.get(0)).intValue() == 5) {
      cellPanel.setBackground(Color.orange);
      bufferedCell = (JPanel)arrayOfCells.get(0);
      bufferedCell.setOpaque(false);
      arrayOfCells.set(0, bufferedCell);
      cellPanel.repaint();
    }
    
    for (int i = 0; i < 100; i++)
    {
      if (!((JPanel)arrayOfCells.get(i)).isOpaque())
      {
        if ((i - 1 > 0) && (((JPanel)arrayOfCells.get(i - 1)).isOpaque()) && (arrayOfColors.get(i - 1) == arrayOfColors.get(0)) && ((i - 1) % 10 != 9))
        {
          bufferedCell = (JPanel)arrayOfCells.get(i - 1);
          bufferedCell.setOpaque(false);
          arrayOfCells.set(i - 1, bufferedCell);
        }
        if ((i - 10 > 0) && (((JPanel)arrayOfCells.get(i - 10)).isOpaque()) && (arrayOfColors.get(i - 10) == arrayOfColors.get(0)))
        {
          bufferedCell = (JPanel)arrayOfCells.get(i - 10);
          bufferedCell.setOpaque(false);
          arrayOfCells.set(i - 10, bufferedCell);
        }
        if ((i + 1 < 100) && (arrayOfColors.get(i + 1) == arrayOfColors.get(0)) && ((i + 1) % 10 != 0) && (((JPanel)arrayOfCells.get(i + 1)).isOpaque()))
        {
          bufferedCell = (JPanel)arrayOfCells.get(i + 1);
          bufferedCell.setOpaque(false);
          arrayOfCells.set(i + 1, bufferedCell);
        }
        if ((i + 10 < 100) && (arrayOfColors.get(i + 10) == arrayOfColors.get(0)) && (((JPanel)arrayOfCells.get(i + 10)).isOpaque()))
        {
          bufferedCell = (JPanel)arrayOfCells.get(i + 10);
          bufferedCell.setOpaque(false);
          arrayOfCells.set(i + 10, bufferedCell);
        }
      }
    }
    cellPanel.repaint();
  }
  
  private static void createCells()
  {
    for (int i = 0; i < 100; i++)
    {
      color = (int)(Math.random() * 6.0D);
      
      cell = new JPanel();
      cell.setPreferredSize(new Dimension(30, 30));
      
      if (color == 0) { cell.setBackground(Color.red);
      } else if (color == 1) { cell.setBackground(Color.green);
      } else if (color == 2) { cell.setBackground(Color.blue);
      } else if (color == 3) { cell.setBackground(Color.pink);
      } else if (color == 4) cell.setBackground(Color.yellow); else {
        cell.setBackground(Color.orange);
      }
      if ((arrayOfCells.size() < 100) && (arrayOfColors.size() < 100))
      {
        arrayOfCells.add(cell);
        arrayOfColors.add(Integer.valueOf(color));
      }
      else {
        arrayOfCells.set(i, cell);
        arrayOfColors.set(i, Integer.valueOf(color));
      }
    }
  }
  
  public static JPanel getCellsPanel()
  {
    new CellPanel();
    return cellPanel;
  }
  
  public static ArrayList<Integer> getArrayOfColors()
  {
    return arrayOfColors;
  }
  
  public static ArrayList<JPanel> getArrayOfCells()
  {
    return arrayOfCells;
  }
  
  public static void repainCellPanel()
  {
    arrayOfCells = ButtonClick.getArrayOfCells();
    cellPanel.removeAll();
    for (int i = 0; i < arrayOfCells.size(); i++)
    {
      cellPanel.add((Component)arrayOfCells.get(i));
    }
    cellPanel.repaint();
    cellPanel.revalidate();
  }
  
  public static void recreateCellPanel()
  {
    cellPanel.removeAll();
    
    createCells();
    
    if (arrayOfCells.isEmpty()) {
      System.out.println("Error. Please, reload the programm!");
    } else {
      for (int i = 0; i < arrayOfCells.size(); i++)
      {
        cellPanel.add((Component)arrayOfCells.get(i));
      }
    }
    startCellDraw();
    cellPanel.revalidate();
  }
}
