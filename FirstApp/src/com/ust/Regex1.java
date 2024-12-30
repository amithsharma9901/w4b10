package com.ust;
import java.util.regex.*; 
public class Regex1 {

 	   public static void main(String args[]){  
	      String content = "look in to book myshow";

	      String pattern = ".*book.*";

	      boolean isMatch = Pattern.matches(pattern, content);
	      System.out.println("REsult " + isMatch);
	      
	      System.out.println("this is tech world ".matches(".*tech.*"));
	      
	      String content1 = "ZZZ AA PP AA QQQ AAA ZZ";

	      String string = "AA";
	      Pattern pattern1 = Pattern.compile(string);
	      Matcher matcher = pattern1.matcher(content1);

	      while(matcher.find()) {
	         System.out.println("Found at: "+ matcher.start()
	        		+ 
	        		" - " + matcher.end());
	      }
	      
	      System.out.println(Pattern.matches("[a-z]","6"));  //digit
	      System.out.println(Pattern.matches("\\D","A"));  //digit
	      
	      
	      Pattern pattern2 = Pattern.compile("java lanugage", Pattern.CASE_INSENSITIVE);
	      Matcher matcher2 = pattern2.matcher("Java");
	      boolean matchFound = matcher2.find();
	      if(matchFound) {
	        System.out.println("Match found");
	      } else {
	        System.out.println("Match not found");
	      }

	   }
	}  
