package com.java.list_;

import java.util.List;

//鍖卪yCode涓嬮潰璁板綍鐨勬槸鍦ㄥ紑鍙戜腑甯哥敤鐨勪竴浜涙搷浣�
/**
 * 杩欎釜绫昏褰曠殑鏄疞ist鐨勪竴浜涘熀鏈搷浣�
 * @author peixun
 *
 */
public class LitpOperation {

	//鑾峰緱涓�涓狶ist鐨勯暱搴�(杩欓噷浣跨敤鍒颁簡娉涘瀷鐨勫弬鏁帮紝杩樻槸 灞炰簬鍗犱綅绗︽硾鍨�)
	public long getSize(List<?> list)
	{
		return list.size();
	}
	
	//鍒ゆ柇涓�涓狶ist鏄笉鏄负绌�
	public boolean isEmpty(List<?> list)
	{
		return (list.size() == 0)?true:false;
	}
	
	
	
}
