package API;

import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import com.google.gson.Gson;
import org.xml.sax.ErrorHandler;

public class RandomUserApi {

	public static void main(String[] args) throws IOException, JSONException {

		boolean menuExit = true;
		boolean userExit = true;
		Scanner sa = new Scanner(System.in);

//        HttpClient client2 = HttpClient.newHttpClient();
//        HttpRequest request2 = HttpRequest.newBuilder()
//        .uri(URI.create("https://randomuser.me/api/"))
//        .build();
//
//       HttpResponse<String> response8 = client2.send(request2,HttpResponse.BodyHandlers.ofString());
//        String uglyJsonString2 = response8.body();
//
//        if (uglyJsonString2.contains("error")) {
//        System.out.println("We have error");
//        Gson gs = new Gson();
//        Error errorHandling = gs.fromJson(response8.body(), Error.class);
//        System.out.println(errorHandling.getErrorUser());
//        }
//        
		while (menuExit) {

			System.out.println("1.MULTIPL USERS");
			System.out.println("2.PAGINATION");
			System.out.println("3.PASSWORDS");
			System.out.println("4.SEEDING");
			System.out.println("5.Specifying a Gender");
			System.out.println("6.previous versions");
			System.out.println("7.Nationality");
			System.out.println("8.Including/Excluding fields");
			System.out.println("9.Miscellaneous");
			String a = sa.next();
			int option = Integer.parseInt(a);
			switch (option) {
			case 1:

				while (userExit) {
					try {

						System.out.println("Pls enter how many users you want?");
						Integer Users = sa.nextInt();

						if (Users == 0) {
							URL url = new URL("https://randomuser.me/api/?results=30");
							HttpURLConnection conn = (HttpURLConnection) url.openConnection();
							conn.setRequestMethod("GET");
							conn.connect();
							StringBuilder informationString = new StringBuilder();
							int responseCode = conn.getResponseCode();
							if (responseCode != 200) {
								throw new RuntimeException("HttpresponseCode" + responseCode);

							} else {

								Scanner scanner = new Scanner(url.openStream());
								while (scanner.hasNext()) {
									informationString.append(scanner.nextLine());
								}
								scanner.close();
								System.out.println(informationString);
								Gson gson = new Gson();
								ExecAPI results1 = gson.fromJson(informationString.toString(), ExecAPI.class);
								for (int k = 0; k < informationString.length(); k++) {

									System.out.println("##################################");
									System.out.println("The Login Is : " + results1.getResults().get(0).getGender());
									System.out.println("The Email Is : " + results1.getResults().get(0).getEmail());
									System.out.println("The Phone Is : " + results1.getResults().get(0).getPhone());
									System.out.println("#################################");

								}
							}
						} else {

							for (int i = 0; i < Users; i++) {
								URL url = new URL("https://randomuser.me/api/");
								HttpURLConnection conn = (HttpURLConnection) url.openConnection();
								conn.setRequestMethod("GET");
								conn.connect();
								StringBuilder informationString = new StringBuilder();
								int responseCode = conn.getResponseCode();
								if (responseCode != 200) {
									throw new RuntimeException("HttpresponseCode" + responseCode);

								} else {

									Scanner scanner = new Scanner(url.openStream());
									while (scanner.hasNext()) {
										informationString.append(scanner.nextLine());
									}
									scanner.close();
								}
								// System.out.println(informationString);
								// JSONParser parse = new JSONParser();
								Gson gson = new Gson();

								ExecAPI results1 = gson.fromJson(informationString.toString(), ExecAPI.class);

								System.out.println("##################################");
								System.out.println(
										"The Location Is : " + results1.getResults().get(0).getName().getFirstName());
								System.out.println("The Login Is : " + results1.getResults().get(0).getGender());
								System.out.println("The Email Is : " + results1.getResults().get(0).getEmail());
								System.out.println("The Phone Is : " + results1.getResults().get(0).getPhone());
								System.out.println("#################################");

							}
						}

					} catch (Exception e) {
						System.out.println(e);

					}
					System.out.println("do you want to countinue? press 1!!");
					int exitoutput = sa.nextInt();
					if (exitoutput == 0) {
						userExit = false;
					 menuExit=true;
					}else {
						userExit = true;
						menuExit=false;
					}
					
				
				}userExit = false;

				break;

			case 2:
				System.out.println("Pls enter your Pagination");
				String Pagination = sa.next();
				
				URL ur2= new URL("https://randomuser.me/api/?page"+Pagination);
				HttpURLConnection conn = (HttpURLConnection) ur2.openConnection();
				conn.setRequestMethod("GET");
				conn.connect();
				StringBuilder informationString = new StringBuilder();
				int responseCode = conn.getResponseCode();
				if (responseCode != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCode);

				} else {

					Scanner scanner = new Scanner(ur2.openStream());
					while (scanner.hasNext()) {
						informationString.append(scanner.nextLine());
					}
				
				}		
			
	
			Gson gson = new Gson();

			ExecAPI results2 = gson.fromJson(informationString.toString(), ExecAPI.class);
			System.out.println("The Pagination Is : " + results2.getInfo().getPage());
			

				break;

			case 3:
				
				System.out.println("Pls enter your password");
				String password = sa.next();
				
				URL url = new URL("https://randomuser.me/api/?password"+password);
				HttpURLConnection connn = (HttpURLConnection) url.openConnection();
				connn.setRequestMethod("GET");
				connn.connect();
				StringBuilder informationStringg = new StringBuilder();
				int responseCodee = connn.getResponseCode();
				if (responseCodee != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCodee);

				} else {

					Scanner scanner = new Scanner(url.openStream());
					while (scanner.hasNext()) {
						informationStringg.append(scanner.nextLine());
					}
				
				}		
			
	
			Gson gsonn = new Gson();

			ExecAPI results3 = gsonn.fromJson(informationStringg.toString(), ExecAPI.class);
			System.out.println("The password Is : " + results3.getResults().get(0).getLOGIN().getPassword());
			

		
	
				
				
				
				break;
			
	        case 4:
	        	System.out.println("Pls enter seeds");
				String seeds = sa.next();
				
				URL ur3 = new URL("https://randomuser.me/api/?password"+seeds);
				HttpURLConnection connnn = (HttpURLConnection) ur3.openConnection();
				connnn.setRequestMethod("GET");
				connnn.connect();
				StringBuilder informationStringgg = new StringBuilder();
				int responseCodeee = connnn.getResponseCode();
				if (responseCodeee != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCodeee);

				} else {

					Scanner scanner = new Scanner(ur3.openStream());
					while (scanner.hasNext()) {
						informationStringgg.append(scanner.nextLine());
					}
				
				}		
			
	
			Gson gsonnn = new Gson();

			ExecAPI results4 = gsonnn.fromJson(informationStringgg.toString(), ExecAPI.class);
			System.out.println("The seed Is : " + results4.getInfo().getSeed());
			
			
	        	
				break;
	        case 5:
	        	System.out.println("Enter Gender:");
	        	String gender=sa.next();
	        	 
	        	URL ur4 = new URL("https://randomuser.me/api/?gender="+gender);
				HttpURLConnection connection1 = (HttpURLConnection) ur4.openConnection();
				connection1.setRequestMethod("GET");
				connection1.connect();
				StringBuilder informationString5 = new StringBuilder();
				int responseCode5 = connection1.getResponseCode();
				if (responseCode5 != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCode5);

				} else {

					Scanner scanner = new Scanner(ur4.openStream());
					while (scanner.hasNext()) {
						informationString5.append(scanner.nextLine());
					}
				
				}		
			
	
			Gson g1 = new Gson();

			ExecAPI results5 = g1.fromJson(informationString5.toString(), ExecAPI.class);
			System.out.println("The Name is : " +results5.getResults().get(0).getName().getFirstName());
			System.out.println("The email is : " +results5.getResults().get(0).getEmail());
			System.out.println("The phone is : " +results5.getResults().get(0).getPhone());
			System.out.println("The Gender is : " +results5.getResults().get(0).getGender());
			break;
			
	        case 6:
//	        	System.out.println("Enter Version:");
//	        	String version=sa.next();
	        	 
	        	URL ur5 = new URL("https://randomuser.me/api/1.4");
				HttpURLConnection connection5 = (HttpURLConnection) ur5.openConnection();
				connection5.setRequestMethod("GET");
				connection5.connect();
				StringBuilder informationString6 = new StringBuilder();
				int responseCode6 = connection5.getResponseCode();
				if (responseCode6 != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCode6);

				} else {

					Scanner scanner = new Scanner(ur5.openStream());
					while (scanner.hasNext()) {
						informationString6.append(scanner.nextLine());
					}
				
				}		
	
			Gson g5 = new Gson();
			ExecAPI results6 = g5.fromJson(informationString6.toString(), ExecAPI.class);
			System.out.println("The Version is : " +results6.getInfo().getVersion());
			break;
			
	        	
	        case 7:
	        	System.out.println("Enter Nationalities:");
	        	String nationalities=sa.next();
	        	 
	        	URL ur6 = new URL("https://randomuser.me/api/?nat="+nationalities);
				HttpURLConnection connection6 = (HttpURLConnection) ur6.openConnection();
				connection6.setRequestMethod("GET");
				connection6.connect();
				StringBuilder informationString7 = new StringBuilder();
				int responseCode7 = connection6.getResponseCode();
				if (responseCode7 != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCode7);

				} else {

					Scanner scanner = new Scanner(ur6.openStream());
					while (scanner.hasNext()) {
						informationString7.append(scanner.nextLine());
					}
				
				}		
	
			Gson g6 = new Gson();
			ExecAPI results7 = g6.fromJson(informationString7.toString(), ExecAPI.class);
			System.out.println("The Name is : " +results7.getResults().get(0).getName().getFirstName());
			System.out.println("The email is : " +results7.getResults().get(0).getEmail());
			System.out.println("The phone is : " +results7.getResults().get(0).getPhone());
			System.out.println("The Nationality is : " +results7.getResults().get(0).getNat());
			break;
			
	        case 8:
	        	System.out.println("Enter Include fields:");
	        	String include=sa.next();
	        	 
	        	URL ur7 = new URL("https://randomuser.me/api/?inc="+include);
				HttpURLConnection connection7 = (HttpURLConnection) ur7.openConnection();
				connection7.setRequestMethod("GET");
				connection7.connect();
				StringBuilder informationString8 = new StringBuilder();
				int responseCode8 = connection7.getResponseCode();
				if (responseCode8 != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCode8);

				} else {

					Scanner scanner = new Scanner(ur7.openStream());
					while (scanner.hasNext()) {
						informationString8.append(scanner.nextLine());
					}
				
				}		
	
			Gson g7 = new Gson();
			ExecAPI results8 = g7.fromJson(informationString8.toString(), ExecAPI.class);
			System.out.println("The Name is : " +results8.getResults().get(0).getName().getFirstName());
			System.out.println("The Gender is : " +results8.getResults().get(0).getGender());
			System.out.println("The email is : " +results8.getResults().get(0).getEmail());
			System.out.println("The phone is : " +results8.getResults().get(0).getPhone());
			System.out.println("The cell is : " +results8.getResults().get(0).getCell());
			System.out.println("The Nationality is : " +results8.getResults().get(0).getNat());
			System.out.println("The include field is:"+include);
	        	
	        case 9:
	        	System.out.println("enter extra parameters: ");
	        	String parameters=sa.next();
	        	 
	        	URL ur8 = new URL("https://randomuser.me/api/?dl="+parameters);
				HttpURLConnection connection8 = (HttpURLConnection) ur8.openConnection();
				connection8.setRequestMethod("GET");
				connection8.connect();
				StringBuilder informationString9 = new StringBuilder();
				int responseCode9 = connection8.getResponseCode();
				if (responseCode9 != 200) {
					throw new RuntimeException("HttpresponseCode" + responseCode9);

				} else {

					Scanner scanner = new Scanner(ur8.openStream());
					while (scanner.hasNext()) {
						informationString9.append(scanner.nextLine());
					}
				
				}		
	
			Gson g8 = new Gson();
			ExecAPI results9 = g8.fromJson(informationString9.toString(), ExecAPI.class);
			System.out.println("The Name is : " +results9.getResults().get(0).getName().getFirstName());
			System.out.println("The include field is:"+parameters);
	        	
			
			}
			
			
			
			menuExit=false;

		}}}
