package example.lib;

import java.io.IOException;
import java.util.Arrays;

public class LegacyWriterAdapter  extends Printer implements LegacyWriter{

	public LegacyWriterAdapter() {
		super(null);
	}

	@Override
	public void setData(String[] data) {		
		setLines(Arrays.asList(data));
	}

	@Override
	public void setDataFromFile(String filePath) throws IOException {
		setLinesFromFile(filePath);
	}

}
