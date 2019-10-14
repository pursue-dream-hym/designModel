package design.pattern.flyweight;

import java.awt.*;

public class WhitePieces  implements ChessPieces {
    @Override
    public void DownPieces(Graphics g, Point pt) {
       g.setColor(Color.white);
       g.fillOval(pt.x, pt.y,30,30);
    }
}
