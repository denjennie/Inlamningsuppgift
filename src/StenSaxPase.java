import java.util.Scanner;
public class StenSaxPase {
    public static void StenSaxEllerPase() {
        Drag drag = new Drag();
        String computerchoice = drag.motstandarensDrag();
        String spelarensVal = "";
        System.out.println("Du har valt att köra en ny match!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Vad väljer du?\s
                1. Sten
                2. Sax
                3. Påse""");
        int spelarensDrag = scanner.nextInt();              // Här väljer spelaren sitt drag
        switch (spelarensDrag) {
            case 1:
                spelarensVal = "Sten";
                System.out.println("Du har valt Sten \n" + "och motståndaren valde: " + computerchoice);
                resultatet(spelarensVal, computerchoice);
                break;
            case 2:
                spelarensVal = "Sax";
                System.out.println("Du har valt Sax \n" + "och motståndaren valde: " + computerchoice);
                resultatet(spelarensVal, computerchoice);
                break;
            case 3:
                spelarensVal = "Påse";
                System.out.println("Du har valt Påse \n" + "och motståndaren valde: " + computerchoice);
                resultatet(spelarensVal,computerchoice);
                break;
            default:
                break;
        }
    }
    public static void resultatet(String spelarensVal, String computerchoice) {
        String resultat = "";
        EfterSpelMeny efterSpelMeny = new EfterSpelMeny();
        if (spelarensVal.equals(computerchoice)) {
            resultat = "Oavgjort";
            System.out.println(resultat);
            Historik.spelarensResultat.add("Oavgjort");     //Lägger till resultatet i historik klassen.
            efterSpelMeny.efterSpelMeny();                  // tillkallar spelmenyn så den syns efter varje gång spelaren har spelat ett spel.


        } else if ((spelarensVal.equals("Sten") && computerchoice.equals("Sax") || spelarensVal.equals("Sax") && computerchoice.equals("Påse") || spelarensVal.equals("Påse") && computerchoice.equals("Sten"))) {
            resultat = "Du vinner!";
            System.out.println(resultat);
            Historik.spelarensResultat.add("Vinst");
            efterSpelMeny.efterSpelMeny();                  // tillkallar spelmenyn så den syns efter varje gång spelaren har spelat ett spel.


        } else {
            resultat = "Motståndaren vinner!";
            System.out.println(resultat);
            Historik.spelarensResultat.add("Förlust");
            efterSpelMeny.efterSpelMeny();// tillkallar spelmenyn så den syns efter varje gång spelaren har spelat ett spel.

        }

    }
}



