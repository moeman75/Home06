/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gmoe
 */
public class TrainTest
{
    public static void main(String[] args) throws FileNotFoundException
    {
        
        //setup the file class the input a text document
        File inputFile = new File("passenger.txt");
        
        //initialize the scanner class to input the grades.txt file
        Scanner scan = new Scanner(inputFile);
        
        int b = 0;
        
        while(scan.hasNext())
        {   
            System.out.println("" + scan.nextLine());
            b++; 
        }
        System.out.println(b);
    
        Object [] a = new Passenger [b];
    
        Train train = new Train();
    
        for (int i = 0; i < a.length; i++) 
        {
            if(scan.hasNext())
            {
                a[i] = scan.nextLine();
                train.addPassenger((Passenger) a[i]);
            }
        }   

        System.out.println(train.getPassenger(0));
    
        System.out.println(train.getNumberOfPassengers());
    
        System.out.println(train.getFirstClass());
    
        System.out.println(train.getRevenue(20,10));
    
        System.out.println(train.isAPassenger("james"));
    
        System.out.println(train.toString());
    
        System.out.println(train.equals(train));
    }
}

