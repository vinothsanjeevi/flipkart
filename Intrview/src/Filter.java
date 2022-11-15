import org.testng.annotations.Test;

public class Filter {
	
	@Test
	public void main() {
		
		
		String name = "vinoth@23be";
		
		 name =name.replaceAll("[^a-z]", "");
		 
		 String a =name.replaceAll("[^0-9]", "");
		
		System.out.println(name);
		
		System.out.println(a);
	}

}
