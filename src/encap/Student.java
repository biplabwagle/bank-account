package encap;

public class Student {
    /*
        The purpose of encapsulation is to hide the data members
        The most efficient way of implementing encapsulation is to
        hide the data members of a class by making them private
        and providing public methods as a means of accessors and
        mutators to these data members
     */
    //Here lets make the data members private so that
    //they cannot be accessed from outside.
    //They are going to be private fields which can be set
    //only by using setter methods
    private String studentName;
    private String studentId;

    //setters or mutators
    public void setStudentName(String name){
        this.studentName = studentName;
    }

    //getters or accessors
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String getStudentId(){
        return this.studentId;
    }
}
