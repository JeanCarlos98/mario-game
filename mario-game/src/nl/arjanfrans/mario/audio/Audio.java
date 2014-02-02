package nl.arjanfrans.mario.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.Map;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;

public class Audio {

	private static Music overworld = Gdx.audio.newMusic(Gdx.files.internal("data/audio/soundtracks/Overworld.ogg"));
	private static Music undergrounds = Gdx.audio.newMusic(Gdx.files.internal("data/audio/soundtracks/Undergrounds.ogg"));
	private static Music lifelost = Gdx.audio.newMusic(Gdx.files.internal("data/audio/soundtracks/Life Lost.ogg"));

	private static Music song;

	public static Sound jump = Gdx.audio.newSound(Gdx.files.internal("data/audio/sfx/jump.ogg")); 
	public static Sound stomp = Gdx.audio.newSound(Gdx.files.internal("data/audio/sfx/stomp.ogg")); 
	public static Sound bump = Gdx.audio.newSound(Gdx.files.internal("data/audio/sfx/bump.ogg")); 
	
	public static Sound powerDown = Gdx.audio.newSound(Gdx.files.internal("data/audio/sfx/PowerDown.ogg"));
	public static Sound powerUp = Gdx.audio.newSound(Gdx.files.internal("data/audio/sfx/PowerUp.ogg"));


	public static void playSong(String name, boolean looping) {
		if(name.equals("overworld")) {
			song = overworld;
		}
		else if(name.equals("undergrounds")) {
			song = undergrounds;
		}
		else if(name.equals("lifelost")) {
			song = lifelost;
		}
		song.setLooping(looping);
		song.play();
	}

	public static void stopSong() {
		if(song != null) {
			song.stop();
		}
	}

	public static void dispose() {
		overworld.dispose();
		undergrounds.dispose();
		song.dispose();
		jump.dispose();
		stomp.dispose();
	}

}
