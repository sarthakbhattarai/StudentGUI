

/**
 * This is the student class.
 * It is the parent class which have the tow sub-class named Regular and Dropout.
 * In this project we have used the concept of the encapsulation.
 * As the requirment of the project I have created a constructor,getter method,setter method and method which have differernt results.
 */
public class Student {
    //All the required attributes are decleared as the instance variables.
    private int enrollmentId;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private double tuitionFee;
    private double courseDuration;//courseDuration is given in month.

    //As the requirement of the project a constructor is introduced which contain the 4 different parameters.
    public Student(String dateOfBirth, String studentName ,
                   double courseDuration,double tuitionFee){
        //According to the requirement of the project different variable are assign the value empty and the null.
        this.courseName="";
        this.dateOfEnrollment="";
        this.enrollmentId=0;
        //Also the remaining variable are assign the same value as they are.
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee=tuitionFee;
        this.dateOfBirth=dateOfBirth;
    }

    //As in the project there is necessary to create the accessor method i.e. getter method.
    //This getter method help to access the private variable in different sub-class.
    public int getEnrollmentId(){
        return enrollmentId;//it return the value of the enrollmentId
    }

    public String getDateOfBirth(){
        return dateOfBirth;//it return the value of the dateOfBirth
    }

    public String getCourseName(){
        return courseName;//it return the value of the courseName
    }

    public String getStudentName(){
        return studentName;//it return the value of the studentName
    }

    public String getDateOfEnrollment(){
        return dateOfEnrollment;//it return the value of the dateOfEnrollment
    }

    public double getTuitionFee(){
        return tuitionFee;//it return the value of the tutionFee
    }

    public double getCourseDuration(){
        return courseDuration;//it return the value of the courseDuration
    }

    //As in the project there is necessary to create the mutator method i.e. setter method.
    //This setter method help to set the value of the private variable in different sub-class.
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public void setCourseDuration(double courseDuration){
        this.courseDuration=courseDuration;
    }

    public void setTuitionFee(double tuitionFee){
        this.tuitionFee=tuitionFee;
    }

    public void setEnrollmentId(int enrollmentId){
        this.enrollmentId=enrollmentId;
    }

    public void setDateOfEnrollment(String dateOfEnrollment){
        this.dateOfEnrollment=dateOfEnrollment;
    }

    //In the project it is asked to create the display method where we check whether the different attributes are filled up propertly or not.
    //if it is filled up properly or not it display the suitable message in both case

    public  void display(){
        if(enrollmentId==0 || dateOfBirth=="" ||  courseName=="" || studentName=="" || dateOfEnrollment=="" || tuitionFee==0 || courseDuration==0){
            System.out.println("Your data is incomplete");
        }
        else{
            System.out.println("EnrollmentId :"+enrollmentId);
            System.out.println("Date of Birth :"+dateOfBirth);
            System.out.println("Course Name :"+courseName);
            System.out.println("Student Name :"+studentName);
            System.out.println("Date of Enrollment :"+dateOfEnrollment);
            System.out.println("Tuition Fee :"+tuitionFee);
            System.out.println("Course Duration :"+courseDuration);
        }
    }
}
