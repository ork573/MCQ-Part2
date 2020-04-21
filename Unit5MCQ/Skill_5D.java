
/**
 * Write a description of class Skill_2B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skill_5D
{
    public static void main (String[] args){
        String phrase = "string";
        String key = "ring";
        int index;
        //Testing option B to show it is restrictinve enough:0 <= index < phrase.length()-key.length()
        index = phrase.length()-key.length()-1;
        boolean ok = substringFound(phrase, key, index);
        System.out.println(ok);
        //Testing option A to show it is not restrictinve enough:0 <= index < phrase.length()
        index = phrase.length()-1;
        try {
            substringFound(phrase, key, index);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }
    }

    public static boolean substringFound(String phrase, String key, int index)
    {
        String part = phrase.substring(index, index + key.length());
        return part.equals(key);
    }
}
