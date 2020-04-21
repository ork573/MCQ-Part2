
/**
 * Write a description of class Skill_5B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skill_5B
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = fact1 * fact2;
        System.out.println("before:"+product);
        fact1 = 1.0 / 2;
        product = fact1 * fact2;
        System.out.println("after:"+product);
    }
}
