import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input{
    static void input(){
        //InputStreamReader is a bridge from byte streams to character streams.
        //It reads bytes and decodes them into characters using a specified charset.
        //INPUTSTREAMREADER EXAMPLE

        try (InputStreamReader isr=new InputStreamReader(System.in)) {
            System.out.print("Enter a character: ");
            int character = isr.read();
            while (isr.ready()) {
                System.out.println((char) character);
                character = isr.read();
            }
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

//        FileReader is a subclass of InputStreamReader that reads characters from a file.
//        It is used to read character files in Java.
//        FileReader example

        try (FileReader fr = new FileReader("C:\\Users\\jaiga\\Downloads\\Java Basics\\FIle Handling\\src\\note.txt")) {
            int letters = fr.read();
            while(fr.ready()) {
                System.out.println((char)letters);
                letters = fr.read();
            }
            // fr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //BufferedReader is used to read text from a character-input stream,
        // buffering characters for efficient reading.

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jaiga\\Downloads\\Java Basics\\FIle Handling\\src\\note.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

public class InputTypes {
    public static void main(String[] args) {
        //1 InputStreamReader
        //2 FileReader
        //3 BufferedReader
        Input.input(); // Uncomment to run FileReader example
    }

}
