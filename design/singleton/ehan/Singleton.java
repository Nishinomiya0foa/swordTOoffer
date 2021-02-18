package design.singleton.ehan;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/1 下午2:05
 * @Description:
 *
 * 饿汉式, 变量在声明时就初始化
 */
public class Singleton {

    private static Singleton instance = new Singleton();  // 类加载出来时,该属性就初始化了, 所以叫饿汉

    private Singleton(){}  // 唯一的构造器 声明私有

    public static Singleton getInstance() {
        return instance;
    }

}
