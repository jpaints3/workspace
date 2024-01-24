pub fn print_input(input: &str) {
    // creates a public function that takes a parameter called input
    // That input is supposed to be a type &str, which is the type of a hardcoded string.
    // The type of a string variable would likely be &String. This is when you use the String::from() method.
    println!("{input}"); //Runs the print new line method with the given variable input
                         // The ! after println signifies macros. I will learn more about that later.
}
