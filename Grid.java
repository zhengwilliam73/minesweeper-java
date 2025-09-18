import java.awt.Color;
import javax.swing.JButton;

public class Grid extends JButton {
    private int x;
    private int y;
    private Color originalColor;
    
    //Getters
    public int getXCoord() {
        return x;
    }
    public int getYCoord() {
        return y;
    }



    // Setters
    public void setXCoord(int x) {
        this.x = x;
    }

    public void setYCoord(int y) {
        this.y = y;
    }
    public void setColor(Color color) {
        this.originalColor = color;
        this.setBackground(this.originalColor);
    }
    public void setOriginalColor(Color color) {
        this.setBackground(this.originalColor);

    }

    //Methods
    public void reset() {
        // Reset the tile's state (customize as needed)
        setEnabled(true);
        setText("");
        setBackground(null);
        // Add any additional reset logic here
    }

}