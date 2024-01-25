pub fn print_input(input: &str) {
    // creates a public function that takes a parameter called input
    // That input is supposed to be a type &str, which is the type of a hardcoded string.
    // The type of a string variable would likely be &String. This is when you use the String::from() method.
    println!("{input}"); //Runs the print new line method with the given variable input
                         // The ! after println signifies macros. I will learn more about that later.

    let mut string_input: String = String::from(input); // Creates a new string of String type from the input

    string_input.push_str(" - Twice!"); // We can modify the string by using push_str
                                        // We need to specify that the string is mutable before we can use this method.

    println!("{string_input}")
}
