package msg;
//import java.util.Date;
import javax.jws.WebService;
 
@WebService(endpointInterface = "msg.Server")
public class ServerImpl implements Server {
	@Override
	public float Add(float num1, float num2) {
		System.out.println("Added " + num1 + " and " + num2);
		return num1 + num2;
	}
	
}