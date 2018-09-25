import java.util.*;
class ArrayListToArray{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("IND");
		al.add("USA");
		al.add("UK");
		al.add("CHK");
		al.add("SA");
		al.add("SL");
		System.out.println("Contents of list :" + al);
		Object sa[] = al.toArray();
		for(int i=0;i<sa.length;i++)
		{
			String s = (String)sa[i];
			System.out.println(s);
		}
	}
}