import java.applet.Applet;
import java.awt.*;

/*
<applet code="AppletDemo" width=200 height=60>
</applet>
*/

public class AppletDemo extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        Font font = new Font("SansSerif", Font.BOLD, 15);
        g.setFont(font);
        g.drawString("Hello World", 50 , 35);
    }

}
