import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Kt1{
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("test.txt")); // Txt faili lugemine
        
        int aCount = 0;
        float avarageInWords = 0.0f;
        int wordsCount = 0;
        int temp = 0;
        int charactersCount = 0;
        int aMaxCountInText = 0;
        float aToAll = 0.0f;

        try{

            String line;
            while((line = reader.readLine()) != null){
                String [] lineContent = line.split(" ");
                wordsCount += lineContent.length;
                

                // Sõnad txt failis eraldi
                for (int i = 0; i < lineContent.length; i++){
                    // kontrollitakse, kui palju on tekstifailis a-tähti (nii suuri kui väikeseid)
                    for (Character ch: lineContent[i].toCharArray()) {
                        if (ch.equals('a') || ch.equals('A')) {
                            temp++;
                            aCount++;
                        }
                
                    }
                    if(temp > aMaxCountInText){
                        aMaxCountInText = temp;
                    }
                    temp = 0;
                }
                

                // kontrollitakse, kui palju on tekstifailis tähti
                for(int i = 0; i < line.length(); i++){
                    if(Character.isLetter(line.charAt(i))){
                        charactersCount++;
                    }
                }
            }
        } finally {
            reader.close();
        }

        // Loendi loomine, kus indeksiks on A-tähtede arv sõnades
        int[] arr = new int[aMaxCountInText + 1];
        for(int i = 0; i < aMaxCountInText; i++){
            arr[i] = 0;
        }

        // Uus reader array'i loomiseks (3. osa)

        BufferedReader reader1 = new BufferedReader(new FileReader("test.txt"));
        try{
            String line;

            while((line = reader1.readLine()) != null){
                String [] lineContent = line.split(" ");
                for (int i = 0; i < lineContent.length; i++){
                    for (Character ch: lineContent[i].toCharArray()) {
                        if (ch.equals('a') || ch.equals('A')) {
                            temp++;
                        }
                    }
                    arr[temp] += 1;
                    temp = 0;
                }

            }
        } finally {
            reader.close();
        }




        aToAll += ((float)aCount / (float)charactersCount * 100);
        avarageInWords += (float)aCount / (float)wordsCount;


        // Esimene osa (kui palju on tekstifailis a-tähti).
        System.out.println("A count: " + aCount);
        
        // Teine osa
        System.out.println("'A' percentage in text: " + aToAll + "%"); // suhtarvuna tähtede üldarvu protsentides
        // System.out.println("Words count: " + wordsCount);
        System.out.println("A average: " + avarageInWords); // kui palju oli a-tähti sõnades keskmiselt
        // System.out.println("Max a: " + aMaxCountInText);
        
        // Kolmas osa

        // A-tähtede arv
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n---------------");

        // Tähtede arv sõnas
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}