import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiOpener implements ActionListener {
    JFrame gui_start = new JFrame();
    JButton start_formatting = new JButton("Formatuj");
    JLabel test_message = new JLabel("działam kurwa");
    GuiOpener() {

        start_formatting.setBounds(200,100,300,100);
        start_formatting.setFocusable(false);
        start_formatting.addActionListener(this);

        gui_start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui_start.setSize(720, 600);
        gui_start.setLayout(null);
        gui_start.setVisible(true);
        gui_start.add(start_formatting);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start_formatting) {
            gui_start.add(test_message);
            test_message.setBounds(0, 0, 300, 30);
            test_message.setFont(new Font("consolas", Font.ITALIC, 30));

        }
    }
}
