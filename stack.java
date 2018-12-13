/*
* Frank Fiumara
* CSI/CEN 213
* Stack implementation*/

import java.util.*;
public class stack {

    private int maximum;
    private String[] arr;
    private int location;

    public static void main(String[] args){
        stack instance = new stack(5);
        /*Pushes values onto the stack based on the instance created with
        * a maximum of 5 in the stack*/
        instance.push("The first value");
        System.out.println(Arrays.toString(instance.arr));
        instance.push("The second value");
        System.out.println(Arrays.toString(instance.arr));
        instance.push("The third value");
        System.out.println(Arrays.toString(instance.arr));
        instance.push("The fourth value");
        System.out.println(Arrays.toString(instance.arr));
        instance.push("The fifth value");
        System.out.println(Arrays.toString(instance.arr));
/*
* Since this stack is pre-organized to contain 5 pushes,
* there is no need for a fullStack instance sine the stack will
* never exceed the stack size.
* If this were the case, In another while loop, there would be an exception
* if the stack was pushed with maximum value.*/

            while(!instance.emptyStack()){
                    String state = instance.pop();
                    System.out.print(state);
                    System.out.println(" ");
                    /*While the stack is not empty, pop each value of the stack
                    * until the stack is empty and print each value.*/
                }

    }
    private stack(int cStack){
        maximum = cStack;
        arr = new String[maximum];
        location = -1;
        /*Constructor for the stack class in order to declare values for the array,
        * maximum and minimum in the stack. Location is at -1 to avoid an overflow. */
    }
    private String pop(){
        return arr[location--];
        /*Returns the value of the location in the array -1 from the original
        * and acts as a pop to the value to move onto the one underneath*/
    }
    private void push(String p){
        arr[++location] = p;
        /*Allows the stack to start at some value (-1) and move upwards placing
        * other values sequentially in the array.*/
    }
    private boolean fullStack(){
        return location == maximum-1;
        /*Not necessary in this scenario but, avoids a stack overflow by returning the stack
        * to one value lesser than the max height of the stack.*/
    }

    private boolean emptyStack(){
         return location == -1;
         /*This indicates the stack is empty when the location in -1 to
         * account for the maximum stack being -1 from the maximum to
         * account for underflow and overflow.*/
    }
}
