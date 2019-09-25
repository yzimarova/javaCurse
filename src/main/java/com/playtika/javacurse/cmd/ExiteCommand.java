package com.playtika.javacurse.cmd;

public class ExiteCommand implements Command {

    @Override
    public void execute(Context context) {
        System.exit(0);
    }
}
