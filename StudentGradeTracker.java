import java.util.Scanner;

public class StudentGradeTracker {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scan.nextInt();
        
        double[] grades = new double[numberOfStudents];

        for(int i=0;i<numberOfStudents;i++) {
            System.out.println("Students grade"+(i+1)+":");
                 grades [i] = scan.nextInt();
                }
                double sum = 0; 
                double highest = Integer.MIN_VALUE;
                double lowest = Integer.MAX_VALUE;
                for(double grade:grades){
                    if(grade>highest){
                        highest = grade;
                    }
                    if(grade<lowest){
                        lowest = grade;
                    }
                    sum+=grade;
                }
                double average = sum/numberOfStudents;
                System.out.println("Average score:"+average);
                System.out.println("Highest score:"+highest);
                System.out.println("Lowest score:"+lowest);
                scan.close();
            }

    
}