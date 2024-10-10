import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class CharacterWordLine {
    public static void main(String [] args) {

      
        int lineCount=0;
        int wordCount=0;
        int characterCount=0;

        try {
            FileReader file = new FileReader("C:\\Luminar\\testfile.txt");
            BufferedReader reader = new BufferedReader(file);
            String currentLine=reader.readLine();
            while(currentLine != null) {
                lineCount++;
                String [] words = currentLine.split(" ");
                wordCount = wordCount + words.length;

                for(String s : words) {
                    characterCount= characterCount+s.length();
                }

                currentLine=reader.readLine();
            }
            System.out.println("total lines = "+lineCount);
            System.out.println("total words = "+wordCount);
            System.out.println("total characters = "+characterCount);
            reader.close();

        }
        
        catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}