package com.victor.practice.command;

public class OpenCommand implements Command {
    private MainBoardApi mainBoard;

    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        this.mainBoard.open();
    }
}
