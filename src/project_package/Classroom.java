package project_package;

import java.util.*;


public class Classroom {
    private String name;
    private List<Student> students;
    private Map<String, String> subjectNotes;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.subjectNotes = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<String, String> getSubjectNotes() {
        return subjectNotes;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setSubjectNotes(Map<String, String> subjectNotes) {
        this.subjectNotes = subjectNotes;
    }

    public void addStudent(Student student) {
        // Implementation to add a student to the classroom
        students.add(student);
    }

    public void addNotes(String subject, String notes) {
        // Implementation to add notes for a subject in the classroom
        subjectNotes.put(subject, notes);
    }

    public String getNotes(String subject) {
        // Implementation to retrieve the notes for a subject in the classroom
        return subjectNotes.getOrDefault(subject, "");
    }
}