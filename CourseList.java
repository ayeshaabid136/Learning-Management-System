import java.util.ArrayList;

public class CourseList implements Cloneable{
public list<course> courses = new ArrayList<>();
 
//null constructor
    public CourseList() {
        this.CourseList = new ArrayList<>();
    }

    //paramerized constructor
    public CourseList(List<course> courses){
        this.CourseList = new ArrayList<>();
    }

    //copy constructor
    public CourseList(course other){
        this.CourseList = new ArrayList<>();
        for (Course c : other.courses){
            this.courses.add(new course(c));
        }
    }

    //add course
    public boolean addCourse(Courses course){
        if(Courses.contains(course)){
            return false;
        }
        else{
            Courses.add(course);
            return true;
        }
    } 

        //remove course
        public boolean removeCourse(Courses course){
            if(Courses.contains(course)){
                Courses.remove(course);
                return true;
            }
            else{
                return false;
            }
        }

        //search course by name 
        public searchCourse(String courseName){
            for(course c : Courses){
                if(c.getcourseName().equalsIgnoreCase(courseName)){
                    return c;
                    
                    }
                }
                return null;
            }

        //clone
        public Object Clone()
        throws CloneNotSupportedException{
          super.clone();
        }

        //@override
        public String toString(){
            return("COURSELIST:" +courses.toString());
        }


        //main.java
        public static void main(String[] args) {
            CourseList courseList = new CourseList();
            
            //courses add
     courseList.addCourse(new Course("DISCRETE STRUCTURE"));
     courseList.addCourse(new Course("ENGLISH"));

            //search
     Course result = courseList.searchCourse("CPS;
      if(result != null)"){
       System.out.println("found: +result");
    }
             else{
       System.out.println("Course Not Found");
   }
        }       
    }   
