import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lms extends JFrame{
    // declaring the fields from which we are taking input form the 
    JTextField studentNameField, classNameField, rollNumberField, bookNameField, authorNameField, issueDateField, returnDateField; 
    JButton addButton;
    JTextArea bookListArea;

    ArrayList<String> bookList; // arraylist to store book detail

    lms(){
        setLayout(new BorderLayout());
        bookList = new ArrayList<>(); // initialized 
        bookListArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(bookListArea);
        add(scrollPane,BorderLayout.CENTER);

        // initialization of components
        JPanel inputPanel = new JPanel(new GridLayout(8,2,8,8));
        studentNameField = new JTextField();
        classNameField = new JTextField();
        rollNumberField = new JTextField();
        bookNameField  = new JTextField();
        authorNameField = new JTextField();
        issueDateField = new JTextField();
        returnDateField = new JTextField();
        addButton = new JButton("Add book");
        // bookListArea = new JTextArea(); this gives me a error coz bookListArea is initialized again !!!!!
        // can not say error 🤔 but not displaying any output on the text area

        
        inputPanel.add(new JLabel("Student Name: "));
        inputPanel.add(studentNameField);
        inputPanel.add(new JLabel("Class Name: "));
        inputPanel.add(classNameField);
        inputPanel.add(new JLabel("Roll number: "));
        inputPanel.add(rollNumberField);
        inputPanel.add(new JLabel("Book Name: "));
        inputPanel.add(bookNameField);
        inputPanel.add(new JLabel("Author Name: "));
        inputPanel.add(authorNameField);
        inputPanel.add(new JLabel("Issue Date: "));
        inputPanel.add(issueDateField);
        inputPanel.add(new JLabel("Return Date"));
        inputPanel.add(returnDateField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                addBook();
            }
        });
        setLocationRelativeTo(null);
        setTitle("Library Management System");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void addBook(){
        String studentName = studentNameField.getText();
        String className = classNameField.getText();
        String rollNumber = rollNumberField.getText();
        String bookName = bookNameField.getText();
        String authorName = authorNameField.getText();
        String issueDate = issueDateField.getText();
        String returnDate = returnDateField.getText();

        
        if (!studentName.isEmpty() && !className.isEmpty() && !rollNumber.isEmpty() && !bookName.isEmpty() && !authorName.isEmpty() && !issueDate.isEmpty() && !returnDate.isEmpty()){
            String bookDetails = "Student Name: " + studentName + ", Class Name: " + rollNumber + ", Book Name: " + bookName + ", Author Name: " + authorName + ", Issue Date: " + issueDate + ", Return Date: " + returnDate;

            bookList.add(bookDetails);
            updateBookList();
            clearInputFields();
        } else{
            // to prompt if any of the above condition is false like here we decided that ! isEmpty()
            JOptionPane.showMessageDialog(this,"Please fill in all fields."); 
        }
    }

    void updateBookList(){
        // pending concept !!!!!
        StringBuilder stringBuilder = new StringBuilder();
        for(String bookDetails : bookList){
            stringBuilder.append(bookDetails).append("\n\n");
        }
        bookListArea.setText(stringBuilder.toString());
    }

    void clearInputFields(){
        studentNameField.setText("");
        classNameField.setText("");
        rollNumberField.setText("");
        bookNameField.setText("");
        authorNameField.setText("");
        issueDateField.setText("");
        returnDateField.setText("");
    }

    public static void main(String[] args){
        new lms();
    }
}