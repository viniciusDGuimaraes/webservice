package msg;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;
 
class Client {
 
  public static void main(String args[]) throws Exception {
    URL     url     = new URL("http://127.0.0.1:9876/msg?wsdl");
    QName   qname   = new QName("http://msg/","ServerImplService");
    Service service = Service.create(url, qname);
    Server  server  = service.getPort(Server.class);
    String message = "";
    
    while(true)
    {
    	System.out.println("Digite uma mensagem");
        Scanner scanner = new Scanner(System.in);
        message         = scanner.nextLine();
        if(message.equals("Over"))
        {
        	break;
        }
        System.out.println("Sua mensagem: " + server.PublishMessage(message));	
    }
  }
}