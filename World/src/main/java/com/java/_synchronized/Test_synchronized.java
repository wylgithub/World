package com.java._synchronized;

/**
 * synchronized线程、同步
synchronized 关键字可以应用于方法或语句块，并为一次只应由一个线程执行的关键代码段提供保护。 

synchronized 关键字可防止代码的关键代码段一次被多个线程执行。 

如果应用于静态方法，那么，当该方法一次由一个线程执行时，整个类将被锁定。 

如果应用于实例方法，那么，当该方法一次由一个线程访问时，该实例将被锁定。 

如果应用于对象或数组，当关联的代码块一次由一个线程执行时，对象或数组将被锁定。
 * @author Administrator
 *
 */
public class Test_synchronized {

	//synchronized关键在的四种使用方法：
	/**
	 * 方法声明的时候使用，放在范围操作符之后(public等)和返回类型操作符之前(void等)，此时线程获得的是成员锁，即一次只能
	 * 有一个线程使用该方法，其它线程要想在此时调用该方法只能排队等候，当前线程(就在synchronized方法内部的线程执行完成)之后
	 * 别的线程才可以进入该方法。当一个对象调用了该方法之后，该方法就是被独占的，直到这个线程使用完成为止。
	 */
	
	//定义一个同步方法
	public synchronized void testSynchronized()
	{
		
	}
	/**
	 * 在学习之后发现synchronized这个同步锁还具有如下的特性：
	 * 
	 * 通俗讲解如下：
	 * 
	 * 假如在一个类Person具有如下两个对象P1和P2
	 * Person对象中有若干个synchronized标注的成员方法(具有成员锁)，Person类的P1对象调用了方法1之后这个对象中的
	 * 其他方法是不可以被调用的，(互斥)，因为这是整个对象都是被锁定的。
	 * 但是这个类的对象P2可以任意调用里面的synchronzied标志的方法。
	 * 
	 * PS：零长度的byte数组对象创建起来将比任何对象都经济――查看编译后的字节码：生成零长度的byte[]对象只需3条操作码，而Object lock = new Object()则需要7行操作码。
	 * 
	 * private byte[] lock = new byte[0];
	 * 
	 * 
	 * 3．将synchronized作用于static 函数，示例代码如下：
Class Foo   
{   
    public synchronized static void method1()   

    {   
        //.   
    }   
    public void method2()   
    {   
        synchronized(Foo.class)   
        //
    }   
}  
	 */
	
	public synchronized static void testSyn()
	{
		//
	}
	
	public void test()
	{
//		synchronized(Test_synchronized.class);
	}
	
	/**
	 * 这两个同步方法都调用这个方法的对象所属的类的类锁（Class，而不再是由这个Class产生的某个具体对象了）。 
能够推断：假如一个类中定义了一个synchronized的static函数A，也定义了一个synchronized 的instance函数B，那么这个类的同一对象Obj在多线程中分别访问A和B两个方法时，不会构成同步，因为他们的锁都不相同。A方法的锁是Obj所属的那个Class，而B的锁是Obj所属的这个对象。
	 */
	//以上的这句话不是很懂
	
	//同步代码块的实例:
	public void method(Object obj)
	{
		synchronized(obj)
		{
			//同步的代码
		}
	}
	/**
	 * 解释如下：
	 * 
	 * 这个时候，锁就是obj这个对象，每一个对象对应一个唯一的锁，所以那个线程拿到这个对象的锁就能过运行所控制的代码段，当有
	 * 一个明确的对象作为锁时就能够这样写程式，但是当没有明确的对象时，能够创建一个明确的instance变量(它得是对象来充当)
	 * 锁：
	 * 
	 * private byte[] by = new byte[0];
	 * 
	 * public void method()
	 * {
	 * 		synchronized(lock)
	 * 		{
	 * 			//.
	 * 		}
	 * }
	 * 
	 * 
	 * PS：零长度的byte数组对象创建起来将比任何对象都经济――查看编译后的字节码：生成零长度的byte[]对象只需3条操作码，而Object lock = new Object()则需要7行操作码。
	 */
	//可以这么解释：
	/**
	 * 当synchronized用于静态方法的时候，当这个静态方法被调用的时候整个类都是被锁定的。
	 * ，但是当应用于一个实例方法的话，当这个方法被调用的话只锁定这个实例，但是这个类的其他方法是可以被调用的。
	 * 如果应用于对象或数组，当关联的代码块一次由一个线程执行时，对象或数组将被锁定。
	 */
	
	
}
