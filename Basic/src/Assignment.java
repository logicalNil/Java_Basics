import java.util.ArrayList;
import java.time.LocalDate;

public class Assignment {
    private String name;
    private LocalDate dueDate;
    private boolean completed;

    public Assignment(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

class Student {
    private ArrayList<Assignment> assignments;

    public Student() {
        this.assignments = new ArrayList<Assignment>();
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void markAssignmentAsCompleted(String assignmentName) {
        for (Assignment assignment : assignments) {
            if (assignment.getName().equals(assignmentName)) {
                assignment.setCompleted(true);
                return;
            }
        }
        System.out.println("Assignment not found.");
    }

    public void displayAssignments() {
        System.out.println("Assignments:");
        for (Assignment assignment : assignments) {
            String status = assignment.isCompleted() ? "Completed" : "Not completed";
            System.out.println("- " + assignment.getName() + " (Due Date: " + assignment.getDueDate() + ", " + status + ")");
        }
    }

    public static void main(String[] args) {
        Student student = new Student();

        // Add some assignments
        student.addAssignment(new Assignment("Assignment 1", LocalDate.of(2023, 3, 31)));
        student.addAssignment(new Assignment("Assignment 2", LocalDate.of(2023, 4, 7)));
        student.addAssignment(new Assignment("Assignment 3", LocalDate.of(2023, 4, 14)));

        // Mark an assignment as completed
        student.markAssignmentAsCompleted("Assignment 1");

        // Display the list of assignments
        student.displayAssignments();
    }
}
