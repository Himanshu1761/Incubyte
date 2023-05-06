
package Incubyte_test;


import org.junit.Test;


/**
 *
 * @author pc
 */
public class Incubyte {
  
    @Test
    public static int Add(String text) {   //The Add method takes the string as parameter
        System.out.println("Return 0 when string is empty");//Here I have added the comment to check that the code is working
    return 0;// Return 0 when string is empty. 
    
    }
     
     
    @Test
    public static void Negative(String text1) {
        
         String[] numbersArray = text1.split(",");
         int size = numbersArray.length;
         int [] arr = new int [size];
            
        arr[0]= Integer.parseInt(numbersArray[0]);
        arr[1]= Integer.parseInt(numbersArray[1]);
        
            if(arr[0]<0 && arr[1]<0){ //We are checking the values of arr whether the values are negative or not
          throw new RuntimeException("Negatives no not allowed"); //If both the values are  negative then we are throwing an runtime exception
                                 }
            }
    
    @Test
    public static void Unknownamountofnumbers(String text) {// In this line Unknownamountofnumbers method takes text as string parameter
    
        String[] numbersArray = text.split(",");//In line 40, we check if any delimeter is there the function will split the numbers 
        if (numbersArray.length !=0) {//In line 41 , I am checking whether the lenth should not be equal to 0
           
            int size=numbersArray.length;//In line 43 we are storing the length of array in int size
            int [] arr=new int[size];//In line 44 , I have created an Integar array of size (the size of numbersArray)
            int sum=0;// In the line 45, I have created a variable of Integer name sum whihc i have assigned a value zero.
            
            for(int i=0;i<size;i++){
               arr[i]= Integer.parseInt(numbersArray[i]);// In line 47 I have created a for loop where I am converting the string array into integer array
               sum=sum+arr[i];//The sum of the numbers will be added here
            }
            System.out.println(sum);// We are printing the sum 
            
            
        } else {
            for (String number : numbersArray) {
                Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
    
          }
    }
    
    @Test
    public static int newline(final String numbers) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(",|n"); // Added |n to the split regex
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            returnValue += Integer.parseInt(number.trim());
        }
    }
    return returnValue;
}
    
    
  
}
