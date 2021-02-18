package design.abstractfactory;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/1 下午1:58
 * @Description:
 */
public class Fruit implements IFactory {

    public Fruit create(){
        return new Apple();
    }
}
