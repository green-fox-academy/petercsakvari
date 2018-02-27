import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    String fileName = "duplicated-chars.txt";
    decrypt(fileName);
  }

  private static void decrypt(String fileName) {
    try {

      Path filePath = Paths.get(fileName);
      List<String> fileContent = Files.readAllLines(filePath);
      List<String> newFileContent = new ArrayList<>();
      //System.out.println(fileContent.toString());
      for (String line : fileContent) {
        String decodedLine = "";
        if (line.trim().isEmpty()) {
          newFileContent.add(decodedLine);
        } else {
          char[] individualChar = line.toCharArray();
          decodedLine += individualChar[0];
          for (int i = 1; i < individualChar.length; i++) {
            if (individualChar[i] != individualChar[i - 1]) {
              decodedLine += individualChar[i];
            }
          }
        }
        newFileContent.add(decodedLine);
        Files.write(filePath, newFileContent);
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

}
