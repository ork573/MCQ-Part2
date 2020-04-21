
/**
 * Write a description of class Skill_2B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skill4_C2
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        method1(1, 2);
        method2(1, 2);
    }

    public static void method1(int x, int y){
        int result = 0;

        if (x > y)

        {

            result = x - y;

            System.out.println(result);

        }

        else if (x < y)

        {

            result = y - x;

            System.out.println(result);

        }

        else

        {

            System.out.println(result);

        }
    }

    public static void method2(int x, int y){
        if (x < y)

        {

            System.out.println(y - x);

        }

        else

        {

            System.out.println(x - y);

        }

    }
}

