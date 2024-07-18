
/**
 * Here I have created the GUI for the RARA PUBLIC SCHOOL....
 * In the main frame od this gui I have created two option either to add regular student or dropout student....
 *
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI {
    //declearging the arraylist where we are going to store the value entered in the textfields
    ArrayList<Student> studentList;

    //three frame are decleared for three different gui
    JFrame frame = new JFrame("RARA PUBLIC SCHOOL");//main gui
    JFrame frame1 = new JFrame("ADD REGULAR STUDENT");//for regular gui
    JFrame frame2=new JFrame("ADD DROPOUT STUDENT");//for droput gui

    //three different panel is decleared for three different gui
    JPanel panel = new JPanel(); //for main gui
    JPanel panel1 = new JPanel();//for regular gui
    JPanel panel2 = new JPanel();//for regular gui

    //an object of gridBagConstraint is made here so that we can use it in 3 different class
    GridBagConstraints gbc = new GridBagConstraints();

    //label and textfield section
    JLabel message =new JLabel();

    JLabel nameLabel = new JLabel("Student Name:");
    JTextField nameTextField = new JTextField(20);

    JLabel enrollmentIdLabel = new JLabel("Enrollment ID:");
    JTextField enrollmentIdTextField = new JTextField(20);

    JLabel courseLabel = new JLabel("Course Name:");
    JTextField courseTextField = new JTextField(20);

    JLabel durationLabel = new JLabel("Course Duration:");
    JTextField durationTextField = new JTextField(20);

    JLabel tuitionFeeLabel = new JLabel("Tuition Fee:");
    JTextField tuitionFeeTextField = new JTextField(20);

    JLabel modulesLabel = new JLabel("Number of Modules:");
    JTextField modulesTextField = new JTextField(20);

    JLabel creditHoursLabel = new JLabel("Number of Credit Hours:");
    JTextField creditHoursTextField = new JTextField(20);

    JLabel daysPresentLabel = new JLabel("Number of Days Present:");
    JTextField daysPresentTextField = new JTextField(20);

    JLabel remainingModulesLabel = new JLabel("Remaining Modules:");
    JTextField remainingModulesTextField = new JTextField(20);

    JLabel monthsAttendedLabel = new JLabel("Number of Months Attended:");
    JTextField monthsAttendedTextField = new JTextField(20);

    JLabel remainingAmountLabel = new JLabel("Remaining Amount:");
    JLabel remainingAmountMessage = new JLabel("Display after BillsPayable Calculation");

    //Declare string array for year month and date
    String year[]={"Select year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
    String month[]={"Select month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String date[]={"Select date","1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};

    //label and comboBox for different dates
    JLabel dobLabel = new JLabel("Date of Birth:");
    JComboBox dobYearComboBox= new JComboBox<>(year);
    JComboBox dobMonthComboBox=new JComboBox<>(month);
    JComboBox dobDayComboBox=new JComboBox<>(date);

    JLabel doeLabel = new JLabel("Date of Enrollment:");

    JComboBox doeYearComboBox= new JComboBox<>(year);
    JComboBox doeMonthComboBox=new JComboBox<>(month);
    JComboBox doeDayComboBox=new JComboBox<>(date);

    JLabel dodLabel = new JLabel("Date of Dropout:");
    JComboBox dodYearComboBox= new JComboBox<>(year);
    JComboBox dodMonthComboBox=new JComboBox<>(month);
    JComboBox dodDayComboBox=new JComboBox<>(date);

    //button section

    //button for main gui
    JButton addRegularButton = new JButton("Add a Regular Student");
    JButton addDropoutButton = new JButton("Add a Dropout Student");

    //button used in both gui
    JButton addButton = new JButton("Add Student");
    JButton clearButton = new JButton("Clear");
    JButton displayButton = new JButton("Display");
    JButton backButton = new JButton("Back");

    //button used in regular gui
    JButton grantButton = new JButton("Grant Scholorship");
    JButton presentPercentageButton = new JButton("Present Percentage");

    //button used in dropout gui
    JButton removeButton= new JButton("Remove Student");
    JButton billsPayableButton= new JButton("Bills Payable");

    // create the contructor that call the method name gui
    public StudentGUI() {
        gui();
    }

    // create the method that create the main frame
    private void gui() {
        //declare the studentList as new arryaList
        studentList = new ArrayList<>();
        // set the frame exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the layout for panel
        panel.setLayout(new GridBagLayout());
        // set insets
        gbc.insets=new Insets(5,5,5,5);
        // set size to the frame
        frame.setSize(1200, 500);
        // declare label
        JLabel message = new JLabel("Welcome to");
        JLabel message1 = new JLabel("RARA School");
        // set the font to the label
        message.setFont(new Font("Bell MT",Font.PLAIN,25));
        message1.setFont(new Font("Bell MT",Font.PLAIN,30));


        // Add function to the button
        addRegularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regularGui();
            }
        });

        addDropoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//regular ko button jasari function add garna xw
                dropoutGui();
            }
        });

        // add different component to the panel
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(message, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(message1, gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        panel.add(addRegularButton ,gbc);

        gbc.gridx=2;
        panel.add(addDropoutButton,gbc);

        frame.add(panel);
        frame.setVisible(true);
    }

    //create a method that make the takes regular gui
    public void regularGui(){
        //set the function to the frame of regularGui
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.setLayout(new GridBagLayout());
        gbc.insets=new Insets(5,5,5,5);
        frame1.setSize(1200, 500);

        message.setText("ADD REGULAR STUDENT");

        message.setFont(new Font("Courier",Font.PLAIN,15));

        // add component to the regular gui frame
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel1.add(message, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(nameLabel, gbc);

        gbc.gridx = 1;
        panel1.add(nameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel1.add(enrollmentIdLabel, gbc);

        gbc.gridx=1;
        panel1.add(enrollmentIdTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        panel1.add(courseLabel,gbc);

        gbc.gridx=1;
        panel1.add(courseTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        panel1.add(durationLabel,gbc);

        gbc.gridx=1;
        panel1.add(durationTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=5;
        panel1.add(tuitionFeeLabel ,gbc);

        gbc.gridx=1;
        panel1.add(tuitionFeeTextField ,gbc);

        gbc.gridx=4;
        gbc.gridy=3;
        panel1.add(modulesLabel ,gbc);

        gbc.gridx=5;
        panel1.add(modulesTextField ,gbc);

        gbc.gridx=4;
        gbc.gridy=2;
        panel1.add(daysPresentLabel ,gbc);

        gbc.gridx=5;
        panel1.add(daysPresentTextField ,gbc);

        gbc.gridx=4;
        gbc.gridy=1;
        panel1.add(creditHoursLabel,gbc);

        gbc.gridx=5;
        panel1.add(creditHoursTextField,gbc);

        gbc.gridx=4;
        gbc.gridy=4;
        panel1.add(dobLabel ,gbc);

        gbc.gridx=5;
        gbc.insets=new Insets(0,-100,0,5);
        panel1.add(dobYearComboBox ,gbc);

        gbc.gridx=6;
        gbc.insets=new Insets(0,-100,0,3);
        panel1.add(dobMonthComboBox,gbc);

        gbc.gridx=7;
        gbc.insets=new Insets(0,3,0,3);
        panel1.add(dobDayComboBox ,gbc);

        gbc.insets=new Insets(5,5,5,5);
        gbc.gridx=4;
        gbc.gridy=5;
        panel1.add(doeLabel ,gbc);

        gbc.gridx=5;
        gbc.insets=new Insets(0,-100,0,5);
        panel1.add(doeYearComboBox ,gbc);

        gbc.gridx=6;
        gbc.insets=new Insets(0,-100,0,3);
        panel1.add(doeMonthComboBox,gbc);

        gbc.gridx=7;
        gbc.insets=new Insets(0,3,0,3);
        panel1.add(doeDayComboBox ,gbc);

        gbc.insets=new Insets(5,80,5,0);

        gbc.gridx=2;
        gbc.gridy=6;
        panel1.add(addButton,gbc);

        gbc.gridx=1;
        gbc.gridy=7;
        panel1.add(presentPercentageButton,gbc);

        gbc.gridx=2;
        gbc.gridy=7;
        panel1.add(grantButton,gbc);

        gbc.gridx=4;
        panel1.add(displayButton,gbc);


        gbc.gridx=2;
        gbc.gridy=8;
        panel1.add(backButton,gbc);

        gbc.gridx=2;
        gbc.gridy=9;
        panel1.add(clearButton,gbc);


        // set the frame of regular gui to visible
        frame.setVisible(false);
        frame1.add(panel1);
        frame1.setVisible(true);

        //add function to different button of regular gui
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int enrollmentId=Integer.parseInt(enrollmentIdTextField.getText());
                try{
                    for (Student student : studentList){
                        if (student.getEnrollmentId()==enrollmentId){
                            JOptionPane.showMessageDialog(frame1,"The Enrollment id already exist");
                        }
                        else{
                            regular();
                            clear();
                        }
                        break;
                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(frame1,"Invalid hello hi bye");
                    System.out.println(ex.getMessage());
                }


            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                frame.setVisible(true);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }

        });

        grantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grant();
                clear();
            }
        });

        presentPercentageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePresentPercentage();
                clear();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regularDisplay();
                clear();
            }
        });
    }

    //create a method that make the takes dropout gui
    public void dropoutGui(){
        // set function to the dropout gui frame
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel2.setLayout(new GridBagLayout());
        gbc.insets=new Insets(5,5,5,5);
        frame2.setSize(1200, 500);

        message.setText("ADD DROPOUT STUDENT");
        message.setFont(new Font("Courier",Font.PLAIN,15));

        // add different component to dropout gui panel
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel2.add(message, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel2.add(nameLabel, gbc);

        gbc.gridx = 1;
        panel2.add(nameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel2.add(enrollmentIdLabel, gbc);

        gbc.gridx=1;
        panel2.add(enrollmentIdTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        panel2.add(courseLabel,gbc);

        gbc.gridx=1;
        panel2.add(courseTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        panel2.add(durationLabel,gbc);

        gbc.gridx=1;
        panel2.add(durationTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=5;
        panel2.add(tuitionFeeLabel ,gbc);

        gbc.gridx=1;
        panel2.add(tuitionFeeTextField ,gbc);

        gbc.gridx=0;
        gbc.gridy=6;
        panel2.add(remainingAmountLabel ,gbc);

        gbc.gridx=1;
        panel2.add(remainingAmountMessage ,gbc);

        gbc.gridx=4;
        gbc.gridy=1;
        panel2.add(remainingModulesLabel ,gbc);

        gbc.gridx=5;
        panel2.add(remainingModulesTextField ,gbc);

        gbc.gridx=4;
        gbc.gridy=2;
        panel2.add(monthsAttendedLabel ,gbc);

        gbc.gridx=5;
        panel2.add(monthsAttendedTextField,gbc);

        gbc.gridx=4;
        gbc.gridy=3;
        panel2.add(dodLabel,gbc);

        gbc.gridx=5;
        gbc.insets=new Insets(0,-100,0,5);
        panel2.add(dodYearComboBox ,gbc);

        gbc.gridx=6;
        gbc.insets=new Insets(0,-100,0,3);
        panel2.add(dodMonthComboBox,gbc);

        gbc.gridx=7;
        gbc.insets=new Insets(0,3,0,3);
        panel2.add(dodDayComboBox ,gbc);

        gbc.insets=new Insets(5,5,5,5);
        gbc.gridx=4;
        gbc.gridy=4;
        panel2.add(dobLabel ,gbc);

        gbc.gridx=5;
        gbc.insets=new Insets(0,-100,0,5);
        panel2.add(dobYearComboBox ,gbc);

        gbc.gridx=6;
        gbc.insets=new Insets(0,-100,0,3);
        panel2.add(dobMonthComboBox,gbc);

        gbc.gridx=7;
        gbc.insets=new Insets(0,3,0,3);
        panel2.add(dobDayComboBox ,gbc);

        gbc.insets=new Insets(5,5,5,5);
        gbc.gridx=4;
        gbc.gridy=5;
        panel2.add(doeLabel ,gbc);

        gbc.gridx=5;
        gbc.insets=new Insets(0,-100,0,5);
        panel2.add(doeYearComboBox ,gbc);

        gbc.gridx=6;
        gbc.insets=new Insets(0,-100,0,3);
        panel2.add(doeMonthComboBox,gbc);

        gbc.gridx=7;
        gbc.insets=new Insets(0,3,0,3);
        panel2.add(doeDayComboBox ,gbc);

        gbc.insets=new Insets(5,80,5,0);
        gbc.gridx=2;
        gbc.gridy=7;
        panel2.add(addButton,gbc);

        gbc.gridx=1;
        gbc.gridy=8;
        panel2.add(removeButton,gbc);

        gbc.gridx=2;
        gbc.gridy=8;
        panel2.add(billsPayableButton,gbc);

        gbc.gridx=4;
        panel2.add(displayButton,gbc);

        gbc.gridx=2;
        gbc.gridy=9;
        panel2.add(backButton,gbc);

        gbc.gridx=2;
        gbc.gridy=10;
        panel2.add(clearButton,gbc);



        frame.setVisible(false);
        frame2.add(panel2);
        frame2.setVisible(true);

        // add function to different button of dropout gui
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drop();
                clear();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                frame.setVisible(true);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove();
                clear();
            }
        });

        billsPayableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                billPayable();
                clear();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dropoutDisplay();
                clear();
            }
        });
    }

    // create a method drop that store the value entered in dropout gui in studentList
    public void drop(){

        // Enter the reguired code that can make exception
        try {
            // declare the variable and store the value as required
            int enrollmentId = Integer.parseInt(enrollmentIdTextField.getText());
            String studentName = nameTextField.getText();
            String courseName = courseTextField.getText();
            String dateOfBirth = dobYearComboBox.getSelectedItem() + "-" +
                    (dobMonthComboBox.getSelectedIndex() + 1) + "-" +
                    dobDayComboBox.getSelectedItem();
            String dateOfEnrollment = doeYearComboBox.getSelectedItem() + "-" +
                    (doeMonthComboBox.getSelectedIndex() + 1) + "-" +
                    doeDayComboBox.getSelectedItem();
            String dateOfDropout = dodYearComboBox.getSelectedItem() + "-" +
                    (dodMonthComboBox.getSelectedIndex() + 1) + "-" +
                    dodDayComboBox.getSelectedItem();
            int courseDuration = Integer.parseInt(durationTextField.getText());
            int tuitionFee = Integer.parseInt(tuitionFeeTextField.getText());
            int numOfRemainingModules = Integer.parseInt(remainingModulesTextField.getText());
            int numOfMonthsAttended = Integer.parseInt(monthsAttendedTextField.getText());

            // stroe the value below in comment accordingly in dropout constructor
//            double remainingAmount = Double.parseDouble(remainingAmountTextField.getText());
//            String dateOfBirth,
//            String courseName,
//            int enrollmentId,String dateOfEnrollment,String studentName,double courseDuration,double tuitionFee,int numOfRemainingModules,
//            int numOfMonthAttended,String dateOfDropout
            Dropout dropoutStd = new Dropout(dateOfBirth,courseName,enrollmentId, dateOfEnrollment, studentName, courseDuration,
                    tuitionFee, numOfRemainingModules, numOfMonthsAttended, dateOfDropout);
            studentList.add(dropoutStd);
            // after the data is added in the studentList show the popup
            JOptionPane.showMessageDialog(frame2,"Student Added");


        } catch (NumberFormatException ex) {

            // show the popup when the exception come
            JOptionPane.showMessageDialog(frame2, "Invalid input. Please fill it properly");

        }}


    // create a method drop that store the value entered in regular gui in studentList
    public void regular(){
        // Enter the reguired code that can make exception
        try {
            // declare the variable and store the value as required
            int enrollmentId = Integer.parseInt(enrollmentIdTextField.getText());
            String studentName = nameTextField.getText();
            String courseName = courseTextField.getText();
            String dateOfBirth = dobYearComboBox.getSelectedItem() + "-" +
                    (dobMonthComboBox.getSelectedIndex() + 1) + "-" +
                    dobDayComboBox.getSelectedItem();
            String dateOfEnrollment = doeYearComboBox.getSelectedItem() + "-" +
                    (doeMonthComboBox.getSelectedIndex() + 1) + "-" +
                    doeDayComboBox.getSelectedItem();
            int daysPresent = Integer.parseInt(daysPresentTextField.getText());
            int courseDuration = Integer.parseInt(durationTextField.getText());
            int tuitionFee = Integer.parseInt(tuitionFeeTextField.getText());
            int numOfModules = Integer.parseInt(modulesTextField.getText());
            int numOfCreditHours = Integer.parseInt(creditHoursTextField.getText());
            // stroe the value below in comment accordingly in regular constructor
//            int enrollmentId,String dateOfBirth,String courseName,String studentName,
//                    String dateOfEnrollment,double courseDuration,
//            double tuitionFee,int numOfModules,int numOfCreditHours,
//            double daysPresent
            Regular regularStd = new Regular(enrollmentId,dateOfBirth,courseName, studentName, dateOfEnrollment, courseDuration,
                    tuitionFee, numOfModules, numOfCreditHours, daysPresent);
            studentList.add(regularStd);
            // after the data is added in the studentList show the popup
            JOptionPane.showMessageDialog(frame1,"Student Added");

        } catch (NumberFormatException ex) {

            // show the popup when the exception come
            JOptionPane.showMessageDialog(frame1, "Invalid input. Please fill it properly");

        }}

    // create the method for the function of button that calculate the present percentage
    public void calculatePresentPercentage() {
        JFrame frame3 = new JFrame("Calculate Percentage");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        JLabel enrollmentIdLabel = new JLabel("Enrollment ID:");
        JTextField enrollmentIdTextField = new JTextField(20);

        JLabel daysPresentLabel = new JLabel("Days Present:");
        JTextField daysPresentTextField = new JTextField(20);



        JButton calculateButton = new JButton("Calculate");
        JButton backButton = new JButton("Back");

        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(enrollmentIdLabel,gbc);

        gbc.gridx=1;
        panel.add(enrollmentIdTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(daysPresentLabel,gbc);

        gbc.gridx=1;
        panel.add(daysPresentTextField,gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(calculateButton, gbc);


        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(backButton, gbc);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int enrollmentId = Integer.parseInt(enrollmentIdTextField.getText());
                    double daysPresent = Double.parseDouble(daysPresentTextField.getText());

                    boolean reg = false;
                    for (Student student : studentList) {
                        if (student instanceof Regular && student.getEnrollmentId() == enrollmentId) {
                            Regular r1 = (Regular) student; //downcasting
                            String grade = r1.presentPercentage(daysPresent);//call the method
                            if (!grade.isEmpty()) {
                                JOptionPane.showMessageDialog(frame, "The Student grade is"+grade);
                            }
                            else {
                                JOptionPane.showMessageDialog(frame, "ERROR:Invalid Input(daysPresent cant be greater then courseDuration)");
//                        System.out.println("why");
                            }
                            reg = true;
                            break;
                        }
                    }
                    if (!reg){
                        JOptionPane.showMessageDialog(frame, "No iD found");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "ERROR:Invalid Input");
//            System.out.println("Exception here");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(false);
            }
        });

        frame3.setVisible(true);
        frame3.add(panel);
        frame3.setSize(350,350);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    // create the method for the function of button that calculate the bill payable
    public void billPayable() {

        JFrame frame5 = new JFrame("Payables Bills");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel enrollmentIdLabel = new JLabel("Enrollment ID:");
        JTextField enrollmentIdTextField = new JTextField(20);

        JButton payButton = new JButton("Pays bill");
        JButton backButton = new JButton("Back");

        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(enrollmentIdLabel,gbc);

        gbc.gridx=1;
        panel.add(enrollmentIdTextField,gbc);


        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(payButton, gbc);

        gbc.gridy = 6;
        gbc.gridx = 1;
        panel.add(backButton, gbc);

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int enrollmentId = Integer.parseInt(enrollmentIdTextField.getText());
                    boolean drp = false;
                    for (Student student : studentList) {

                        if (student instanceof Dropout && student.getEnrollmentId() == enrollmentId) {
                            Dropout d1 = (Dropout) student;//downcasting
                            d1.billsPayable();//call the method
                            if(d1.getHasPaid()){
                                JOptionPane.showMessageDialog(frame,"The bill has been paid");
                            }
                            else {
                                JOptionPane.showMessageDialog(frame,d1.getRemainingAmount()+" need to be paid");
                            }
                            remainingAmountMessage.setText(d1.getRemainingAmount()+" for EnrollmentId: "+enrollmentId);
                            drp= true;
                            break;
                        }
                    }
                    if (!drp) {
                        JOptionPane.showMessageDialog(frame, "No iD found");
                    }


                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame5, "ERROR:Invalid Input");
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame5.setVisible(false);
            }
        });

        frame5.setVisible(true);
        frame5.add(panel);
        frame5.setSize(350,350);
        frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    // create the method for the function of button that remove the student
    public void remove(){

        JFrame frame6 = new JFrame("Remove Student");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel enrollmentIdLabel = new JLabel("Enrollment ID:");
        JTextField enrollmentIdTextField = new JTextField(20);

        JButton removeButton = new JButton("Remove");
        JButton backButton = new JButton("Back");

        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(enrollmentIdLabel,gbc);

        gbc.gridx=1;
        panel.add(enrollmentIdTextField,gbc);


        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(removeButton, gbc);

        gbc.gridy = 6;
        gbc.gridx = 1;
        panel.add(backButton, gbc);

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int enrollmentId = Integer.parseInt(enrollmentIdTextField.getText());

                    boolean drp= false;
                    for (Student student : studentList) {
                        if (student instanceof Dropout && student.getEnrollmentId() == enrollmentId) {
                            Dropout d1 = (Dropout) student;//downcasting
                            d1.billsPayable();//call the method
                            d1.removeStudent();


                            if(d1.getHasPaid()){
                                JOptionPane.showMessageDialog(frame6, "The student with EnrollmentId "+
                                        enrollmentIdTextField.getText()+" has been removed");
                            }
                            else{
                                JOptionPane.showMessageDialog(frame6, "The student with EnrollmentId "+
                                        enrollmentIdTextField.getText()+" has to clear the fee of: "+d1.getRemainingAmount()+"before " +
                                        "get removed.");
                            }
                            remainingAmountMessage.setText(d1.getRemainingAmount()+"");
                            drp= true;
                            break;
                        }
                    }
//            System.out.println(f);
                    if (!drp) {
                        JOptionPane.showMessageDialog(frame6, "No id found");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame6, "ERROR: Invalid Input");
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame6.setVisible(false);
            }
        });

        frame6.setVisible(true);
        frame6.add(panel);
        frame6.setSize(350,350);
        frame6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    // create the method for the function of button that cgrant certificate to student
    public void grant() {

        JFrame frame4 = new JFrame("Grant Certificate");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        JLabel enrollmentIdLabel = new JLabel("Enrollment ID:");
        JTextField enrollmentIdTextField = new JTextField(20);

        JLabel courseLabel = new JLabel("Course Name:");
        JTextField courseTextField = new JTextField(20);

        JLabel daysPresentLabel = new JLabel("Days Present:");
        JTextField daysPresentTextField = new JTextField(20);

        JLabel dateOfEnrollment = new JLabel("Date Of Enrollment:");
        String year[]={"Select year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        String month[]={"Select month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String date[]={"Select date","1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};

        JComboBox doeYear= new JComboBox<>(year);
        JComboBox doeMonth=new JComboBox<>(month);
        JComboBox doeDay=new JComboBox<>(date);

        JButton grantButton = new JButton("Grant CertiFicate");
        JButton backButton = new JButton("Cancel");

        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(enrollmentIdLabel,gbc);

        gbc.gridx=1;
        panel.add(enrollmentIdTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(courseLabel,gbc);

        gbc.gridx=1;
        panel.add(courseTextField,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(dateOfEnrollment,gbc);

        gbc.gridx=1;
        gbc.insets=new Insets(0,-60,0,5);
        panel.add(doeYear,gbc);

        gbc.gridx=2;
        gbc.insets=new Insets(0,-70,0,3);
        panel.add(doeMonth,gbc);

        gbc.gridx=3;
        gbc.insets=new Insets(0,3,0,3);
        panel.add(doeDay,gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        gbc.insets=new Insets(0,0,0,0);
        panel.add(daysPresentLabel,gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        panel.add(daysPresentTextField,gbc);

        gbc.gridy = 6;
        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(grantButton, gbc);

        gbc.gridy = 7;
        gbc.gridx = 1;
        panel.add(backButton, gbc);


        grantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int enrollmentId = Integer.parseInt(enrollmentIdTextField.getText());
                    String courseName = courseTextField.getText();
                    double daysPresent = Double.parseDouble(daysPresentTextField.getText());
                    String dateOfEnrollment = doeYear.getSelectedItem() + "-" +
                            (doeMonth.getSelectedIndex() + 1) + "-" +
                            doeDay.getSelectedItem();

                    boolean reg= false;
                    for (Student student : studentList) {
                        if (student instanceof Regular && student.getEnrollmentId() == enrollmentId) {
                            Regular r1 = (Regular) student;//downcasting
                            r1.grantCertificate(courseName, enrollmentId, dateOfEnrollment);//call the  method
                            r1.presentPercentage(daysPresent);

                            if(r1.getIsGrantedScholorship()==true){
                                JOptionPane.showMessageDialog(frame4,"The scholarship has been granted to "+r1.getStudentName()+
                                        " with enrollmentId: " +r1.getEnrollmentId());
                            }
                            else{
                                JOptionPane.showMessageDialog(frame4,"The scholarship has not been granted to "+r1.getStudentName()+
                                        " with enrollmentId: " +r1.getEnrollmentId());
                            }
                            reg= true;
                            break;
                        }
                    }
                    if (!reg) {
                        JOptionPane.showMessageDialog(frame4, "No id found");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame4, "ERROR:Invalid Input");
                }

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame4.setVisible(false);
            }
        });

        frame4.setVisible(true);
        frame4.add(panel);
        frame4.setSize(600,350);
        frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    // create the method for the function of button that clear the field
    public void clear(){
        nameTextField.setText("");
        enrollmentIdTextField.setText("");
        courseTextField.setText("");
        remainingModulesTextField.setText("");
        durationTextField.setText("");
        tuitionFeeTextField.setText("");
        modulesTextField.setText("");
        creditHoursTextField.setText("");
        daysPresentTextField.setText("");
        remainingAmountMessage.setText("Display after BillsPayable Calculation");
        monthsAttendedTextField.setText("");
        dobYearComboBox.setSelectedIndex(0);
        dobMonthComboBox.setSelectedIndex(0);
        dobDayComboBox.setSelectedIndex(0);

        doeYearComboBox.setSelectedIndex(0);
        doeMonthComboBox.setSelectedIndex(0);
        doeDayComboBox.setSelectedIndex(0);

        dodYearComboBox.setSelectedIndex(0);
        dodMonthComboBox.setSelectedIndex(0);
        dodDayComboBox.setSelectedIndex(0);
    }

    // create the method for the function of button that display the recorded data in regular gui
    public void regularDisplay(){
        String[] columnNames = { "Enrollment ID", "Student Name", "Course Name", "Course Duration", "Tuition Fee", "Number of Credit Hours",
                "Number of Days Present","Number Of Modules","Date of Birth","Date of Enrollment" };
        DefaultTableModel regularModel = new DefaultTableModel(columnNames, 0);

        for (Student student : studentList) {
            Regular r1 = (Regular) student;
            int enrollmentId = (r1.getEnrollmentId());
            String studentName = r1.getStudentName();
            String courseName = r1.getCourseName();
            double courseDuration = r1.getCourseDuration();
            double tuitionFee= r1.getTuitionFee();
            int numOfCreditHours = r1.getNumOfCreditHours();
            double daysPresent = r1.getDaysPresent();
            int numOfModules = r1.getNumOfModules();
            String dob = r1.getDateOfBirth();
            String doe = r1.getDateOfEnrollment();

            regularModel.addRow(new Object[] { enrollmentId, studentName, courseName,courseDuration,tuitionFee,
                    numOfCreditHours,daysPresent,numOfModules,dob, doe});
        }

        JTable regularTable = new JTable(regularModel);
        JScrollPane scrollPane = new JScrollPane(regularTable);

        JFrame frame3 = new JFrame("Regular Student Records");
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.add(scrollPane);
        frame3.pack();
        frame3.setVisible(true);
    }

    // create the method for the function of button that display the recorded data in dropout gui
    public void dropoutDisplay(){
        String[] columnNames = { "Enrollment ID", "Student Name", "Course Name", "Course Duration", "Tuition Fee", "Remaining Modules",
                "Number of Month Attended","Date of Birth","Date of Enrollment","Date Of Dropout","Remaining Amount" };
        DefaultTableModel dropoutModel = new DefaultTableModel(columnNames, 0);

        for (Student student : studentList) {
            Dropout d1 = (Dropout) student;
            int enrollmentId = (d1.getEnrollmentId());
            String studentName = d1.getStudentName();
            String courseName = d1.getCourseName();
            double courseDuration = d1.getCourseDuration();
            double tuitionFee= d1.getTuitionFee();
            int numOfRemainingModules = d1.getNumOfRemainingModules();
            double monthAttended = d1.getNumOfMonthAttended();
            String dob = d1.getDateOfBirth();
            String doe = d1.getDateOfEnrollment();
            String dod = d1.getDateOfDropout();
            double remainingAmount=d1.getRemainingAmount();
            dropoutModel.addRow(new Object[] { enrollmentId, studentName, courseName,courseDuration,tuitionFee,
                    numOfRemainingModules,monthAttended,dob, doe,dod,remainingAmount});
        }

        JTable dropoutTable = new JTable(dropoutModel);
        JScrollPane scrollPane = new JScrollPane(dropoutTable);

        JFrame frame4 = new JFrame("Dropout Student Records");
        frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame4.add(scrollPane);
        frame4.pack();
        frame4.setVisible(true);
    }

    //create the main method
    public static void main(String[] args) {
        new StudentGUI();
    }
}