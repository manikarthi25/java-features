package com.manikarthi25.java14;

public class SwitchExpression {
	
	public static String findDayofWeek(int day) {
		String dayOfWeek = "";
		switch(day) {
			case 0: dayOfWeek = "Sunday"; break;
			case 1: dayOfWeek = "Monday"; break;
			case 2: dayOfWeek = "Tuesday"; break;
			case 3: dayOfWeek = "Wednesday"; break;
			case 4: dayOfWeek = "Thursday"; break;
			case 5: dayOfWeek = "Friday"; break;
			case 6: dayOfWeek = "Saturday"; break;
			default: throw new IllegalArgumentException("Invalid arigument");
		}
		return dayOfWeek;
	}

	//Java 14 introduced switch expression
	public static String findDayofWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch(day) {
			case 0 -> {//when write multiple lines
				System.out.println();
				yield "Sunday"; 
			}
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> throw new IllegalArgumentException("Invalid arugument");
		};
		return dayOfWeek;
	}
	
	public static void main(String[] args) {
		System.out.println("Legacy Switch :" + findDayofWeek(5));
		System.out.println("Switch Expression :" + findDayofWeekWithSwitchExpression(3));
	}

}

/*
 Legacy Switch :Friday
 Switch Expression :Wednesday
*/