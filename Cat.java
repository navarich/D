import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

/**
 * Created by 4 on 22.03.2016.
 */
public class Cat implements DrawInterface {

    @Override
    public void DrawFigure() {
        ArrayList<Rectangle> cat = new ArrayList<Rectangle>();
        int scale = 32;
        Rectangle r = new Rectangle(11 * scale + 1, 2 * scale + 1, scale, scale * 14 - 1); cat.add(r);
        r = new Rectangle(12 * scale + 1, 3 * scale + 1, 3 * scale, scale * 13 - 1);cat.add(r);
        r = new Rectangle(15 * scale + 1, 2 * scale + 1, scale, scale * 14 - 1);cat.add(r);
        r = new Rectangle(16 * scale + 1, 4 * scale + 1, scale, scale * 2 - 1);cat.add(r);
        r = new Rectangle(10 * scale + 1, 4 * scale + 1, scale, scale * 2 - 1);cat.add(r);
        r = new Rectangle(16 * scale + 1, 8 * scale + 1, scale, scale * 3 - 1);cat.add(r);
        r = new Rectangle(16 * scale + 1, 15 * scale + 1, scale, scale - 1);cat.add(r);
        r = new Rectangle(10 * scale + 1, 8 * scale + 1, scale, scale * 8 - 1);cat.add(r);
        r = new Rectangle(9 * scale + 1, 8 * scale + 1, scale, scale * 8 - 1);cat.add(r);
        r = new Rectangle(8 * scale + 1, 9 * scale + 1, scale, scale * 7 - 1);cat.add(r);
        r = new Rectangle(7 * scale + 1, 10 * scale + 1, scale, scale * 4 - 1);cat.add(r);
        r = new Rectangle(5 * scale + 1, 15 * scale + 1, scale * 3, scale);cat.add(r);
        r = new Rectangle(4 * scale + 1, 14 * scale + 1, scale * 2, scale);cat.add(r);
        r = new Rectangle(4 * scale + 1, 12 * scale + 1, scale, scale * 2);cat.add(r);
        r = new Rectangle(3 * scale + 1, 8 * scale + 1, scale, scale * 5 - 1);cat.add(r);
        r = new Rectangle(4 * scale + 1, 7 * scale + 1, scale, scale * 2 - 1);cat.add(r);
        r = new Rectangle(5 * scale + 1, 7 * scale + 1, scale * 2, scale - 1);cat.add(r);
        r = new Rectangle(6 * scale + 1, 6 * scale + 1, scale * 2, scale);cat.add(r);

        for (Rectangle temp : cat) {
            temp.setFill(Color.BLACK);
            Main.root.getChildren().add(temp);
            Main.allRectangles.add(temp);
        }

    }

    @Override
    public void DrawOutlineFigure() {
        ArrayList<Line> catOutline = new ArrayList<Line>();
        int scale = 32;
        Line line = new Line(10 * scale, 4 * scale, 11 * scale, 4 * scale);catOutline.add(line);
        line = new Line(11 * scale, 4 * scale, 11 * scale, 2 * scale);catOutline.add(line);
        line = new Line(11 * scale, 2 * scale, 12 * scale, 2 * scale);catOutline.add(line);
        line = new Line(12 * scale, 2 * scale, 12 * scale, 3 * scale);catOutline.add(line);
        line = new Line(12 * scale, 3 * scale, 15 * scale, 3 * scale);catOutline.add(line);
        line = new Line(15 * scale, 3 * scale, 15 * scale, 2 * scale);catOutline.add(line);
        line = new Line(15 * scale, 2 * scale, 16 * scale, 2 * scale);catOutline.add(line);
        line = new Line(16 * scale, 2 * scale, 16 * scale, 4 * scale);catOutline.add(line);
        line = new Line(16 * scale, 4 * scale, 17 * scale, 4 * scale);catOutline.add(line);
        line = new Line(17 * scale, 4 * scale, 17 * scale, 6 * scale);catOutline.add(line);
        line = new Line(17 * scale, 6 * scale, 16 * scale, 6 * scale);catOutline.add(line);
        line = new Line(16 * scale, 6 * scale, 16 * scale, 8 * scale);catOutline.add(line);
        line = new Line(16 * scale, 8 * scale, 17 * scale, 8 * scale);catOutline.add(line);
        line = new Line(17 * scale, 8 * scale, 17 * scale, 11 * scale);catOutline.add(line);
        line = new Line(17 * scale, 11 * scale, 16 * scale, 11 * scale);catOutline.add(line);
        line = new Line(16 * scale, 11 * scale, 16 * scale, 15 * scale);catOutline.add(line);
        line = new Line(16 * scale, 15 * scale, 17 * scale, 15 * scale);catOutline.add(line);
        line = new Line(17 * scale, 15 * scale, 17 * scale, 16 * scale);catOutline.add(line);
        line = new Line(17 * scale, 16 * scale, 5 * scale, 16 * scale);catOutline.add(line);
        line = new Line(5 * scale, 16 * scale, 5 * scale, 15 * scale);catOutline.add(line);
        line = new Line(5 * scale, 15 * scale, 4 * scale, 15 * scale);catOutline.add(line);
        line = new Line(4 * scale, 15 * scale, 4 * scale, 13 * scale);catOutline.add(line);
        line = new Line(4 * scale, 13 * scale, 3 * scale, 13 * scale);catOutline.add(line);
        line = new Line(3 * scale, 13 * scale, 3 * scale, 8 * scale);catOutline.add(line);
        line = new Line(3 * scale, 8 * scale, 4 * scale, 8 * scale);catOutline.add(line);
        line = new Line(4 * scale, 8 * scale, 4 * scale, 7 * scale);catOutline.add(line);
        line = new Line(4 * scale, 7 * scale, 6 * scale, 7 * scale);catOutline.add(line);
        line = new Line(6 * scale, 7 * scale, 6 * scale, 6 * scale);catOutline.add(line);
        line = new Line(6 * scale, 6 * scale, 8 * scale, 6 * scale);catOutline.add(line);
        line = new Line(8 * scale, 6 * scale, 8 * scale, 7 * scale);catOutline.add(line);
        line = new Line(8 * scale, 7 * scale, 7 * scale, 7 * scale);catOutline.add(line);
        line = new Line(7 * scale, 7 * scale, 7 * scale, 8 * scale);catOutline.add(line);
        line = new Line(7 * scale, 8 * scale, 5 * scale, 8 * scale);catOutline.add(line);
        line = new Line(5 * scale, 8 * scale, 5 * scale, 9 * scale);catOutline.add(line);
        line = new Line(5 * scale, 9 * scale, 4 * scale, 9 * scale);catOutline.add(line);
        line = new Line(4 * scale, 9 * scale, 4 * scale, 12 * scale);catOutline.add(line);
        line = new Line(4 * scale, 12 * scale, 5 * scale, 12 * scale);catOutline.add(line);
        line = new Line(5 * scale, 12 * scale, 5 * scale, 14 * scale);catOutline.add(line);
        line = new Line(5 * scale, 14 * scale, 6 * scale, 14 * scale);catOutline.add(line);
        line = new Line(6 * scale, 14 * scale, 6 * scale, 15 * scale);catOutline.add(line);
        line = new Line(6 * scale, 15 * scale, 8 * scale, 15 * scale);catOutline.add(line);
        line = new Line(8 * scale, 15 * scale, 8 * scale, 14 * scale);catOutline.add(line);
        line = new Line(8 * scale, 14 * scale, 7 * scale, 14 * scale);catOutline.add(line);
        line = new Line(7 * scale, 14 * scale, 7 * scale, 10 * scale);catOutline.add(line);
        line = new Line(7 * scale, 10 * scale, 8 * scale, 10 * scale);catOutline.add(line);
        line = new Line(8 * scale, 10 * scale, 8 * scale, 9 * scale);catOutline.add(line);
        line = new Line(8 * scale, 9 * scale, 9 * scale, 9 * scale);catOutline.add(line);
        line = new Line(9 * scale, 9 * scale, 9 * scale, 8 * scale);catOutline.add(line);
        line = new Line(9 * scale, 8 * scale, 11 * scale, 8 * scale);catOutline.add(line);
        line = new Line(11 * scale, 8 * scale, 11 * scale, 6 * scale);catOutline.add(line);
        line = new Line(11 * scale, 6 * scale, 10 * scale, 6 * scale);catOutline.add(line);
        line = new Line(10 * scale, 6 * scale, 10 * scale, 4 * scale);catOutline.add(line);

        for (Line temp : catOutline) {
            temp.setStroke(Color.RED);
            temp.setStrokeWidth(4);
            Main.root.getChildren().add(temp);
            Main.allLines.add(temp);
        }

    }
}
