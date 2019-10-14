package design.pattern.strategy;

import javax.swing.*;

public class StreameCrabs  extends JLabel  implements CrabCooking {
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("file/strategy/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
