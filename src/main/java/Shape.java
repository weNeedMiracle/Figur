import java.awt.*;

public abstract class Shape {
    public int x;
    public int y;
    public int dlina;
    public int shirina;
    String color;

    void equals(){};

    abstract void draw(Graphics t, int x, int y, int dlin, int shirina);
}
