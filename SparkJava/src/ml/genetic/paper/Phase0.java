package ml.genetic.paper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.input.ReversedLinesFileReader;

public class Phase0 {
	
	public static String outputFilePath;
	
	

	public static void PhaseProcess(String inputFilePath) throws Exception{
		String strpath=inputFilePath;

		ReversedLinesFileReader fr = new ReversedLinesFileReader(new File(strpath));
		String ch;
		int time=0;
		String Conversion="";

	
		PrintWriter writer = new PrintWriter("resources2/reverseFile.csv", "UTF-8");

		do {
			ch = fr.readLine();
			System.out.println(ch);
			if(ch != null)
				writer.println(ch);

		} while (ch != null);
		writer.close();
		fr.close();
		
	}

	public static void main(String[] args) throws Exception  {
		String strpath="resources2/APPL19972007.csv";
		//String strpath="resources2/CAT20072017.csv";

		ReversedLinesFileReader fr = new ReversedLinesFileReader(new File(strpath));
		String ch;
		int time=0;
		String Conversion="";

		PrintWriter writer = new PrintWriter("resources2/reverseFile.csv", "UTF-8");

		do {
			ch = fr.readLine();
			System.out.println(ch);
			if(ch != null)
				writer.println(ch);

		} while (ch != null);
		writer.close();
		fr.close();
	}
}
