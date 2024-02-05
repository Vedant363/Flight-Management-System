import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdminPortal extends FlightManagementSystem{
    static JFrame AdmenuFrame;
    AdminPortal() throws SQLException {
        AdmenuFrame = new JFrame("Admin Portal");

        JLabel welcomeLabel = new JLabel("Welcome to Admin Portal");
        welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
        welcomeLabel.setBounds(180, 90, 800, 50);
        AdmenuFrame.add(welcomeLabel);


        JButton flightButton = new JButton("Flight Details");
        flightButton.setBounds(200, 170, 300, 40);
        flightButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        flightButton.setFocusPainted(false);

        flightButton.addActionListener(actionEvent -> {
            try {
                FlightManagementPanel.SetTrue(2);
                new FlightManagementPanel();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            AdmenuFrame.setVisible(false);
        });
        AdmenuFrame.add(flightButton);

        JButton manButton = new JButton("Manager Details");
        manButton.setBounds(200, 240, 300, 40);
        manButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        manButton.setFocusPainted(false);

        manButton.addActionListener(actionEvent -> {
            try {
                new ManagerManagementPanel();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            AdmenuFrame.setVisible(false);
        });
        AdmenuFrame.add(manButton);

        JButton empButton = new JButton("Employee Details");
        empButton.setBounds(200, 310, 300, 40);
        empButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        empButton.setFocusPainted(false);

        empButton.addActionListener(actionEvent -> {
            try {
                EmployeeManagementPanel.SetTrue(2);
                new EmployeeManagementPanel();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            AdmenuFrame.setVisible(false);
        });
        AdmenuFrame.add(empButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(200, 380, 300, 40);
        exitButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        exitButton.setFocusPainted(false);

        exitButton.addActionListener(actionEvent -> {
            AdmenuFrame.dispose();
        });
        AdmenuFrame.add(exitButton);

        AdmenuFrame.setSize(750, 530);
        AdmenuFrame.getContentPane().setBackground(new Color(255, 6, 72));
        LineBorder blackBorder = new LineBorder(new Color(255, 255, 255), 7);
        AdmenuFrame.getRootPane().setBorder(blackBorder);
        AdmenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        AdmenuFrame.setLayout(null);
        AdmenuFrame.setVisible(true);
        AdmenuFrame.setLocationRelativeTo(null);

    }
}