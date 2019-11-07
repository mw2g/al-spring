package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
	
	private ClassicalMusic() {}

	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
	
	private void doMyInit() {
		System.out.println("doing my init");
	}
	private void doMyDestroy() {
		System.out.println("doing my destroy");
	}
	
	public String getSong() {
		return "Hungarian Rhapsody";
	}

}
