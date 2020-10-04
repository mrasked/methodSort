import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String line;
        while ((line = reader.readLine())!=null) {
            arrayList.add(line);
            String[] array = arrayList.toArray(new String[arrayList.size()]);
            Arrays.sort(array);
            for (String s : array) {
                System.out.println(" (" + s + ") ");
            }
        }
    }
    }