import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Jaga {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("D:\\dev\\src\\com\\company\\jagasis.txt")); // Txt faili lugemine
        String line;
        ArrayList<Integer> applesArray = new ArrayList<Integer>();
        Integer sum = 0;
        Integer rightMiddle = 0;
        Integer leftMiddle = 0;
        Integer leftAnswer = 0;
        float middle;
        String finalAnswer;

        line = reader.readLine();

        // Luuakse massiiv, mis sisaldab kõiki txt-faili numbreid
        while (line != null) {
            applesArray.add(Integer.valueOf(line));
            line = reader.readLine();
        }

        reader.close();

        Integer size = applesArray.get(0);

        // Kõigi õunte koguse leidmine
        for (int i=1; i <= size; i++){
            sum += applesArray.get(i);
        }

        middle = (float)sum / 2; // Leitakse pool õunte arvust (tõene keskmine).

        // Vasakult alustades ideaalse keskmise leidmine. Liidetakse õunad kokku kuni see arv on keskmisest suurem või sellega võrdne.
        // Tsükli läbimisel suureneb korvi number, mille järel on vaja piiri tõmmata, ühe võrra
        while(leftAnswer < size & leftMiddle <= middle){
            leftAnswer++;      // Korvi number, mille järel tuleb piir tõmmata
            leftMiddle += applesArray.get(leftAnswer);
        }

        Integer rightAnswer = size;

        // Paremalt alustades ideaalse keskmise leidmine.
        while(rightAnswer > 0 & rightMiddle <= middle){
            rightMiddle += applesArray.get(rightAnswer);
            rightAnswer--;
        }

        // Lõpliku vastuse leidmine
        if(leftAnswer == rightAnswer){
            finalAnswer = Integer.toString(rightAnswer);
        } else{
            // Kontrollitakse, kas vasak või parem “ideaalne keskmine” on lähemale tegelikule keskmisele
            if(leftMiddle > rightMiddle){
                finalAnswer = Integer.toString(rightAnswer);
            } else if(leftMiddle < rightMiddle){
                finalAnswer = Integer.toString(leftAnswer);
            } else{
                // Kui võimalikke vastuseid on mitu
                finalAnswer = rightAnswer + " or " + leftAnswer;
            }
        }

        // Vastust sisaldava txt-faili loomine
        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        writer.write(finalAnswer);
        writer.close();
    }
}