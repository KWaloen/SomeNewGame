import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel {

    public GameWindow() {
        this.setDoubleBuffered(true);
        this.setBackground(Color.BLACK);
        System.out.println("THIS IS A TEST COMMIT");
        System.out.println("THIS IS ANOTHER TEST COMMIT");

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g.create();

        drawGame(g2D);
        repaint();
        g2D.dispose();

    }

    private void drawGame(Graphics2D g2D) {
    }


}
