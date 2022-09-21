import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Test
{
public static void main(String[] args) throws Exception{

    URL imageLocation = new URL( "https://png.pngitem.com/pimgs/s/793-7936726_java-duke-hd-png-download.png");
    JOptionPane.showMessageDialog(null, "Hello there...", "Duke", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

    }

}