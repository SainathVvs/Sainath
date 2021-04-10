package Test.API;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="{ [ ] }";
		s=s.replaceAll("\\s","");
		String sjson="{[]}";
		
		System.out.println(s.equals(sjson));
		
	}

}
