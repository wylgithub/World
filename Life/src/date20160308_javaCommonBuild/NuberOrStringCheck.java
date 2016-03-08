package date20160308_javaCommonBuild;

public class NuberOrStringCheck {
	//无参数的构造函数
	NuberOrStringCheck(){}

	/**
	 * 日期: 2016-03-08
	 * 功能： 添加在开发过程中的一些Check函数
	 * 
	 */
	public static boolean  checkInt(final Integer value){
		/**
		 * 假如value是一个Integer类型的数字则返回true否则返回false；
		 * 
		 */
		return (value instanceof Integer) ? true : false;
	}
	
	/**
	 * 返回一个字符串的长度
	 * @return
	 */
	public static long getLengthOfString(final String str){
		//相当于复写java的length函数
		return str.length();
	}
	
	/**
	 * 判断一个字符串是不是为空
	 * @param str
	 * @return
	 */
	public static boolean isBlankOrEmpty(final String str){
		return (str == null) || (str.length() == 0);
	}
	
	/**
	 * 判断字符串是不是为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(final String str){
		if(str == null){
			return false;
		}
		return true;
	}
	
	/**
	 * 判断一个数是不是奇数
	 * @param value
	 * @return
	 */
	public static boolean isOdd(final int value){
		return (value % 2 != 0)? true:false;
	}
	
	/**
	 * 判断一个数是不是偶数
	 * @param value
	 * @return
	 */
	public static boolean isEven(final int value){
		return (value % 2 != 0)? false:true;
	}
	
	
}
