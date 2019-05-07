package com.example.sharingapp;

public abstract class Command {
    private boolean isExcuted;
    public Command() {
        isExcuted = false;
    }
    public boolean isExcuted() {
        return this.isExcuted;
    }

    public void setExcuted(boolean excuted) {
        isExcuted = excuted;
    }

    public abstract void execute();
}
