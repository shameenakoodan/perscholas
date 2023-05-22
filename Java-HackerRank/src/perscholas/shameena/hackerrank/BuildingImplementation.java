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
class School implements Building{
	int floors[];
	School(int n) {
		// TODO Auto-generated constructor stub
		floors = new int[n];
		Arrays.fill(floors,0);
        System.out.println("A school is being constructed");
	}
	@Override
	public void floorCompleted(int floorNumber) {
		int n = floors.length;
		if(floorNumber<=n) {
			floors[floorNumber-1] = 1;
			System.out.println("Construction for floor number "+floorNumber+" completed in school");
		}
		else {
            System.out.println("Floor number "+floorNumber + " does not exist in school");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatus(int floorNumber) {
		int n = floors.length;
		if(floorNumber>=n)
		{
            System.out.println("Floor number "+floorNumber + " does not exist in school");
		}
		else if(floors[floorNumber-1] == 1)
            System.out.println("Construction for floor number "+floorNumber+ " completed in school");
		else {
			System.out.println("Construction for floor number "+floorNumber+ " not completed in school");
		}
		
	}

	@Override
	public void printNumberOfFloors() {
        System.out.println("The school has "+floors.length+" floors");		
	}
	
}
class Hospital implements Building{
	int floors[];
	Hospital(int n) {
		// TODO Auto-generated constructor stub
		floors = new int[n];
		Arrays.fill(floors,0);
        System.out.println("A hospital is being constructed");
	}
	@Override
	public void floorCompleted(int floorNumber) {
		int n = floors.length;
		if(floorNumber<=n) {
			floors[floorNumber-1] = 1;
			System.out.println("Construction for floor number "+floorNumber+" completed in hospital");
		}
		else {
            System.out.println("Floor number "+floorNumber + " does not exist in hospital");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatus(int floorNumber) {
		int n = floors.length-1;
		if(floorNumber>n) {
            System.out.println("Floor number "+floorNumber + " does not exist in hospital");
		}
		else if(floors[floorNumber-1] == 1)
            System.out.println("Construction for floor number "+floorNumber+ " completed in hospital");
		else {
			System.out.println("Construction for floor number "+floorNumber+ " not completed in hospital");
		}
		
	}

	@Override
	public void printNumberOfFloors() {
        System.out.println("The hospital has "+floors.length+" floors");		
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