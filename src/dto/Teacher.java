package dto;

public class Teacher extends Person{
    private String teacherCode;
    private int yearsOftExperience;
    public Teacher(){}


    public Teacher(String name, String lastName, int age, String teacherCode, int yearsOftExperience) {
        super(name, lastName, age);
        this.teacherCode = teacherCode;
        this.yearsOftExperience = yearsOftExperience;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public int getYearsOftExperience() {
        return yearsOftExperience;
    }

    public void setYearsOftExperience(int yearsOftExperience) {
        this.yearsOftExperience = yearsOftExperience;
    }
}
