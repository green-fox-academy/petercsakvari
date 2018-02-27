import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    String file = "my-file.txt";
    Path filePath = Paths.get(file);
    String word = "banana";
    int number = 5;

    wFile(filePath, word, number, file);

  }

  private static void wFile (Path filePath, String word, int number, String file) {
    try {
      if (!Files.exists(filePath)) {
        Files.createFile(filePath);
      }
      List<String> content = new ArrayList();
      for (int i = 0; i < number; i++) {
        content.add(word);
      }
      Files.write(filePath, content);
    } catch (Exception e) {
      System.err.println("Unable to write file: " + file);
    }
  }

}
