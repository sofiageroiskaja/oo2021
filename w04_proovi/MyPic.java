import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MyPic {
    public static void main(String[] args) throws IOException{
        int width = 300;
        int height = 300;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.drawString("My Mickey", 120, 20);

        g.fillArc(60, 110, 175, 175, 0, 360);
        g.fillArc(15, 60, 100, 100, 0, 360);
        g.fillArc(180, 60, 100, 100, 0, 360);

        g.setColor(Color.RED);
        g.fillArc(60, 93, 175, 195, 0, -180);

        g.setColor(Color.YELLOW);
        g.fillOval(115, 200, 20, 45);
        g.fillOval(160, 200, 20, 45);
        
        ImageIO.write(picture, "png", new File("mickey.png"));
    }
}
