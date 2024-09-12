import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Gui extends JFrame {
    JFrame gui;
    JPanel selectedimages_gui;
    Gui() {

        /*
            SETTINGS OF A WINDOW

            - blocking a fullscreen
         */

        gui = new JFrame("Bufforizer InDev Version");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800,500);
        gui.setLocationRelativeTo(null);
        gui.setLayout(new BorderLayout());
        gui.setVisible(true);
        gui.setResizable(false);

        GraphicsDevice flsupported = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        if (flsupported.isFullScreenSupported()) {
            flsupported.setFullScreenWindow(null);
        }

        /*
            COMPONENTS
         */

            // Text inputs

        JLabel title_gui = new JLabel("Bufforizer");
        JLabel desc_gui = new JLabel("Automatycznie zmienia rozmiar, dodaje znak wodny, zmienia nazwe pliku, i dodaje na WP oraz na jego DB");
        JLabel warning_gui = new JLabel("WARNING: Oprogramowanie jest jeszcze w niedziałającym stanie. Nie zalecane jest używanie.");
        JLabel author_gui = new JLabel("Autor: Paweł Wasilewski");

            // User interactive components

        JButton fileinsert_gui = new JButton("Dodaj pliki");
        JButton startformatting_gui = new JButton("Zacznij Formatować");

        /*
            EVENT FUNCTIONALITY
         */

            // File inserter

        fileinsert_gui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileinserter = new JFileChooser();

                // Adding multi-filing option

                fileinserter.setMultiSelectionEnabled(true);

                int result = fileinserter.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File[] selectedfiles = fileinserter.getSelectedFiles();
                    selectedimages_gui.removeAll();

                    try (FileWriter writer = new FileWriter("")){

                    }
                    for (File file: selectedfiles) {
                    }
                }
            }
        });
    }




}
