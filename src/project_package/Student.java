package project_package;

import java.util.*;


public class Student {
    private int id;
   private String name;
   private Classroom classroom;
   private Map<String, Integer> subjectNotes;

   public Student() {
       this.name = name;
       this.classroom = classroom;
       this.subjectNotes = new HashMap<>();
   }
    public Classroom getClassroom() {
       return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addSubjectNotes(String subject, int notes) {
       // Implementation to add notes for a subject
       subjectNotes.put(subject, notes);
   }

   public int getSubjectNotes(String subject) {
       // Implementation to retrieve the notes for a subject
       return subjectNotes.getOrDefault(subject, 0);
   }
}

