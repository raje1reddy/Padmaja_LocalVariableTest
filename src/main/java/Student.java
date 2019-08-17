import java.util.Scanner;

class Student {
    private double marks1, marks2, marks3;
    private double maxMarks = 100;
    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(double marks3) {
        this.marks3 = marks3;
    }


    public double getAverage() {
        double avg = 0;
        avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
        return avg;
    }
    //This code won't compile because avg is inaccessible outside te method  getAverage
//    public void setAverage(double val) {
//        avg = val;
//    }

}