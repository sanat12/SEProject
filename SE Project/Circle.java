package modules.modules;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Circle extends Ellipse2D.Double {
    Circle(int radius, int cx, int cy) {
        height = 2*radius;
        width = 2*radius;
        x = cx-radius;
        y = cy-radius;
    }
    
}
