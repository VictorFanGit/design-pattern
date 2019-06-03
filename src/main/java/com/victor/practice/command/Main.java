package com.victor.practice.command;

public class Main {
    public static void main(String[] args) {
        GigaMainBoard mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openButtonPressed();
    }
}
