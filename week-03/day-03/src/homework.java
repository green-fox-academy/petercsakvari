import java.awt.*;
import java.util.*;

public class homework {
  public static void main(String[] args) {

    //TreeType
    Map<String, String> treeTypes = new HashMap<>();
    treeTypes.put("tree01", "willow");
    treeTypes.put("tree02", "maple");
    treeTypes.put("tree03", "yew");
    treeTypes.put("tree04", "fraxinus nigra");
    treeTypes.put("tree05", "oak");

    //TreeLeafColor
    Map<String, Color> treeLeafColor = new HashMap<>();
    treeLeafColor.put("tree01", Color.red);
    treeLeafColor.put("tree02", Color.blue);
    treeLeafColor.put("tree03", Color.yellow);
    treeLeafColor.put("tree04", Color.magenta);
    treeLeafColor.put("tree05", Color.green);

    //TreeAge
    Map<String, Integer> treeAge = new HashMap<>();
    treeAge.put("tree01", 20);
    treeAge.put("tree02", 40);
    treeAge.put("tree03", 60);
    treeAge.put("tree04", 80);
    treeAge.put("tree05", 100);

    //TreeSex
    Map<String, String> treeSex = new HashMap<>();
    treeSex.put("tree01", "male");
    treeSex.put("tree02", "female");
    treeSex.put("tree03", "male");
    treeSex.put("tree04", "female");
    treeSex.put("tree05", "male");
  }
}
