package Client;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class ContextParser {
	private Context ctx;

	public ContextParser(Context ctx) {
		super();
		this.ctx = ctx;
	}
	
	public void init() throws Throwable{
		//Encapsulating DOM
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(Context.CONF_FILE);
		
		Element root = doc.getDocumentElement(); //Get the root of the node tree
		NodeList children = root.getChildNodes(); //Get the child node of the root
		NamedNodeMap atts = root.getAttributes(); //Get the attributes as a map of name/value pairs
		
		for (int j = 0; j < atts.getLength(); j++){ //Look over the attributes. This is similar to looping over a ket set in a Map
			if (atts.item(j).getNodeName().equals("username")){ //If host="127.0.0.1"
				ctx.setUsername(atts.item(j).getNodeValue()); //Update the contex object
		
			}//If end
		}//for loop end
		
		for(int i=0; i<children.getLength(); i++){
			Node next = children.item(i);
			
			if(next instanceof Element){
				Element e = (Element)next;
				
			if(e.getNodeName().equals("serverHost")){
				ctx.setServerHost(e.getTextContent());
			}
			else if(e.getNodeName().equals("serverPort")){
				ctx.setServerPort(e.getTextContent());
			}
			else if(e.getNodeName().equals("download_dir")){
				ctx.setDownload_dir(e.getTextContent());
			}
					
				
			}//if end
		}//for loop end
	}//init() end		

	public Context getCtx() {
		return ctx;
	}

	public void setCtx(Context ctx) {
		this.ctx = ctx;
	}
}//Class end
