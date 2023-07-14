package project_package;

public class Administrator {
    public Classroom createClassroom(String className) {
        // Implementation to create a classroom
        Classroom classroom = new Classroom(className);
        // Add classroom to the database or any other necessary operations
        return classroom;
    }
    public Teacher createTeacher(String teacherName) {
        // Implementation to create a teacher
        Teacher teacher = new Teacher(teacherName);
        // Add teacher to the database or any other necessary operations
        return teacher;
    }
    public Student createStudent(int studentId, String studentName, Classroom classroom) {
        // Implementation to create a student and assign them to a classroom
        Student student = new Student();
        classroom.addStudent(student);
        // Add student to the database or any other necessary operations
        return student;
    }
    public void addSubjectToTeacher(String subject, Teacher teacher) {
        // Implementation to add a subject to a teacher
        teacher.addSubject(subject);
        // Update teacher in the database or any other necessary operations
    }
}
