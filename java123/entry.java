package java123;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/15 上午10:54
 * @Description:
 */
public class entry {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        observe ob0 = new observe();
        observe ob = new observe("1");
        observe ob2 = new observe("2");
        System.out.println(ob0.getId());
        ob.register();
        ob2.register();
        ob.son(7);
        ob2.son(3);
        ob2.son(9);


    }
}
