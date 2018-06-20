package oopConception;

public class MethodsDemo {

    public static void main(String[] args) {

        System.out.println("grade of student" +findScore("john",68));
        System.out.println(findScore("tom",76));

    }
    public static String findScore (String studentName, int score) {
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 90) {
            grade = "B";
        } else if (score >= 70 && score <= 80) {
            grade = "C";
        } else {
            grade = "D";
        }
return grade;

    }

}
