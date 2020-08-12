package coder;

import javax.swing.JOptionPane;

import coder.db.Action;
import coder.inters.ClickEmitter;
import coder.inters.CountEmitter;

public class Main implements ClickEmitter,CountEmitter{

	public static void main(String[] args) {
		Action action = new Action(new Main(),new Main());
		System.out.println(ClickEmitter.name);
		action.doSomething();
	}
	
	@Override
	public void emit(String name) {//override method(interface ClickEmitter of method)
		System.out.println("Emit value is　" + name);
	}
	
	@Override
	public void alert(String alert) {
		JOptionPane.showMessageDialog(null, alert);
	}
	
	@Override
	public void count(int count) {
		System.out.println("Count is　" + count);
	}

}
