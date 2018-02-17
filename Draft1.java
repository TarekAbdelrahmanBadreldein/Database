import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Draft1 {

	

public static String[][] Init(int x) {
		String [][] page= new String[x][200];
				int i =0;
				int j =0;
				while(i<x) {
					while(j<200) {
						page[i][j]= null;
					j++;
					}
					i++;
				}
				return page;
	}
	
public static void InitCSV(String f, String s) throws IOException {
	File propFile = new File(s, "properties.csv");
	if (!(propFile.exists())) {
		System.out.print("hi");
	FileWriter writer = new FileWriter(f+"\\"+s);
	  writer.flush();
      writer.close();
	}
	}

public static void writetofile (String n,String f) throws IOException {
	BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
	  writer.append("Name");
	     writer.append(',');
	     writer.append("Number");
	     writer.append('\n');

	     writer.append("interview questions");
	     writer.append(',');
	     writer.append("001");
	     writer.append('\n');
	writer.close();
}
	public static void main(String[]args) throws IOException{
		
		String f="C:\\Users\\USRBGDY\\Desktop";
		String s ="properties.csv";
		InitCSV(f,s);
		String n= f+"\\"+s;
		String d = "hi";
		writetofile(d,n);
		String[][] h=Init(3);
		System.out.print(h[1][1]);
		
	}
}
