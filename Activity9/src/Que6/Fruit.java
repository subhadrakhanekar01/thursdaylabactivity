package Que6;

public class Fruit {

public static String[] fruits= {"orange", "apple", "banana", "pear", "cantaloupe"};

public static int found =0;
        
    public static void main(String[] args)
    {
     
        
        for (int i=0; i < fruits.length; i++)
        {
            if(fruits[i].equals("banana"))
            {
            found++;
            }
}
        if(found > 0)
        {
            System.out.println("The word banana is in the array");
        }
        else
        {
            System.out.println("The word banana is not in the array");
        }
}
}