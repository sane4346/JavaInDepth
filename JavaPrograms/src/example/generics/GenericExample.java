package example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericExample {
	
	
	public void showGenericExample() {
		
		GenericContainer<String> stringStore = new GuruStore<>();
		stringStore.set("Hello Java");
		//stringStore.set(1);
		System.out.println("Generic Example String :" + stringStore.get());
		
		GenericContainer<Integer> integerStore = new GuruStore<>();
		integerStore.set(1);
		System.out.println("Generic Example integer :" + integerStore.get());
		
		GenericContainer<List<Integer>> integerListStore = new GuruStore<>();
		integerListStore.set(Arrays.asList(1,2,5));
		System.out.println("Generic Example Array List :" + integerListStore.get());
		
		//GenericContainer<int> intStore = new GuruStore<>();  type parameters can not be primitives
		
		List<Number> list = new ArrayList<Number>();
		boolean  add = list.add(new Integer(1));
		list.add(new Double(10.5));
		System.out.println("List number Example: " + list);
		
		List[] array = new ArrayList[2];
		array[0] = new ArrayList();
		//array[1] = new LinkedList(); // Type safety is required since it will give runtine exception.
		System.out.println("List number Example: " + list);

		
	}

}


interface GenericContainer<T> {
	
	void set(T a);
	T get();
	
}

class GuruStore<T> implements GenericContainer<T> {
	
	private T val;
	//private static T val2;  //We can not use static as generic member variable type.
	public void set(T a) {
		this.val = a;
	}
	public T get() {
		return val;
	}
}
