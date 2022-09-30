public class Main {

    public static void main(String[] args) {
        
        //Unsorted array
        int[] array = {1, 3, 4, 5, 1, 23, 57, 126, 4, 543, 345, 23, 12, 45, 67, 97};

        //Print unsorted array
        System.out.println("Unsorted Array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        boolean arraySorted = false; //arraySorted starts as false.
        while (arraySorted == false) {
            arraySorted = true; //Set arraySorted to true at the start of each loop.
            for (int i = 0; i < array.length - 1; i++) { //Loop through all elements except the last.
                if (array[i] > array[i + 1]) { //If an element is greater than the following element,
                    array = swap(array, i); //swap them and set arraySorted to false.
                    arraySorted = false; //arraySorted will be true if no elements are swapped, ending the while loop
                }
            }
        }

        //Print sorted array
        System.out.println("Sorted Array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
    
    //Function to swap elements in an array
    public static int[] swap(int[] array, int index) {

        int temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
        return array;
    }
}
