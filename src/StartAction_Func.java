import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class StartAction_Func {
    private ArrayList<String> files_local;

    public StartAction_Func(ArrayList<String> files_local, int set_width, int set_height) {
        this.files_local = files_local;
    }

    public void startformatting() {
        if (files_local == null || files_local.size() < 1) {
            System.out.println("ERR 404: Nie znaleziono plików lub nie zostały wrzucone");
        }
        // Scanner
        for (String path : files_local) {
            if (!path.contains(".png") || !path.contains(".jpg")) {
                System.out.println("ERR 001: Plik nie posiada wspieranego rozszerzenia graficznego lub plik ma złe rozszerzenie");
                continue;
            } else {
                try {
                    // Accesing access to a image
                    File bufforized_image = new File(path);
                    BufferedImage access_to_bufforized_image = ImageIO.read(bufforized_image);


                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
