import java.awt.*;
import javax.swing.*;

public class Game {
    int rows = 10;
    int cols = 10;
    Timer gameTimer;
    int elapsedTime = 0;
    Grid[][] grid = new Grid[rows][cols];

    JFrame frame = new JFrame("Minesweeper");
    JPanel board = new JPanel();
    JPanel timerPanel = new JPanel();
    JLabel timerLabel = new JLabel("Seconds: 0");

        Game() {
            //Frame setup
            frame.setSize(600, 650);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());            
            frame.setLocationRelativeTo(null);
            

            //Timer panel setup
            timerPanel.setBackground(Color.BLACK);
            timerLabel.setFont(new Font ("Consalas", Font.BOLD, 40));
            timerLabel.setForeground(Color.LIGHT_GRAY);
            timerPanel.add(timerLabel);
            frame.add(timerPanel, BorderLayout.NORTH);


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

            //Timer setup
            gameTimer = new Timer(1000, e -> {
                elapsedTime++;
                timerLabel.setText((String.format("Seconds: " + elapsedTime)));
            });
            frame.setVisible(true);
        }

        public void startTimer() {
            elapsedTime = 0;
            timerLabel.setText("Seconds: 0");
            gameTimer.start();
        }

        public void stopTimer() {
            gameTimer.stop();
        }
    
    }

    
