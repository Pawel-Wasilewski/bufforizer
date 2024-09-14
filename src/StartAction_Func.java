import java.util.ArrayList;

public class StartAction_Func {
    private ArrayList<String> files_local;

    public StartAction_Func(ArrayList<String> files_local) {
        this.files_local = files_local;
    }

    public void startformatting() {
        if (files_local == null || files_local.size() < 1) {
            System.out.println("ERR 404: Nie znaleziono plików lub nie zostały wrzucone");
        }
    }

}
