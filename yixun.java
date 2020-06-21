package com.yixun;

/**
 *      @author 宜薰
 *      @version 1.1
 *      @see  @http://www.imooc.com/code/1230
 *      @param @对方法中某参数的说明
 *      @return 对方法返回值的说明
 *      @exception @对方法可能抛出的异常进行说明
 *
 * javadoc -d doc helloworld.java 生成api帮助文档
 */

public class yixun {
    //运算符
    public static void main(String[] args) {
        String My_name = "我爱慕课网";
        String My_dns = "www.yixun.com";
        System.out.println(My_name + My_dns);
        //字符的介绍
        String name = "爱慕课";
        char sex = '男';
        int num = 18;
        double price = 120.5;
        boolean isOK = true;
        System.out.println(name);
        System.out.println(sex);
        System.out.println(num);
        System.out.println(price);
        System.out.println(isOK);
        //类型的转换
        double avg1 = 78.5;
        int rise = 5;
        double avg2 = avg1 + rise;
        System.out.println("考试平均分：" + avg1);
        System.out.println("调整后的平均分：" + avg2);
        //强制类型转换
        double heightAvg1 = 176.2;
        int heightAvg2 = (int) heightAvg1;
        System.out.println(heightAvg1);
        System.out.println(heightAvg2);
        //常量
        final String SEX2 = "女";
        final char SEX1 = '男';
        System.out.println(SEX1 + SEX2);
        //自增和自减，只可以用变量
        int age1 = 24;
        int age2 = 18;
        int age3 = 36;
        int age4 = 27;
        int sum = age1 + age2 + age3 + age4;
        double avg = sum / 4;
        int minus = age1 - age2;
        int newAge = --age1;
        System.out.println("年龄总和：" + sum);
        System.out.println("平均年龄：" + avg);
        System.out.println("年龄差值：" + minus);
        System.out.println("自减后的年龄：" + newAge);
        //赋值运算符
        int one = 10;
        int two = 20;
        int three = one + two;
        //System.out.println(three);
        System.out.println(three + "==>30");
        System.out.println((three += one) + "==>40");
        System.out.println((three -= one) + "==>30");
        System.out.println((three *= one) + "==>300");
        System.out.println((three /= one) + "==>30");
        System.out.println((three %= one) + "==>0");
        //比较运算符
        int a1 = 16;
        double b1 = 9.5;
        String str1 = "hello";
        String str2 = "imooc";
        System.out.println("a等于b：" + (a1 == b1));
        System.out.println("a大于b：" + (a1 > b1));
        System.out.println("a小于等于b：" + (a1 <= b1));
        System.out.println("str1等于str2：" + (str1 == str2));
        //逻辑运算符，&& 与 ||或 !非 ^异或（仅有一个true则true）
        boolean a2 = true; // a同意
        boolean b2 = false; // b反对
        boolean c2 = false; // c反对
        boolean d2 = true; // d同意
        System.out.print((a2 && b2) + "未通过");
        System.out.print((a2 || b2) + "通过");
        System.out.print(!a2 + "未通过");
        System.out.print((c2 ^ d2) + "通过");
        //条件运算符 布尔表达式 ？ 表达式1 ：表达式2 数字判比都为布尔值
        //运算过程：如果布尔表达式的值为 true ，则返回 表达式1 的值，否则返回 表达式2 的值
        int score = 68;
        //数字判断均为布尔值
        String mark = (score > 60) ? "及格" : "不及格";
        System.out.println("考试成绩如何：" + mark);
        //优先级
        int m = 5;
        int n = 7;
        int x = (m * 8 / (n + 2)) % m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("x:" + x);
        //判断语句
        int age5 = 25;
        if (age5 >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }
        /*或者
         *        String ageif = (age > 18) ? "成年" : "未成年";
         *        System.out.println(ageif);
         */
        //多重if
        int age6 = 25;
        if (age6 >= 60) {
            System.out.println("老年");
        } else if (40 < age6 && age6 < 60) {
            System.out.println("中年");
        } else if (18 < age6 && age6 < 40) {
            System.out.println("少年");
        } else {
            System.out.println("童年");
        }
    }
}