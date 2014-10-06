import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AsciiVersion {
	private final static Logger logger=LoggerFactory.getLogger(AsciiVersion.class);
	public static void main(String args[]){
		String str="abcdea";
		if(AsciiVersion.isUniqueCHars2(str)){
			logger.debug(str+" has all unique characters");
		}else{
			logger.debug(str+" has duplicated characters");
		}
		
	}
	
	public static boolean isUniqueCHars2(String str){
		boolean[] char_set=new boolean[256];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}

}
