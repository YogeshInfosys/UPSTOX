package Maps;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
      ht.put("rohini",45);
      ht.put(28,"anal");
      ht.put(87,"tanmay");
      ht.put(33,"sakshi");
      ht.put(78,"yogesh");
    // ht.put(null,"Rohini2");
      
      System.out.println(ht);
      ht.remove(33);
      System.out.println(ht);
      ht.put("Rohini3",45);
      System.out.println(ht);
    
	}

}
