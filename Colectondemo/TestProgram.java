package Colectondemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.StringTokenizer;

public class TestProgram {

	public static void main(String[] args) throws IOException {
		Date d = new Date();
		String date = d.toString();
		//System.out.println(date);

		File f1 = new File("C:\\Users\\Akshay Katoch\\Desktop\\test.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Akshay is a best prgrammer");
		bw.close();
		System.out.println("File1 succssflly creted");

		File f = new File("C:\\Users\\Akshay Katoch\\Desktop\\test.txt");
		FileReader fis = new FileReader(f);
		BufferedReader br = new BufferedReader(fis);
		String line = null;

		// int count=ll;

		String line1 = null;

		while ((line = br.readLine()) != null) {

			System.out.println(line);
			line1 = line;

		}

		File f2 = new File("C:\\Users\\Akshay Katoch\\Desktop\\testone.txt");
		FileWriter fw2 = new FileWriter(f2);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		bw2.write(line1.replaceAll("prgrammer", date));
		bw2.close();
		System.out.println("File2 succssflly creted");
		br.close();

		File f3 = new File("C:\\Users\\Akshay Katoch\\Desktop\\testone.txt");
		FileReader fis3 = new FileReader(f3);
		BufferedReader br3 = new BufferedReader(fis3);
		String line3 = null;

		// int count=0;

		while ((line3 = br3.readLine()) != null) {

			System.out.println(line3);

		}

		br.close();
		br3.close();
	}

}
