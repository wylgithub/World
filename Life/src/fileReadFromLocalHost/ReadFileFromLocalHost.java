package fileReadFromLocalHost;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileFromLocalHost {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
//		String Url = "D:/readfile.txt";
//
//		try {
//			//E:/Java/fileReadTest/readfile.txt"
//			FileInputStream file = new FileInputStream(Url);
//			//把字符输入流转换成字节流，并且套上缓冲流管子
//			BufferedReader buf = new BufferedReader(new InputStreamReader(file));
//			String str = null;
//			int i = 1;
//			while((str = buf.readLine()) != null){
//				System.out.println("第"+i+"行:"+str);
//				i++;
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("文件读取异常！请检查！");
//			e.printStackTrace();
//		}
//		
//	}
//	String path = "E:/Java/fileReadTest/readfile.txt";
	JavaFileOperation file =new JavaFileOperation();
//	file.ReadFileFromLocalHost(path);
	
	//创建一个文件,test.txt
	String filePath = "E:/Java/fileReadTest/";
	String fileName = "test.txt";
	String fullFilePath = "E:/Java/fileReadTest/test.txt";
	//创建文件
	//file.createFileToLocalHost(filePath, fileName);
	//向文件内写入内容
//	file.WriteFileToLocalHost(fullFilePath);
//	file.createFileCheck(filePath, fileName);
	file.creteFolder(filePath, "helloWorld");
	}
}
