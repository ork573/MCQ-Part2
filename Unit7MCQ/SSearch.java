
/**
 * Write a description of class SSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SSearch
{
    public static int sequentialSearch(ArrayList<Integer> elements, int target)

    {

        for (int j = 0; j < elements.size(); j++)     // Line 3

        {

            if (elements.get(j) == target)

            {

                return j;

            }

        }

        return -1;

    }

    public static int sequentialSearch2(ArrayList<Integer> elements, int target)

    {

        for (int j = (elements.size() - 1); j >= 0; j--)    

        {

            if (elements.get(j) == target)

            {

                return j;

            }

        }

        return -1;

    }
}
