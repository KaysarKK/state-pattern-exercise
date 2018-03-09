package com.example.examplestatemachine;

public class AcceptState extends State{

	
	public AcceptState(StateContext sc) {
		this.sc = sc;
		this.accept = true;
	}
	@Override
	public void actionA() {
		if (sc.getFirstAction() == 0) {
			sc.setFirstAction(1);
			sc.setCurrentState(sc.getAcceptState());
		} else {
			if (sc.getFirstAction() == 1) {
				sc.setCurrentState(sc.getAcceptState());
			}
			else {
				sc.setCurrentState(sc.getRejectState());
			}
		}
	}
	
	@Override
	public void actionB() {
		if (sc.getFirstAction() == 0) {
			sc.setFirstAction(2);
			sc.setCurrentState(sc.getAcceptState());
		} else {
			if (sc.getFirstAction() == 1) {
				sc.setCurrentState(sc.getRejectState());
			}
			else {
				sc.setCurrentState(sc.getAcceptState());
			}
			
		}
	}

}
