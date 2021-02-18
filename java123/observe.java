package java123;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/15 上午10:54
 * @Description:
 */

public class observe {

    public String getId() {
        return id;
    }

    private String id = "0";
    private int sum = 0;
    Parent parent = Parent.createParent();


    public observe(){
        this.id = "0";
    }

    public observe(String id){
        this.id = id;
    }

    public void register() {
        parent.register(this.id);
    }

    public void son(int num) {
        this.sum += num;
        if (this.sum > 5) {
            parent.obs(this);
        }
    }

    @Override
    public String toString() {
        return "observe" + this.id;
    }
}
