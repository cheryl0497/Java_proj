package Interval;

import java.util.*;

class ListTest1{

	public static void main(String[] args){
		List<Interval> store = new ArrayList<>();
		store.add(new Interval(5, 21));
		store.add(new Interval(3, 42));
		store.add(new Interval(4, 13));
		store.add(new Interval(7, 34));
		store.add(new Interval(6, 55));
		store.add(new Interval(3, 73));
		for(var i : store)
			System.out.println(i);
		System.out.printf("Third Interval: %s%n", store.get(2));
	}
}


