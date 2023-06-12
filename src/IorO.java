import java.io.*;

public class IorO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing into a file");
            writer.close();//file needs to be closed or else it will be empty.
        } catch (IOException e) {
            e.printStackTrace();
        }//to write into a file
        try {
            BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }//to read to a file


    }
}
