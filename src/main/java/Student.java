import java.util.Scanner;

class Student {
    private double marks1, marks2, marks3;
    //private double maxMarks = 100;
    public static void main(String[] args) {
            double maxMarks = 100;
            System.out.println("Enter number of subjects");
            Scanner sc = new Scanner(System.in);
            double n = sc.nextDouble();
            double[] marks = new double[3];
            System.out.println("Enter marks");
            for (int i = 0; i < n; i++) {
                marks[i] = sc.nextDouble();
            }
            double avg = 0;
            avg = ((marks[0] + marks[1] + marks[2]) / (maxMarks * 3)) * 100;
            System.out.println(avg);

        }



    public void setAverage(double val) {
        double avg = val;
    }

}