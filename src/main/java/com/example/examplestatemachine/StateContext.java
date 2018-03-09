package com.example.examplestatemachine;

public class StateContext {

	private State accept;
    private State reject;
    private State current;
    private int first;

	public StateContext() {
		this.accept = new AcceptState(this);
		this.reject = new RejectState(this);
		current = reject;
	}
	
	public void actionA() {
        current.actionA();
    }

    public void actionB() {
        current.actionB();
    }

    public boolean isAccept() {
        return current.isAccept();
    }

    public void setFirstAction(int a) {
        this.first = a;
    }

    public int getFirstAction() {
        return first;
    }

    public void setCurrentState(State a) {
        this.current = a;
    }

    public State getAcceptState() {
        return accept;
    }

    public State getRejectState() {
        return reject;
        }
}
