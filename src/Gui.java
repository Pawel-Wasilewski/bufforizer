import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui extends JFrame {

    private JPanel selectedimages_gui;
    private ArrayList<String> files_local = new ArrayList<>();

    Gui() {

        /*
            SETTINGS OF A WINDOW

            - blocking a fullscreen
         */

        JFrame gui = new JFrame("Bufforizer InDev Version");

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
            STYLE CHANGES TO COMPONENTS
        */

        fileinsert_gui.setSize(800,200);

        /*
            ADDING COMPONENTS TO WINDOW
        */

        gui.add(fileinsert_gui, BorderLayout.SOUTH);


        /*
            EVENT FUNCTIONALITY
         */

        FileInserter_Func insertfiles = new FileInserter_Func(selectedimages_gui, files_local);

            // File inserter

        fileinsert_gui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action takes place in FileInserter_Func.java
                insertfiles.insertfiles();
                // gui.add(selectedimages_gui, BorderLayout.NORTH);
            }
        });

            // Start Button

        StartAction_Func startformatting = new StartAction_Func(files_local);

        startformatting_gui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action takies place
                startformatting.startformatting();
            }
        });
    }

    public void setSelectedimages_gui(JPanel selectedimages_gui) {
        this.selectedimages_gui = selectedimages_gui;
    }
}