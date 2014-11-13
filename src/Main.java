public class Main {
	public static void main(String[] args) {
		String s = "12325";
		System.out.println();
		isUniqueCharsACSII(s);
	}

	public static boolean isUniqueCharsACSII(String str) {
		int[] char_set = new int[256]; // 建立一个boolean数组char_set对应ascii码表
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val] != 0) { // 如果str中出现了在char_set已经标记过的字母，表示有重复
				System.out.println("有重复字符");
				return false;
			}
			char_set[val]++; // 把str中未标记过的字母在char_set中标记
		}
		System.out.println("没有重复字符");
		return true;
	}
}
