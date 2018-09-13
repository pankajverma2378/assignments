import java.io.*;
public class read
{
    public static void main(String[] args)
    {
        File f=new File("F:/Assignmensts/java/Dynamic data storage1/abc.txt");
		
		try{
			FileInputStream fin=new FileInputStream(f);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				System.out.print((char)i);
				i=fin.read();
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("\nFile path = "+f.getPath());
		
       
    }
}