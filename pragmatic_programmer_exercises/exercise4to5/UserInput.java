package pragmatic_programmer_exercises.exercise4to5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserInput {
    String command;

    public UserInput(String command) {
        this.command = command;
    }

    /**
     * This function allows you to get a copy of all the parts
     * of the user input.
     *
     * @return the user input as an array of strings.
     */
    protected String[] getCommand() {
        return command.split("").clone();
    }

    /**
     * This makes sure that the input matches our game formatting specifications.
     *
     * @param input The input given by the user.
     */
    protected boolean verify_input_format() {
        Pattern input_pattern = Pattern.compile("([A-Z])((\\s{1}\\d{1})|(\\s{2})){1}");
        Matcher input_pattern_verifier = input_pattern.matcher(command);
        return input_pattern_verifier.matches();
    }

}
