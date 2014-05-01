import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String line;
			int countLine = 0;
			int countWords = 0;
			int countSymbols = 0;
			
			BufferedReader reader = new BufferedReader(new FileReader("Task text.txt"));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				if (!(line.trim().equals(""))) {
					countLine++;
					String[] words = line.split("[ ,/_//-]+");
					String[] symb = line.split("[ ]+");
					for (String string : symb) {
						countSymbols += string.length() + 1;
					}
					countSymbols -=1;
				    if (line.contains("$")) {
				         countWords += words.length - 1;
				    }  else {
				    	countWords+=words.length;  
				    }
				}
				 
			}
			
			System.out.println("Lines: "+countLine);
			System.out.println("Words: "+countWords);
			System.out.println("Symbols: "+countSymbols);
	}

}
