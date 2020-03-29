package lab03;

/**
 *
 * @author wm41547
 */
public class Teacher extends Person{
    
    private String courseName;
   
    public Teacher(String firstName, String lastName, String emailAddress, String courseName){
        super(firstName, lastName, emailAddress);
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    /*
    @Override
    public String toString(){
        return super.toString() + " " + courseName;
    }
    */
}
