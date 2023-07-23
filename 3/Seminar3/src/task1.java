import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task1 {
    public static void main(String[] args) {

    }
    public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = Files.newBufferedReader (pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite);) {

            while (in.ready()) out.write(in.readLine());


        }
    }
}