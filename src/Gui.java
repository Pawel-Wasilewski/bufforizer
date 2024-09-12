import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame gui;
    Gui() {

        /*
            SETTINGS OF A WINDOW

            - blocking a fullscreen
         */

        gui = new JFrame("Bufforizer InDev Version");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800,500);
        gui.setLocationRelativeTo(null);
        gui.setLayout(new FlowLayout());
        gui.setVisible(true);
        gui.setResizable(false);

        GraphicsDevice flsupported = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        if (flsupported.isFullScreenSupported()) {
            flsupported.setFullScreenWindow(null);
        }

        /*
            COMPONENTS
         */
    }



}
