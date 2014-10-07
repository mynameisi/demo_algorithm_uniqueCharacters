import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 这个包通过调用 StringUtil 中的不同方法实现对一个给定字符串中是否出现重复字符进行判断的功能
 * @author wangguozheng
 *
 */
public class UniqueCharacters {
	//用 Logger 类库进行程序的 log 工作
	private final static Logger logger = LoggerFactory.getLogger(UniqueCharacters.class);

	public static void main(String args[]) throws Exception {

		/*
		 * 从文件中读行的常用pattern
		 * 参考：http://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-using-java
		 */
		BufferedReader br = new BufferedReader(new FileReader(new File("test/TestStrings")));
		String line;
		while ((line = br.readLine()) != null) {
			if (StringUtil.isUniqueCharsLowerCaseLetters(line)) {
				logger.debug(line + " has all unique characters");
			} else {
				logger.debug(line + " has duplicated characters");
			}
		}
		br.close();

	}

}
