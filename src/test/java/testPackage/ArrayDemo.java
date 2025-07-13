package testPackage;

public class ArrayDemo {

    public static void main(String[] args) {

//        String [] names = new String [5]; // Declare an array of integers with a size of 5
        // Initialize the array with values
//        names[0] = "Mohamed"; // Assign values to the array elements
//        names[1] = "Ahmed";
//        names[2] = "Ali";
//        names[3] = "Sara";
//        names[4] = "Fatima";

        // Print the array elements
//        System.out.println("Element 1 : " + names[0]);
//        System.out.println("Element 2 : " + names[1]);
//        System.out.println("Element 3 : " + names[2]);
//        System.out.println("Element 4 : " + names[3]);
//        System.out.println("Element 5 : " + names[4]);

        String [] names = {"Mohamed", "Ahmed", "Ali", "Sara", "Fatima"}; // Initialize the array with values

//        for (int i=1; i<=5; i++){
//            System.out.println("Element"+ i+ " of index "+(i-1)+" " + names[i-1]);
//        }
        // Enhanced for loop to iterate through the array
        for(String name : names){
            System.out.println("Name: " + name);
        }

        // methods on arrays
        // Print the length of the array
        System.out.println("Length of the array: " + names.length);

//        // Check if the array is empty
//        if (names.length == 0) {
//            System.out.println("The array is empty.");
//        } else {
//            System.out.println("The array is not empty.");
//        }

    }
}
