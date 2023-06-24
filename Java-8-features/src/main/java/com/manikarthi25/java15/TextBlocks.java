package com.manikarthi25.java15;

public class TextBlocks {

	public static void main(String[] args) {
		
		// no need to use /n /t for new line etc
		// removing trailing white space of each lines
		String textBlock = """
				First Name : %s
				Last Name : %s
				Age : %d
				e-mail : %s
				Thanks
				Mani
				""".formatted("Mohith", "Mani", 10, "mohith@gmail.com");
		
		System.out.println(textBlock);
		
		
	}

}

/*
 
First Name : Mohith
Last Name : Mani
Age : 10
e-mail : mohith@gmail.com
Thanks
Mani


*/