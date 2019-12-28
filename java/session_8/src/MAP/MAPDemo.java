package MAP;

import java.util.HashMap;
import java.util.Map;

public class MAPDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(111, "deepa");
		hm.put(112, "deepali");
		hm.put(113, "deepaliK");
		hm.put(114, "deepaKa");
		hm.put(null, null);
		hm.put(null, "deepa");
		hm.put(115, "deepali");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}//not ordererd ,no duplicate key

}
