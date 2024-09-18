import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import static java.lang.String.valueOf;

public class FileInserter_Func {

    private JPanel selectedimages_gui;
    private ArrayList<String> files_local;

    // Refering to Gui_Win.java elements

    public FileInserter_Func(JPanel selectedimages_gui, ArrayList<String> files_local) {
        this.selectedimages_gui = selectedimages_gui;
        this.files_local = files_local;
    }

    public void insertfiles(){

        JFileChooser fileinserter = new JFileChooser();

        // Adding multi-filing option

        fileinserter.setMultiSelectionEnabled(true);

        int result = fileinserter.showOpenDialog(null);

        if (selectedimages_gui != null) {

        }

        if (result == JFileChooser.APPROVE_OPTION) {

            // Getting Access to files AKA. Copy PATH

            File[] selectedfiles = fileinserter.getSelectedFiles();

            for (File file: selectedfiles) {

                files_local.add(file.getAbsolutePath());
                // selectedimages_gui.add(new JLabel(valueOf(file)));


            }
        }
    }
}
