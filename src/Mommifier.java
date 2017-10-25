

public class Mommifier {
    public String mommify(String input) {
    	if(input.length() == 0)
    		return "";
        switch(input.charAt(0)){
        case 'a': 
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	return "mommy";
        default:
        	return input;
        }
    }
}
