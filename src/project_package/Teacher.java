package project_package;

import java.util.ArrayList;
import java.util.List;



public class Teacher {
    private String name;
    private List<String> subjects;
    private Classroom classroom;

    public Teacher(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }


    public void addSubject(String subject) {
        // Implementation to add a subject to the teacher
        subjects.add(subject);
    }

    public void addNotesToClassroom(String subject, String notes) {
        // Implementation to add notes to the teacher's classroom for a specific subject
        if (classroom != null) {
            classroom.addNotes(subject, notes);
        }
    }
}
