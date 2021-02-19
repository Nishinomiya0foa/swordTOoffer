package sword2offer.highquality;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/19 下午1:18
 * @Description:
 *
 * 顺时针由外朝内打印二位矩阵的值
 */
public class A29PrintMatrice {

    // 螺旋打印 时间:O(mn)  空间:O(1)
    public List<Integer> printMatrice(int[][] nums) {

        List<Integer> result =  new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int left = 0;
        int right = nums[0].length - 1;
        int top = 0;
        int bottom = nums.length - 1;
        int numEle = nums[0].length * nums.length;
        while (numEle >= 1) {
            for (int i=left; i<=right&&numEle>=1; i++) {  // 上, 打印y,
                result.add(nums[top][i]);
                numEle--;
            }
            top++;

            for (int i=top; i<=bottom&&numEle>=1; i++) {  // 右, 打印x, 递增
                result.add(nums[i][right]);
                numEle--;
            }
            right--;

            for (int i=right; i>=left&&numEle>=1; i--) {  // 下, 打印y, 递减
                result.add(nums[bottom][i]);
                numEle--;
            }
            bottom--;

            for (int i=bottom; i>=top&&numEle>=1; i--) {  // 左
                result.add(nums[i][left]);
                numEle--;
            }
            left++;
        }


        return result;
    }

    // 由x,y坐标确定下一坐标点
    public int getNextNum(int[][] nums, int x, int y, int whichCycle) {
        int cycles = (nums.length+1)/2;
        int startRow = nums.length + whichCycle - cycles;  // 4,3,2
        int startCol = cycles - whichCycle;  // 0, 1, 2
        if (y<startRow) {
            y+=1;
        }
        else if (y==startRow) {
            x-=1;
        }
        else if (y==startCol) {
            x-=1;
        }
        else if (x==startCol+1) {
            y+=1;
        }
        System.out.println(x+ "  "+y);
        return 3;
    }

    public static void main(String[] args) {
        A29PrintMatrice printMatrice = new A29PrintMatrice();
        System.out.println(printMatrice.printMatrice(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}}));
    }
}
