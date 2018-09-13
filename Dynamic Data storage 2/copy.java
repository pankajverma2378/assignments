import java.io.*;
public class copy
{
    public static void main(String[] args)
    {
        File f=new File("C:/Users/hp/Desktop/assignments/Dynamic Data storage 2/input.txt");
		File f1=new File("C:/Users/hp/Desktop/assignments/Dynamic Data storage 2/output.txt");
	
		try
		{
			FileInputStream fin=new FileInputStream(f);
			FileOutputStream fout=new FileOutputStream(f1);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				fout.write((char)i);
				i=fin.read();
				
			}
			fin.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		try{
			FileInputStream fin=new FileInputStream(f1);
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
		
		
		
       
    }
}