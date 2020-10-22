package javagraphics;
import javax.swing.JFrame;
/**
 *
 * @author Rayhan Anandhias
 */
public class JavaGraphics {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Batman Wallpaper 1920x1080");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
    }
    
}
