import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void getAverageForStudent1() {
        Student s1 = new Student();
        s1.setMarks1(100);
        s1.setMarks2(100);
        s1.setMarks3(100);
        double avg =  s1.getAverage();
        System.out.println (avg);
        double expectedResult = 100;
        assertEquals(expectedResult,avg, 0);
    }
    @org.junit.Test
    public void getAverageForStudent2() {
        Student s2 = new Student();
        s2.setMarks1(50.78);
        s2.setMarks2(36.77);
        s2.setMarks3(40.87);
        double avg =  s2.getAverage();
        System.out.println (avg);
        double expectedResult = 42.806;
        assertEquals(expectedResult,avg, 0.2);
    }

}