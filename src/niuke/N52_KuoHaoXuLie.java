package niuke;

import java.util.Scanner;

/**
 * 括号序列
 * 题目描述
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 * 示例1
 * 输入
 * 复制
 * "["
 * 返回值
 * 复制
 * false
 * 示例2
 * 输入
 * 复制
 * "[]"
 * 返回值
 * 复制
 * true
 */

public class N52_KuoHaoXuLie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String checkStr = scanner.next();

        boolean re = isValid(checkStr);
        System.out.println(re);

        scanner.close();

    }

    public static boolean isValid (String s) {
        char character[] = s.toCharArray();
        int i = 0;
        int count = 0;

        if(s.length() == 2 && (s.equals("()") || s.equals("[]") || s.equals("{}"))){
            return true;
        }else if(s.length() % 2 == 0){
            while(true){
                if(i == s.length()){
                    break;
                }

                if(character[i] == '('){
                    if(character[i+1] == ')'){
                        count++;
                    }
                }else if(character[i] == '['){
                    if(character[i+1] == ']'){
                        count++;
                    }
                }else if(character[i] == '{'){
                    if(character[i+1] == '}'){
                        count++;
                    }
                }
                i += 2;
            }

        }else{
            return false;
        }

        return count == s.length() / 2;
    }
}
