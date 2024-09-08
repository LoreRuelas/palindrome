import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class palindrome {

	public static List<Character> createPalindromeListString(int n, boolean useArrayList) {
		   List<Character> pal;

		   if (useArrayList) {
		       pal = new ArrayList<>();
		   } else {
		       pal = new LinkedList<>();
		   }

		   for (int i = 0; i < n / 2; i++) {
		       char c = (char) ('a' + i);
		       pal.add(c);
		   }

		   if (n % 2 != 0) {
		       char half = (char) ('a' + n / 2);
		       pal.add(half);
		   }

		   for (int i = n / 2 - 1; i >= 0; i--) {
		       char c = (char) ('a' + i);
		       pal.add(c);
		   }

		   System.out.println(pal);
		   return pal;
		}
	
	  public static boolean isPalindromeIterators(List<Character> ls) {
	        int i, j;
	        ListIterator<Character> lsInit = ls.listIterator();
	        ListIterator<Character> lsEnd = ls.listIterator(ls.size());

	        for(i = 0, j = ls.size() - 1; i < j; i++, j--)
	            if(lsInit.next() != lsEnd.previous())
	                return false;
	        return true;
	    }

	
	public static void main(String[] args) {
		List a = new ArrayList();
		List b = new LinkedList();
		//isPalindrome(a);
		a.add('a');
		a.add('n');
		a.add('p');
		
		System.out.println(isPalindromeIterators(a));
		
	}
}
