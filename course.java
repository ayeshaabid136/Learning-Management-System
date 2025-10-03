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

    //Main.java
public static void main(String[] args) {

    course C1 = new course("OOPS" , 101);
course C2 = new course("DLD" , 102);
course C3 new course("CPS" , 103);

C1.setcourseName("OOPS");
C1.getcourseName();
C2.setcourseCode(101);
C2.getcourseCode();
 System.out.println(C1);
}
}
