package offer12;

/**
 * Created by Taoxiao on 2017/7/28 0028.
 * Describe:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution {
    public double Power(double base, int exponent) {
        double result = base;
        for (int i = 1; i < Math.abs(exponent); i++) {
            result = result * base;
        }
        if (exponent < 0) {
            return 1 / result;
        } else if (exponent == 0) {
            return 1;
        } else {
            return result;
        }
    }
}