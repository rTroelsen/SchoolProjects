package Lecture1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class P27 {

    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL(
            "http://2.bp.blogspot.com/-hgN-aE-5Vzo/Tbm6Rnkp5rI/AAAAAAAAAJ4/1mErThCz14o/s1600/mona-lisa.jpg");
        JOptionPane.showMessageDialog(null, "EZ GAYM", "EZ LYFE",
            JOptionPane.PLAIN_MESSAGE,
            new ImageIcon(imageLocation));
    }

}
