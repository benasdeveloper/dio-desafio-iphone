package equipment.smartphone;

import equipment.browser.Browser;
import equipment.musicplayer.MusicPlayer;
import equipment.phone.Phone;

public class SmartPhone implements Browser, MusicPlayer, Phone {
	
	@Override
	public void startCall() {
		System.out.println("Calling...");
	}

	@Override
	public void playMedia() {
		System.out.println("Playing...");

	}

	@Override
	public void openWebPage() {
		System.out.println("Openning...");

	}

}
