# 課題 プリンタークラスの実装

### 課題7 Adapterパターン

Main.javaを修正しました。

```java
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
		List<String> members = Arrays.asList("John", "Michael", "James", "Daniel");
		Printer printer = new Printer(members);
		printer.print();

		// Exercise2
		printer.print(2);

		// Exercise3
		printer.setShowLineNo(true);
		printer.print();

		// Exercise4
		List<String> athletes = Arrays.asList("Takahashi", "Nakamura", "Sakamoto");
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
```


LegacyWriterインタフェースは以下の通りです。

```java
package example.lib;

import java.io.IOException;

public interface LegacyWriter {

	public void print();

	public void print(int count);

	public void setData(String[] data);

	public void setDataFromFile(String filePath) throws IOException;

	public void setShowLineNo(boolean showLineNo);

	public void writeToFile(String filePath) throws IOException;

}
```

次の実行結果になるようにLegacyWriterAdapterクラスを作成してください。

> Printerクラスの修正は不要です。LegacyWriterインタフェースでPrinterクラスを再利用するために、LegacyWriterAdapterクラスを作成します。

```
John
Michael
James
Daniel
John
Michael
James
Daniel
John
Michael
James
Daniel
1:John
2:Michael
3:James
4:Daniel
1:Takahashi
2:Nakamura
3:Sakamoto
java.lang.IllegalStateException: lines is null.
	at example.lib.Printer.print(Printer.java:23)
	at example.Main.main(Main.java:33)
1:Tokugawa
2:Toyotomi
3:Sanada
one
two
three
```

> またoutput.txtファイルに以下の内容が出力されていること

```
1:Tokugawa
2:Toyotomi
3:Sanada
```
