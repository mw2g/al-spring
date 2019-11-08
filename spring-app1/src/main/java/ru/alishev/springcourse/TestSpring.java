package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
//		ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
//		ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
		
//		System.out.println(classicalMusic.getSong());
//		
		Music music = context.getBean("musicBean", Music.class);
		
		MusicPlayer musicPlayer = new MusicPlayer(music);

//		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//		boolean comporison = firstMusicPlayer == secondMusicPlayer;
//		System.out.println(comporison);
//		
//		firstMusicPlayer.playMusic();
//		firstMusicPlayer.setVolume(10);
//		System.out.println(firstMusicPlayer.getName());
//		System.out.println(firstMusicPlayer.getVolume());
//		System.out.println(secondMusicPlayer.getVolume());
		
		musicPlayer.playMusic();
		context.close();
	}
}