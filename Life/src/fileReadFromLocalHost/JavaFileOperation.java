package fileReadFromLocalHost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 这个类用于使用java读取或者或者写入内容到本地磁盘中指定的文件
 * @author Administrator
 *
 */
public class JavaFileOperation {

	/**
	 * 读取本地磁盘路径的文件显示在终端上
	 * @param filePath： 读取文件的本地路径 
	 */
	public static void ReadFileFromLocalHost(final String filePath){
		try{
			//读取本地文件
			FileInputStream file = new FileInputStream(filePath);
			//把字符输入流转换成字节流,套上缓冲的管子(InputStreamReader， 它是字节转换为字符的桥梁)
			BufferedReader buf = new BufferedReader(new InputStreamReader(file));
			
			String str = null;
			//记录文件的读取行内容
			int line = 1;
			//一行一行的读取文件中的内容
			while((str = buf.readLine()) != null){
				System.out.println("第"+line+"行的内容为: "+str);
				line++;
			}
			//关闭文件
			file.close();
		}catch(IOException ex){
			System.out.println("文件读取失败!");
			ex.printStackTrace();
		}
	}
	
	/**
	 * 在本地磁盘的指定目录创建指定的文件
	 * @param filePath 文件所在的路径
	 * @param fileName 文件名+后缀名
	 */
	public static void createFileToLocalHost(final String filePath,final String fileName){
		//创建一个文件创建对象，在指定的磁盘目录下
		File file = new File(filePath,fileName);
		try{

			//创建文件
			file.createNewFile();
			System.out.println("文件创建成功！");
		}catch(IOException ex){
			System.out.println("文件创建失败！");
			//打印异常堆栈
			ex.printStackTrace();
		}
	}
	
	//将缓冲区的内容输入到本地磁盘中的文件
	public static void WriteFileToLocalHost(final String filePath){
		
		//输入字符
		Scanner console = new Scanner(System.in);
		System.out.println("请输入内容: ");
		
//		int i=1;
//		while(i<1000000){
//			System.out.println("输入完成,正在保存.");
//			System.out.println("输入完成,正在保存..");
//			System.out.println("输入完成,正在保存...");
//			System.out.println("输入完成,正在保存....");
//			System.out.println("输入完成,正在保存.....");
//			System.out.println("输入完成,正在保存......");
//			System.out.println("输入完成,正在保存.......");
//			System.out.println("输入完成,正在保存........");
//			System.out.println("输入完成,正在保存..........");
//			i++;
//		}
		//输入字符
		String str = console.next();
		byte bt[] = new byte[10240];
		bt = str.getBytes();
		try{
			//实例化一个文件写入对象
			FileOutputStream in = new FileOutputStream(filePath);
			try{
				//写入文件
				in.write(bt, 0, bt.length);
				System.out.println("输入完成,正在保存......");	
				System.out.println("文件写入成功！");
			}catch(Exception ex){
				System.out.println("文件写入异常！");
				ex.printStackTrace();
			}finally{
				//关闭文件写入
				in.close();
			}
		}catch(IOException ex){	
			System.out.println("文件写入失败!");
			//打印异常堆栈
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 判断文件是否存在，如果存在则不创建，否则创建文件
	 */
	public static void createFileCheck(final String filePath,final String fileName){
		//实例化文件创建实例
		File file = new File(filePath+fileName);
		//判断文件是不是已经存在
		if(!file.exists()){
			//执行文件创建命令
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("文件创建失败！");
				e.printStackTrace();
			}
		}else{
			System.out.println("文件已经存在,不可以重复创建。");
		}
		//测试通过
	}
	
	/**
	 * 判断文件夹是否存在，假如不存在就创建文件夹
	 * @param filePath
	 * @param fileName
	 */
	public static void creteFolder(final String filePath,final String fileName){
		//创建一个文件创建实例
		File file = new File(filePath+fileName);
		if(!file.exists()){
			//创建文件夹
			file.mkdir();
			System.out.println("文件夹创建成功！");
		}else{
			System.out.println("文件夹已经存在！");
		}
	}
}
