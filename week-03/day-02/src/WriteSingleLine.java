import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    try {
      List<String> content = new ArrayList();
      content.add("Peter Csakvari");
      Path filePath = Paths.get("my-file.txt");
      if (!Files.exists(filePath)) {
        Files.createFile(filePath);
      }
      Files.write(filePath, content);
    } catch (Exception e) {
      System.err.println("Unable to write file: my-file.txt");
    }

  }
}