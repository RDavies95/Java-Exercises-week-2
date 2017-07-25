import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Methods {

	ArrayList<String> words = new ArrayList<String>();

	public void readFromFile() throws IOException {
		String cLine;
		InputStream fis = new FileInputStream("Anagram.txt");
		InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);

		while ((cLine = br.readLine()) != null) {

		words.add(cLine);	
	
		}
		br.close();
	}
	
	public void sortString()
	{
		for(int i = 0; i < words.size(); i++)
		{
			String s = words.get(i);
			
			
			
			
		}
	}
	
}
