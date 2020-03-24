package Epam_gopisadi.tdd_junit;

public class RemoveFun {
	public String remove(String string) {
		String res_string = string;
		
		int strlength = string.length();
		
		
		if(strlength  == 1) {
			if(string.charAt(0) == 'A') {
				res_string = "";
			}
		}else if (strlength > 1 ) {
			
			if (string.charAt(0) == 'A' && string.charAt(1) == 'A')
			{
				res_string = string.substring(2,strlength);
				
			}
			else if (string.charAt(0) != 'A' && string.charAt(1) == 'A') {
				
				res_string = string.charAt(0) +  string.substring(2,strlength);
			}
			else if (string.charAt(0) == 'A' && string.charAt(1) != 'A') {
				res_string = string.substring(1,strlength);
			}
		}

		return res_string;
	}
}