package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToOracle {

	/**
	 * 使用java连接Oracle数据库代码编写
	 */
	//主机名
	private final static String serverName = "localhost";
	//数据库名
	private final static String databaseName = "orcl";
	//连接地址
	private final static String DB_URL_2 = "jdbc:oracle:thin:@//"+serverName+":1521/"+databaseName;
	
	
	//连接Oracle数据库的Url，最后的orcl表示连接的数据库
	private final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	//Oracle数据库连接驱动
	private final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//数据库连接用户名
	private final static String DB_USERNAME = "scott";
	//连接Oracle数据库的密码
	private final static String DB_PASSWORD = "tiger";
	
	//获取数据库连接
	public static Connection getConnection(){
		//声明数据库连接对象
		Connection conn = null;
		
		try{
			//使用Class.forName()方法自动创建这个驱动程序的实例且自动调用DriverManager来注册它
			Class.forName(DB_DRIVER);
			//通过DriverManager的getConnection()来获得数据库实例
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		}catch(Exception ex){
			//打印异常堆栈
			ex.printStackTrace();
		}
		//返回数据库连接的实例
		return conn;
	}
	
	//关闭数据库连接
	public static void closeConnection(Connection conn){
		try{
			if(conn != null){
				//判断当前连接对象没有关闭
				if(!conn.isClosed()){
					//关闭数据库
					conn.close();
				}
			}
		}catch(Exception ex){
			System.out.println("******数据库关闭异常******");
			ex.printStackTrace();//打印异常堆栈
		}
	}
	
	
}