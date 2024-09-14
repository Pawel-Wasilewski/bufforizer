import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import static java.lang.String.valueOf;

public class FileInserter_Func {

    private JPanel selectedimages_gui;
    private ArrayList<String> files_local;

    // Refering to Gui.java elements

    public FileInserter_Func(JPanel selectedimages_gui, ArrayList<String> files_local) {
        this.selectedimages_gui = selectedimages_gui;
        this.files_local = files_local;
    }

    public void insertfiles(){

        JFileChooser fileinserter = new JFileChooser();

        // Adding multi-filing option

        fileinserter.setMultiSelectionEnabled(true);

        int result = fileinserter.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {

            // Getting Access to files AKA. Copy PATH

            File[] selectedfiles = fileinserter.getSelectedFiles();
            selectedimages_gui.removeAll();

            for (File file: selectedfiles) {

                String filename = file.getName();

                try (FileWriter writer = new FileWriter(filename)){

                    files_local.add(file.getAbsolutePath());
                    selectedimages_gui.add(new JLabel(valueOf(file)));

                } catch (IOException ex) {

                    throw new RuntimeException(ex);

                }
            }
        }
    }
}
