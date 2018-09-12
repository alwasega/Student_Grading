/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savich_projects;
import java.util.*;
public class StudentRecord 
{
    //instance variables
    private double quizzes;
    private double midterm;
    private double finalScore;
    protected double overalScore;
    private char grade;
    
    //default constructor
    public StudentRecord()
    {
        
    }
    //Mutator methods for instance variable quizzes
    public void setQuizzes(int quiz1, int quiz2, int quiz3)
    {
        double quizz1 = quiz1;
        double quizz2 = quiz2;
        double quizz3 = quiz3;
        quizzes = (((quizz1+quizz2+quizz3)/3)*25)/100;       
    }
    public double getQuizzes()
    {
        return quizzes;
        //Accounts for 25% of the total grade
    }
    
    //Mutator methods for instance variable midterm
    public void setMidterm(int mid)
    {
        midterm = (mid*35)/100;
    }
    public double getMidterm()
    {
        return midterm;
        //Accounts for 35% of the final grade
    }
    
    //Mutator methods for instance variable finalScore
    public void setFinalScore(int score)
    {
        finalScore = (score*40)/100;
    }
    public double getFinalScore()
    {
        return finalScore;
        //Accounts for 40% of the final grade
    }
    
    //Accessor method for variable overalScore
    public double getOveralScore()
    {
        overalScore = quizzes + midterm + finalScore;
        return overalScore;
    }
    
    //Mutator methods for variable grade
    public void setGrade( double number)
    {
        overalScore = number;
        if (overalScore>=90)
            grade = 'A';
        if (overalScore>=80 && overalScore<90)
            grade = 'B';
        if (overalScore>=70 && overalScore<80)
            grade = 'C';
        if (overalScore>=60 && overalScore<70)
            grade = 'D';
        if (overalScore<60)
            grade= 'F';        
    }
    public char getGrade()
    {
        return grade;
    }
    
    //main method
    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
        StudentRecord aStudent = new StudentRecord();
        
        System.out.println("Enter the quizz scores:");
        int quiz1 = input.nextInt();
        int quiz2 = input.nextInt();
        int quiz3 = input.nextInt();
        aStudent.setQuizzes(quiz1, quiz2, quiz3);
        System.out.printf("The overal quiz score is %.2f\n", aStudent.getQuizzes());
        
        System.out.println("Enter the Midterm score:");
        int mid = input.nextInt();
        aStudent.setMidterm(mid);
        System.out.printf("The overal midterm score is %.2f\n", aStudent.getMidterm());
        
         System.out.println("Enter the final exam score:");
         int score = input.nextInt();
         aStudent.setFinalScore(score);
         System.out.printf("The final exam score is %.2f\n", aStudent.getFinalScore());
         
         aStudent.setGrade(aStudent.getOveralScore());
         
         System.out.printf("The overal score of the student is %.2f\n", aStudent.getOveralScore());
         System.out.println("And the grade scored is "+ aStudent.getGrade());
         
    } 
}

