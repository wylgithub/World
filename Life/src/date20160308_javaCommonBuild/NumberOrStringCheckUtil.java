package date20160308_javaCommonBuild;

public class NumberOrStringCheckUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NuberOrStringCheck noc = new NuberOrStringCheck();
		
		Integer check = new Integer(100);
		
		boolean checkflag = noc.checkInt(check);

		System.out.println(checkflag);
	}

}
