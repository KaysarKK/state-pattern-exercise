package com.example.examplestatemachine;

public class RejectState extends State {

	
	
	public RejectState(StateContext sc) {
		this.sc = sc;
		this.accept = false;
	}
	
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
