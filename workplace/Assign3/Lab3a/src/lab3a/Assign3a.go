//
// Assign3.go:
//      The version of 'Assign3.java' written in Go
//
// Invocation:
//      $ go run Assign3.go
//
// Needs:
//      'golang' package installed
//

package main;

/**
 *
 * @author c0030622
 */
func main() {
    natasha := new(Student);
    tony := new(Student);

    // set up Natasha's information        
    natasha.SetName("Natasha Romanoff");
    natasha.SetClassYear(1);
    natasha.SetAge(18);
    natasha.SetMajor("Computer Science");
    natasha.PrintInfo();

    // set up Apu's information
    tony.SetName("Tony Stark");
    tony.SetClassYear(2);
    tony.SetAge(19);
    tony.SetMajor("Engineering");
    tony.PrintInfo();

    //make Natasha a sophomore
    natasha.IncreaseYear(1);
    
    //make Tony a senior
    tony.IncreaseYear(2);
    
    //natasha.printInfo();
    tony.PrintInfo();
}
