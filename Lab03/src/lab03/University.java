package lab03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wm41547
 */
public class University implements EmailRecipient {
    
    private String name;
    private String emailAddress;
    
    private List<Faculty> faculties = new ArrayList<Faculty>();
    
    public University(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
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
    
    public List<Faculty> getFaculties(){
        return faculties;
    }
    
    public void addFaculties(Faculty obj){
        faculties.add(obj);
    }
}
