package Colectondemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RandomNumber {
	

	
	public static void swap()  {
		String s1="This ish a java language";
		String[] s2=s1.split("\\s+");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].length()%2==0) {
				System.out.println(s2[i]);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		swap() ;
		
	}
}
