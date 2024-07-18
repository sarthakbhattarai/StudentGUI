

/* This is a Regular class.
 * It is the sub-class of the class namely Student.
 * As the requirment of the project I have created a constructor,getter method and method which have differernt results.
 */
public class Regular extends Student {
    //All the required attributes are decleared as the instance variables.
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholorship;

    //As the requirement of the project a constructor is introduced which contain the 10 different parameters which also include the different attributes of the parent class attributes.
    //In this method we have called the constructor of the parent class using super(parameter).
    public Regular(int enrollmentId,String dateOfBirth,String courseName,String studentName,
                   String dateOfEnrollment,double courseDuration,
                   double tuitionFee,int numOfModules,int numOfCreditHours,
                   double daysPresent){
        super(dateOfBirth,studentName,courseDuration,tuitionFee);//It calls the constructor of the parent class.
        //Here I call the setter method of the parent class.
        super.setCourseName(courseName);
        super.setEnrollmentId(enrollmentId);
        super.setDateOfEnrollment(dateOfEnrollment);
        //Here I assign the value for the instance variable.
        this.numOfModules=numOfModules;
        this.numOfCreditHours=numOfCreditHours;
        this.daysPresent=daysPresent;
        this.isGrantedScholorship=false;
    }




    //As the requirement of the project I have created the getter method for all the attributes of the Regular Class.
    public int getNumOfModules(){
        return numOfModules;//Its return the value of numOfModules.
    }

    public int getNumOfCreditHours(){
        return numOfCreditHours;//Its return the value of creditHours.
    }

    public double getDaysPresent(){
        return daysPresent;//Its return the value of daysPresent.
    }

    public boolean getIsGrantedScholorship(){
        return isGrantedScholorship;//Its return the value of isGrantedDcholorship.
    }

    //Here I have created a method presentPercentage which accept daysPresent as the parameter.
    //This method calculate the presentPercentage and according the condition of the project it return the attendence grade.
    public String presentPercentage(double daysPresent){
        double presentPercentage=daysPresent/(super.getCourseDuration()*30) *100;//here getCourseDuration is multiplied by 30 to convert it into days as daysPresent is given is days.
        String attendenceGrade = "";
        //In the begining the it is checked either the student id properly present in the class or not.
        if((getCourseDuration()*30)<daysPresent){
            System.out.println("Please be present in class");//similarly here getCourseDuration is converted into days.
        }
        //The given condition to return the attendence grade are as follow.
        else if(presentPercentage>=80){
            attendenceGrade="A";
            isGrantedScholorship=true;

        }

        else if(presentPercentage>=60){
            attendenceGrade="B";
            isGrantedScholorship=false;
        }

        else if(presentPercentage>=40){
            attendenceGrade="C";
            isGrantedScholorship=false;
        }

        else if(presentPercentage>=20){
            attendenceGrade="D";
            isGrantedScholorship=false;
        }

        else if(presentPercentage>=0){
            attendenceGrade="E";
            isGrantedScholorship=false;
        }
        else{
            System.out.println("Invalid (-ve)");
            attendenceGrade="";
        }
        return attendenceGrade;

    }

    //Here I have created the method grantCertificate with 3 parameter.
    //this method check whether the scholorship is granted or not.
    public void grantCertificate(String courseName,int enrollmentId,String dateOfEnrollment){
        System.out.println(getStudentName()+" has graduate from "+ getCourseName() +" with enrollmentId "+enrollmentId+" date of enrollment was "+dateOfEnrollment);
        if(isGrantedScholorship==true){
            System.out.println("The scholarship has been granted");
        }
        else{
            System.out.println("The scholarship has not been granted");
        }
    }

    //Here i have created a display method as the requirement of the project.
    //This method call the display method of parent class and also it print the instance variable.
    public void display(){
        super.display();//It call the display method of parent class.
        //Now it prints the instance variable.
        System.out.println("Number of moodules :"+this.numOfModules);
        System.out.println("Number of Credit Hours :"+this.numOfCreditHours);
        System.out.println("Days Present :"+this.daysPresent);
    }
}
