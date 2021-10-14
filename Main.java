package fuckbrain;

import fuckbrain.core.Parse;
import fuckbrain.error.BracketError;
import fuckbrain.error.FileTypeError;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static String code;

	public static void readFileByLines(String fileName) {
		File file = new File(fileName);
		String name = file.getName();
		if (!name.substring(name.length() - 2).equals("bf"))
			throw new FileTypeError();
		StringBuilder sb = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String tempString;
			while ((tempString = reader.readLine()) != null) sb.append(tempString).append("\n");
			code = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main() throws BracketError {
		System.out.println("Input file name:");
		Scanner sc = new Scanner(System.in);
		readFileByLines(sc.nextLine());
		System.out.println("Program Start\n");
		long time = System.currentTimeMillis();
		Parse p = new Parse(code.toCharArray());
		p.interpret();
		System.out.println("\n");
		System.out.println("Run time: " + (System.currentTimeMillis()-time) / (double) 1000+"s");
        sc.close();
	}
}
