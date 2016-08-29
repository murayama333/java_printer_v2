package example.lib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Printer {

	protected List<String> lines;

	private boolean showLineNo;

	public Printer(List<String> lines) {
		this.lines = lines;
	}

	public void print() {
		if (lines == null) {
			throw new IllegalStateException("lines is null.");
		}

		for (int i = 0; i < lines.size(); i++) {
			if (showLineNo) {
				System.out.print((i + 1) + ":");
			}
			System.out.println(lines.get(i));
		}
	}

	public void print(int count) {
		for (int i = 0; i < count; i++) {
			print();
		}
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}

	public void setLinesFromFile(String filePath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			List<String> lines = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				lines.add(line);
				line = br.readLine();
			}
			setLines(lines);
		}
	}

	public void setShowLineNo(boolean showLineNo) {
		this.showLineNo = showLineNo;
	}

	public void writeToFile(String filePath) throws IOException {
		if (lines == null) {
			throw new IllegalStateException("lines is null.");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			for (int i = 0; i < this.lines.size(); i++) {
				if (showLineNo) {
					bw.write((i + 1) + ":");
				}
				bw.write(lines.get(i));
				bw.newLine();
			}
		}
	}

}
