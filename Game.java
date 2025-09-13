import java.awt.*;
import javax.swing.*;

public class Game {
    int rows = 10;
    int cols = 10;
    Grid[][] grid = new Grid[rows][cols];

    JFrame frame = new JFrame("Minesweeper");
    JPanel board = new JPanel();

        Game() {
            //Frame setup
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());            
            frame.setLocationRelativeTo(null);
            
            //Board setup
            board.setLayout(new GridLayout(rows, cols));
            frame.add(board, BorderLayout.CENTER);
    
            //Grid setup
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    Grid tile = new Grid();
                    tile.setXCoord(i);
                    tile.setYCoord(j);
    
                    if ((i + j) % 2 == 0) {
                        tile.setBackground(Color.LIGHT_GRAY);
                    } 
                    else {
                        tile.setBackground(Color.GRAY);
                    }
    
                    board.add(tile);
                    grid[i][j] = tile;
                }
            }
            frame.setVisible(true);
        }
    }

