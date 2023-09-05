package class9;

public class T3Array {
    public static void main(String[] args) {
        String[][] students = {
                {"Ashley", "Micaela", "Betse", "Mann", "Ish"},
                {"A", "A+", "C", "B", "B+"}
        };
        for (int i = 0; i < 4; i++) {
            if (students[1][i].equals("C") || students[1][i].equals("B"))
                System.out.println(students[0][i]);
        }
    }}


