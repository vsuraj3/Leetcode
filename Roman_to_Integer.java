import java.util.HashMap;
import java.util.Scanner;

class romanInt{
public int romanToInt(String s) 
{
	int res=0;
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
	for(int i=0;i<s.length();i++)
	{
		if(map.get(s.charAt(i))>map.get(s.charAt(i-1)))
		{
			res+=map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
		}
		else 
		{
			res+=map.get(s.charAt(i));
		}
	}
	return res;
}
}
public class Roman_to_Integer {
	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		romanInt obj=new romanInt();
		obj.romanToInt(s);
	}

}
