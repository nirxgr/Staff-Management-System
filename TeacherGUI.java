import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
public class TeacherGUI {
    private JFrame frame,frame1,frame2,frame3,frame4;
    
    private JPanel panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10,welcomePanel,guidelinesPanel;
    
    private JLabel welcomeLabel;
    private JLabel teacherIdLabel, teacherNameLabel, addressLabel, workingTypeLabel,employmentStatusLabel,performanceIndexLabel;
    private JLabel workingHoursLabel,addLabel,departmentLabel,yearsOfExperienceLabel,salaryLabel,specializationLabel,academicQualificationLabel;
    private JLabel teacherId1Label,gradedScoreLabel,department1Label,yearsOfExperience1Label;
    private JLabel teacherId2Label,newSalaryLabel,newPerformanceIndexLabel,teacherId3Label;
    
    private JTextField teacherIdTxt, teacherNameTxt, addressTxt, workingTypeTxt,employmentStatusTxt;
    private JTextField workingHoursTxt,departmentTxt,yearsOfExperienceTxt,salaryTxt,specializationTxt,academicQualificationTxt,performanceIndexTxt;
    private JTextField teacherId1Txt,gradedScoreTxt,department1Txt,yearsOfExperience1Txt;
    private JTextField teacherId2Txt,newSalaryTxt,newPerformanceIndexTxt,teacherId3Txt;
    
    private JTextArea lecturerDisplayArea,tutorDisplayArea,guidelinesArea;
    
    private JButton addButton,clearButton,displayButton,tutorButton,lecturerButton;
    private JButton clear1Button,addLecturerButton,goBack1Button,gradeAssignmentButton,setSalaryButton,addTutorButton,removeTutorButton;
    private JButton gradeAssignment1Button,clear2Button,goBack2Button;
    private JButton setSalary1Button,clear3Button,goBack3Button,clear4Button,goBack4Button,removeTutor1Button,clear5Button,goBack5Button,goBack6Button;
    private JButton goBack7Button,goBaack8Button,startButton;
    
    private JComboBox<String> displayComboBox;
    private StringBuilder displayLecturer = new StringBuilder();
    private StringBuilder displayTutor = new StringBuilder();
    
    private Font font1 = new Font("HELVETICA",Font.PLAIN,16);
    private Font font2 = new Font("HELVETICA",Font.BOLD,14);
    
    private Color c1 = Color.decode("#EEEEEE");
    private Color c3 = Color.decode("#393E46");
    private Color c4 = Color.decode("#102C57");
    private Color c5 = Color.decode("#FEFAF6");
    private Color c6 = Color.decode("#EADBC8");
    private Color c7 = Color.decode("#222831");
    private Color c8 = Color.decode("#DAC0A3");
    private Color c9 = Color.decode("#fa8f32");
   
    private ArrayList <Teacher> teacherList;
    
    public TeacherGUI() {
        teacherList = new ArrayList<Teacher>();
        frame = new JFrame("Teacher");
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creating home page panels
        // Main panel to hold components
        panel10 = new JPanel();
        panel10.setLayout(new BorderLayout());
        panel10.setBackground(c1);
        
        // Panel for welcome message and button
        welcomePanel = new JPanel();
        welcomePanel.setBackground(c7); // Changed to navy blue
        welcomePanel.setLayout(new BorderLayout());
        
        // Welcome label
        welcomeLabel = new JLabel("Welcome to Teacher Database");
        welcomeLabel.setForeground(c1);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("HELVETICA", Font.BOLD, 20));
        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);
        
        // Button
        startButton = new JButton("START");
        startButton.setForeground(c7);
        startButton.setFont(font2);
        startButton.setPreferredSize(new Dimension(70, 40)); 
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel10.setVisible(false);
                panel.setVisible(true);
            }
        });
        welcomePanel.add(startButton, BorderLayout.SOUTH);
        
        
        // Guidelines panel
        guidelinesPanel = new JPanel();
        guidelinesPanel.setBackground(c1);
        guidelinesPanel.setLayout(new BorderLayout());
        
        // Guidelines textarea
        guidelinesArea = new JTextArea("\n  Guidelines: \n  -Please ensure all the information is accurate.\n  -Please double-check before submitting.\n  -Error will arise if any wrong format data will be provided.\n   ");
        guidelinesArea.setEditable(false);
        guidelinesArea.setForeground(c7);
        guidelinesArea.setFont(font1);
        guidelinesPanel.add(guidelinesArea, BorderLayout.CENTER);

        // Add panels to main panel
        panel10.add(welcomePanel, BorderLayout.CENTER);
        panel10.add(guidelinesPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        frame.add(panel10);
        
        
        //main frame starts
        // Creating JPanel with GridBagLayout
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gui = new GridBagConstraints();
        gui.insets = new Insets(30, 10, 10, 10); // Padding between components
        panel.setVisible(false);
        
        // Teacher ID
        teacherIdLabel = new JLabel("Teacher ID:");
        gui.gridx = 0;
        gui.gridy = 0;
        teacherIdLabel.setFont(font1);
        teacherIdLabel.setForeground(c1);
        panel.add(teacherIdLabel, gui);

        teacherIdTxt = new JTextField(12);
        gui.gridx = 1;
        teacherIdTxt.setFont(font1);
        teacherIdTxt.setBackground(c3);
        teacherIdTxt.setForeground(c1);
        panel.add(teacherIdTxt, gui);

        
        // Teacher Name
        teacherNameLabel = new JLabel("Teacher Name:");
        gui.gridx = 2;
        teacherNameLabel.setFont(font1);
        teacherNameLabel.setForeground(c1);
        panel.add(teacherNameLabel, gui);

        teacherNameTxt = new JTextField(12);
        gui.gridx = 3;
        teacherNameTxt.setFont(font1);
        teacherNameTxt.setBackground(c3);
        teacherNameTxt.setForeground(c1);
        panel.add(teacherNameTxt, gui);

        
        // Address
        addressLabel = new JLabel("Address:");
        gui.gridx = 0;
        gui.gridy = 1;
        addressLabel.setFont(font1);
        addressLabel.setForeground(c1);
        panel.add(addressLabel, gui);

        addressTxt = new JTextField(12);
        gui.gridx = 1;
        addressTxt.setFont(font1);
        addressTxt.setBackground(c3);
        addressTxt.setForeground(c1);
        panel.add(addressTxt, gui);

        
        // Working Type
        workingTypeLabel = new JLabel("Working Type:");
        gui.gridx = 2;
        workingTypeLabel.setFont(font1);
        workingTypeLabel.setForeground(c1);
        panel.add(workingTypeLabel, gui);

        workingTypeTxt = new JTextField(12);
        gui.gridx = 3;
        workingTypeTxt.setFont(font1);
        workingTypeTxt.setBackground(c3);
        workingTypeTxt.setForeground(c1);
        panel.add(workingTypeTxt, gui);

        
        //employment status
        employmentStatusLabel = new JLabel("Employment Status:");
        gui.gridx = 0;
        gui.gridy = 2;
        employmentStatusLabel.setFont(font1);
        employmentStatusLabel.setForeground(c1);
        panel.add(employmentStatusLabel, gui);

        employmentStatusTxt = new JTextField(12);
        gui.gridx = 1;
        employmentStatusTxt.setFont(font1);
        employmentStatusTxt.setBackground(c3);
        employmentStatusTxt.setForeground(c1);
        panel.add(employmentStatusTxt, gui);
        
        
        //working hours
        workingHoursLabel = new JLabel("Working Hours:");
        gui.gridx = 2;
        workingHoursLabel.setFont(font1);
        workingHoursLabel.setForeground(c1);
        panel.add(workingHoursLabel, gui);

        workingHoursTxt = new JTextField(12);
        gui.gridx = 3;
        workingHoursTxt.setFont(font1);
        workingHoursTxt.setBackground(c3);
        workingHoursTxt.setForeground(c1);
        panel.add(workingHoursTxt, gui);
        
        //clear button
        clearButton = new JButton(" Clear ");
        gui.gridx = 0;
        gui.gridy = 3;
        gui.gridwidth = 2;
        clearButton.setFont(font2);
        clearButton.setForeground(c4);
        panel.add(clearButton,gui);
        clearButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to clear all fields?", "Clear Text Fields Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    teacherIdTxt.setText("");
                    teacherNameTxt.setText("");
                    addressTxt.setText("");
                    workingTypeTxt.setText("");
                    employmentStatusTxt.setText("");
                    workingHoursTxt.setText("");

                } else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {

                }
           }
        });


          
        //add button
        addButton = new JButton(" ADD ");
        gui.gridx = 1;
        gui.gridy = 3;
        gui.gridwidth = 2;
        addButton.setFont(font2);
        addButton.setForeground(c4);
        panel.add(addButton,gui);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(teacherIdTxt.getText().isEmpty() || teacherNameTxt.getText().isEmpty() || addressTxt.getText().isEmpty() || workingTypeTxt.getText().isEmpty() || employmentStatusTxt.getText().isEmpty() || workingHoursTxt.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "Please  fill all the fields.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        int teacherId = Integer.parseInt(teacherIdTxt.getText());
                        int workingHours = Integer.parseInt(workingHoursTxt.getText());;
                        if(Integer.parseInt(workingHoursTxt.getText())>24){
                            JOptionPane.showMessageDialog(frame2, "Working Hours Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else if(teacherList.isEmpty()){
                            JOptionPane.showMessageDialog(frame, "Please press a button.", "Information", JOptionPane.INFORMATION_MESSAGE);
                            // Creating a new frame with two buttons
                            newFrame1();
                        }
                        else{                   
                            for(Teacher teacher: teacherList){
                                if(teacher instanceof Lecturer || teacher instanceof Tutor){
                                    if(teacher.getTeacherId()!=teacherId){
                                        JOptionPane.showMessageDialog(frame, "Please press a button.", "Information", JOptionPane.INFORMATION_MESSAGE);
                                        // Creating a new frame with two buttons
                                        newFrame1();
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(frame, "This teacher Id is already taken.Please enter another unique teacher Id.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(frame,"Number Format Exception");
                }
            }
        });

        
        //display combo box
        String[] disp = {"Display","Lecturer","Tutor"};
        displayComboBox = new JComboBox<>(disp);
        gui.gridx = 2;
        gui.gridy = 3;
        gui.gridwidth = 2;
        displayComboBox.setFont(font2);
        displayComboBox.setForeground(c4);
        panel.add(displayComboBox,gui);
        /*
            Adding action listener to the combo box:
             - When an item is selected from the combo box, this ActionListener is triggered and determines which 
                panel to show while hiding others.
        */
       
        displayComboBox.addActionListener(new ActionListener() {
            // ActionListener implementation
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the combo box
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedValue = (String) combo.getSelectedItem();
                // Showing the corresponding panel based on the selected item
                if (selectedValue.equals("Display")) {
                    
                } else if (selectedValue.equals("Lecturer")) {
                    frame.dispose();
                    dispFrame();
                    frame4.getContentPane().add(panel7, BorderLayout.NORTH);
                    panel7.setVisible(true);
                    panel8.setVisible(false);
                    for (Teacher lect : teacherList)
                    {
                        if (lect instanceof Lecturer) {
                            Lecturer lecturer = (Lecturer) lect; // Cast Teacher to Lecturer
                            displayLecturer.append("Lecturer Information:");
                            displayLecturer.append("\n________________________________________________");
                            displayLecturer.append("\nTeacher ID: ").append(lecturer.getTeacherId());
                            displayLecturer.append("\nTeacher Name: ").append(lecturer.getTeacherName());
                            displayLecturer.append("\nAddress: ").append(lecturer.getAddress());
                            displayLecturer.append("\nWorking Type: ").append(lecturer.getWorkingType());
                            displayLecturer.append("\nEmployment Status: ").append(lecturer.getEmploymentStatus());
                            displayLecturer.append("\nWorking Hours: ").append(lecturer.getWorkingHours());
                            displayLecturer.append("\nDepartment: ").append(lecturer.getDepartment());
                            displayLecturer.append("\nYears of Experience: ").append(lecturer.getYearsOfExperience());
                            displayLecturer.append("\nGraded Score: ").append(lecturer.getGradedScore());
                            displayLecturer.append("\n________________________________________________\n");
                            
                        }
                        // Set the content of the JTextArea
                        lecturerDisplayArea.setText(displayLecturer.toString());
                    }
                    
                    
                }
                else if (selectedValue.equals("Tutor")) {
                    frame.dispose();
                    dispFrame();
                    frame4.getContentPane().add(panel8, BorderLayout.NORTH);
                    panel8.setVisible(true);
                    panel7.setVisible(false);
                    for(Teacher tut:teacherList)
                    {
                        if(tut instanceof Tutor)
                        {
                            Tutor tutor = (Tutor) tut; // Cast Teacher to Lecturer
                            displayTutor.append("Tutor Information:");
                            displayTutor.append("\n________________________________________________");
                            displayTutor.append("\nTeacher ID: ").append(tutor.getTeacherId());
                            displayTutor.append("\nTeacher Name: ").append(tutor.getTeacherName());
                            displayTutor.append("\nAddress: ").append(tutor.getAddress());
                            displayTutor.append("\nWorking Type: ").append(tutor.getWorkingType());
                            displayTutor.append("\nEmployment Status: ").append(tutor.getEmploymentStatus());
                            displayTutor.append("\nWorking Hours: ").append(tutor.getWorkingHours());
                            displayTutor.append("\nSalary: ").append(tutor.getSalary());
                            displayTutor.append("\nSpecialization: ").append(tutor.getSpecialization());
                            displayTutor.append("\nAcademic Qualification: ").append(tutor.getAcademicQualifications());
                            displayTutor.append("\nPerformance Index: ").append(tutor.getPerformanceIndex());
                            displayTutor.append("\n________________________________________________\n");
                        }
                        // Set the content of the JTextArea
                        tutorDisplayArea.setText(displayTutor.toString());
                    }
                }

            }
        });
        
        panel.setBackground(c7);
        frame.getContentPane().setBackground(c7);
        frame.getContentPane().add(panel, BorderLayout.NORTH);  
    
        frame.setVisible(true);
    }
    public void dispFrame(){
        frame4 = new JFrame("Display");
        frame4.setSize(600, 980);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating panel 7 for display of lecturer
        panel7 = new JPanel(new GridBagLayout());
        GridBagConstraints gui7 = new GridBagConstraints();
        gui7.insets = new Insets(30, 10, 10, 10);
        lecturerDisplayArea = new JTextArea();
        lecturerDisplayArea.setEditable(false);
        gui7.gridx = 0;
        gui7.gridy = 0; 
        panel7.setBackground(c7);
        panel7.add(lecturerDisplayArea,gui7);
        
        
        //creating panel 8 for display of tutor
        panel8 = new JPanel(new GridBagLayout());
        GridBagConstraints gui8 = new GridBagConstraints();
        gui8.insets = new Insets(30, 10, 10, 10);
        tutorDisplayArea = new JTextArea();
        tutorDisplayArea.setEditable(false);
        gui8.gridx = 0;
        gui8.gridy = 0; 
        panel8.setBackground(c7);
        panel8.add(tutorDisplayArea,gui8);
        
        //go back button
        panel9 = new JPanel();
        goBack7Button = new JButton(" BACK ");
        goBack7Button.setBounds(250, 80, 100, 40);
        //x-cordinate, y-cordinate, width, height
        panel9.add(goBack7Button);
        goBack7Button.setFont(font2);
        goBack7Button.setForeground(c4);
        goBack7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLecturer.setLength(0);
                displayLecturer.setLength(0);
                frame4.dispose();
                frame.setVisible(true);
            }
        });
        panel9.setBackground(c7);
        panel9.setLayout(null);
        frame4.setBackground(c7);
        frame4.getContentPane().add(panel9);
        frame4.setVisible(true);
    }
    
    public void newFrame1() {
        frame1 = new JFrame("New Frame");
        frame1.setSize(730,250);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        // Creating JPanel with GridBagLayout
        panel1 = new JPanel(new GridBagLayout());
        GridBagConstraints gui1 = new GridBagConstraints();
        gui1.insets = new Insets(40,10,10,10);
        
        //creating a JLabel
        addLabel = new JLabel("Do you want to add the teacher as a tutor or a lecturer?");
        gui1.gridx = 0;
        gui1.gridy = 0;
        addLabel.setForeground(c7);
        addLabel.setFont(font1);
        panel1.add(addLabel, gui1);


        //add lecturer button
        lecturerButton = new JButton("Add Lecturer");
        gui1.gridx = 0;
        gui1.gridy = 1;
        gui1.gridwidth = 8;
        lecturerButton.setFont(font2);
        lecturerButton.setForeground(c3);
        panel1.add(lecturerButton,gui1);
        lecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //new lecturer frame
                frame1.dispose();
                newFrame2();
                
            }
        });
        
        //add tutor button
        tutorButton = new JButton("Add Tutor");
        gui1.gridx = 2;
        gui1.gridwidth = 1;
        tutorButton.setFont(font2);
        tutorButton.setForeground(c3);
        panel1.add(tutorButton,gui1);
        tutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new tutor frame
                frame1.dispose();
                newFrame3();
            }
        });
        
        //go back button
        goBack5Button = new JButton("Back");
        gui1.gridx = 3;
        gui1.gridwidth = 1;
        goBack5Button.setFont(font2);
        goBack5Button.setForeground(c3);
        panel1.add(goBack5Button,gui1);
        goBack5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
                frame.setVisible(true);
            }
        });
        panel1.setBackground(Color.decode("#F5F5F5"));
        frame1.getContentPane().setBackground(Color.decode("#F5F5F5"));
        frame1.getContentPane().add(panel1,BorderLayout.NORTH);  
        frame1.setVisible(true);
    }


    public void newFrame2(){
        frame2 = new JFrame("Lecturer");
        frame2.setSize(725,400);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame2.setLocationRelativeTo(null);
        // Creating JPanel with GridBagLayout
        panel2 = new JPanel(new GridBagLayout());
        GridBagConstraints gui2 = new GridBagConstraints();
        gui2.insets = new Insets(15,25,10,10);
        
        
        // Department
        departmentLabel = new JLabel("Department:");
        gui2.gridx = 0;
        gui2.gridy = 0;
        departmentLabel.setFont(font1);
        departmentLabel.setForeground(c4);
        panel2.add(departmentLabel, gui2);

        departmentTxt = new JTextField(15);
        gui2.gridx = 1;
        departmentTxt.setFont(font1);
        departmentTxt.setBackground(c5);
        departmentTxt.setForeground(c4);
        panel2.add(departmentTxt, gui2);

        
        // Years of experience
        yearsOfExperienceLabel = new JLabel("Years of Experience:");
        gui2.gridx = 0;
        gui2.gridy = 1;
        yearsOfExperienceLabel.setFont(font1);
        yearsOfExperienceLabel.setForeground(c4);
        panel2.add(yearsOfExperienceLabel, gui2);
        
        yearsOfExperienceTxt = new JTextField(15);
        gui2.gridx = 1;
        yearsOfExperienceTxt.setFont(font1);
        departmentTxt.setBackground(c5);
        yearsOfExperienceTxt.setForeground(c4);
        panel2.add(yearsOfExperienceTxt, gui2);
        
        
        //clear button
        clear1Button = new JButton("Clear");
        gui2.gridx = 0;
        gui2.gridy = 2;
        gui2.gridwidth = 1;
        clear1Button.setFont(font2);
        clear1Button.setForeground(c8);
        panel2.add(clear1Button,gui2);
        clear1Button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(frame2, "Are you sure you want to clear all fields?", "Clear Text Fields Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
            departmentTxt.setText("");
            yearsOfExperienceTxt.setText("");

           } else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {

            }
           }
        });
        //add lecturer button
        addLecturerButton = new JButton("ADD");
        gui2.gridx = 1;
        gui2.gridwidth = 1;
        addLecturerButton.setFont(font2);
        addLecturerButton.setForeground(c8);
        panel2.add(addLecturerButton,gui2);
        addLecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(departmentTxt.getText().isEmpty() || yearsOfExperienceTxt.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame2, "Please  fill all the fields.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        if(Integer.parseInt(yearsOfExperienceTxt.getText())>40){
                            JOptionPane.showMessageDialog(frame2, "Years of Experience Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            String teacherName = teacherNameTxt.getText();
                            String address = addressTxt.getText();
                            String workingType = workingTypeTxt.getText();
                            String employmentStatus = employmentStatusTxt.getText();
                            int workingHours = Integer.parseInt(workingHoursTxt.getText());;
                            
                            String department = departmentTxt.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());
                            
                            teacherList.add(new Lecturer(teacherId,teacherName,address,workingType,employmentStatus,workingHours,department,yearsOfExperience));
                            JOptionPane.showMessageDialog(frame2, "Lecturer is added.", "Information", JOptionPane.INFORMATION_MESSAGE);
                            //claering the text field after addting lecturer in array list
                            teacherIdTxt.setText("");
                            teacherNameTxt.setText("");
                            addressTxt.setText("");
                            workingTypeTxt.setText("");
                            employmentStatusTxt.setText("");
                            workingHoursTxt.setText("");
                            departmentTxt.setText("");
                            yearsOfExperienceTxt.setText("");
                            frame.dispose();
                        }
                    }
                    }
                catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(frame2,"Number Format Exception");
                }
            }
        });
        
        //go back button
        goBack1Button = new JButton("Back");
        gui2.gridx = 2;
        gui2.gridwidth = 2;
        goBack1Button.setFont(font2);
        goBack1Button.setForeground(c8);
        panel2.add(goBack1Button,gui2);
        goBack1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                newFrame1();
            }
        });
        
        //grade assignment button
        gradeAssignmentButton = new JButton("Grade Assignmnet");
        gui2.gridx = 1;
        gui2.gridy = 3;
        gui2.gridwidth = 2;
        gradeAssignmentButton.setFont(font2);
        gradeAssignmentButton.setForeground(c8);
        panel2.add(gradeAssignmentButton,gui2);
        gradeAssignmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                frame2.getContentPane().add(panel4, BorderLayout.NORTH);
                panel4.setVisible(true);
            }
        });
        
        
        panel2.setBackground(c6);
        frame2.getContentPane().setBackground(c6);
        frame2.getContentPane().add(panel2,BorderLayout.NORTH); 
        
        //panel4 for grade assignment
        panel4 = new JPanel(new GridBagLayout());
        panel4.setBackground(c6);
        GridBagConstraints gui4 = new GridBagConstraints();
        gui4.insets = new Insets(20,10,10,10);
        
        // Teacher Id
        teacherId1Label = new JLabel("Teacher ID:");
        gui4.gridx = 0;
        gui4.gridy = 0;
        teacherId1Label.setFont(font1);
        teacherId1Label.setForeground(c4);
        panel4.add(teacherId1Label, gui4);

        teacherId1Txt = new JTextField(15);
        gui4.gridx = 1;
        teacherId1Txt.setFont(font1);
        departmentTxt.setBackground(c5);
        teacherId1Txt.setForeground(c4);
        panel4.add(teacherId1Txt, gui4);

        
        // Graded score
        gradedScoreLabel = new JLabel("Graded Score:");
        gui4.gridx = 0;
        gui4.gridy = 1;
        gradedScoreLabel.setFont(font1);
        gradedScoreLabel.setForeground(c4);
        panel4.add(gradedScoreLabel, gui4);
        
        gradedScoreTxt = new JTextField(15);
        gui4.gridx = 1;
        gradedScoreTxt.setFont(font1);
        gradedScoreTxt.setForeground(c4);
        departmentTxt.setBackground(c5);
        panel4.add(gradedScoreTxt, gui4);
        
        // Department
        department1Label = new JLabel("Department:");
        gui4.gridx = 0;
        gui4.gridy = 2;
        department1Label.setFont(font1);
        department1Label.setForeground(c4);
        panel4.add(department1Label, gui4);

        department1Txt = new JTextField(15);
        gui4.gridx = 1;
        department1Txt.setFont(font1);
        department1Txt.setForeground(c4);
        departmentTxt.setBackground(c5);
        panel4.add(department1Txt,gui4);
        
        // Years of experience
        yearsOfExperience1Label = new JLabel("Years of Experience:");
        gui4.gridx = 0;
        gui4.gridy = 3;
        yearsOfExperience1Label.setFont(font1);
        yearsOfExperience1Label.setForeground(c4);
        panel4.add(yearsOfExperience1Label, gui4);
        
        yearsOfExperience1Txt = new JTextField(15);
        gui4.gridx = 1;
        yearsOfExperience1Txt.setFont(font1);
        yearsOfExperience1Txt.setForeground(c4);
        departmentTxt.setBackground(c5);
        panel4.add(yearsOfExperience1Txt, gui4);
        
        //clear button
        clear2Button = new JButton("Clear");
        gui4.gridx = 0;
        gui4.gridy = 4;
        gui4.gridwidth = 1;
        clear2Button.setFont(font2);
        clear2Button.setForeground(c8);
        panel4.add(clear2Button,gui4);
        clear2Button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(frame2, "Are you sure you want to clear all fields?", "Clear Text Fields Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                teacherId1Txt.setText("");
                gradedScoreTxt.setText("");
                department1Txt.setText("");
                yearsOfExperience1Txt.setText("");

           } else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {

            }
           }
        });
        
        //grade assignment button
        gradeAssignment1Button = new JButton("Grade Assignment");
        gui4.gridx = 1;
        gui4.gridwidth = 1;
        gradeAssignment1Button.setFont(font2);
        gradeAssignment1Button.setForeground(c8);
        panel4.add(gradeAssignment1Button,gui4);
        gradeAssignment1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    if(teacherId1Txt.getText().isEmpty() || gradedScoreTxt.getText().isEmpty() || department1Txt.getText().isEmpty() || yearsOfExperience1Txt.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame2, "Please  fill all the fields.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else{
                        
                        int teacherId = Integer.parseInt(teacherId1Txt.getText());
                        int gradedScore = Integer.parseInt(gradedScoreTxt.getText());
                        String department = department1Txt.getText();
                        int yearsOfExperience = Integer.parseInt(yearsOfExperience1Txt.getText());
                        if(Integer.parseInt(yearsOfExperience1Txt.getText())>40){
                            JOptionPane.showMessageDialog(frame2, "Years of Experience Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else if(Integer.parseInt(gradedScoreTxt.getText())<0 || Integer.parseInt(gradedScoreTxt.getText())>100){
                                JOptionPane.showMessageDialog(frame2, "Graded Score Invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
    
                        else{
                            for(Teacher lect:teacherList)
                            {
                                if(lect instanceof Lecturer)
                                {
                                    if(lect.getTeacherId() == teacherId)
                                    {
                                        Lecturer obj1 = (Lecturer) lect;
                                        
                                        JOptionPane.showMessageDialog(frame2,obj1.gradeAssignment(gradedScore,yearsOfExperience,department) , "Graded Score", JOptionPane.INFORMATION_MESSAGE);
                                        
                                        teacherId1Txt.setText("");
                                        gradedScoreTxt.setText("");
                                        department1Txt.setText("");
                                        yearsOfExperience1Txt.setText("");
                                        
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(frame2, "Teacher Id not found.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(frame2,"Number Format Exception");
                }
            }
        });
        
        //go back button
        goBack2Button = new JButton("Back");
        gui4.gridx = 2;
        gui4.gridwidth = 1;
        goBack2Button.setFont(font2);
        goBack2Button.setForeground(c8);
        panel4.add(goBack2Button,gui4);
        goBack2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel4.setVisible(false);
                panel2.setVisible(true);
            }
        });
    
        
        frame2.setVisible(true);
    }
    
    public void newFrame3(){
        frame3 = new JFrame("Tutor");
        frame3.setSize(700,500);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame3.setLocationRelativeTo(null);
        // Creating JPanel with GridBagLayout
        panel3 = new JPanel(new GridBagLayout());
        panel3.setBackground(Color.decode("#FEFAF6"));
        GridBagConstraints gui3 = new GridBagConstraints();
        gui3.insets = new Insets(20,10,10,10);
        
        //salary
        salaryLabel = new JLabel("Salary:");
        gui3.gridx = 0;
        gui3.gridy = 0;
        salaryLabel.setFont(font1);
        salaryLabel.setForeground(c4);
        panel3.add(salaryLabel, gui3);
        
        salaryTxt = new JTextField(15);
        gui3.gridx = 1;
        salaryTxt.setFont(font1);
        salaryTxt.setBackground(c6);
        salaryTxt.setForeground(c4);
        panel3.add(salaryTxt, gui3);
        
        //specialization
        specializationLabel = new JLabel("Specialization:");
        gui3.gridx = 0;
        gui3.gridy = 1;
        specializationLabel.setFont(font1);
        specializationLabel.setForeground(c4);
        panel3.add(specializationLabel, gui3);
        
        specializationTxt = new JTextField(15);
        gui3.gridx = 1;
        specializationTxt.setFont(font1);
        specializationTxt.setBackground(c6);
        specializationTxt.setForeground(c4);
        panel3.add(specializationTxt, gui3);
        
        //academic qualification
        academicQualificationLabel = new JLabel("Academic qualification:");
        gui3.gridx = 0;
        gui3.gridy = 2;
        academicQualificationLabel.setFont(font1);
        academicQualificationLabel.setForeground(c4);
        panel3.add(academicQualificationLabel, gui3);
        
        academicQualificationTxt = new JTextField(15);
        gui3.gridx = 1;
        academicQualificationTxt.setFont(font1);
        academicQualificationTxt.setBackground(c6);
        academicQualificationTxt.setForeground(c4);
        panel3.add(academicQualificationTxt, gui3);
        
        
        //performance index
        performanceIndexLabel = new JLabel("Performance Index:");
        gui3.gridx = 0;
        gui3.gridy = 3;
        performanceIndexLabel.setFont(font1);
        performanceIndexLabel.setForeground(c4);
        panel3.add(performanceIndexLabel, gui3);
        
        performanceIndexTxt = new JTextField(15);
        gui3.gridx = 1;
        performanceIndexTxt.setFont(font1);
        performanceIndexTxt.setBackground(c6);
        performanceIndexTxt.setForeground(c4);
        panel3.add(performanceIndexTxt, gui3);
        
        //clear button
        clear4Button = new JButton("Clear");
        gui3.gridx = 0;
        gui3.gridy = 4;
        gui3.gridwidth = 1;
        clear4Button.setFont(font2);
        clear4Button.setForeground(c9);
        panel3.add(clear4Button,gui3);
        clear4Button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) 
           {
             int option = JOptionPane.showConfirmDialog(frame3, "Are you sure you want to clear all fields?", "Clear Text Fields Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
             if (option == JOptionPane.YES_OPTION) {
                salaryTxt.setText("");
                specializationTxt.setText("");
                academicQualificationTxt.setText("");
                performanceIndexTxt.setText("");

               } else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {

                }
           }
        });

        //add tutor button
        addTutorButton = new JButton ("ADD");
        gui3.gridx = 1;
        gui3.gridwidth = 1;
        addTutorButton.setFont(font2);
        addTutorButton.setForeground(c9);
        panel3.add(addTutorButton,gui3);
        addTutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(salaryTxt.getText().isEmpty() || specializationTxt.getText().isEmpty() || academicQualificationTxt.getText().isEmpty() || performanceIndexTxt.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame3, "Please  fill all the fields.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        int teacherId = Integer.parseInt(teacherIdTxt.getText());
                        String teacherName = teacherNameTxt.getText();
                        String address = addressTxt.getText();
                        String workingType = workingTypeTxt.getText();
                        String employmentStatus = employmentStatusTxt.getText();
                        int workingHours = Integer.parseInt(workingHoursTxt.getText());;
                    
                        double salary = Double.parseDouble(salaryTxt.getText());
                        String specialization = specializationTxt.getText();
                        String academicQualifications = academicQualificationTxt.getText();
                        int performanceIndex = Integer.parseInt(performanceIndexTxt.getText());
                        
                        if(Double.parseDouble(salaryTxt.getText())<0){
                            JOptionPane.showMessageDialog(frame3, "Invalid Salary", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else if(Integer.parseInt(performanceIndexTxt.getText())<5 || Integer.parseInt(performanceIndexTxt.getText())>10){
                                JOptionPane.showMessageDialog(frame3, "Invalid Performance Index", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                
                            teacherList.add(new Tutor(teacherId,teacherName,address,workingType,employmentStatus,workingHours,salary,specialization,academicQualifications,performanceIndex));
                            JOptionPane.showMessageDialog(frame3, "Tutor is added.", "Information", JOptionPane.INFORMATION_MESSAGE);
                            //clearing all the fields after adding the tutor in arraylist
                            teacherIdTxt.setText("");
                            teacherNameTxt.setText("");
                            addressTxt.setText("");
                            workingTypeTxt.setText("");
                            employmentStatusTxt.setText("");
                            workingHoursTxt.setText("");
                            salaryTxt.setText("");
                            specializationTxt.setText("");
                            academicQualificationTxt.setText("");
                            performanceIndexTxt.setText("");
                            frame.dispose();
                        }
                    }
                }
                catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(frame3,"Number Format Exception");
                }
            }
        });
        
        //go back button
        goBack4Button = new JButton("Back");
        gui3.gridx = 2;
        gui3.gridwidth = 1;
        goBack4Button.setFont(font2);
        goBack4Button.setForeground(c9);
        panel3.add(goBack4Button,gui3);
        goBack4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame3.dispose();
                newFrame1();
            }
        });
        //set salary button
        setSalaryButton = new JButton("Set Salary");
        gui3.gridx = 0;
        gui3.gridy = 5;
        gui3.gridwidth = 2;
        setSalaryButton.setFont(font2);
        setSalaryButton.setForeground(c9);
        panel3.add(setSalaryButton,gui3);
        setSalaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(false);
                frame3.getContentPane().add(panel5, BorderLayout.NORTH);
                panel5.setVisible(true);
            }
        });
        
        //remove tutor button
        removeTutorButton = new JButton ("Remove Tutor");
        gui3.gridx = 1;
        gui3.gridwidth = 2;
        removeTutorButton.setFont(font2);
        removeTutorButton.setForeground(c9);
        panel3.add(removeTutorButton,gui3);  
        removeTutorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel3.setVisible(false);
                frame3.getContentPane().add(panel6,BorderLayout.NORTH);
                panel6.setVisible(true);
            }
        });
        
        frame3.getContentPane().setBackground(Color.decode("#FEFAF6"));
        frame3.getContentPane().add(panel3,BorderLayout.NORTH);
        
        //panel5 for set salary
        panel5 = new JPanel(new GridBagLayout());
        panel5.setBackground(Color.decode("#FEFAF6"));
        GridBagConstraints gui5 = new GridBagConstraints();
        gui5.insets = new Insets(20,10,10,10);
        
        // Teacher Id
        teacherId2Label = new JLabel("Teacher ID:");
        gui5.gridx = 0;
        gui5.gridy = 0;
        teacherId2Label.setFont(font1);
        teacherId2Label.setForeground(c4);
        panel5.add(teacherId2Label, gui5);

        teacherId2Txt = new JTextField(15);
        gui5.gridx = 1;
        teacherId2Txt.setFont(font1);
        teacherId2Txt.setBackground(c6);
        teacherId2Txt.setForeground(c4);
        panel5.add(teacherId2Txt, gui5);

        
        // New salary
        newSalaryLabel = new JLabel("New Salary:");
        gui5.gridx = 0;
        gui5.gridy = 1;
        newSalaryLabel.setFont(font1);
        newSalaryLabel.setForeground(c4);
        panel5.add(newSalaryLabel, gui5);
        
        newSalaryTxt = new JTextField(15);
        gui5.gridx = 1;
        newSalaryTxt.setFont(font1);
        newSalaryTxt.setBackground(c6);
        newSalaryTxt.setForeground(c4);
        panel5.add(newSalaryTxt, gui5);
        
        // New Performance Index
        newPerformanceIndexLabel = new JLabel("New Performance Index:");
        gui5.gridx = 0;
        gui5.gridy = 2;
        newPerformanceIndexLabel.setFont(font1);
        newPerformanceIndexLabel.setForeground(c4);
        panel5.add(newPerformanceIndexLabel, gui5);

        newPerformanceIndexTxt = new JTextField(15);
        gui5.gridx = 1;
        newPerformanceIndexTxt.setFont(font1);
        newPerformanceIndexTxt.setBackground(c6);
        newPerformanceIndexTxt.setForeground(c4);
        panel5.add(newPerformanceIndexTxt, gui5);

        //clear button
        clear3Button = new JButton("Clear");
        gui5.gridx = 0;
        gui5.gridy = 3;
        gui5.gridwidth = 1;
        clear3Button.setFont(font2);
        clear3Button.setForeground(c9);
        panel5.add(clear3Button,gui5);
        clear3Button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(frame3, "Are you sure you want to clear all fields?", "Clear Text Fields Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                teacherId2Txt.setText("");
                newSalaryTxt.setText("");
                newPerformanceIndexTxt.setText("");

           } else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {

            }
           }
        });
        
        //set salary button
        setSalary1Button = new JButton("Set Salary");
        gui5.gridx = 1;
        gui5.gridwidth = 1;
        setSalary1Button.setFont(font2);
        setSalary1Button.setForeground(c9);
        panel5.add(setSalary1Button,gui5);
        setSalary1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    if(teacherId2Txt.getText().isEmpty() || newSalaryTxt.getText().isEmpty() || newPerformanceIndexTxt.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame3, "Please  fill all the fields.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                    
                        int teacherId = Integer.parseInt(teacherId2Txt.getText());
                        double salary = Double.parseDouble(newSalaryTxt.getText());
                        int performanceIndex = Integer.parseInt(newPerformanceIndexTxt.getText());
                        
                        if(Double.parseDouble(newSalaryTxt.getText())<0){
                            JOptionPane.showMessageDialog(frame3, "Invalid Salary", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else if(Integer.parseInt(newPerformanceIndexTxt.getText())<5 || Integer.parseInt(newPerformanceIndexTxt.getText())>10){
                            JOptionPane.showMessageDialog(frame3, "Invalid Performance Index", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            for(Teacher tut:teacherList)
                            {
                                if(tut instanceof Tutor)
                                {
                                    if(tut.getTeacherId() == teacherId)
                                    {
                                        Tutor obj1 = (Tutor) tut;
                                        JOptionPane.showMessageDialog(frame3,obj1.setSalary(salary,performanceIndex), "Information", JOptionPane.INFORMATION_MESSAGE);
                                    
                                        teacherId2Txt.setText("");
                                        newSalaryTxt.setText("");
                                        newPerformanceIndexTxt.setText("");
                                        break;
    
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(frame3, "Teacher Id not found.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }   
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(frame3,"Number Format Exception");
                }
            }
        });
        //go back button
        goBack3Button = new JButton("Back");
        gui5.gridx = 2;
        gui5.gridwidth = 1;
        goBack3Button.setFont(font2);
        goBack3Button.setForeground(c9);
        panel5.add(goBack3Button,gui5);
        goBack3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel5.setVisible(false);
                panel3.setVisible(true);
            }
        });
        
        
        
        //panel6 for remove tutor
        panel6 = new JPanel(new GridBagLayout());
        panel6.setBackground(Color.decode("#FEFAF6"));
        GridBagConstraints gui6 = new GridBagConstraints();
        gui6.insets = new Insets(20,10,10,10);
        
        // Teacher Id
        teacherId3Label = new JLabel("Teacher ID:");
        gui6.gridx = 0;
        gui6.gridy = 0;
        teacherId3Label.setFont(font1);
        teacherId3Label.setForeground(c4);
        panel6.add(teacherId3Label, gui6);

        teacherId3Txt = new JTextField(15);
        gui6.gridx = 1;
        teacherId3Txt.setFont(font1);
        teacherId3Txt.setBackground(c6);
        teacherId3Txt.setForeground(c4);
        panel6.add(teacherId3Txt, gui6);
        
        //clear button
        clear5Button = new JButton("Clear");
        gui6.gridx = 0;
        gui6.gridy = 2;
        gui6.gridwidth = 1;
        clear5Button.setFont(font2);
        clear5Button.setForeground(c9);
        panel6.add(clear5Button,gui6);
        clear5Button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(frame3, "Are you sure you want to clear all fields?", "Clear Text Fields Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                
            teacherId3Txt.setText("");
            
            } else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {

            }
           }
        });
        
        //remove tutor button
        removeTutor1Button = new JButton ("Remove Tutor");
        gui6.gridx = 1;
        gui6.gridwidth = 1;
        removeTutor1Button.setFont(font2);
        removeTutor1Button.setForeground(c9);
        panel6.add(removeTutor1Button,gui6);
        removeTutor1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    if(teacherId3Txt.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame3, "Please  fill all the fields.", "Information", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        int teacherId = Integer.parseInt(teacherId3Txt.getText());
                    
                        for(Teacher tut:teacherList)
                        {
                            if(tut instanceof Tutor)
                            {
                                if(tut.getTeacherId() == teacherId)
                                {
                                    Tutor obj1 = (Tutor) tut;
                                    JOptionPane.showMessageDialog(frame3,obj1.removeTutor(), "Information", JOptionPane.INFORMATION_MESSAGE);                                
                                    
                                    teacherId3Txt.setText("");
                                    break;

                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(frame3, "Teacher Id not found.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(frame3,"Number Format Exception");
                }
            }
        });
        
        //go back button
        goBack5Button = new JButton("Back");
        gui6.gridx = 2;
        gui6.gridwidth = 1;
        goBack5Button.setFont(font2);
        goBack5Button.setForeground(c9);
        panel6.add(goBack5Button,gui6);
        goBack5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel6.setVisible(false);
                panel3.setVisible(true);
            }
        });
        
        frame3.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TeacherGUI();
    }
}
