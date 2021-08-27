import java.util.*;

//Class Show_Charsimulation Declaration
public class Show_CharSimulation
{
//METHOD MAIN
public static void main(String[] args)
{
//passing the word and index value
ShowChar("newyork",2);
}
//method simulates ShowChar()
public static void ShowChar (String Str1, int num_ber)
{
//showing the corresponding result
System.out.println ("the CHARACTER at position " +
num_ber + " of the CITY " + Str1+ " is " + Str1.charAt(num_ber));
}
}