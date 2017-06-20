/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author spencercook
 */
public class ClassRecord {

    private String name;
    private int grade;
    private String teacher;
    public static final int NAME_LENGTH = 10;
    public static final int TEACHER_LENGTH = 12;
    public static final int LENGTH = (NAME_LENGTH * 2) + (TEACHER_LENGTH * 2) + 4;

    public ClassRecord(String name, int grade, String teacher) {
        setName(name);
        setGrade(grade);
        setTeacher(teacher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        StringBuilder str = new StringBuilder();
        str.append(name.trim());
        str.setLength(NAME_LENGTH);
        this.name = new String(str);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        StringBuilder str = new StringBuilder();
        str.append(teacher.trim());
        str.setLength(TEACHER_LENGTH);
        this.teacher = new String(str);
    }

}
