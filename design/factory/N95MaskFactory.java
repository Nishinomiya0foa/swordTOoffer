package design.factory;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/19 下午3:04
 * @Description:
 */
public class N95MaskFactory {

    public N95Mask create(){
        return new N95Mask();
    }
}
