import javax.swing.JFrame;

public class Game {
    JFrame frame = new JFrame("Minesweeper");

    public Game() {
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
