public class Mommifier {
    public String mommify(String input) {
    	int len=input.length();
    	String newInput="";
    	if(len == 0)
    		return "";
    	else
    	{
    		for(int i=0;i<len;i++)
    		{
        switch(input.charAt(i)){
        case 'a': 
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	if(i == len -1) {
        		newInput=newInput+"mommy";
            	break;
        	}
        	else {
        		switch(input.charAt(i+1)) {
        		case 'a': 
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                	break;
                default:
                	newInput=newInput+"mommy";
                	break;
        		}
        	}
        	break;
        default:
        	newInput=newInput+input.charAt(i);
        	break;
        }
    	}
    		return newInput;
    	}
    }
}
