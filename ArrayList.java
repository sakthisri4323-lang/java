

import java.util.*;

public class StringOperations
{
    public static void main(String args[])
    {
        ArrayList<String> obj = new ArrayList<String>();

        // Append - add at end
        obj.add("Arun");
        obj.add("Balaji");
        obj.add("Chandru");
        obj.add("David");
        obj.add("Elango");

        System.out.println("\nElements in ArrayList:");
        System.out.println(obj);

        // Insert - add at particular index
        obj.add(0, "Arujun");
        obj.add(1, "Barath");

        System.out.println("\nAfter Inserting Elements:");
        System.out.println(obj);

        // Search for an element
        Scanner in = new Scanner(System.in);

        System.out.println("\nSearch For Element:");
        String searchStr = in.nextLine();

        boolean ans = obj.contains(searchStr);

        if (ans)
            System.out.println("ArrayList contains " + searchStr);
        else
            System.out.println("ArrayList does not contain " + searchStr);

        // List strings starting with a given letter
        System.out.println("\nEnter the starting letter:");
        String start = in.nextLine();

        ArrayList<String> obj1 = new ArrayList<String>();

        for (int i = 0; i < obj.size(); i++)
        {
            if (obj.get(i).toUpperCase().startsWith(start.toUpperCase()))
            {
                obj1.add(obj.get(i));
            }
        }

        System.out.println("\nStrings starting with " + start + ":");
        System.out.println(obj1);

        in.close();
    }
}