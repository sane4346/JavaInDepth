package example.lambda;

import java.util.Arrays;
import java.util.Comparator;

interface CacheIterator {
    boolean hasNext();
    Bookmark next();
}

 interface Test {
	 void apply();	
}

public class Cache {		
	private Bookmark[] items;	
	private int next = 0;
	
	public Cache(int size) { 
    	items = new Bookmark[size]; 
    }
    
    public void add(Bookmark item) {
	    if(next < items.length)
            items[next++] = item;
    }
    
    public CacheIterator iterator() {
    	return new MyCacheIterator();    	
    }
    
    public Bookmark[] getItems() {
		return items;
	}

	public void setItems(Bookmark[] items) {
		this.items = items;
	}

	private class MyCacheIterator implements CacheIterator {
    	private int i = 0;
    	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < items.length;
		}

		@Override
		public Bookmark next() {
			// TODO Auto-generated method stub
			return items[i++];
		}
    	
    }
    
    
    public void go(Test test) {
		test.apply();
	}
}

