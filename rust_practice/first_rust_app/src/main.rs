mod print; // creates a new module using the print file
fn main() {
    let mut input = "Hello World from main file"; // Creates a string
                                                  // Strings have references at creation. So the text here is &str.
                                                  // All variables in rust are IMMUTABLE.
                                                  // So by putting mut after let I are specifying that this variable is mutable.
    print::print_input(input); // Run the print_input function from the print module

    input = "The world has ended.";

    print::print_input(input);
}
