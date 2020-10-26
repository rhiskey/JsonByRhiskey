package JsonByRhiskey.Interfaces;

public class SimpleMsg implements JsonByRhiskey.Interfaces.IMsg{
	private String type, message;
	
	public SimpleMsg (String type, String payload) {
		super();
		this.type = type;
		this.message = payload;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "type: " + type;
	}

	@Override
	public String payload() {
		// TODO Auto-generated method stub
		return "payload: " + message;
	}
}
