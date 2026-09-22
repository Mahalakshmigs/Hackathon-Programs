package hackathon;

public class Theory {

	public static void main(String[] args) {
		
		//Q7.	What are different ways to create String Object?
		
		 String str = "Mahalakshmi"; 
		 String str1 = new String("Mahalakshmi");
		 String emptyStr = new String();
		 char[] chars = {'J', 'a', 'v', 'a'};
		 String charStr = new String(chars);

		 //Q8.	How can we make String upper case to lower case?

		 String str3 = "MAHA";
		 str3 = str3.toLowerCase();
		 System.out.println(str3);
//Q9.	How can we make String Lower case to Upper case?
		 String strU = "maha";
		 strU = strU.toUpperCase();
		 System.out.println(strU);
//Q10. What is String subSequence method?
		 String sStr = "Mahalakshmi*";
		 sStr.subSequence(5, 11);
		 System.out.println( sStr.subSequence(5, 11));
//Q11. How to Split String in java?
			/*
			 * String sSplit = "G.S.Mahalakshmi*"; String[] sArrWords = sSplit.split("\\.");
			 * for (String word:sArrWords) { System.out.println(word); } String sSpl =
			 * "Maha is Learning Java"; String[] sSplArr = sSpl.split(" "); for (String
			 * eachWord:sSplArr) System.out.println(eachWord);
			 */
		 String sSplit = "G.S.Mahalakshmi*";
		 String[] sArrWords = sSplit.split("\\.");
		System.out.println("Split words from dot delimiter");
		 for (String word:sArrWords) {
			 System.out.println(word);
		 }
		 String sSpl = "Maha is Learning Java";
		 String[] sSplArr = sSpl.split(" ");
		System.out.println("Split words from Space delimiter");
		 for (String eachWord:sSplArr)
			 System.out.println(eachWord);

		 
		 
	}

}
