

/*This is dropout class.
 * It is the one of the sub-class of the class named Student.
 * * As the requirment of the project I have created a constructor,getter method and method which have differernt results.
 */
public class Dropout extends Student {
    //All the required attributes are decleared as the instance variables.
    private int numOfRemainingModules;
    private int numOfMonthAttended;
    private String dateOfDropout;
    private double remainingAmount;
    private boolean hasPaid;
    //As the requirement of the project a constructor is introduced which contain the 10 different parameters which also include the different attributes of the parent class attributes.
    //In this method we have called the constructor of the parent class using super(parameter).
    public Dropout(
            String dateOfBirth,
            String courseName,
            int enrollmentId,String dateOfEnrollment,String studentName,double courseDuration,double tuitionFee,int numOfRemainingModules,
            int numOfMonthAttended,String dateOfDropout){
        super(dateOfBirth,studentName ,courseDuration,tuitionFee); //It calls the constructor of the parent class.
        //Here I call the 3 setter method of the parent class.
        super.setCourseName(courseName);
        super.setEnrollmentId(enrollmentId);
        super.setDateOfEnrollment(dateOfEnrollment);
        //Here I assign the value for the instance variable.
        this.numOfRemainingModules=numOfRemainingModules;
        this.numOfMonthAttended=numOfMonthAttended;
        this.dateOfDropout=dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid=false;
    }

    //As the requirement of the project I have created the getter method for all the attributes of the Dropout class.
    public int getNumOfRemainingModules(){
        return numOfRemainingModules; //return the value of numOfRemainingModules.
    }

    public int getNumOfMonthAttended(){
        return numOfMonthAttended; //return the value of numOfRemainingModules.
    }

    public String getDateOfDropout(){
        return dateOfDropout; //return the value of dateOfDropout.
    }

    public double getRemainingAmount(){
        return remainingAmount; //return the value of remainingAmount.
    }

    public boolean getHasPaid(){
        return hasPaid; //return the value of haspaid.
    }

    //I have created the method name billsPayable.
    //This method calculate the remaining amount and display the result as the condition of the project.
    public void billsPayable(){
        remainingAmount=(getCourseDuration()-numOfMonthAttended) * getTuitionFee(); // formula has been provided in the project.
        //The given condition follows from here.
        if(remainingAmount <= 0){
            hasPaid=true;
        }else{
            hasPaid = false;
        }
    }

    //I have created the method removeStudent.
    //This method check the value of hasPaid and display the result.
    public void removeStudent(){
        if(hasPaid==true){
            setDateOfBirth("");
            setCourseName("");
            setStudentName("");
            setCourseDuration(0);
            setDateOfEnrollment("");
            setTuitionFee(0);
            this.dateOfDropout="";
            setEnrollmentId(0);
            this.numOfRemainingModules=0;
            this.numOfMonthAttended=0;
        }
        else{
            System.out.println("Your bill is not clear.Please clear it first");
        }
    }

    //Here i have created a display method as the requirement of the project.
    //This method call the display method of parent class and also it print the instance variable.
    public void display(){
        super.display();//It call the display method of parent class.
        //Now it prints the instance variable.
        System.out.println("Number of Remaining Modules"+numOfRemainingModules);
        System.out.println("Number of Month Attended"+numOfMonthAttended);
        System.out.println("Remaining Amount"+remainingAmount);
        System.out.println("Date of Dropout"+dateOfDropout);
    }
}
