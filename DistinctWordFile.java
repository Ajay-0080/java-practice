import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

public class DistinctWordFile {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = null;
        List<String> words = new ArrayList<String>();

        try {
            FileReader file = new FileReader("C:\\Luminar\\testfile.txt");
            reader = new BufferedReader(file);
            String currentLine;
            currentLine=reader.readLine();
            while(currentLine != null) {
                StringTokenizer st = new StringTokenizer (currentLine," ,'-;:.");

                while(st.hasMoreTokens()) {
                    String temp=st.nextToken().toLowerCase();
                    if(!words.contains(temp) ) {
                        words.add(temp);
                    }

                }

                currentLine=reader.readLine();

               
            }
            System.out.println("total numbers of words are : "+words.size());
            Collections.sort(words);
            System.out.println("the words are");
            System.out.println("-------------------------------------------");
            for(String str : words) {
                System.out.println(str);
            }
        }
        catch (IOException ie) {
            ie.printStackTrace();
        }
        finally {
            reader.close();
        }
 

    }



    
}
