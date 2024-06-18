package library_management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Library_Management {

    private static DefaultListModel<String> bookListModel;

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 900);

        // Load the original icon
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\karwa\\OneDrive\\Documents\\NetBeansProjects\\Library_Management\\src\\main.png");

        // Resize the icon
        Image originalImage = originalIcon.getImage();
        int newWidth = 500;  // New width for the resized icon
        int newHeight = 700; // New height for the resized icon
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the resized image
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Display the resized icon in another JLabel
        JLabel resizedLabel = new JLabel(resizedIcon, JLabel.LEFT);
        resizedLabel.setHorizontalTextPosition(JLabel.LEFT);
        resizedLabel.setVerticalTextPosition(JLabel.BOTTOM);

        // Create form panel for adding books
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.setBorder(BorderFactory.createTitledBorder("Add a Book"));

        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField();
        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField();
        JLabel isbnLabel = new JLabel("ISBN:");
        JTextField isbnField = new JTextField();
        JButton addButton = new JButton("Add Book");

        formPanel.add(titleLabel);
        formPanel.add(titleField);
        formPanel.add(authorLabel);
        formPanel.add(authorField);
        formPanel.add(isbnLabel);
        formPanel.add(isbnField);
        formPanel.add(new JLabel());
        formPanel.add(addButton);

        // Create list model and JList to display books
        bookListModel = new DefaultListModel<>();
        JList<String> bookList = new JList<>(bookListModel);
        JScrollPane listScrollPane = new JScrollPane(bookList);
        listScrollPane.setBorder(BorderFactory.createTitledBorder("Book List"));

        // Add action listener to add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String isbn = isbnField.getText();

                if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String bookDetails = "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
                    bookListModel.addElement(bookDetails);
                    titleField.setText("");
                    authorField.setText("");
                    isbnField.setText("");
                }
            }
        });

        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(resizedLabel, BorderLayout.WEST);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(listScrollPane, BorderLayout.EAST);

        // Display the frame
        frame.setVisible(true);
    }
}
