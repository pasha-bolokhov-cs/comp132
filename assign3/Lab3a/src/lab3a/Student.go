//
// Student class
//
package main;

import "fmt"

/**
 * Student class
 */
type Student struct {

	//
	// Variables that start with a small letter
	// are "private" to the package
	//
	classYear int
	major	  string
	name	  string
	age	  int
}


/**
 * GetName
 *
 * Description: Returns the student's name Parameters: none Returns: the
 * student's name
 */
func (s *Student) GetName() string {
    return s.name;
}

/**
 * SetName
 *
 * Description: Sets the student's name Parameters: studentName - the
 * student's name Returns: nothing
 */
func (s *Student) SetName(studentName string) {
    s.name = studentName;
}

/**
 * GetMajor
 *
 * Description: Returns the student's major Parameters: none Returns: the
 * student's major
 */
func (s *Student) GetMajor() string {
    return s.major;
}

/**
 * SetMajor
 *
 * Description: Sets the student's major Parameters: studentMajor - the
 * student's major Returns: nothing
 */
func (s *Student) SetMajor(studentMajor string) {
	s.major = studentMajor;
}

/**
 * GetAge
 *
 * Description: Returns the student's age Parameters: none Returns: the
 * student's age
 */
func (s *Student) GetAge() int {
    return s.age;
}

/**
 * SetAge
 *
 * Description: Sets the student's age Parameters: studentAge - the
 * student's age Returns: nothing
 */
func (s *Student) SetAge(studentAge int) {
    s.age = studentAge;
}

/**
 * SetClassYear
 *
 * Description: set the student's class year to the specified year If the
 * specified year is > 4, the student's class year is set to 4. If the
 * specified year is < 1, the student's class year is set to 1. Parameters:
 * year - the year to set the student's class year to Returns: nothing
 */
func (s *Student) SetClassYear(year int) {
    if (year < 1) {
        s.classYear = 1;
    } else if (year > 4) {
        s.classYear = 4;
    } else {
        s.classYear = year;
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
func (s *Student) IncreaseYear(numYears int) {
    s.SetClassYear(s.classYear + numYears);
}

/**
 * PrintInfo
 *
 * Description: print student information to the console Parameters: none
 * Returns: nothing
 */
func (s *Student) PrintInfo() {
    fmt.Println("Name: ", s.name);
    fmt.Println("Age: ", s.age);
    fmt.Println("Major: ", s.major);
    fmt.Println("Class year: ", s.classYear);
    fmt.Println();
}

