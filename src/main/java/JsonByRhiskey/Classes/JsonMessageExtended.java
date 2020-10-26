package JsonByRhiskey.Classes;

public class JsonMessageExtended extends JsonMessage{
	private String ip;
	private int port;
	
	public JsonMessageExtended(String type, String payload, String ip, int port) {
		this.setType(type);
		this.setPayload(payload);
		this.setIp(ip);
		this.setPort(port);
	}
	
	@Override
	public String getIp() {
		return ip;
	}
	
	@Override
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public int getPort() {
		return port;
	}

	@Override
	public void setPort(int port) {
		this.port = port;
	}
}
