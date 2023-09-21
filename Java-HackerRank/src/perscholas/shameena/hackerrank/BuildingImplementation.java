package perscholas.shameena.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface Building{
    void floorCompleted(int floorNumber);
    void printStatus(int floorNumber);
    void printNumberOfFloors();
}

/* model output for cut and paste
A ____ is being constructed
Construction for floor number ____ completed in ____
Floor number ____ does not exist in ____
Construction for floor number ____ completed in ____
Construction for floor number ____ not completed in ____ 
The ____ has ____ floors
*/

class School implements Building{
    ArrayList<Integer> floors;
    School(int n){
        super();
        floors = new ArrayList<>(Collections.nCopies(n+1, 0));
        System.out.println("A school is being constructed");
    }
   @Override
    public void floorCompleted(int floorNumber){
        int n= floors.size();     
        if(floorNumber<=n && floorNumber>0){
            floors.set(floorNumber, 1);
            System.out.println("Construction for floor number "+floorNumber+ " completed in school");
        }
        else if(floorNumber>n){
            System.out.println("Floor number "+floorNumber + " does not exist in school");
        }
    }
    @Override
    public void printStatus(int floorNumber){
        int n = floors.size();
        if(floorNumber>n)
            System.out.println("Floor number "+floorNumber + " does not exist in school");
        else if(floorNumber >=0 && floors.get(floorNumber)==1)
        System.out.println("Construction for floor number "+floorNumber+ " completed in school");
        else if(floorNumber >=0 && floors.get(floorNumber)==0)
            System.out.println("Construction for floor number "+floorNumber+ " not completed in school");
    }
    @Override
    public void printNumberOfFloors(){
            System.out.println("The school has "+(floors.size()-1)+" floors");
    }
}
class Hospital implements Building{
	ArrayList<Integer> floors = new  ArrayList<Integer>();
    Hospital(int n){
        floors = new ArrayList<>(Collections.nCopies(n+1, 0));
        System.out.println("A hospital is being constructed");
    }
    @Override
    public void floorCompleted(int floorNumber){
        int n = floors.size();  
        if(floorNumber>=n)      
            System.out.println("Floor number "+floorNumber + " does not exist in hospital");
        else if(floorNumber >0 && floorNumber<n){
            floors.set(floorNumber, 1);
            System.out.println("Construction for floor number "+floorNumber+ " completed in hospital");
            
        }
    }
    @Override
    public void printStatus(int floorNumber){
        int n = floors.size();
        if(floorNumber>=n)
            System.out.println("Floor number "+floorNumber + " does not exist in hospital");
        else if(floorNumber >=0 && floors.get(floorNumber)==1)
        System.out.println("Construction for floor number "+floorNumber+ " completed in hospital");
        else if(floorNumber >=0 && floors.get(floorNumber)==0)
            System.out.println("Construction for floor number "+floorNumber+ " not completed in hospital");
    }
    @Override
    public void printNumberOfFloors(){
        System.out.println("The hospital has "+(floors.size()-1)+" floors");

    }
}
public class BuildingImplementation {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] floors = sc.nextLine().split(" ");

        School s = new School(Integer.parseInt(floors[0]));
        Hospital h = new Hospital(Integer.parseInt(floors[1]));
        s.printNumberOfFloors();
        h.printNumberOfFloors();

        String[] floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.printStatus(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.printStatus(Integer.parseInt(floorNumbers[i]));
        }
    }
}