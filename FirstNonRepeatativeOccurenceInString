/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
public class Main
{

    public static void main(String[] args) {
        String string = "geeksgeekffs";
        int index = -1;
        char fnc = ' ';
       
       if(string.length()==0){
         System.out.println("EMPTY STRING");
       }
       //g==
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == string.length()-1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("First non-repeating character is " + fnc);
        }
    }
}
