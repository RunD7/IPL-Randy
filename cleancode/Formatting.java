package cleancode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formatting extends JFrame {
    private Color backgroundColor = new Color(80, 204, 55);
    private boolean isMouseOverRectangle = false;

    public Formatting() {
        setTitle("Clean Code Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isMouseOverRectangle = true;
                repaint();
            }
            @Override
            public void mouseExited(MouseEvent e) {
                isMouseOverRectangle = false;
                repaint();
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        drawRectangle(g);
        drawCircles(g);
    }
    private void drawRectangle(Graphics g) {
        g.setColor(backgroundColor);
        g.fillRect(100, 0, 200, 400);
    }
    private void drawCircles(Graphics g) {
        int numCircles = 6;
        for (int i = numCircles; i > 1; i--) {
            int radius = i * 7;

            if (isMouseOverRectangle) {
                g.setColor(Color.WHITE);
            } else {
                g.setColor(backgroundColor);
            }
            g.fillOval(getMousePosition().x - radius / 2, getMousePosition().y - radius / 2, radius, radius);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Formatting example = new Formatting();
            example.setVisible(true);
        });
    }
}