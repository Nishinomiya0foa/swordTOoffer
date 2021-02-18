package design.singleton.lanhan;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/1 下午2:12
 * @Description:
 *
 * 懒汉式:  第一次用到时, 才构造出该单例对象
 */
public class Singleton {

    public static volatile Singleton instance = null;

    private Singleton(){}

//    public static Singleton getInstance() {  // 线程不安全, 当多个线程同时调用时, 会返回多个不同的对象
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    public static Singleton getInstance() {  // 线程安全了, 但每个线程都要执行同步方法, 非常耗时
//        synchronized (Singleton.class) {
//            if (instance == null) {
//                instance = new Singleton();
//            }
//        }
//        return instance;
//    }


//    public static Singleton getInstance() {  // 线程安全了, 且只有在没有实例化过的情况下 才会触发同步方法, 同时兼容了安全与速度
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    // 这种写法也可以
    // *******
    private static class SingletonHolder {  // 静态内部类, 使用时才会加早
        public static Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.instance;  //实现线程安全则是: java虚拟机的完善策略保证,线程安全,同时只有一个线程进行类的初始化, 内部类的好处
    }
    // *******

    // 也不能说是懒汉式优于饿汉式, 只是构建的时机不同
    // 对于复杂构建的对象, 使用懒汉式可能降低使用体验, 此时饿汉式可能会更好

    // 变量声明时volatile作用: 防止指令重排序
    // instance = new Singleton(); 时, 实际进行了三个指令
    // 1.分配对象的内存空间
    // 2.初始化对象
    // 3.将变量instance指向刚分配的内存空间
    // 如果2和3的顺序乱了,那么其他线程在检测到instance已经不为null时,但还没有初始化,会触发空指针
}
