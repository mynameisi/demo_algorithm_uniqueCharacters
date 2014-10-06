import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AsciiVersion {
	private final static Logger logger=LoggerFactory.getLogger(AsciiVersion.class);
	public static void main(String args[]) throws Exception{
		String str="abcdea";
		
		BufferedReader br = new BufferedReader(new FileReader(new File("test/TestStrings")));
		String line;
		while ((line = br.readLine()) != null) {
			
			if(AsciiVersion.isUniqueCHars2(line)){
				logger.debug(str+" has all unique characters");
			}else{
				logger.debug(str+" has duplicated characters");
			}
		}
		br.close();
		
		
		
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
