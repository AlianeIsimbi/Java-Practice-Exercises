public class Student {
    private String name;
    private double[][] grades;

    private static int studentCount = 0;

    public Student(String name, double[][] grades) {
        this.name = name;
        this.grades = grades;
        studentCount++; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[][] getGrades() {
        return grades;
    }

    public void setGrades(double[][] grades) {
        this.grades = grades;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public double calculateAverage() {
        double total = 0;
        int count = 0;

        for (double[] subjectGrades : grades) {
            for (double grade : subjectGrades) {
                total += grade;
                count++;
            }
        }

        return count == 0 ? 0 : total / count;
    }

    public void printNameUppercase() {
        System.out.println("Student Name: " + name.toUpperCase());
    }

    public void displayGrades() {
        System.out.println("Grades for " + name + ":");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showResult() {
        double avg = calculateAverage();
        if (avg >= 50) {
            System.out.println("Result: PASS (" + avg + ")");
        } else {
            System.out.println("Result: FAIL (" + avg + ")");
        }
    }
    
    public static void main(String[] args) {
        double[][] grades1 = {
            {60, 70, 80},   // Subject 1
            {50, 40, 90}    // Subject 2
        };

        double[][] grades2 = {
            {30, 45, 55},   // Subject 1
            {60, 35, 40}    // Subject 2
        };

        Student s1 = new Student("Aliane", grades1);
        Student s2 = new Student("John", grades2);

        s1.printNameUppercase();
        s1.displayGrades();
        s1.showResult();

        System.out.println();

        s2.printNameUppercase();
        s2.displayGrades();
        s2.showResult();

        System.out.println("\nTotal Students: " + Student.getStudentCount());
    }


    
}
