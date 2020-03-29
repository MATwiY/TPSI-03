package lab03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wm41547
 */
public class Student extends Person{
    
    private String groupId;
    private List<Double> grades = new ArrayList<>();
    
    
    public Student(String firstName, String lastName, String emailAddress, String groupId){
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
    }
    
    public String getGroupId(){
        return groupId;
    }
    
    public void setGroupId(String groupId){
        this.groupId = groupId;
    }
    
    public List<Double> getGrades(){
        return grades;
    }
    
    public void addGrades(double grade){
        grades.add(grade);
    }
    
    public double getGradesAverage(){
        double av = 0;
        if(grades.isEmpty() == true)
        {
            return av;
        }else{
            int size = grades.size();
            for(int i = 0; i < size; i++){
                av = av + grades.get(i);
            }
            av = av/size;
            return av;
        }
        
    }
}
