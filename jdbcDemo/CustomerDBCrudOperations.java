package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerDBCrudOperations {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Loading the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establishing a database connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CURDoperation", "root", "Root");

        // Step 3: Creating a Statement
        Statement stmt = connection.createStatement();

        // Scanner class to take input from user
        Scanner sc = new Scanner(System.in);

        // Integer input for variable operation
        int operation;

        do {
            // Display menu for CRUD operations
            System.out.println("Available Operations:");
            System.out.println("1. Create");
            System.out.println("2. Retrieve");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            // Prompts user to enter a operation number
            System.out.print("Please Enter a Operation number you want to Perform: ");
            operation = sc.nextInt();

            // Consume newline
            sc.nextLine();

            // Use a switch statement to perform different actions based on the user's choice
            switch (operation) {
                // Create operation: Add a new customer record to the database
                case 1:
                    // Prompt for and collect customer information
                    System.out.print("Enter customer first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter customer last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter customer email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter customer phone number: ");
                    String phoneNumber = sc.nextLine();

                    // SQL query to insert a new customer record
                    String createSql = "INSERT INTO Customers (firstName, lastName, email, phoneNumber) VALUES (?, ?, ?, ?)";

                    // Creating a PreparedStatement object for executing the SQL query.
                    try (PreparedStatement createStatement = connection.prepareStatement(createSql)) {
                        // Set the value for the first placeholder ('?') in the SQL query with the first name.
                        createStatement.setString(1, firstName);

                        // Set the value for the second placeholder ('?') in the SQL query with the last name.
                        createStatement.setString(2, lastName);

                        // Set the value for the third placeholder ('?') in the SQL query with the email.
                        createStatement.setString(3, email);

                        // Set the value for the fourth placeholder ('?') in the SQL query with the phone number.
                        createStatement.setString(4, phoneNumber);

                        // Execute the SQL query and get the number of rows affected in the database.
                        int rowsAffected = createStatement.executeUpdate();

                        // Check if any rows were affected (record added successfully) and provide appropriate feedback.
                        if (rowsAffected > 0) {
                            System.out.println("Customer added successfully.");
                        } else {
                            System.out.println("Failed to add customer.");
                        }
                    }
                    // End of try-with-resources block for PreparedStatement
                    // Jump out of the switch statement after completing the insert operation.
                    break;

                case 2:
                    // Read operation: Retrieve and display customer records from the database
                    String readSql = "SELECT * FROM Customers";

                    // Creating a Statement object for executing the SQL query.
                    try (Statement readStatement = connection.createStatement()) {
                        // Execute the SQL query and obtain a ResultSet containing the results.
                        ResultSet resultSet = readStatement.executeQuery(readSql);

                        // While Loop through the ResultSet to extract and display customer information.
                        while (resultSet.next()) {
                            // Extract and display customer information
                            int customerId = resultSet.getInt("customer_id");
                            String customerFirstName = resultSet.getString("firstName");
                            String customerLastName = resultSet.getString("lastName");
                            String customerEmail = resultSet.getString("email");
                            String customerPhoneNumber = resultSet.getString("phoneNumber");
                            // Display the extracted customer information
                            System.out.println(
                                    "ID: " + customerId + ", Name: " + customerFirstName + " " + customerLastName + ", Email: " + customerEmail + ", Phone Number: " + customerPhoneNumber);
                        }
                    }
                    // Jump out of the switch statement after completing the read operation.
                    break;

                case 3:
                    // Update operation: Modify customer records (name, email, or phone number)
                    // Prompt for customer ID and update choice
                    System.out.print("Enter customer ID to update: ");
                    int customerIdToUpdate = sc.nextInt();
                    // Consume newline character
                    sc.nextLine();

                    // Display options for what the user can update
                    System.out.println("Choose what to update:");
                    System.out.println("1. Update name");
                    System.out.println("2. Update email");
                    System.out.println("3. Update phone number");
                    
                    // Prompts to user to enter a choice 
                    System.out.print("Enter your choice: ");
                    int updateChoice = sc.nextInt();
                    // Consume newline
                    sc.nextLine(); 

                    String updateSql;
                    PreparedStatement updateStatement;
                    
                    // Use a switch statement to handle different update choices
                    switch (updateChoice) 
                    {
                        case 1:
                            // Update name
                            System.out.print("Enter new first name: ");
                            String newFirstName = sc.nextLine();
                            System.out.print("Enter new last name: ");
                            String newLastName = sc.nextLine();

                            // SQL query to update name
                            updateSql = "UPDATE Customers SET firstName = ?, lastName = ? WHERE customer_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newFirstName);
                            updateStatement.setString(2, newLastName);
                            break;

                        case 2:
                            // Update email
                            System.out.print("Enter new email: ");
                            String newEmail = sc.nextLine();

                            // SQL query to update email
                            updateSql = "UPDATE Customers SET email = ? WHERE customer_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newEmail);
                            break;

                        case 3:
                            // Update phone number
                            System.out.print("Enter new phone number: ");
                            String newPhoneNumber = sc.nextLine();

                            // SQL query to update phone number
                            updateSql = "UPDATE Customers SET phoneNumber = ? WHERE customer_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newPhoneNumber);
                            break;

                        default:
                            System.out.println("Invalid choice for update. Please try again.");
                            // Continue the loop to re-enter the update operation
                            continue; 
                    }

                    // Set customer ID and execute the update query
                    updateStatement.setInt(2, customerIdToUpdate);
                    int rowsAffected = updateStatement.executeUpdate();
                    
                    // Check if the update was successful and provide feedback
                    if (rowsAffected > 0) 
                    {
                        System.out.println("Customer updated successfully.");
                    } else 
                    {
                        System.out.println("Customer not found or update failed.");
                    }
                    break;

                case 4:
                    // Delete operation: Remove a customer record from the database
                    System.out.print("Enter customer ID to delete: ");
                    int customerIdToDelete = sc.nextInt();

                    // SQL query to delete a customer record
                    String deleteSql = "DELETE FROM Customers WHERE customer_id = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) 
                    {
                        deleteStatement.setInt(1, customerIdToDelete);
                        int rowsAffected1 = deleteStatement.executeUpdate();
                        if (rowsAffected1 > 0) 
                        {
                            System.out.println("Customer deleted successfully.");
                        } else 
                        {
                            System.out.println("Customer not found or delete failed.");
                        }
                    }
                    // Jump out of the switch statement after completing the update operation
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program.");
                    // Jump out of the loop
                    break;

                default:
                    // Handles any invalid user input.
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        
        // This loop continues as long as the user's choice (operation) is not equal to 5.
        while (operation != 5);

    
        // Close the Scanner used for user input.
        sc.close();
        // Close a Statement object
        stmt.close();
        // Close the database connection.
        connection.close();
    }
}
    
                    