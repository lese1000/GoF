package tech.lese.gof.singleton;

/**
 * 	单例模式:
 * 1.饿汉式:饿汉就是类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了
 * 1)静态内部类:内部类式中，实现了延迟加载，
 * 只有调用了getInstance(),才会加载StaticInnerClass创建唯一的实例INSTANCE到内存中.并且也解决了懒汉式中多线程的问题.
 * @author lese
 *
 */
public class SingletonStaticInnerClass {

    private static class StaticInnerClass {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    private SingletonStaticInnerClass() {}

    public static SingletonStaticInnerClass getInstance() {
        return StaticInnerClass.INSTANCE;
    }
}
