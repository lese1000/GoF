package tech.lese.gof.singleton;

/**
 * 	单例模式:
 * 1.饿汉式:饿汉就是类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了
 * 1)静态变量
 * @author lese
 *
 */
public class SingletonStatic {
    private SingletonStatic() {}

    private static final SingletonStatic instance = new SingletonStatic();

    public static SingletonStatic getInstance() {
        return instance;
    }
}