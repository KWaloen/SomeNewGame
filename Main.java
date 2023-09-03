import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();

        JFrame frame = new JFrame();
        frame.setTitle("Some Game");
        frame.add(gameWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


    }

}
