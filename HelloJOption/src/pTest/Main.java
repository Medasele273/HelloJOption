package pTest;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	String firstName;
	String lastName;
	firstName = JOptionPane.showInputDialog("Please Enter Your First Name");
	lastName =JOptionPane.showInputDialog("Please Enter your Last Name");
	JOptionPane.showMessageDialog(null,"Hello Mr " +firstName+ " " +lastName);
	System.exit(0);

    }
}
