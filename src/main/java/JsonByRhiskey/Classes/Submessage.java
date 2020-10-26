package JsonByRhiskey.Classes;

public class Submessage extends JsonMessage{
	private String playerInfo;
	
	public Submessage(String action, String payload, String playerInfo) {
		super(action, payload);
		this.setPlayerInfo(playerInfo);
	}

	public String getPlayerInfo() {
		return playerInfo;
	}

	public void setPlayerInfo(String playerInfo) {
		this.playerInfo = playerInfo;
	}
}