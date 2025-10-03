
import java.util.ArrayList;
public class StudentList;

   // public static void main(String[] args) {
     //   ArrayList<String> students = new Arraylist<>()
        
        //adding students 
      //  public void addstudents(student s){
           // students.add(new student(1,"milli"));
           // students.add(new student(2,"sofia"));
          //  students.add(new student(3,"helena"));
     //   }
  //  }

//Removing student by index
//public void removestudent(int i){
   // if(i>=0 && i<students.size()){
      //  students.remove(i);
   // }

//system.out.println(students.get(i));

//}
//}

public class studentlist{
    public list<student> Students = new ArrayList<>();

    // null consstructor
    public studentlist() {
        students = new ArrayList<>();
    }

    //copy constructor
    public studentlist(studentlist other){
        this.students = new ArrayList<>();
        for(student s : other.student){
            this.student.add(new student(s));
        }
    }


    //adding student
    public boolean addstudent(student other){
        if(students.contains(s));
        return false;  //false bcz theirs no student present and we have to add student
        else{
            students.add(new student(s));
            return true;
        }
    }


    //removing student
    public boolean removestudent(student s){
        if(students.contains(s));
        students.remove(s)
        return true;
        else{
            return false;
        }
    }

    //getting all students
    public list<student> getStudents(){
        return students;
    }

    //display
    public void display(){
        system.out.println("Student List:"+s)

    }
    
}