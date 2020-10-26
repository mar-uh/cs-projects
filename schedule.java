//Name - Ammaarah Arab

//This program allows a user to enter assignments and how long it will take to complete them. 
//It prints their answers neatly once they say 'n' to stop the program.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class schedule
{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> assignments = new ArrayList<String>();
        List<Double> hours = new ArrayList<>();
     
        while(true){
            System.out.println("Enter the assignment");
            assignments.add(sc.next());
            
            System.out.println("Enter the hours it will take to complete (ex. 2 or .5)");
            hours.add(sc.nextDouble());
        
            System.out.println("Add an assignment? y/n");  

            if(sc.next().equals("n")){
               break;
            }
            
            continue;
        }


        for(int i=0;i<assignments.size();i++){
            System.out.println("Assignment:" + assignments.get(i) + ", Hours:" + hours.get(i));
        }

}}