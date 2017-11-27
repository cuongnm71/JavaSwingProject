import javax.swing.*;
import java.awt.*;

public class diagramPanel extends JPanel {
    public diagramPanel() {
//        setBackground(Color.BLUE);
        repaint();
    }

    public void paint(Graphics g) {
//        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        int a = 90;
        int b = 60;
        int c = 10;
        int d = 15;


        Graphics2D g2 = (Graphics2D) g;

//        g2.translate(640, 332.5);
//        g2.rotate(30.0 * Math.PI / 180.0);
//        g2.scale(3, 3);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,1280,720);

        g.setColor(Color.BLACK);
        g.drawRect(c, d, a, b);
        g.drawString("Hi", (a + c) / 2, (b + d) / 2);
        g.drawLine(c, (b + d) / 2 + 10 , a+10, (b + d) / 2 + 10);


    }
}
