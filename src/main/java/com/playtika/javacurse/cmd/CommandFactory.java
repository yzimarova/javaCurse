package com.playtika.javacurse.cmd;

public class CommandFactory {
    public Command getCommand(String input) {
        String[] str = input.split(" ");
        switch (str[0]) {
            case "chdir":
                return new ChangeDirCommand(str);
            case "ls":
                return new ListCommand();
            case "exit":
                return new ExiteCommand();
            case "echo":
                return new EchoCommand(str);
            default:
                return new UnknownCommand();
        }
    }
}
