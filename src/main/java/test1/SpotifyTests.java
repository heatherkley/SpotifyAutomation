package test1;

import static org.junit.Assert.*;
import org.sikuli.basics.*;
import org.sikuli.script.*;
import org.junit.Test;

public class SpotifyTests extends ValidLogin {

	
//	@Test
//	public void testLoginInvalid() throws Exception {
//		openApp();
//		IncorrectLogin();
//		closeApp();
//	}
//	
//	@Test
//	public void testLoginValid() throws Exception {
//		openApp();
//		validLogin();
//		logout();
//		closeApp();
//	}
	
//	@Test
//	public void search () throws Exception {
//		openApp();
//		validLogin();
//		searchArtist();
//		logout();
//		closeApp();
//	}

	@Test
	public void searchAndPlay () throws Exception {
		openApp();
		validLogin();
		searchArtist();
		closeApp();
		openApp();
		searchAndPlaySong();
		logout();
		closeApp();
	}
	
	
}
