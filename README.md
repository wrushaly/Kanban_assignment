# Selenium Automation Script for Kanban App

## Description
This repository contains a Selenium WebDriver automation script written in Java that interacts with the Kanban application. The script performs several automated tasks such as logging into the application, managing users, changing passwords, and creating projects and tasks.

### Features:
- **Login:** Automates the login process using provided credentials for the Kanban app.
- **Password Change:** Allows a user to change their password after logging in.
- **User Management:** Creates multiple users with different roles (e.g., Manager, User, Viewer).
- **Project Management:** Creates a new project in the system.
- **Task Management:** Adds tasks to a project and assigns them to users.
- **Logout:** Logs out from the application after performing all actions.

### Technologies Used:
- **Selenium WebDriver:** For browser automation.
- **Java:** Programming language for the script.
- **ChromeDriver:** For executing tests on Google Chrome browser.

## Setup Instructions

### Prerequisites:
- **Java:** Ensure Java is installed on your machine.
- **Selenium WebDriver:** Download the latest version of Selenium WebDriver and add it to your project.
- **ChromeDriver:** Download and configure the appropriate version of ChromeDriver to match your installed version of Google Chrome.
- **IDE:** Use an Integrated Development Environment (IDE)  Eclipse to run the script.

### Steps:
1. Clone this repository to your local machine.
2. Install the necessary dependencies by adding them to your project.
3. Ensure that ChromeDriver is configured and available on your system's PATH.


### Dependencies:
- Selenium WebDriver 
- Java 
- maven
- testng 

## Errors and Issues:
1. **Login Failure Tracking:** The script may not correctly track the number of failed login attempts. Ensure the correct handling of error messages is implemented.
2. **Password Validation Issue:** The password validation is not adhering to the client's requirements. It should be adjusted according to the specified rules (e.g., length, special characters).

.

