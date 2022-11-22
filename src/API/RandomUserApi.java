package API;
import java.util.List;
import java.util.Scanner;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import com.google.gson.*;

public class RandomUserApi {
	
		 
	

	public static void main(String[] args) throws IOException, JSONException {
		List<results> results;
		try {
			
		for(int i=0;i<5;i++) {
		URL url =  new URL("https://randomuser.me/api/");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		StringBuilder informationString = new StringBuilder();
		int responseCode = conn.getResponseCode();
		if(responseCode != 200)
		{
		throw new RuntimeException("HttpresponseCode"+responseCode);

		}else {
			
		
		Scanner scanner = new Scanner(url.openStream());
		while(scanner.hasNext()) {
		informationString.append(scanner.nextLine());
		}
		scanner.close();
		
		System.out.println(informationString);
		JSONParser parse=new JSONParser();
		}

		System.out.println("##################################");
		Gson gson = new Gson();
		ExecAPI results1 = gson.fromJson(informationString.toString(), ExecAPI.class);
		System.out.println("The Name Is :"+results1.getResults().get(0).getName().getTitleName()+"."+results1.getResults().get(0).getName().getFirstName());
		System.out.println("The Location Is : "+results1.getResults().get(0).getLOCATION().getCity()+"."+results1.getResults().get(0).getLOCATION().getCountry());
		System.out.println("The Login Is : "+results1.getResults().get(0).getLOGIN().getUsername()+"."+results1.getResults().get(0).getLOGIN().getPassword()+"."+results1.getResults().get(0).getLOGIN().getSalt());
		System.out.println("The Email Is : "+results1.getResults().get(0).getEmail());
		System.out.println("The Phone Is : "+results1.getResults().get(0).getPhone());
		System.out.println("The Cell Is : "+results1.getResults().get(0).getCell());
		System.out.println("The Nat Is : "+results1.getResults().get(0).getNat());
		System.out.println("#################################");
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	
		}
}
}