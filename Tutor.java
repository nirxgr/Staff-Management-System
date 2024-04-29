public class Tutor extends Teacher{
    /*creating main class Tutor extending the Superclass Teacher
       creating instance variables*/
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
   //constructor
    public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHours,double salary,String specialization,String academicQualifications,int performanceIndex)
    {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.setWorkingHours(workingHours);
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualifications=academicQualifications;
        this.performanceIndex=performanceIndex;
        this.isCertified=false; 
    }
    
    //Accessor methods
    public double getSalary() {
        return this.salary;
    }
    public String getSpecialization() {
        return this.specialization;
    }
    public String getAcademicQualifications() {
        return this.academicQualifications;
    }
    public int getPerformanceIndex() {
        return this.performanceIndex;
    }
    public boolean getIsCertified() {
        return this.isCertified;
    }
    
    //Mutator method(Setter method) to set the salary
   public String setSalary(double salary,int performanceIndex){
        this.performanceIndex=performanceIndex;
        if (this.performanceIndex > 5 && this.performanceIndex <=10 && getWorkingHours() > 20)
        {
            if(this.performanceIndex <=7){
                this.salary=salary+(0.05*salary);
            }
            else if(this.performanceIndex <=9){
                this.salary=salary+(0.10*salary);
            }
            else if(this.performanceIndex == 10){
                this.salary=salary+(0.20*salary);
            }
            this.isCertified=true;
        }
        else{
            return("Salary cannot be approved.");
        }
        return ("The new salary is "+ this.salary +".");
    }
    
   //Method to remove the tutor
    public String removeTutor(){
        if(!this.isCertified){
            this.salary=0;
            this.specialization=" "; 
            this.academicQualifications=" ";
            this.performanceIndex=0;
            this.isCertified=false;
        }
        else{
            return("Tutor cannot be removed as tutor has already been certified.");
        }
        return("Tutor has been removed successfully.");
    }
    
    //Creating a method to display the details of Tutor
    public void displayTeacherInformation(){
       if (!isCertified) {
            // Calling the display method of the Teacher class
            super.displayTeacherInformation();
        } else {
            super.displayTeacherInformation();
            System.out.println("Salary is " + this.getSalary()+".");
            System.out.println("The specialization is " + this.getSpecialization()+".");
            System.out.println("The Academic Qualifications is " + this.getAcademicQualifications()+".");
            System.out.println("The Performance Index is " + this.getPerformanceIndex()+".");
        }
    }
}