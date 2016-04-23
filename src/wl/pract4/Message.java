package wl.pract4;

import java.util.ArrayList;

public class Message {
	String recipient, sender, text = "";
	ArrayList<String> textarr = new ArrayList<String>();
	
	public Message(String recipient, String sender) {
		this.recipient = recipient;
		this.sender = sender;
	}
	
	public void append(String appendable) {
		textarr.add(appendable);
	}
	
	public String toString() {
		for (int i = 0; i < textarr.size(); i++)
			text += (textarr.get(i) + "\n");
		return "From: " + sender + "\nTo: " + recipient + "\nMessage:\n" + text;
	}

}
