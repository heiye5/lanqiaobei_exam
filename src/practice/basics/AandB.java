package practice.basics;

import java.util.Scanner;

/**
 * 问题描述
 * 输入A、B，输出A+B。
 * 说明：在“问题描述”这部分，会给出试题的意思，以及所要求的目标。
 * 输入格式
 * 输入的第一行包括两个整数，由空格分隔，分别表示A、B。
 * 说明：“输入格式”是描述在测试你的程序时，所给的输入一定满足的格式。
 *
 * 做题时你应该假设所给的输入是一定满足输入格式的要求的，所以你不需要对输入的格式进行检查。多余的格式检查可能会适得其反，使用你的程序错误。
 *
 * 在测试的时候，系统会自动将输入数据输入到你的程序中，你不能给任何提示。比如，你在输入的时候提示“请输入A、B”之类的话是不需要的，这些多余的输出会使得你的程序被判定为错误。
 *
 * 输出格式
 * 输出一行，包括一个整数，表示A+B的值。
 * 说明：“输出格式”是要求你的程序在输出结果的时候必须满足的格式。
 *
 * 在输出时，你的程序必须满足这个格式的要求，不能少任何内容，也不能多任何内容。如果你的内容和输出格式要求的不一样，你的程序会被判断为错误，包括你输出了提示信息、中间调试信息、计时或者统计的信息等。
 *
 * 样例输入
 * 12 45
 * 说明：“样例输入”给出了一组满足“输入格式”要求的输入的例子。
 *
 * 这里给出的输入只是可能用来测试你的程序的一个输入，在测试的时候，还会有更多的输入用来测试你的程序。
 *
 * 样例输出
 * 57
 */

public class AandB {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();

        System.out.println(n + m);
    }
}
