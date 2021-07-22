package Algorithms;

public class lx_2 {
    public static void main(String[] args) {
        System.out.println((1 + 2.236) / 2);//a【1.618】表达式即为3.236/2，是浮点数的除运算（与1.1.1.a做区别）
        System.out.println(1 + 2 + 3 + 4.0);//b【10.0】数据类型转换，数值自动提升为高级的数据类型1,2,3变为1.0,2.0,3.0
        System.out.println(4.1 >= 4);//c【true】
        System.out.println(1 + 2 + "3");//d【33】输出为两个3，但两个3并不相同，前者表示由1+2得整数3，后者表示为字符3
    }
}
