import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MyPoligon {
    public static void main(String[] args) throws IOException{
        int width = 300;
        int height = 150;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.GRAY);
        g.drawString("Bow", 135, 30);

        int x[] = { 85, 210, 210, 85 }; 
        int y[] = { 70, 110, 70, 110 }; 
        int numberofpoints = 4; 
  
        g.setColor(Color.BLACK);
        g.fillPolygon(x, y, numberofpoints);

        g.setColor(Color.RED);
        g.fillArc(137, 80, 20, 20, 0, 360);


        ImageIO.write(picture, "png", new File("poligon.png"));
    }
}
