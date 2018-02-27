import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String fileName1 = "my-file1.txt";
    String fileName2 = "my-file2.txt";

    System.out.println("Copy successful: " + fileCopy(fileName1, fileName2));

  }

  private static boolean fileCopy(String fileName1, String fileName2) {
    try {
      Path path1 = Paths.get(fileName1);
      Path path2 = Paths.get(fileName2);
      if (!Files.exists(path1)) {
        Files.createFile(path1);
      }
      Files.copy(path1, path2);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}
