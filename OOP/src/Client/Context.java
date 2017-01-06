package Client;

/* A context represents the entire scope of an application, i.e.
 * we can assign "global variables" to a context.
 * 
 * This is a "bean class", containing a constructor and accessor
 * methods only.
 */
//Context Class taking from XML Encapsulation Example on Moodle
public class Context {
	//Storing the XML file info into a String
	public static final String CONF_FILE="src/Client/conf.xml";
	private String username;
	private String serverHost;
	private String serverPort;
	private String download_dir;
	
//===== GETTERS AND SETTERS ========================================================================================================================
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getServerHost() {
		return serverHost;
	}



	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}



	public String getServerPort() {
		return serverPort;
	}



	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}



	public String getDownload_dir() {
		return download_dir;
	}



	public void setDownload_dir(String download_dir) {
		this.download_dir = download_dir;
	}

//===toString============================================================================================================================================
	@Override
	public String toString() {
		return "Context [username=" + username + ", serverHost=" + serverHost + ", serverPort=" + serverPort + ", download_dir=" + download_dir + "]";
	}
}
