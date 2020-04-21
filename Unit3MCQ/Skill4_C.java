
/**
 * Write a description of class Skill_2B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skill4_C
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        int a = (int)(3*Math.random());
        int b = (int)(3*Math.random());
        int c = (int)(Math.random());
        System.out.print("method 1:");
        method1(a, b, c);
        System.out.print("method 2:");
        method2(a, b, c);
    }
    public static void method1(int j, int k, int m){
        System.out.println(!((j == k) && (k > m)));
    }
    public static void method2(int j, int k, int m){
        System.out.println((j != k) || (k <= m));
    }
}

