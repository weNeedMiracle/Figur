import java.awt.*;

public class Circle extends Shape {

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    void get(int a, int b, int c, int d){
        super.x = a;
        super.y = b;
        super.dlina = c;
        super.shirina = d;
    }

    @Override
    void draw(Graphics t, int x, int y, int dlina, int shirina) {
        t.drawOval(x, y, dlina, shirina);

    }
}
