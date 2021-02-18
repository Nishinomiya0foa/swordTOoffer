package design.factory;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/19 下午2:56
 * @Description:
 */
public class MaskFactory {
    public Mask create(String type) throws IllegalAccessException {
        // TODO 简单工厂模式实现
        switch (type) {
            case "N95": {
                return new N95Mask();
            }
            case "Med": {
                return new MedMask();
            }
            default: throw new IllegalAccessException();
        }
    }
}
