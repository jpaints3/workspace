mod print; // creates a new module using the print file
fn main() {
    let input = "Hello World from main file"; // Creates a string
                                              // Strings have references at creation. So the text here is &str.
    print::print_input(input); // Run the print_input function from the print module
}
