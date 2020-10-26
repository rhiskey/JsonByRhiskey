package JsonByRhiskey.Interfaces;

public class ExtendedMsg implements JsonByRhiskey.Interfaces.IMsg{ 
	private String type, message;
	private String ip;
	private int port;
	
	public ExtendedMsg (String type, String payload, String ip, int port) {
		super();
		this.type = type;
		this.message = payload;
		this.setIp(ip);
		this.setPort(port);
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

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
