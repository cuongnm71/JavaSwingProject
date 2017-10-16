import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class BufferedReaderExample1 {
	private static final String FILENAME = "New Text Document.txt";
 
	public static void main(String[] args) {
		String s="";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			findClass f= new findClass();
			String currentLine;
 
			br = new BufferedReader(new FileReader(FILENAME));
 
			while ((currentLine = br.readLine()) != null) {
				currentLine=currentLine.replaceAll("\\s+"," ");
				currentLine= currentLine.trim();
				s=s.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
				s=s.replaceAll("\\s+"," ");
				f.nameClass(currentLine);
				f.nameMethod(currentLine);
				s +=currentLine + " ";
			}
		} catch (IOException e) {
			e.printStackTrace();
				
		} finally {
			try {
				if (br != null)
					br.close();
 
				if (fr != null)
					fr.close();
 
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		//System.out.println(s);

		System.out.println(s);
	}

}