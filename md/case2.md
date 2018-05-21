# 課題 プリンタークラスの実装

### 課題4 印刷データの変更

Main.javaを修正しました。

```java
package example;

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
	at example.Main.main(Main.java:30)
```

> 例外メッセージの出力は前後する可能性があります。
