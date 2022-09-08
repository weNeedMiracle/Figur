import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        BufferedImage Out = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
        Graphics t = Out.createGraphics();
        Circle c1 = new Circle();
        c1.get(40, 50, 50, 50);
        Rectangle r1 = new Rectangle();
        r1.get(100, 50, 100, 50);
        Shape[] m = {c1,r1};
        for(int i = 0; i < m.length; i++){
            m[i].draw(t, m[i].x, m[i].y, m[i].dlina, m[i].shirina);
        }
        File OutF = new File("Out.png");
        try {
            ImageIO.write(Out, "png", OutF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
