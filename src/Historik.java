import java.util.ArrayList;
public class Historik {
    public static ArrayList<String> spelarensResultat = new ArrayList<>();
    public void spelHistorik(){
        System.out.println("Du har valt att se tidigare matcher: ");
                                                                // printar ut spelarens resultat och lägger till i listan.
        for (int i = 0; i < spelarensResultat.size(); i++) {
            System.out.println(spelarensResultat.get(i));
        }
    }
}
