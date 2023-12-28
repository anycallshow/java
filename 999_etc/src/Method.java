
public class Method {
	
	public int fi(int en) {
				
		if(en <= 1) {
			return 0;
		} else {
	      return fi(en - 1) + fi(en - 2);
		}
	}
		
}
