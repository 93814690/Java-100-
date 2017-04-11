/**
 * <p>Title: 数组数据操作</p>
 * <p>Description: 演示一维数组和多维数组的初始化和基本操作</p>
 */


public class _003myArray {
	//初始化数组变量
	char[] cNum = {'1','2','3','4','5','6','7','8','9','0'};
	char[] cStr = {'a','b','c','d','e','f','g','h','i','j',
					'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int[] iMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	String[] sMail = {"@","."};


/**
 *<br>方法说明：校验电子邮件
 *<br>输入参数：String sPara 被校验的电子邮件字符
 *<br>返回类型：boolean 如果校验的格式符合电子邮件格式返回true；否则返回false
 */
 public boolean isMail(String sPara){
 	for (int i=0; i<sMail.length; i++) {
 		if (sPara.indexOf(sMail[i])==-1) {
 			return false;
 		}
 	}
 	return  true;
 }

 /**
 *<br>方法说明：判断是否是数字
 *<br>输入参数：String sPara 需要判断的字符串
 *<br>返回类型：boolean。如果都是数字类型，返回true；否则返回false
 */
 public boolean isNumber(String sPara){
 	int iPLength = sPara.length();
 	for (int i=0; i<iPLength; i++) {
 		char cTemp = sPara.charAt(i);
 		boolean bTemp = false;
 		for (int j=0; j<cNum.length; j++) {
 			if (cTemp==cNum[j]) {
 				bTemp = true;
 				break;
 			}
 		}
 		if (!bTemp) {
 			return false;
 		}
 	}
 	return true;
 }

 /**
 *<br>方法说明：判断是否都是英文字符
 *<br>输入参数：String sPara。要检查的字符
 *<br>返回类型：boolean。如果都是字符返回true；反之为false
 */
public boolean isString(String sPara){
	int iPLength = sPara.length();
	for (int i=0; i<iPLength; i++) {
		char cTemp = sPara.charAt(i);
		boolean bTemp = false;
		for (int j=0; j<cStr.length; j++) {
			if (cTemp==cStr[j]) {
				bTemp = true;
				break;
			}
		}
		if (!bTemp) {
			return false;
		}
	}
	return true;
}

/**
 *<br>方法说明：判断是否是闰年
 *<br>输入参数：int iPara。要判断的年份
 *<br>返回类型：boolean。如果是闰年返回true，否则返回false
 */   
 public boolean chickDay(int iPara){
 	if (iPara%100==0) {
 		if (iPara%400==0) {
 			return true;
 		}else {
 			return false;
 		}
 	}
 	if (iPara%4==0) {
 		return true;
 	}else
 		return false;
 }

 /**
 *<br>方法说明：主方法，测试用
 *<br>输入参数：
 *<br>返回类型：
 */
 public static void main(String[] args) {
 	_003myArray mA = new _003myArray();
 	boolean bMail = mA.isMail("tom@163.com");
 	System.out.println("1 bMail is "+bMail);
 	bMail = mA.isMail("tom@163com");
 	System.out.println("2 bMail is "+bMail);
 	boolean bIsNum = mA.isNumber("1234");
 	System.out.println("1:bIsNum="+bIsNum);
 	bIsNum = mA.isNumber("123r4");
 	System.out.println("2:bIsNum="+bIsNum);
 	boolean bIsStr = mA.isString("wer");
 	System.out.println("1: bIsStr="+bIsStr);
 	bIsStr = mA.isString("wer3");
 	System.out.println("2: bIsStr="+bIsStr);

 }

}