
public class StringUtil {
	/**
	 * 这个方法判断输入的字符串str中有没有重复的字符
	 * 前提：str中的字符只能属于ascii码表
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isUniqueCharsACSII(String str){
		boolean[] char_set=new boolean[256];	//建立一个boolean数组char_set对应ascii码表
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(char_set[val]){					//如果str中出现了在char_set已经标记过的字母，表示有重复
				return false;
			}
			char_set[val]=true;					//把str中未标记过的字母在char_set中标记
		}
		return true;
	}

}
