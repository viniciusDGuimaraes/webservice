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
    
    if(args.length != 2)
    {
    	System.out.println("Use only two numbers");
    	return;
    }
    
    float num1;
    float num2;
    
    try
    {
    	num1 = Float.parseFloat(args[0]);
    }
    catch (Exception e) 
    {
		System.out.print("Failed to convert the first input to a integer");
		return;
	}
    
    try
    {
    	num2 = Float.parseFloat(args[1]);
    }
    catch (Exception e) 
    {
		System.out.print("Failed to convert the second input to a integer");
		return;
	}
    
    System.out.println(num1 + " + " + num2 + " = " + server.Add(num1, num2));
  }
}