package tech.lese.gof.singleton;

/**
 * 	单例模式:
 * 1.懒汉式:
 * 3)双重检验加锁
 * @author lese
 *
 */
public class SingletonVolatile {
    // volatile保证在多线程的时候，每个线程能正确的处理这个单例
    private volatile static SingletonVolatile uniqueInstance;

    private SingletonVolatile() {}

    public static SingletonVolatile getInstance() {

        if (uniqueInstance == null){
            synchronized (SingletonVolatile.class) {
                if (uniqueInstance == null){
                    uniqueInstance = new SingletonVolatile();
                }
            }
        }
        return uniqueInstance;
    }
}
