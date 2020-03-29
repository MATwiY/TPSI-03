package lab03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wm41547
 */
public class Faculty implements EmailRecipient {
    private String name;
    private List<Teacher> teachers = new ArrayList<>();
    private String emailAddress;
    
    public Faculty(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
    }
    
    public void addTeacher(Teacher obj){
        teachers.add(obj);
    }
    
    public List<Teacher> getTeacher(){
        return teachers;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getEmailAddress(){
        return emailAddress;
    }
    
}
