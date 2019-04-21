package list;

import java.util.Arrays;

public class MyList<T> {
	T data;
	MyList<T> tail;
	
	public MyList() {
		data = null;
		tail = null;
	}

	public MyList(T data) {
		super();
		this.data = data;
		tail = new MyList<T>();
	}

	public MyList(T[] v) {
		super();
		if(v == null) {
			data = null;
			tail = null;
		}
		else {
			MyList<T> w = this;
			for (int i = 0; i < v.length;i++) {
				w.data = v[i];
				w.tail = new MyList<T>();
				w = w.tail;
			}
		}
	}

	@Override
	public String toString() {
		return "MyList [data=" + data + ", tail=" + tail + "]";
	}
	
	
	public boolean isEmpty() {
		return ((this.data == null) && (this.tail == null))?true:false;
	}
	
	
	public Object[] toArray() {
		Object[] array = new Object[0];
		MyList<T> list = this;
		if (!list.isEmpty()) {
			array = Arrays.copyOf(array, array.length+1);
			System.out.println("this is the new Array of Objects => " + array);
		}
		return array;
	}
	
	
	public MyList<T> copy(){
		MyList<T> list = this;
		return list;
		
	}

}
