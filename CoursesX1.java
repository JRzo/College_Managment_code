
import java.util.Scanner;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class CoursesX1 {

	static String collegeProffesor(String x) {
		Dictionary<String, String> collegeProofs = new Hashtable<String, String>();
		collegeProofs.put("BC", "Sergio Alvarez");
		collegeProofs.put("BU", "Wayne, Snyde");
		collegeProofs.put("ELMS", "Beryl, Hoffman");
		collegeProofs.put("Umass A", "Adrion,Rick");
		collegeProofs.put("WNE", "Ellis, Heidi");
		collegeProofs.put("NYU", "'Hasan");
		collegeProofs.put("Cornell", "Jayyadev, Acharya ");
		collegeProofs.put("Syracuse", "Tomislav Bujanovic");
		collegeProofs.put("RIT", "Reynol, Bailey");
		collegeProofs.put("SC", "Lisa Bromberg");

		return collegeProofs.get(x);
	}

	static String CollegeCourses(String college) {
		// A dictionary holding the courses of the colleges in the department of
		// computer science.
		Dictionary<String, String> courses = new Hashtable<String, String>();
		courses.put("BC",
				"Calc 1&2,\n CSCI 1101/2,\n Logic & ELMSComputation,\n Computer Systems & Alogirthms,\n CSCI33xx(4)");
		courses.put("BU",
				"Calc 1,\n Introduction CS I/II,\n Computer System(2),\n Alogrithms(3),\n Combinatoric Structures,\n CS300xx(4)");
		courses.put("ELMS",
				"	Intro to Programming,\n Networks & Security,\n Discrete Math,\n System Administration,\n Databases,\n MAT 108>,"
						+ "	\nData Structures and Algorithms,\n Advanced Programming,\n CIT(2)");

		courses.put("Umass A",
				"Calc 1&2,\n Introduction to Problem Solving,\n Programming & Data Structures,\n Programming Methodology,\n "
						+ "Computer Systems Principles,\n Reasoning Under Uncertainty,\n Social Issues in Computing,\n Software Engineering");
		courses.put("WNE",
				"CS 101 & 2/IT 101 & 2,\n Data Structures,\n Software Design & Development,\n Programming Paradigms,\n Design of Database Management Systems"
						+ "Design and Analysis of Algorithms,\n Parallel Computing,\n Software Engineering,\n Computer Science Capstone,\n Discrete Mathematics (2),\n Calc 1 ");

		courses.put("NYU", "CSCI 1&2,\n CSCI 201&2,\n Calc 1,\n Descrete Math,\n Basic Algorithms,\n CSCi 04XX(5)\n");
		courses.put("Cornell",
				"Calc 1-3,\n Science(2),\n Discrete & Data Structures,\n OS,\n Theory Algorithms,\n CS(5)\n");

		courses.put("Sysracuse",
				"Calc 1-3,\n CIS 321,\n PHY221+Lab,\n Che106+Lab,\n CRS 225,\n CRS 325,\n IST 344,\n PHI 251,\n ECS 392,\n CIS 453-86\n");
		courses.put("RIT",
				"Calc 1&2,\n Discrete math,\n CSCI 141&2,\n Algorithms(3),\n Intro to CS theory Principles of Data Management,\n 	Introduction to Artificial Intelligence\n"
						+ "Computer Science Undergraduate Co-op (spring)\n");
		courses.put("SC",
				"Discrete Mathematics I,\nData Structures Using C++,\n Microcomputer Applications,\nIntroduction to Computer Science with C++,\n "
						+ "Database Development and Management,\n Computer Systems Seminar,\n Precalculus Mathematics,\n Computer Architecture\n ");

		return courses.get(college);
	}

	public static String[] CollegesDatabase() {
		Scanner in = new Scanner(System.in);

		// array 0 = MA, Array 1 = NY,
		String[][] collegeListEdu = { { "BC", "BU", "ELMS", "Umass A", "WNE" },
				{ "NYU", "Cornell", "Syracuse", "RIT", "SC" } };

		System.out.println("The colleges we have avaible at the moment are \n");
		for (int n = 0; n < 2; n++) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("%s\n", collegeListEdu[n][i]);
			}
		}
		System.out.println("What college are you going to attend or attending?");
		String userCollege = in.next();

		int iValue = 0;
		try {
			for (int x = 0; x < 5; x++) {
				if (collegeListEdu[0][x].toString().contains(userCollege)
						|| collegeListEdu[1][x].toString().contains(userCollege)) {
					iValue += 1;
				} else {
					iValue += 0;
				}
			}
		} catch (Exception e) {
			System.out.println("Something has went wrong");
		} finally {
			String[] detailsCollege = { CollegeCourses(userCollege), CoursesX1.collegeProffesor(userCollege) };
			return detailsCollege;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] collegePerson = CoursesX1.CollegesDatabase();
		System.out.print("What is your name ?");
		String userName = in.next();
		System.out.printf("\n\n Hello %s your courses are %s \n and your persn to contact is \n %s", userName,
				collegePerson[0], collegePerson[1]);
	}

}
