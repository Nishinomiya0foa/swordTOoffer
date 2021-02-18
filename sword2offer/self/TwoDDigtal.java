package sword2offer.self;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午1:26
 * @Description:
 * 二位数组, 每一行从左往右递增, 每一列从左往右递增,判断x是否在二位数组中
 */
public class TwoDDigtal {

    public boolean existNum(int[][] nums, int x) {
        // nums是二维数组
        // 每次看右上角的数字, >x则该列不考虑, <x则该行不考虑(因为>x的情况已经分析过了)
        // 时间O(n), 空间O(1)； 如果遍历全数组时间O(n*n)
        // 如果观察左上角的数字,
        int col = nums[0].length;
        int row = 0;
        while (col >0 && row < nums.length) {
            System.out.println(row + "   "+ col);
            int tmp = nums[row][col-1];
            if (tmp == x) {
                return true;
            }
            else if (tmp > x) {
                col -= 1;
            }
            else {
                row += 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoDDigtal twoDDigtal = new TwoDDigtal();
        System.out.println(twoDDigtal.existNum(new int[][]{{1,3,4}, {2,3,5}, {6,7,8}}, 0));
    }
}
