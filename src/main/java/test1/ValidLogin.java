package test1;

import org.sikuli.basics.*;
import org.sikuli.script.*;


public class ValidLogin {
	
	
	public static void main(String[] args) throws FindFailed {
		
	String correctUsername = "freeeaccountt";	
	String correctPassword = "freeaccount";
	
	Screen s = new Screen();
	Pattern username = new Pattern("username.png");
	Pattern password = new Pattern("password.png");
	Pattern loginImage = new Pattern("LoginImage.png");
//	Pattern rememberMeOn = new Pattern ("rememberMeOn.png");
//	Pattern rememberMeOff = new Pattern ("rememberMeOff.png");	
	
	
	s.find("openSpotify.png");
	s.click("openSpotify.png");
	System.out.println("spotify opening");	
	s.wait(loginImage, 10); //Waits a max 10 secs to verify that you land on the login page via image
	s.find(password);
	s.type(password, correctPassword);
	s.type(Key.TAB, KeyModifier.SHIFT);
	s.type(Key.BACKSPACE);
	s.type(correctUsername);
	s.click("login.png");
	
	}
}
