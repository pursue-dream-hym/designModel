package design.pattern.flyweight;

import java.awt.*;

public class BlackPieces implements ChessPieces {
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}
