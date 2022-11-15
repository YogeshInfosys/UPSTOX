package Collection;

import java.util.ArrayList;

public class arraylist {//
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Anal");
		al.add(100);
		al.add(200);
        al.add('T');
		al.add(null);
		al.add(null);
		al.add("Anal");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(4,"Tanmay");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		
	}

}
