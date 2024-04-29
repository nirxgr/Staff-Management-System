public class Teacher //creating main class
{
    /*creating instance variables
       using private access modifier to keep it encapsulated*/
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //constructor
    public Teacher(int teacherId,String teacherName,String address,String workingType,String employmentStatus)
    {
        this.teacherId=teacherId;
        this.teacherName=teacherName;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
        this.workingHours=0;
        //using this keyword to refer the instance variable
    }
    
    //Accessor method for each attribute of teacher
    public int getTeacherId()
    {
        return this.teacherId;
    }
    
    public String getTeacherName()
    {
        return this.teacherName;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getWorkingType()
    {
        return this.workingType;
    }
    
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    
    //Using setter method to set the working hours
    public void setWorkingHours(int workingHours)
    {
        this.workingHours=workingHours;
    }
    

    //creating a display method to display the information
    public void displayTeacherInformation()
    {
        System.out.println("The teacher ID is "+this.getTeacherId() +".");
        System.out.println("The teacher name is "+this.getTeacherName() +".");
        System.out.println("The address is "+this.getAddress());
        System.out.println("The working type is "+this.getWorkingType() +".");
        System.out.println("The employment status is "+this.getEmploymentStatus() +".");
        
        if(this.workingHours==0){
             System.out.println("Working Hour is not assigned.");
        }else{
            System.out.println("Working Hour is "+this.workingHours +".");
        }
    }
}