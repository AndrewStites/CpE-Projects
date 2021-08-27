package com.example.test;

import com.example.mypackagechallenge.Series;

public class Main {

    /*to add a new library/package to a new package:
    --delete the Main.java from original package
    --go to file>project structures>artifacts>"plus icon">JAR>"from modules with dependencies..."
    --press ok to save it
    --go to build>build artifacts>build
    --create a new java project or go to the new java project
    --go to file>project structures>libraries>"plus icon">Java
    --find the jar file created and click on it
    --press ok, then apply, then ok again
     */

    public static void main(String[] args) {
	    for (int i = 0; i <= 10; i++)
        {
            System.out.println(Series.nSum(i));
        }

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(Series.factorial(i));
        }

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(Series.fibonacci(i));
        }

    }
}
