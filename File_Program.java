package loop_examples;

import java.io.IOException;

public class File_Program {
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	java.io.File file = new java.io.File("C:\\Users\\jbairu\\Desktop\\jyothi.txt");//creating a file on desktop
	if( file.exists())
	{
	System.out.println("File Exists!!!! ");
	System.exit(1);
	}
	java.io.PrintWriter output = new java.io.PrintWriter(file);

	output.print("Sanjit U Jha ");
	output.print("100 ");
	output.print("Schin A g ");
	output.print("90 ");

	output.close();
	}

}
