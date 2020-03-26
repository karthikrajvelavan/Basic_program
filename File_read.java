import java.io.*;
class File_read
{
	public static void main(String args[])
	{
	String line=null;
	try{
	FileReader fr=new FileReader("D:/txt.txt");
	BufferedReader br=new BufferedReader(fr);
	while((line=br.readLine())!=null)
	{
	System.out.println(line);
	}
	br.close();
	FileWriter fw=new FileWriter("D:/txt.txt",true);
	BufferedWriter brr=new BufferedWriter(fw);
	brr.newLine();
	brr.write("am new line");
	brr.close();
	}
	catch(Exception e){
	System.out.println(e);}
	}
}