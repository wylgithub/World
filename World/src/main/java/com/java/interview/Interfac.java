package com.java.interview;

public interface Interfac {

	//�ӿ��в�������ͨ���ݳ�Ա��ֻ�ܹ��о�̬�Ĳ��ܱ��޸ĵ����ݳ�Ա,static��ʾȫ�֣�final��ʾ�����޸ģ����Բ���static final ���Σ�����ʽ������Ϊstatic��final
	public static final int i = 100;
	
	int j = 200;
	
	//�ӿ��еķ���һ���ǳ��󷽷������Բ�ʹ��abstract�ؼ�������
	public void method1();
	
	//�ӿ��еķ��������з�����Ĭ����Ϊ�����Բ����з����ľ���ʵ�֡�
	public void method2();
	
	/*�ܽ᣺
	 * ����֮��������һ�ֹ��ܲ�ȫ���࣬�ӿ�ֻ��һ�����󷽷������;�̬���ܱ��޸ĵ����ݵļ��ϣ����߶����ܱ�ʵ������
����	 * ��ĳ��������˵���ӿ���һ��������ʽ�ĳ����࣬�ڣ����������г������ʾ����һ�ּ̳й�ϵ��һ����ֻ�ܼ̳м̳�
	һ�������࣬��һ����ȴ����ʵ�ֶ���ӿڡ�����������£��ӿ�ȷʵ���Դ�������࣬����㲻��Ҫ������������ϵļ̳еĻ���
	 * */
}