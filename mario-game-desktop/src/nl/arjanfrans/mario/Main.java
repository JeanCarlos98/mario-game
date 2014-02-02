package nl.arjanfrans.mario;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Super Mario Bros. clone - " + MarioGame.VERSION;
		cfg.useGL20 = true;
		cfg.width = 512;
		cfg.height = 448;
		cfg.vSyncEnabled = true;
		new LwjglApplication(new MarioGame(), cfg);
	}
}
