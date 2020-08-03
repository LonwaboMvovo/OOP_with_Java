// Class Members and Arrays: Question 1
// 23/07/2020
// Lonwabo Mvovo

// Import Comparator class used for comparing objects
import java.util.Comparator;

// 'SortByNameColourAndVolume' class which implements Comparator of type 'SoftDrink' class
public class SortByNameColourAndVolume implements Comparator<SoftDrink> {

    // Overrode method compare which compares two 'SoftDrink' objects 'a' and 'b', when called by the Collections.sort method
    @ Override
    public int compare(SoftDrink a, SoftDrink b) {
        // Firstly compare names alphabetically using the compareTo method
        if (a.getName().compareTo(b.getName()) < 0) {
            // Negative number indicates that the name of 'a' appears alphabetically higher than 'b'
            return -1;
        // If the names are equal compare the colours alphabetically using the compareTo method
        } else if (a.getName().equals(b.getName())) {
            if (a.getColour().compareTo(b.getColour()) < 0) {
                // Negative number indicates that the colour of 'a' appears alphabetically higher than 'b'
                return -1;
            // If the colours are also equal compare the volumes in ascending order using the less than operator
            } else if (a.getColour().equals(b.getColour())) {
                if (a.getVolume() < b.getVolume()) {
                    // Negative number indicates that the volume of 'a' appears in ascending order higher than 'b'
                    return -1;
                // Since the volumes are also equal return 0 which indicates that the order of 'a' and 'b' do not matter because they are equal
                } else if (a.getVolume() == b.getVolume()) {
                    return 0;
                }
                // Positive number indicates that the volume of 'a' appears in ascending lower higher than 'b'
                return 1;
            }
            // Positive number indicates that the colour of  'a' appears alphabetically lower than 'b'
            return 1;
        }
        // Positive number indicates that the name of  'a' appears alphabetically lower than 'b'
        return 1;

    }
}
