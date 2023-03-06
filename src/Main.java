import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Song.txt")) {
            fileWriter.write("""
                    Title : Nothing else maters
                    Author : Metallica
                    Text: So close, no matter how far
                    Couldn't be much more from the heart
                    Forever trusting who we are 
                    And nothing else matters 
                    Never opened myself this way 
                    Life is ours, we live it our way 
                    All these words I dont't just say 
                    And nothing else matters.
                    """);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Song song = new Song();
        try (FileReader fileReader = new FileReader("Song.txt")) {
            Scanner scanner = new Scanner(fileReader);
            int s = 0;
            while (scanner.hasNext()) {
                s++;
                if (s <= 1) {
                    song.setTitle(scanner.nextLine());
                    System.out.println(song.getTitle());
                } if (s <= 2) {
                        song.setAuthor(scanner.nextLine());
                        System.out.println(song.getAuthor());
                    }
                    String kasha = " ";
                    kasha = scanner.nextLine();
                    song.setText(kasha);
                    System.out.println(song.getText());

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}