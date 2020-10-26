package JsonByRhiskey.Classes;


public class JsonMessage {
	private String type, payload;
    private static String ip;
	private static int port;
	
	public JsonMessage(String type, String payload) {
		this.setType(type);
		this.setPayload(payload);
	}
	
	public JsonMessage() {
		this("service","0");
	}
	
	public JsonMessage(String type, String payload, String ip, int port) {
		this.setType(type);
		this.setPayload(payload);
		this.setIp(ip);
		this.setPort(port);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		JsonMessage.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		JsonMessage.port = port;
	}
	
}


