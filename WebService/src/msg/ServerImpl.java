package msg;
//import java.util.Date;
import javax.jws.WebService;
 
@WebService(endpointInterface = "msg.Server")
public class ServerImpl implements Server {
	@Override
	public String PublishMessage(String msg) {
		return msg;
	} 
}