package design.factory;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/19 下午2:57
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException {
        // 简单工厂
        MaskFactory factory = new MaskFactory();
        System.out.println(factory.create("Med"));
        System.out.println(factory.create("N95"));

        // 工厂模式
        MedMaskFactory medMaskFactory = new MedMaskFactory();
        N95MaskFactory n95MaskFactory = new N95MaskFactory();
        MedMask medMask = medMaskFactory.create();
        N95Mask n95Mask = n95MaskFactory.create();
        System.out.println(medMask);
        System.out.println(n95Mask);
    }
}
