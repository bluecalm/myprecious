package arraylist;

import java.util.ArrayList;
public class Alist{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
		list.add("Tool");
		list.add("u2");
		list.add("u2");
		list.add("u2");
		list.add(1,"phish");
		//list.add(0,"hhh");

		System.out.println(list);
		int sum =0;
		for(int i = 0; i<list.size();i++)	{
			String s = list.get(i);
			sum +=s.length();
		}
		System.out.println("total :"+sum);
		list.set(0,"replace");
		System.out.println(list);
		

	}
}
