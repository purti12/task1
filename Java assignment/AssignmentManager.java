/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaAssignment;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.*;

class Student {

    String name;
    int prnNo;

    public void Student(String name, int prnNo) {
        this.name = name;
        this.prnNo = prnNo;
    }

    
    private void StudentDetails() {

        System.out.println("StudentDetails");
        System.out.println("name=" + name + "prnNO:" + prnNo);
    }
    }


class Trainer {

    String name;

    public Trainer(String name) {
        this.name = name;
    }

    void TrainerDetails() {
        System.out.println("Trainer Name:" + name);
      
        
    }

}

class Assignment extends Student {

    String Title;
    String Date;
    String Description;
    String Assignee;

    public Assignment(String Title, String Date, String Description, String Assignee) {
        this.Title = Title;
        this.Date = Date;
        this.Description = Description;
        this.Assignee = Assignee;
    }
    void AssignmentDetails(){
        System.out.println("Tiles of assignment"+Title);
        
          Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
        String str=sdf.format(d);
        
        System.out.println(str);
        
         try{
            Path path=Paths.get("C:\\Users\\hp\\Desktop\\pu\\pu.txt");
            
            String content="Soft Polynomials Pvt Ltd,Nagpur";
            //for(int i=0;i<10;i++)
                Files.write(path,content.getBytes(),StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Completed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        
    }
        System.out.println("Assignee name"+Assignee);
         

}
}

public class AssignmentManager {

    public static void main(String[] args) 
    {
        AssignmentManager am=new AssignmentManager();

   
        
        

        Map<Integer, String> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Student assignment management system");
        System.out.println("enter your choice");
        System.out.println("1:create assignment");
        System.out.println("2: Add assignment to collection");
        System.out.println("3:Show assigment");
        System.out.println("4: save assignment to files");
        System.out.println("5: Load assignment to files");
        System.out.println("6:Exit");

        int choice = sc.nextInt();
        
        String name;
        int prnNo;
        while (true) {
            switch (choice) {
                case 1:
                    try {
                    Path p = Paths.get("C:\\Users\\hp\\Desktop\\pu");
                    Path p1 = Files.createFile(p);
                    System.out.println("File created");
                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }

                break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                   
                   

                    break;
                case 5:
                    try {
                    Path path = Paths.get("C:\\Users\\hp\\Desktop\\pu\\pu.txt");
                    List<String> lst = Files.readAllLines(path);
                    for (String str : lst) {
                        System.out.println(str);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                    break;
                    
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Choose correct option");

            }
  
        }
    }

}

