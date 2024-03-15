package New;

public class NumFromStringFunc {
	public void numbStr(){
		String str2 = "sfe232rd23d";
		StringBuilder strBui = new StringBuilder();
		int i, j;
	
		for(i=0; i<str2.length(); i++) {
				if(str2.charAt(i)>=48 && str2.charAt(i)<=57) {
					strBui.append(str2.charAt(i));
				}
		}
		System.out.println(strBui);
	}
}
