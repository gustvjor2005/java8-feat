package lambdasFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files {
	
	String file;
	
	public static void main(String[] args) throws IOException {
		
		for(String arg:args) {
			
			System.out.printf("first argument %1$s \n" , arg);
			
		}
		
		String fileLine = processFile();
		
		System.out.println("file line " + fileLine);
		
		String fileContextMessage = processFile((BufferedReader br) -> 
								br.readLine() + br.readLine());
		
		System.out.println("fileContextMessage "+fileContextMessage);
		
	}

	public static String processFile() throws IOException{
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			return br.readLine();
		}
	}
	
	public static String processFile(BufferedReaderProcessor processor) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			return "file content is "+ processor.process(br);
		}
	}
	
	
}
