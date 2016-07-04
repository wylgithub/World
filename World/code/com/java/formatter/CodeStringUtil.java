package com.java.formatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 瀛楃鍒涙搷浣滅被
 * @author peixun
 *
 */
public final class CodeStringUtil {

	/**
	 * 鎻愪緵绉佹湁鏋勯�犲嚱鏁�
	 * 绂佹瀹炰緥鍖�
	 * 
	 */
	private CodeStringUtil()
	{
		
	}
	
	/**
	 * 灏嗛┘宄板紡瀛楃鍒涘彉鎹㈡垚涓嬬幆绾垮垎鍓插瓧绗︿覆
	 */
	public static String camelToSnacke(final String targetStr)
	{
		String convertStr = targetStr.replaceAll("([A-Z]+)([A-Z][a-z])", "$1_$2").replaceAll("([a-z])([A-Z])", "$1_$2");
		
		//杩斿洖灏忓啓
		return convertStr.toLowerCase();
	}
	
	/**
	 * 鍒ゆ柇涓�涓猄tring鏄惁涓虹┖
	 * 
	 */
	public static boolean isEmpty(final String value)
	{
		return (value == null) || (value.length() == 0);
	}
	
	/**
	 * 鍒ゆ柇涓�涓狾bject鍊兼槸涓嶆槸涓虹┖
	 */
	public static boolean isEmpty(final Object value)
	{
		//杩斿洖涓�涓竷灏斿�硷紝鍋囧涓虹┖灏辫繑鍥瀟rue鍚﹀垯杩斿洖false
		return (value == null)||((value instanceof CharSequence) && value.toString().isEmpty());
	}
	
	/**
	 * 鍒ゆ柇涓�涓瓧绗﹀垱鏄笉鏄叏涓虹┖鎴栬�呭叏鏄┖鏍�
	 */
	public static boolean isBlankOrAllSpace(final String str)
	{
		return str.isEmpty() || str.matches("^\\s|^[\\s\\p{Zs}]+$");
	}
	
	/**
	 * 妫�鏌ュ瓧绗﹀垱鏄笉鏄负绌烘垨鑰呬负涓�涓┖鏍�
	 */
	public static boolean isEmptyOrWhSpace(final String str)
	{
		return (str.isEmpty()) || str.matches("\\s$");
	}
	
	/**
	 * 鍒ゆ柇涓�涓瓧绗︿覆闈炵┖:
	 * 
	 * 浣嶉潪绌虹殑鏃跺�欒繑鍥瀟rue
	 * 
	 * 鍚﹀垯杩斿洖false
	 */
	public static boolean isNotEmpty(final String str)
	{
		return (str != null) && (str.length() > 0);
	}
	
	/**
	 * 灏嗕笅鍒掔嚎鍒嗗壊瀛楃鍒涘彉鎹㈡垚椹煎嘲寮忓瓧绗︿覆
	 * @param targetStr 鍙樻崲鐨勫瓧绗﹀垱
	 * @return 杩斿洖瀛楃涓�
	 */
	public static String snakeToCamel(final String targetStr) {
		Pattern p = Pattern.compile("_([a-z])");
		Matcher m = p.matcher(targetStr.toLowerCase());

		StringBuffer sb = new StringBuffer(targetStr.length());
		while (m.find()) {
			m.appendReplacement(sb, m.group(1).toUpperCase());
		}
		m.appendTail(sb);
		return sb.toString();
	}
	
	/**
	 * 
	 * @param str 浼犲叆string
	 * @return
	 * @throws ClassCastException 鎶涘嚭寮傚父
	 */
	public static String valueOf(final String str) throws ClassCastException
	{
		if(str == null){
			return null;
		}else if(str instanceof CharSequence){
			if(str.toString().isEmpty()){
				return null;
			}
			return str.toString();
		}else
		{
			throw new ClassCastException();
		}
	}
	
	/**
	 * 灏嗗瓧绗︿覆杩炴帴璧锋潵
	 * @param slashStr 锛� 鎸囧畾瀛楃涓茬殑杩炴帴绗﹀彿
	 * @param args 锛� 寰呰繛鎺ョ殑瀛楃涓�
	 * @return 杩斿洖杩炴帴濂界殑瀛楃涓�
	 */
	public static String combineStr(final String slashStr,String... args)
	{
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<args.length;i++){
			if(!CodeStringUtil.isEmptyOrWhSpace(args[i])){
				if(i == args.length - 1){//鍋囧鏄渶鍚庝竴涓緟杩炴帴鐨勫瓧绗︿覆鐨勮瘽灏变笉瑕佹坊鍔犺繛鎺ョ鍙�
					sb.append(args[i]);
				}else{
					sb.append(args[i]).append(slashStr);//鍋囧涓嶆槸绉熷悗涓�涓緟杩炴帴鐨勫瓧绗︿覆鐨勮瘽灏辨坊鍔犺繛鎺ョ鍙�
				}
			}
		}
		return sb.toString().trim();//杈撳嚭鏍煎紡鍖栦箣鍚庣殑瀛楃涓�
	}
}
