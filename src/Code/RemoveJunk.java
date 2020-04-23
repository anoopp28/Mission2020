package Code;

public class RemoveJunk {

	public static void main(String[] args) {
		
	String s = " 的 是 latin string %$^*%@#@ 34e3214";
	
	System.out.println(s);
	
	s = s.replaceAll("[^a-zA-Z0-9@]", " ");
	
	System.out.println(s);
	}

}
