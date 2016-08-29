# 課題 プリンタークラスの実装

## 課題1 プリンターの実装

次の2つのコードがあります。

+ example.Main （実装済み）
+ example.lib.Printer（未実装）

```java
package example;

import java.util.Arrays;
import java.util.List;

import example.lib.Printer;

public class Main {
	public static void main(String[] args) {

		// Exercise1
		List<String> members = Arrays.asList("John", "Paul", "George", "Ringo");
		Printer printer = new Printer(members);
		printer.print();

	}
}
```

> Mainクラスは完成しています。


```java
package example.lib;

public class Printer {
    // TODO
}
```

> Printerクラスはパッケージがexample.libなので注意してください。


次の実行結果になるようにPrinterクラスを実装してください。

```
John
Paul
George
Ringo
```

### 課題2 印刷枚数の指定

Main.javaを修正しました。

```java
package example;

import java.util.Arrays;
import java.util.List;

import example.lib.Printer;

public class Main {
	public static void main(String[] args) {

		// Exercise1
		List<String> members = Arrays.asList("John", "Paul", "George", "Ringo");
		Printer printer = new Printer(members);
		printer.print();

		// Exercise2
		printer.print(2);

	}
}
```

> printer.print(2);を追記しました。

次の実行結果になるようにPrinterクラスを修正してください。

```
John
Paul
George
Ringo
John
Paul
George
Ringo
John
Paul
George
Ringo
```


### 課題3 行番号の表示

Main.javaを修正しました。

```java
package example;

import java.util.Arrays;
import java.util.List;

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

	}
}
```

次の実行結果になるようにPrinterクラスを修正してください。

```
John
Paul
George
Ringo
John
Paul
George
Ringo
John
Paul
George
Ringo
1:John
2:Paul
3:George
4:Ringo
```
