package example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import example.lib.LegacyWriter;
import example.lib.LegacyWriterAdapter;
import example.lib.Printer;

public class Main {
	public static void main(String[] args) {

		// Exercise1
		List<String> members = Arrays.asList("John", "Paul", "George", "Ringo");
		Printer printer = new Printer(members);
		printer.print();

		// Exercise2
		printer.print(2);

		// Exercise3
		printer.setShowLineNo(true);
		printer.print();

		// Exercise4
		List<String> athletes = Arrays.asList("Uchimura", "Hagino", "Nishikori");
		printer.setLines(athletes);
		printer.print();

		try {
			printer.setLines(null);
			printer.print();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

		// Exercise5
		try {
			printer.setLinesFromFile("users.txt");
			printer.print();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Exercise6
		try {
			printer.writeToFile("output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Exercise7
		String[] data = {"one", "two", "three"};
		LegacyWriter writer = new LegacyWriterAdapter();
		writer.setData(data);
		writer.print();
	}
}
