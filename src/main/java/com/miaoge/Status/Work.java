package com.miaoge.Status;

import com.miaoge.Status.Status.Impl.ForenoonState;
import com.miaoge.Status.Status.State;

public class Work {
    private State currentState;

    private Integer hour;

    private Boolean workfinished = false;

    public Work() {
        currentState = new ForenoonState();
    }

    public void writeProgram() {
        this.currentState.writeProgram(this);
    }

    public State getCurrentStatus() {
        return currentState;
    }

    public void setCurrentStatus(State currentState) {
        this.currentState = currentState;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Boolean getWorkfinished() {
        return workfinished;
    }

    public void setWorkfinished(Boolean workfinished) {
        this.workfinished = workfinished;
    }
}
