package coder.inters;

public interface ClickEmitter {
	String name = "中村";//default is public
	/*
	 * 1.not allow curly blacket
	 * 2.method must with no body 
	 */
	void emit(String name);
	
	void alert(String alert);
}
