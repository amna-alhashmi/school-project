package school;

import java.util.*;
import java.math.BigInteger;
public class Main {
	
	ArrayList<School> schoolName = new ArrayList<>();

	public void setSchoolName(ArrayList<School> schoolName) {
		this.schoolName = schoolName;
	}

	public ArrayList<School> getSchoolName() {
		return schoolName;
	}

	public static void main(String[] args) {
		
		BigInteger fac=new BigInteger("1");
		int n;
		//final int digits = fac.toString().length();
		 //BigInteger number = new BigInteger(fac.toString());
		//List<Integer> list = new LinkedList<Integer>();
		//BigInteger factorial = new BigInteger("1");
		 //BigInteger factor = null;
		    //int limit=1;
		    
		Stack<String> history = new Stack<String>();
		Main man=new Main();
		ArrayList<School> schoolName = new ArrayList<>();
		ArrayList<Student> studentEmail = new ArrayList<>();
		 ArrayList<Course> ourCourse=new ArrayList<>();
		// ArrayList<Marks> ourMarks=new ArrayList<>();
		Scanner sa = new Scanner(System.in);
		ArrayList<String> emailList = new ArrayList<>();
		HashSet<String> eList = new HashSet<>();
		String name="";
		int currancy = 0;
		double amounty = 0;
		double calamounty = 0;
		HashMap<String,Double> amountList =new HashMap<String,Double>();
		HashMap<String,HashMap<String,Double>> studentAmountList =new HashMap<>();
	    //Factorial factLong=new Factorial();
		boolean eExit = true;
		boolean isExit = true;
		boolean hasExit = true;
		boolean cExit=true;
		boolean mMenue=true;
		boolean fMenue=true;
		do {
			System.out.println("1.Enter Student details:");
			System.out.println("2.Report");
			System.out.println("3.History");
			System.out.println("4.Dublicate Email");
			System.out.println("5.Student Amount");
			System.out.println("6.Code Problem");
			System.out.println("7.Exit");
			String a = sa.next();
			int option = Integer.parseInt(a);
			switch (option) {
			case 1:
				while (eExit) {
					School ourSchool = new School();
					System.out.println("Enter School Name:");
					String school = sa.next();
					ourSchool.setSchoolName(school);
					isExit = Boolean.TRUE;

					while (isExit) {
						Student studentList = new Student();
						System.out.println("Enter Student Name:");
						String student = sa.next();
						studentList.setStudentName(student);
						history.push(student);
						//ArrayList<Course> ourCourse=new ArrayList<>();
						// ArrayList<Marks> ourMarks=new ArrayList<>();
						System.out.println("Enter Student Email:");
						String email = sa.next();
						studentList.setStudentEmail(email);
						eList.add(email);
						// eList1.add(email);
						history.push(email);
					    
					    
						while(cExit) {
						System.out.println("Choose one option \n 1-DOLLER\n 2-AED\n 3-SAR\n");
						currancy = sa.nextInt();
						System.out.print("Enter your Amount\n");
						amounty = sa.nextInt();
						// studentList.setStudentAmount(amounty);
						if (currancy == 1) {
							name = "DOLLER";
							calamounty = amounty * 2.6;
							//System.out.println("your currncy in Doller is:\t" + calamounty);
						} else if (currancy == 2) {
							name = "AED";
							calamounty = amounty * 9.4;
							//System.out.println("your currncy in AED is:\t" + calamounty);
						} else if (currancy == 3) {
							name = "SAR";
							calamounty = amounty * 9.7;
							System.out.println("your currncy IN SAR is:\t" + calamounty);
						} else  {
							if(currancy>4) {
								currancy=0;
								System.out.println("Pls select one of option");
								
						}
						}
						//System.out.println("your currncy is:\t" + calamounty);
						
						amountList.put(name,calamounty);
						studentAmountList.put(student, amountList);
						System.out.println("do you want to add currancy press 1 if not press 0");
						int exitCurrancy = sa.nextInt();
						if (exitCurrancy == 0) {
							cExit = false;
						
						}
						}
						//history.push(email);

						while (hasExit) {
							Course newCourse = new Course();
							Marks newMarks = new Marks();
							System.out.println("Enter Course Name:");
							String courseList = sa.next();
							newCourse.setCourseName(courseList);
							history.push(courseList);

							System.out.println("Enter course Mark:");
							String coursemar = sa.next();
							int cour = Integer.parseInt(coursemar);
							newMarks.setCourseMarks(cour);
							history.push(coursemar);
							studentList.ourCourse.add(newCourse);
							System.out.println("do you want to add course press 1 if not press 0");
							//newCourse.ourMarks.add(newMarks);
							// ourCourse.add(newCourse);
							// ourMarks.add(newMarks);
							
							int exitoutput = sa.nextInt();
							if (exitoutput == 0) 
								hasExit = false;
							
							
						}
						schoolName.add(ourSchool);
						
						ourSchool.studentName.add(studentList);

						

						System.out.println("do you want to add student press 1");
						int studentExit = sa.nextInt();
						if (studentExit == 0) {
							isExit = false;
							
						}
						else
						{
							
							isExit = true;
							cExit = true;
							hasExit = true;
						}

					}
					System.out.println("do you want to add school press 1 ");
					int schoolExit = sa.nextInt();
					if (schoolExit == 1) {
						eExit = true;
						isExit = true;
						cExit=true;
						hasExit = true;
					} else {
						eExit = false;
						isExit = false;
						cExit=false;
						hasExit = false;
					}

				}
				
				break;

			// hasExit=false;
			case 2:
				System.out.println("*******************Report*************************");

				for (School s : schoolName) {
					System.out.println("\t school Name:\t" + "\t" + s.schoolName);

					for (Student t : s.studentName) {
						System.out.println("\t student Name: \t" + "\t" + t.studentName + "\tstudent Email:\t" + "\t"
								+ t.studentEmail);

						for (Course c : t.ourCourse) {
							System.out.println("\t course Name: \t" + "\t" + c.courseName);

							for (Marks m : c.ourMarks) {
								System.out.println("\t Mark \t" + "\t" + "\t" + m.getCourseMarks());

							}
						}

					}

				}
				break;
			case 3:
				System.out.println("*****************HISTORY*********************");
				while (history.empty() == false) {
					System.out.println(history.pop());
				}
				break;

			case 4:
				for (String e : eList) {
					if (eList.add(e) == false) {
						System.out.println("*******print Dublicate email*********\n" + e);
					}

				}
				break;

			case 5:
				for(String studentName:studentAmountList.keySet()) {
					Map<String,Double> lowerMap = studentAmountList.get(studentName);
					System.out.println("Student Name :\t"+ studentName);

					for(String currencyKey :lowerMap.keySet())
					{
						System.out.println("Currency :\t"+currencyKey+"Amount is :\t"+lowerMap.get(currencyKey));
					}
				 }
			case 6:
				do {
					System.out.println("1.new Menue");
					System.out.println("2.Back to main menue");
					String b = sa.next();
					int menue = Integer.parseInt(b);
					switch (menue) {
					case 1:
						//while(number.compareTo(BigInteger.ONE)>=0) {
					   //while(mMenue) {
						System.out.println("Enter a number:");
						n=sa.nextInt();	
								
							
							for(int i=2;i<=n;i++){	
								
								fac=fac.multiply(BigInteger.valueOf(i));
							}
						
						//System.out.println("the digits are\t:"+number);
						
						System.out.println("factorial of number :\t"+n+"\t"+"is\t"+fac);
						//System.out.println("do you want to add another number press 1 if not 0");
						//int s=sa.nextInt();
						//if(s==0) {
							//mMenue=false;
						
					   break;
					case 2:
						if(menue==2) {
						hasExit=true;
						//isExit
							
						}
						
						
						
						
						break;
					   }
				}while(true);
				
			}break;
					   
				
			
			
		
			}while (true);

	

}
}
	//static void temp() {
		
		//Map<String, Integer> tempsOfOmanCities = new HashMap<>();
		//Map<String, Map<String, Integer>> internationalTemperatureMap = new HashMap<>();

		
		//Scanner scanner = new Scanner(System.in);
		
		
		//System.out.println("Enter Country You Want");
		//String country = scanner.next();
		
		
		//System.out.println("Enter City You Want");
		//String city = scanner.next();
		
		
		
		//System.out.println("Enter Temp You Want");
		//Integer temp = scanner.nextInt();


		//tempsOfOmanCities.put(city, temp);
		//internationalTemperatureMap.put(country, tempsOfOmanCities);

		
		
		
		
		
		//tempsOfOmanCities.put("Sohar", 30);
		//tempsOfOmanCities.put("Nizwa", 28);
		
		//Map<String, Integer> tempsofUAECities = new HashMap<>();
		
		//tempsofUAECities.put("Dubai", 40);
		//tempsofUAECities.put("Abu Dhabi", 42);
		//tempsofUAECities.put("Sharjah", 42);
		
		//Map<String, Integer> tempsOfUSACities = new HashMap<>();
		
		//tempsOfUSACities.put("New York", 16);
		//tempsOfUSACities.put("Chicago", 18);
		//tempsOfUSACities.put("Washington DC", 22);

		
		
		
		//internationalTemperatureMap.put("Oman", tempsOfOmanCities);
		//internationalTemperatureMap.put("UAE", tempsofUAECities);
		//internationalTemperatureMap.put("USA", tempsOfUSACities);
		
		//System.out.println(internationalTemperatureMap.get("Oman").get("Muscat"));


		
		
	

