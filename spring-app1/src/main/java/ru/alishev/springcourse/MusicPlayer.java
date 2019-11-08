package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	private List<Music> musicList = new ArrayList<>();
	private Music music;
	
	private String name;
	private int volume;
	
	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public List<Music> getMusicList() {
		return musicList;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public MusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public MusicPlayer(Music music) {
		this.music = music;
	}
	
	public MusicPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void playMusic() {
		System.out.println("Playing:  "+ music.getSong());
	}
//	public void playMusic() {
//		for (Music music:musicList) {
//			System.out.println("Playing:  "+ music.getSong());
//		}
//	}

}
