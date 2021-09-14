import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till mitt spel Sten, sax eller påse!");
        System.out.println("Tryck enter för att börja spela. ");
        scanner.nextLine();
        mainMeny();
    }
        public static void mainMeny(){
            Scanner scanner = new Scanner(System.in);
            Historik historik = new Historik(); // Behövs för att kunna kalla på klassen inne i case 2.
            int menyVal = 0;
            System.out.println("""
                    Menyval:
                    1. Ny match\s
                    2. Historik
                    3. Avsluta spelet
                    """);
            menyVal = scanner.nextInt();
            switch (menyVal) {
                case 1:
                    StenSaxPase.StenSaxEllerPase();    // Kallar på StenSaxPåse klassen.
                    break;

                case 2:
                    historik.spelHistorik();            // Kallar på historik klassen.
                    mainMeny();                         // Kallar på main menyn så den visas efter man fått ut sin historik.
                    break;

                case 3:
                    System.out.println("Du har valt att avsluta, tack för att du spelat!");     //Avslutar spelet
                default:
                    break;
            }

            }

        }




