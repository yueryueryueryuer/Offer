package offer02;

/**
 * Created by Taoxiao on 2017/7/20 0020.
 * Describe:请实现一个函数，将一个字符串中的空格替换成“%20”。
 *          例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i<str.length();i++) {
            if (str.charAt(i) == ' '){
                stringBuilder.append('%');
                stringBuilder.append('2');
                stringBuilder.append('0');
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuffer st = new StringBuffer("We Are Happy");
        System.out.println(solution.replaceSpace(st));
    }
}
