package tech.lese.gof.singleton;

/**
 * 	单例模式:
 * 1.懒汉式:懒汉式单例 在使用的时候去判断单例是否已经存在，然后再调用实例或创建实例 【在懒汉式中需要考虑并发问题】
 * 1)不使用同步方法
 * @author lese
 *
 */
public class SingletonLazyNoSync{
	private static SingletonLazyNoSync instance;
	private SingletonLazyNoSync(){}
	
	public static SingletonLazyNoSync getInstance(){
		if(null == instance){
			instance = new SingletonLazyNoSync();
		}
		return instance;
	}
}

