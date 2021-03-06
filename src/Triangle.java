import java.awt.*;

/**
 * Created by schan on 2017-10-30.
 */
public class Triangle extends Polygon {
    public Triangle(int x, int y) {
        super(x,y);
    }

    public void draw(Graphics g) {
        g.drawLine(getCenterPoints().x, getCenterPoints().y-10, getCenterPoints().x-10, getCenterPoints().y+10);
        g.drawLine(getCenterPoints().x-10, getCenterPoints().y+10,
                getCenterPoints().x+10, getCenterPoints().y+10);
        g.drawLine(getCenterPoints().x+10, getCenterPoints().y+10, getCenterPoints().x, getCenterPoints().y-10);
    }
    @Override
    public String toString() {
        System.out.println("Triangle");
        return "Triangle";
    }

    public boolean overlaps(Triangle t){
        System.out.println("Triangle.overlaps: "+this.toString()+"   and    "+t.toString());
        return true;
    }
}
