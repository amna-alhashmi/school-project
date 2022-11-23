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

		boolean menuExit = true;
		boolean userExit = true;
		Scanner sa = new Scanner(System.in);

		while (menuExit) {

			System.out.println("1.MULTIPL USERS");
			System.out.println("2.PAGINATION");
			System.out.println("3.PASSWORDS");
			System.out.println("4.SEEDING");
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
									System.out.println("The Location Is : "
											+ results1.getResults().get(0).getName().getFirstName());
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
					
				}
				userExit = false;

				break;

			case 2:

				break;

			case 3:
				break;

			case 4:
				break;

			}

		}

	}
}