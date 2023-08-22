package functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	
	public static void main(String[] args) {
		
		int count = 0;
		for(String arg:args) {
			
			System.out.printf(" arg %1$d is %2$s \n", count, arg);
			count +=1;
		}
		
		List<String> lstString = new ArrayList<>();
		lstString.add("aa");
		lstString.add("");
		lstString.add("bbb");
		
		List<String> lstStringFilter = new ArrayList<>();
		lstStringFilter = filterPredicate(lstString, (String s) -> !s.isEmpty());
			
		for (String s: lstStringFilter) {
			
			System.out.printf("lst String Filter %1$s \n", s);
		}
		
	}
	
	public static <T> List<T> filterPredicate(List<T> lst, 
			Predicate<T> predicate){
		
		List<T> newLst = new ArrayList<>();
		for (T t: lst) {
			
			if(predicate.test(t)) {
				
				newLst.add(t);
			}
			
		}
		
		return newLst;
	}
}
