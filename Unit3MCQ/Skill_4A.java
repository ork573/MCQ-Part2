
/**
 * Write a description of class Skill_2B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skill_4A
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        System.out.print("Temp=30;expected= cold;actual=");
        weather(30);
        System.out.print("Temp=51;expected= moderate;actual=");
        weather(51);
        System.out.print("Temp=60;expected= moderate;actual=");
        weather(60);
    }

    public static void weather(int temp){
        String weather;
        if (temp <= 31)
        {
            weather="cold";
        }
        else
        {
            weather="cool";
        }
        if (temp >= 51)
        {
            weather="moderate";
        }
        else
        {
            weather="warm";
        }
        System.out.println(weather);
    }
}
