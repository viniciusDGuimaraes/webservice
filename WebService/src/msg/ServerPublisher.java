package msg;
import javax.xml.ws.Endpoint;
 
public class ServerPublisher {
 
  public static void main(String[] args)
  {
	  System.out.println("Published server");
	  Endpoint.publish("http://127.0.0.1:9876/msg", new ServerImpl());
  }
}