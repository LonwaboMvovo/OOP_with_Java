// Objects and Classes: Exercise One
// 15/07/2020
// Lonwabo Mvovo

// A Student Object represents a student. A student has a first name, middle name and last name.
public class Student {

    // Student Fields / Instance Variables:
    // Declare 'firstName'
    private String firstName;
    // Declare 'middleName'
    private String middleName;
    // Declare 'lastName'
    private String lastName;

    // Student Setter:
    public void setNames(String first, String middle, String last) {
        // Set 'firstName' to 'first' parameter which represents the student's first name
        firstName = first.toLowerCase();
        // Set 'middleName' to 'middle' parameter which represents the student's middle name
        middleName = middle.toLowerCase();
        // Set 'lastName' to 'last' parameter which represents the student's last name
        lastName = last.toLowerCase();
    }

    // Student Getter:
    public String getFullName() {
        // Return full name of the student with the middle name converted to an initial only.
        return firstName.substring(0,1).toUpperCase() + firstName.substring(1) + " " + // First name capitalized followed by a space
                middleName.toUpperCase().charAt(0) + ". " + // Middle name initial followed by a dot and space
                lastName.substring(0,1).toUpperCase() + lastName.substring(1); // Last name capitalized
    }
}
