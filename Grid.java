import java.awt.Color;
import javax.swing.JButton;

public class Grid extends JButton {
    private int x;
    private int y;
    private Color originalColor;
    private boolean isMine = false;
    private boolean isRevealed = false;
    private boolean isFlagged = false;
    
    //Getters
    public int getXCoord() {
        return x;
    }
    public int getYCoord() {
        return y;
    }
    public boolean isMine() {
        return isMine;
    }
    public boolean isRevealed() {
        return isRevealed;
    }
    public boolean isFlagged() {
        return isFlagged;
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
    public void setMine(boolean isMine) {
        this.isMine = isMine;
    }
    public void setRevealed(boolean isRevealed) {
        this.isRevealed = isRevealed;
    }
    public void setFlagged(boolean isFlagged) {
        this.isFlagged = isFlagged;
    }

    //Methods
    public void reset() {
        setEnabled(true);
        setText("");
        setBackground(originalColor);
        isMine = false;
        isRevealed = false;
        isFlagged = false;
    }

    public void reveal() {
        if (!isRevealed && !isFlagged) {
            isRevealed = true;
            setEnabled(false);
        }
    }

    public void toggleFlag() {
        if (!isRevealed) {
            isFlagged = !isFlagged;
            setText (isFlagged ? "F" : "");
        }
    }

}