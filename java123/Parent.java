package java123;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/15 上午11:25
 * @Description:
 */
public class Parent {
    private volatile static Parent parent;

    private List<String> observes = new ArrayList<>();

    private Parent() {};

    public static Parent createParent() {
        if (parent == null) {
            synchronized (Parent.class) {
                if (parent == null) {
                    parent = new Parent();
                }
            }
        }
        return parent;
    }

    public void register(String id){
        this.observes.add(id);
    }

    public void obs(observe o) {
        if (this.observes.contains(o.getId())) {
            System.out.println("i see ob"+o.getId() +  " bigger than 5");
        }
    }

    public List<String> getObserves() {
        return observes;
    }
}
