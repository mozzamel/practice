package method;

public class OopConcept {
   
    public static void main(String[] args) {
        String grade;
        grade= findGrade(90);
        displayGrade("john", grade);

    }
    public  static  String findGrade( int score){
        String grade=null;

        if(score>=90 && score <=100){
            grade ="A";
        }else if (score>=80 && score<=90){
            grade = "B";
        } else if (score >= 70 && score <= 80) {
            grade = "C";
        }else {
            System.out.println("don't have a grade");
        }
        return grade;
        
    }
    public static void displayGrade(String studentName, String grade){
        System.out.println("########");
        System.out.println("grade of " +studentName+" "+grade);
    }
}
