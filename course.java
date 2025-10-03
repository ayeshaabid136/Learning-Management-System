public class course implements Cloneable{
    private String courseName;
    private int courseCode; 

    //NULL CONSTRUCTOR
    public course() {
       this.courseName = "unknown";
       this.courseCode = 0;
    }

    //parametrized constructor 
    public course(String courseName,int courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    //copy constructor
    public course(course other){
        this.courseName= other.courseName;
        this.courseCode= other.courseCode;
    }

    //setter
    public void setcourseName(String  courseName){
        this.courseName=courseName;
    }

    public void setcourseCode(int courseCode){
        this.courseCode=courseCode;
    }

    //getter
    public String getcourseName(){
        return courseName;
    }

    public int getcourseCode(){
        return courseCode;
    }

    //cloning
    public course Clone()
throws CloneNotSupportedException{
return super.clone();
}

//@override
public String toString(){
    return "courseName=" +courseName+ ,"lncourseCode=" +courseCode;
} 
