package lab3a;

/**
 *
 * @author
 */
public class Student {

    private int classYear;
    private String major;
    private String name;
    private int age;

    /**
     * getName
     *
     * Description: Returns the student's name Parameters: none Returns: the
     * student's name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     *
     * Description: Sets the student's name Parameters: studentName - the
     * student's name Returns: nothing
     */
    public void setName(String studentName) {
        name = studentName;
    }

    /**
     * getMajor
     *
     * Description: Returns the student's major Parameters: none Returns: the
     * student's major
     */
    public String getMajor() {
        return major;
    }

    /**
     * setMajor
     *
     * Description: Sets the student's major Parameters: studentMajor - the
     * student's major Returns: nothing
     */
    public void setMajor(String studentMajor) {
	major = studentMajor;
    }

    /**
     * getAge
     *
     * Description: Returns the student's age Parameters: none Returns: the
     * student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * setAge
     *
     * Description: Sets the student's age Parameters: studentAge - the
     * student's age Returns: nothing
     */
    public void setAge(int studentAge) {
        age = studentAge;
    }

    /**
     * setClassYear
     *
     * Description: set the student's class year to the specified year If the
     * specified year is > 4, the student's class year is set to 4. If the
     * specified year is < 1, the student's class year is set to 1. Parameters:
     * year - the year to set the student's class year to Returns: nothing
     */
    public void setClassYear(int year) {
        if (year < 1) {
            classYear = 1;
        } else if (year > 4) {
            classYear = 4;
        } else {
            classYear = year;
        }
    }

    /**
     * increaseYear
     *
     * Description: increase student's class year by the specified amount.
     * Parameters: numYears - the number of years to add to the student's class
     * year
     * Returns: nothing
     */
    public void increaseYear(int numYears) {
        setClassYear(classYear + numYears);
    }

    /**
     * printInfo
     *
     * Description: print student information to the console Parameters: none
     * Returns: nothing
     */
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("Class year: " + classYear);
        System.out.println();
    }
}
