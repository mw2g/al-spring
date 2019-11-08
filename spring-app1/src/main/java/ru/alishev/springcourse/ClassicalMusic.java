package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
	
	private ClassicalMusic() {}

	public static ClassicalMusic getClassicalMusic() { 		//factory-method used in applicationContext
		return new ClassicalMusic();
	} 
	
	private void doMyInit() {								//bean initialization will run after dependency injection
		System.out.println("doing my init");
	}
	private void doMyDestroy() {							//bean destroy will run after context.close()
		System.out.println("doing my destroy");
	}
	
	public String getSong() {
		return "Hungarian Rhapsody";
	}

}
