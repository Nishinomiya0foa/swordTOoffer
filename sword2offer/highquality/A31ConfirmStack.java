package sword2offer.highquality;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/19 下午3:25
 * @Description:
 *
 * 有两个序列, 一个是栈的压入顺序, 所有数字均不相等, 判断另一个是否可能是出栈顺序
 */
public class A31ConfirmStack {


    // {1,2,3,4,5}   {4,5,3,2,1}
    // 1,2,3   {5,3,2,1}
    public boolean checkOutStack(int[] in, int[] out) {
        if (in==null || out==null || in.length != out.length) {
            return false;
        }
        List<Integer> sup = new ArrayList<>();  // 用栈实现更好
        int j = 0;
        for (int i = 0; i<out.length; i++) {
            if (sup.contains(out[i])) {
                if (sup.get(sup.size()-1) != out[i]) {  // 出栈中的这个值在sup中,但不是最后一个, 这说明下一个出栈的不是它
                    break;
                }
                else {
                    sup.remove(sup.size()-1);  // 进行一个出栈
                }
            }
            else {
                while (j< in.length && in[j] != out[i] ) {
                    sup.add(in[j]);
                    j++;
                }
                j++;
            }
        }
        System.out.println(sup);
        return sup.size()==0;

    }

    public static void main(String[] args) {

        A31ConfirmStack confirmStack = new A31ConfirmStack();
        System.out.println(confirmStack.checkOutStack(new int[] {1,3}, new int[] {1, 3}));
        System.out.println(confirmStack.checkOutStack(new int[] {1,2,3,4,5}, new int[] {4,3,5,1,2}));
        System.out.println(confirmStack.checkOutStack(new int[] {1,2,3,4,5,6}, new int[] {6,4,5,3,2,1}));
    }
}
