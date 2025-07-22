import java.io.*;

class Output{
    static void output(){
        OutputStream os= System.out;
        // OutputStream is an abstract class, so we cannot create an instance of it directly.
        // However, we can use it to write data to the console or a file.
        // OutputStreamWriter is a bridge from character streams to byte streams.
        // It uses a specified charset to encode characters into bytes.

        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr="hello world".toCharArray();
            osw.write(arr);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //FileWriter is a subclass of OutputStreamWriter that writes characters to a file.
        // It is used to write character files in Java.

        try (FileWriter fw = new FileWriter("C:\\Users\\jaiga\\Downloads\\Java Basics\\FIle Handling\\src\\note.txt", true)) {
            fw.write("this should be appended");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //BufferedWriter is used to write text to a character-output stream,
        // buffering characters for efficient writing.
        try (BufferedWriter bw = new java.io.BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("Buffered Writer Example");
            bw.newLine();
            bw.write("This is a new line.");
            bw.flush(); // Ensure all data is written
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\jaiga\\Downloads\\Java Basics\\FIle Handling\\src\\note.txt"))) {
            bw.write("Hare Krishna");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

public class OutputTypes {
    public static void main(String[] args) {
        Output.output();
    }
}
