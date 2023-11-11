import java.io.*;

public class ExcepTest {
    public static void main(String args[]) {
        FileInputStream file = null;  // Mendeklarasikan objek FileInputStream
        byte x;
        // Menambahkan blok try-catch untuk menangani IOException
        try {
            String fileName = "example.txt"; // Gantilah dengan nama file yang sesuai
            file = new FileInputStream(fileName);
            x = (byte) file.read();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            return; // Menghentikan program jika file tidak ditemukan
        } catch (IOException i) {
            i.printStackTrace();
            return; // Menghentikan program jika terjadi IOException
        } finally {
            // Menutup file dalam blok finally agar selalu dieksekusi
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // Melanjutkan eksekusi program setelah blok try-catch
        System.out.println("File read successfully!");
    }
}