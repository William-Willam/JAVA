package entities;

public class Student {

    // Atributos
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    // Métodos
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        return 0.0;
    }

    @Override
    public String toString() {

        if (finalGrade() >= 60.0) {
            return "Student: " + name
                    + "\nFINAL GRADE = " + String.format("%.2f", finalGrade())
                    + "\nPASS";
        } else {
            return "Student: " + name
                    + "\nFINAL GRADE = " + String.format("%.2f", finalGrade())
                    + "\nFAILED"
                    + "\nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
        }
    }
}