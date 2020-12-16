
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Student
{
    String stud_name;
    String id_number;
    double cgpa;
    String course_name;
    String status;
    
    public Student()
    {
    }
    
    public Student(String name, String id, double cgpa, String course)
    {
        stud_name = name;
        id_number = id;
        this.cgpa = cgpa;
        course_name = course;
    }
    
    public void setData(String name, String id, double cgpa, String course)
    {
        stud_name = name;
        id_number = id;
        this.cgpa = cgpa;
        course_name = course;
    }
    
    public void setName(String nm)
    {
        stud_name = nm;
    }
    
    public void setId(String id)
    {
        id_number = id;
    }
    
    public void setCgpa(double cgpa)
    {
        this.cgpa = cgpa;
    }
    
    public void setCourse(String course)
    {
        course_name = course;
    }
    
    public String FindStatus()
    {
        if (cgpa >= 2.00)
            status = "PASS";
       
        
        if (1.8 <= cgpa && cgpa < 2.00)
            status = "PROBITION";
            
        if (cgpa < 1.8)
            status = "FAIL";
            
        return status;    
    }
    
    public String toString()
    {
        return "Student Name: " + stud_name +
               "\nId number: " + id_number +
               "\nCGPA: " + cgpa +
               "\nStatus: " + FindStatus();
    }
}
