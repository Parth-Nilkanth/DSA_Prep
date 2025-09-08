// Help the hero cf problem statement rateed easy - 800
import java.util.Scanner;
import java.util.HashSet;
public class Sol {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
	
	HashSet<Character> set = new HashSet<>();
	for(char c : str.toCharArray())
	{
		set.add(c);
	}
	if(set.size() % 2 == 0)
		System.out.println("CHAT WITH HER!");
	else
		System.out.println("IGNORE HIM!");
    
    sc.close();
    }
}
