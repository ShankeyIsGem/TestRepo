package javaprogrames;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HowToWriteDataIntoExcel
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw =new FileWriter("C:\\Users\\abc\\Desktop\\write.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        fw.write("This is shankey");
        fw.close();
	}

}
