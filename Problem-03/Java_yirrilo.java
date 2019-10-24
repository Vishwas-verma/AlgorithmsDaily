/*
Author : yirrilo
College : N/A
Year/Department : N/A
E-Mail Id : 15703478+yirrilo@users.noreply.github.com
*/
package fr.yirrilo.contest.github.algorithmdaily.problem3;

import java.io.InputStream;
import java.util.Scanner;

public class Java_yirrilo {

	public static void main( String[] argv ) throws Exception {
		InputStream inputStream = System.in;
		String response = doJob(inputStream);
		System.out.print(response);
	}

	public static String doJob(InputStream inputStream) {
		try (Scanner sc = new Scanner(inputStream)){
			String[] listOfValue = sc.nextLine().split("->");
			int offset = Integer.valueOf(sc.nextLine().split("=")[1].trim());
			return listOfValue[listOfValue.length-offset].trim();
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.err.println("An error occured when reading or using the input : " + e.getMessage());
			return "";
		}
	}

}
