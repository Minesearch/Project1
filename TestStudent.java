
/**
 * Write a description of class TestStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import javax.swing.*;
public class TestStudent
{
    static Scanner student = new Scanner(System.in);
    
    public static void main (String[] args)
    {
        String str, name, id, course;
        double cgpa;
        
        Student stud1 = new Student();
        stud1.setData ("Muhammad Ibrahim","COV12323232", 3.32, "Computer Science");
        JOptionPane.showMessageDialog(null,stud1.toString());
        
        Student stud2 = new Student("Farhana Salleh", "COV141242141", 2.85, "Accounting");
        JOptionPane.showMessageDialog(null,stud2.toString());
        
        stud1.setCgpa(2.8);
        JOptionPane.showMessageDialog(null,stud1.toString());
        
        stud2.setCgpa(1.5);
        JOptionPane.showMessageDialog(null,stud2.toString());
        
        Student stud3 = new Student();
        
        name = JOptionPane.showInputDialog("Enter Name: ");
        stud3.setName(name);
        
        id = JOptionPane.showInputDialog("Enter Id number: ");
        stud3.setId(id);
        
        str = JOptionPane.showInputDialog("Enter CGPA: ");
        cgpa = Double.parseDouble(str);
        stud3.setCgpa(cgpa);
        
        JOptionPane.showMessageDialog(null,stud3.toString());
    }
}
