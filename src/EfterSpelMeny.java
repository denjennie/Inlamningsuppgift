import java.util.Scanner;
public class EfterSpelMeny {
    public void efterSpelMeny() {
        Scanner scanner = new Scanner(System.in);
        int spelMeny = 0;
            System.out.println("""
                    Spel meny:
                    1. Återgå till menyn\s
                    2. Spela igen
                    3. Avsluta spelet
                    """);
            spelMeny = scanner.nextInt();

            switch (spelMeny) {                              // Menyn som visas efter man spelat ett spel
                case 1:
                  Main.mainMeny();                       //Här återgår man till första menyn
                  break;
                case 2:
                    StenSaxPase.StenSaxEllerPase();         // Här kallar vi på StenSaxPåse klassen, som gör att man kan spela igen
                break;
                case 3:
                    System.out.println("Du har valt att avsluta, tack för att du spelat!"); // Avslutas.
                    break;
                default:
                    break;
            }
        }
    }
