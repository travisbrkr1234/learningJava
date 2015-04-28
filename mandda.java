/* 
* @Author: Jeremiah Marks
* @Date:   2015-04-27 20:44:55
* @Last Modified 2015-04-27
* @Last Modified time: 2015-04-27 21:20:36
*/

/***********************************************************
This application will eventually build a basic calculator
In this itteration we will explore some basic ways to 
set an integer as a variable, experience integer division, 
and demonstrate a basic for loop
***********************************************************/


public class mandda {
    public static void main(String[] args) {
        int firstInteger=0, secondInteger=0;
        double doubleVariable;
        System.out.println(firstInteger + secondInteger);
        System.out.println("\nThis method displays zero because of the fact that the method sees integer addition.\n");
        System.out.println(""+firstInteger+secondInteger);
        System.out.println("\nThis method displays 00 because of the fact that the first thing that was passed to it was a string. Because of that, it will contcat every thing after.\n");
        System.out.println(firstInteger+""+secondInteger);
        System.out.println("\nThis method displays 00 because of the fact that the first variable is treated as an integer, then there is a string, so everything after the string is concatted \n");
        System.out.println(firstInteger+secondInteger+""+firstInteger+secondInteger);
        System.out.println("\nThis method displays 000 because it adds the first two variables, hits the string, and treats everything after that as a string\n\n");
        firstInteger++;
        System.out.println("Incrementing the first integer.  its value is now:  " + firstInteger);
        System.out.println("its value is now actually this value + 1:  " + firstInteger++);  /*This method displays the variable, and then increments it.*/
        System.out.println("its value is now:  " + ++firstInteger); /* where this method increments it then displays it */
        secondInteger = firstInteger++; /*similarly, this method assigns the value of secondInteger to the value of first Integer, and then increments firstInteger */
        System.out.println("firstInteger = " + firstInteger + "\nsecondInteger = " + secondInteger ); /* I am starting to get tired of writing out the whole print thing. lets fix that */
        secondInteger = firstInteger + secondInteger; /*Demonstration that you can use yourself on both sides of the equation*/
        printVars(firstInteger, secondInteger);
        secondInteger = firstInteger / 3; /* the first integer here is 4, so we are setting secondInteger = 4/3 (or about 1.33333, if we were using decimal math)  */
        printVars(firstInteger, secondInteger); /*but we can see that is not what happens.  */
        doubleVariable = firstInteger / 3.0; /*here, since we are working with a float, the division returns a float.*/
        System.out.println(doubleVariable);
        doubleVariable = firstInteger / 3; /*here, even though the container is a double, the math will just turn 1 into 1.0000 */
        System.out.println(doubleVariable);
        for (int t=0;t<=100 ;t++ ) {
            firstInteger = secondInteger + t;
            secondInteger = t*2;
            printVars(firstInteger,secondInteger);
        }
    }

    public static void printVars(int firstInteger, int secondInteger){
        System.out.println("firstInteger = " + firstInteger + "\nsecondInteger = " + secondInteger );
    }
}