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
