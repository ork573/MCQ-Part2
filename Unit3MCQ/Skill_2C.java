
/**
 * Write a description of class Skill_2B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skill_2C
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        String[] ar = new String [] {first,second,third};
        for (String str1 : ar){
            for (String str2 : ar){
                System.out.println(str1+" and "+str2+":");
        if (str1.equals(str2)) {
            System.out.println("Values are equal");
        }
        else {
            System.out.println("Values not equal");
        }
        if (str1 == str2){
            System.out.println("References are equal");
        }
        else{
            System.out.println("References not equal");
        }
        
    }
}
}
}
