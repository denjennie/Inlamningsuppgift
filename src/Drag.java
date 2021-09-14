import java.util.Random;
public class Drag {
    String move = "";
    public String motstandarensDrag(){          //Motståndarens drag som slumpmässigt visas från 0-3
        Random random = new Random();
        int val =  random.nextInt(3);
        if (val ==0){
        move = "Sten";
        }
        else if(val ==1){
            move = "Sax";
            }
        else if(val ==2){
            move = "Påse";
            }
        return move;
        }
}


