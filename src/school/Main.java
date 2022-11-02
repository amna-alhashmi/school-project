package school;

import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	private static void printFibonacci(int i) {
		// TODO Auto-generated method stub

	}

	ArrayList<School> schoolList = new ArrayList<>();

	
	
	public void setSchoolName(ArrayList<School> schoolList) {
		this.schoolList = schoolList;
	}

	public ArrayList<School> getSchoolList() {
		return schoolList;
	}

	public static void main(String[] args) throws IOException {
		Student studentList = new Student();
		
		BigInteger fac = new BigInteger("1");
		int n;
		FileOutputStream fileOut;
		ObjectOutputStream fOut = null;

		try {
			fileOut = new FileOutputStream("C:\\Users\\user008\\eclipse-workspace\\amna\\amna.txt");
			fOut = new ObjectOutputStream(fileOut);
		} catch (IOException e1) {
			e1.printStackTrace();

		}

		Stack<String> history = new Stack<String>();
		// Main man=new Main();
		ArrayList<School> schoolList = new ArrayList<>();
		ArrayList<Student> studentEmail = new ArrayList<>();
		// ArrayList<Course> ourCourse=new ArrayList<>();
		// ArrayList<Marks> ourMarks=new ArrayList<>();
		Scanner sa = new Scanner(System.in);
		ArrayList<String> emailList = new ArrayList<>();
		HashSet<String> eList = new HashSet<>();
		String name = "";
		int currancy = 0;
		double amounty = 0;
		double calamounty = 0;

		int n1 = 0, n2 = 1, n3 = 0, count = 10;

		String teacherNameInput = null;
		String teachrIdInput = null;
		String teacherName = "AMNA";
		String teacherId = "123";
		int studentAgeInput;
		HashMap<String, Double> amountList = new HashMap<String, Double>();
		HashMap<String, HashMap<String, Double>> studentAmountList = new HashMap<>();
		// Factorial factLong=new Factorial();
		boolean schoolExit = true;
		boolean studentExit = true;
		boolean courseExit = true;
		boolean amountExit = true;
		boolean loop = true;
		boolean teacherExit = true;
		while (teacherExit) {
			try {
				System.out.println("Enter teacher name:");
				teacherNameInput = sa.next();
				if (teacherNameInput.matches("^[A-Za-z]*$")) {
					System.out.println("faild string format");

				} else {
					System.out.println("not faild string format\n");
					teacherExit = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("faild string format \n");
				teacherExit = true;
				System.out.println("Enter teacher name:");
				teacherNameInput = sa.next();
			}

			try {
				System.out.println("Enter teacher ID");
				teachrIdInput = sa.next();
				Integer.parseInt(teachrIdInput);
				System.out.println("faild number format");
			} catch (NumberFormatException e) {
				System.out.println("not faild number format");
				teacherExit = true;
			}
			if (teacherNameInput.matches(teacherName)) {
				if (teachrIdInput.matches(teacherId)) {

					do {
						System.out.println("\n1.Enter Student details:");
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
							while (schoolExit) {
								School ourSchool = new School();

								System.out.println("Enter School Name:");
								String school = sa.next();
								ourSchool.setSchoolName(school);
								history.push(school);
								try {
									if (!school.matches("^[A-Za-z]*$")) {
										throw new Exception("in faild string format");
									}
								} catch (Exception e) {
									System.out.println(e.getMessage());
									continue;

								}

								studentExit = Boolean.TRUE;

								while (studentExit) {
									System.out.println("Enter Student Age");
									studentAgeInput=sa.nextInt();
									studentList.setStudentAge(studentAgeInput);
									studentList.studentAge(studentAgeInput);
									if (studentAgeInput>6&&studentAgeInput<18) {
								System.out.println("Can join to school");
									//Student studentList = new Student();
									System.out.println("Enter Student Name:");
									String student = sa.next();
									studentList.setStudentName(student);
									history.push(student);
									try {
										if (!student.matches("^[A-Za-z]+$")) {
											throw new Exception("In Falid String Format");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										continue;
									}
									
										
									
									
									
									
									
									
									
									System.out.println("Enter Student Email:");
									String email = sa.next();
									studentList.setStudentEmail(email);
									eList.add(email);
									history.push(email);
									try {
										if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
											throw new Exception("In Faild String Format");	
										}
									}catch(Exception e) {
										System.out.println(e.getMessage());
										continue;
									}

									while (amountExit) {
										System.out.println("Choose one option \n 1-DOLLER\n 2-AED\n 3-SAR\n");
										currancy = sa.nextInt();
										System.out.print("Enter your Amount\n");
										amounty = sa.nextInt();
										// studentList.setStudentAmount(amounty);
										if (currancy == 1) {
											name = "DOLLER";
											calamounty = amounty * 2.6;
											System.out.println("your currncy in Doller is:\t" + calamounty);
										} else if (currancy == 2) {
											name = "AED";
											calamounty = amounty * 9.4;
											System.out.println("your currncy in AED is:\t" + calamounty);
										} else if (currancy == 3) {
											name = "SAR";
											calamounty = amounty * 9.7;
											System.out.println("your currncy IN SAR is:\t" + calamounty);
										} else {
											if (currancy > 4) {
												currancy = 0;
												System.out.println("Pls select one of option");

											}
										}
										// System.out.println("your currncy is:\t" + calamounty);

										amountList.put(name, calamounty);
										studentAmountList.put(student, amountList);
										System.out.println("do you want to add currancy press 1 if not press 0");
										int exitCurrancy = sa.nextInt();
										if (exitCurrancy == 0) {
											amountExit = false;

										}
									}
									// history.push(email);

									while (courseExit) {
										Course newCourse = new Course();
										Marks newMarks = new Marks();
										System.out.println("Enter Course Name:");
										String courseList = sa.next();
										newCourse.setCourseName(courseList);
										history.push(courseList);
                                        try {
                                        	if(!courseList.matches("^[A-Za-z]*$")) {
                                        		throw new Exception("In faild String format");
                                        	}
                                        }catch(Exception e) {
                                        	System.out.println(e.getMessage());
                                        	continue;
                                        }
										
										
										
										
										
										
										
										
										
										
										
										try {
										System.out.println("Enter course Mark:");
										String coursemar = sa.next();
										int cour = Integer.parseInt(coursemar);
										newMarks.setCourseMarks(cour);
										history.push(coursemar);
										fOut.writeObject(history.toString());
										studentList.ourCourse.add(newCourse);
										System.out.println("do you want to add course press 1 if not press 0");
										
										}catch(Exception e) {
											System.out.println(e.getMessage());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
										}

										int exitoutput = sa.nextInt();
										if (exitoutput == 0)
											courseExit = false;

									}
									schoolList.add(ourSchool);

									ourSchool.studentName.add(studentList);

									System.out.println("do you want to add student press 1");
									int studExit = sa.nextInt();
									if (studExit == 0) {
										studentExit = false;

									} else {

										studentExit = true;
										amountExit = true;
										courseExit = true;
									}
									}
								else{
										System.out.println("Can not join to school");
									}
									

								}
								System.out.println("do you want to add school press 1 ");
								int schExit = sa.nextInt();
								if (schExit == 1) {
									schoolExit = true;
									studentExit = true;
									amountExit = true;
									courseExit = true;
								} else {
									schoolExit = false;
									studentExit = false;
									amountExit = false;
									courseExit = false;
								}

							}

							break;

						// hasExit=false;
						case 2:
							System.out.println("*******************Report*************************");

							for (School s : schoolList) {
								System.out.println("\t school Name:\t" + "\t" + s.schoolName);

								for (Student t : s.studentName) {
									System.out.println("\t student Name: \t" + "\t" + t.studentName
											+ "\tstudent Email:\t" + "\t" + t.studentEmail);

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

								// try {
								// Stack<String> stu=Stack
								// }

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
							for (String studentName : studentAmountList.keySet()) {
								Map<String, Double> lowerMap = studentAmountList.get(studentName);
								System.out.println("Student Name :\t" + studentName);

								for (String currencyKey : lowerMap.keySet()) {
									System.out.println(
											"Currency :\t" + currencyKey + "Amount is :\t" + lowerMap.get(currencyKey));
								}
							}
						case 6:
							do {
								System.out.println("\n1.Factorial");
								System.out.println("2.Fibonacci");
								System.out.println("3.Back to main menue");
								String b = sa.next();
								int menue = Integer.parseInt(b);
								switch (menue) {
								case 1:
									// while(number.compareTo(BigInteger.ONE)>=0) {
									// while(mMenue) {
									System.out.println("Enter a number:");
									n = sa.nextInt();

									for (int i = 2; i <= n; i++) {

										fac = fac.multiply(BigInteger.valueOf(i));
									}

									System.out.println("factorial of number :\t" + n + "\t" + "is\t" + fac);

									break;

								case 2:
									System.out.println("Enter your count number");
									count = sa.nextInt();
									System.out.print(n1 + " " + n2);
									printFibonacci(count - 2);
									for (int i = 2; i < count; ++i) {
										n3 = n1 + n2;
										n1 = n2;
										n2 = n3;
										System.out.print(" " + n3);
										printFibonacci(count - 1);

									}
									break;

								case 3:
									loop = false;
									break;
								}

							} while (loop == true);

							break;
						}
					} while (true);
				}
			} else {
				System.out.println("It is wrong teacher name and Id pls try agin ");
			}
		}
		teacherExit = false;
	}

}
