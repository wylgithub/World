package connectdatabase;

import java.sql.Connection;

public class ConnectionToOracleFactory {

	//数据库连接创建工厂类
	private ConnectToOracle cto = new ConnectToOracle();
	
	//获取数据库连接对象实例
	public ConnectToOracle getConnectToOracle(){
		//如果为空就创建一个新的连接对象实例
		if(cto == null){
			cto = new ConnectToOracle();
			return cto;
		}else{
			//如果不为空就直接返回这个对象
			return cto;
		}
		
	}
	
	//关闭数据库连接
	public void closeConnection(Connection conn){
		if(conn == null){
			cto = new ConnectToOracle();
		}
		//调用关闭数据库的方法
		cto.closeConnection(conn);
		
	}
}
