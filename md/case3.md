# 課題 プリンタークラスの実装

### 課題5 ファイルの読み込み

Main.javaを修正しました。

```java
package example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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

	}
}
```

users.txtファイルは以下のとおりです。users.txtファイルはEclipseのプロジェクト直下に配置します。

```
Tokugawa
Toyotomi
Sanada
```

次の実行結果になるようにPrinterクラスを修正してください。

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
	at example.Main.main(Main.java:31)
1:Tokugawa
2:Toyotomi
3:Sanada
```


### 課題6 ファイル書き出し

Main.javaを修正しました。

```java
package example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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

	}
}
```

次の実行結果になるようにPrinterクラスを修正してください。

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
```


> output.txtファイルに以下の内容が出力されていること

```
1:Tokugawa
2:Toyotomi
3:Sanada
```
