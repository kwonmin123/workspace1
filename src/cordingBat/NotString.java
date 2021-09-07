package cordingBat;

public class NotString {

	public String notString(String str) {
		
		if(str.startsWith("not")) {
			return str;
		}
		
		return "not" + str;
		
	}
}
