import java.nio.file.*;
import java.io.IOException;
import java.util.*;


class FileHelper {
    static String[] getLines(String path) {
        try {
            return Files.readAllLines(Paths.get(path)).toArray(String[]::new);
        }
        catch(IOException e) {
            System.err.println("Error reading file " + path + ": " + e);
            return new String[]{"Error reading file " + path + ": " + e};
        }
    }
}

class FileGrep{
 public static void main(String[] args){
    String[] lines = FileHelper.getLines("HuntWords.txt");
    ArrayList<String> wordsmatch = new ArrayList<>();
    for (String st: lines){
        if (st.length()<9){
            wordsmatch.add(st);
        }
    }
    for (String sq: wordsmatch){
        System.out.println(sq);
    }
}
}
