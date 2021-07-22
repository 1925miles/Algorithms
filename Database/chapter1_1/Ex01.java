package Algorithms;

public class lx_1 {
    public static void main(String[] args) {
        System.out.println((0 + 15) / 2);//a【7】表达式即为15/2，是整型量的除运算
        System.out.println(2.0e-6 * 100000000.1);//b【200.0000002】2.0e-6为浮点数的科学计数法，等同于0.000002
        System.out.println(true && false || true && true);//c【true】按优先级运算，逻辑运算符中，！拥有最高优先级，其次是&&，之后是||，然后为&、|、^
    }
}
