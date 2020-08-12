package coder.db;

import javax.swing.JOptionPane;

import coder.inters.ClickEmitter;
import coder.inters.CountEmitter;

public class Action {
	ClickEmitter cemitter;
	CountEmitter emitter;
	public Action (ClickEmitter cemitter,CountEmitter emitter) {
		this.emitter = emitter;
		this.cemitter = cemitter;
	}
	
	public void doSomething() {
		String name = JOptionPane.showInputDialog("名前を記入してください！");
		cemitter.emit("Good Bye!" + name);
		cemitter.alert(name);
		emitter.count(10);
	}
}
