/**
   This program tests the insertionSort method in the
   ObjectInsertionSorter class.
*/

public class Main
{
   public static void main(String[] args)
   {
      // Create a STring array with test values.
      String[] values = { "Zeb", "Deb", "Will", "Karen",
                          "Aaron", "Chris", "Barb", "Kenny" };

      // Display the array's contents.
      System.out.println("Original order: ");
      for (String element : values)
         System.out.print(element + " ");

      // Sort the array.
      ObjectInsertionSorter.insertionSort(values);

      // Display the array's contents.
      System.out.println("\nSorted order: ");
      for (String element : values)
         System.out.print(element + " ");

      System.out.println();
   }
}