package pragmatic_programmer_exercises.exercise4to5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

class Chap1 {
    /**
     * Function reads input if present.
     *
     * @return The input typed in by the user otherwise return empty string.
     */
    private static String read_input(Scanner input_scanner) {
        System.out.print("Input Command: ");

        try {
            return input_scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }

    /**
     * Runs a game function corresponding to a command given as an input.
     *
     * A good refactor here would be to create a case and switch with enum for the
     * commands. However, I believe this is sufficient for the exercise.
     *
     * @param input the input of the game.
     * @return A true or false depending on if the command ran.
     */
    private static boolean run_command(UserInput input) {
        Map<String, Consumer<String>> commands = new HashMap<>();

        commands.put("P", (String x) -> {
            System.out.println("selected pen " + x);
        });

        commands.put("D", (String x) -> {
            System.out.println("pen down");
        });

        commands.put("W", (String x) -> {
            System.out.println("turtle moves west " + x + "cm");
        });

        commands.put("N", (String x) -> {
            System.out.println("turtle moves north " + x + "cm");
        });

        commands.put("E", (String x) -> {
            System.out.println("turtle moves east " + x + "cm");
        });

        commands.put("S", (String x) -> {
            System.out.println("turtle moves south " + x + "cm");
        });

        commands.put("U", (String x) -> {
            System.out.println("pen up");
        });

        try {
            String[] current_command = input.getCommand();

            for (String command : commands.keySet()) {
                if (command.equals(current_command[0])) {
                    commands.get(command).accept(current_command[2]);
                }
            }
            return true;
        } catch (Exception FailureToRunException) {
            System.out.println(FailureToRunException.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);
        UserInput input = new UserInput(read_input(input_scanner));
        boolean playing = true;

        while (playing) {
            if (input.verify_input_format()) {
                playing = run_command(input); // continue game if correct input
            }
            input = new UserInput(read_input(input_scanner));
        }

        input_scanner.close();
    }
}