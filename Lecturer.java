public class Lecturer extends Teacher { 
    /*creating main class Lecturer extending the Superclass Teacher
       creating instance variables*/
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    private String assignmentScore;

    //constructor
    public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHours, String department, int yearsOfExperience)
    {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.setWorkingHours(workingHours);
        this.department=department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0; // Initialize gradedScore as 0
        this.hasGraded = false; // Set hasGraded to false initially
    }

    // Accessor methods 
    public String getDepartment() {
        return this.department;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public int getGradedScore() {
        return this.gradedScore;
    }

    public boolean getHasGraded() {
        return this.hasGraded;
    }

    //Mutator method(Setter method) for gradedScore
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }
    
    //Method to grade assignments
    public String gradeAssignment(int gradedScore,int yearsOfExperience,String department) {
        this.yearsOfExperience=yearsOfExperience;
        if ((this.yearsOfExperience >= 5) && (this.department.equals(department))) 
        {
            this.gradedScore=gradedScore;
            if (this.gradedScore >= 70) {
                assignmentScore = "A";
            } else if (this.gradedScore >= 60) {
                assignmentScore = "B";
            } else if (this.gradedScore >= 50) {
                assignmentScore = "C";
            } else if (this.gradedScore >= 40) {
                assignmentScore = "D";
            } else {
                assignmentScore = "E"; 
            }
            this.hasGraded = true;
        
        } else {
            return("Assignment grading has not been completed.");
        }
        return ("The graded score is "+this.gradedScore+" and the grade is "+assignmentScore+".");
    }

    //Creating a method to display the details of Lecturer
    public void displayTeacherInformation() {
        //Calling the display method of the superclass (Teacher)
        super.displayTeacherInformation();
        //Displaying the other details of Lecturer
        System.out.println("The Department is  " + this.getDepartment()+".");
        System.out.println("The years of Experience is " + this.getYearsOfExperience()+".");

        if (hasGraded) {
            System.out.println("The Graded Score is " + this.getGradedScore()+".");
        } else {
            System.out.println("Assignment is not graded yet.");
        }
    }

}
