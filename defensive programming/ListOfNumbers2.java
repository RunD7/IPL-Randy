import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);
        for (int i = 0; i < size; i++)
            victor.addElement(i);

        try {
            this.readList("infile.txt");
            this.writeList();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
    public void readList(String fileName) throws IOException {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i);
            }
        }
    }
    public void writeList() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("outfile.txt"))) {
            for (Integer number : victor) {
                writer.write(number.toString());
                writer.newLine();
            }
        }
    }
    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}