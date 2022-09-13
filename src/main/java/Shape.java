import java.awt.*;
import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public int dlina;
    public int shirina;
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && dlina == shape.dlina && shirina == shape.shirina && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, dlina, shirina, color);
    }

    abstract void draw(Graphics t, int x, int y, int dlin, int shirina);
}
