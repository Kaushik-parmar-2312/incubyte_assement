package calculator;

public class StringCalculator {

	public static int Add(String num)
	{
		if(num.equals(""))
		{
			return 0;
		}
		else
		{
			String delimeter = "," ;
			if(num.matches("//(.*)\n(.*)")) {
				delimeter=Character.toString(num.charAt(2));
				num=num.substring(4);
			}
			String numList[]= splitNumbers(num,delimeter + "|\n");
			return sum(numList);
		}
	}
	 private static int toInt(String num)
	    {
	        return Integer.parseInt(num);
	    }	
	 private static String[] splitNumbers(String num, String split)
	 {
		 return num.split(split);
	 }
	 
	 private static int sum(String[] numbers)
     {
		 int total = 0;
		 String negString = "";

		 for(String number : numbers)
		 	{
			 	if(toInt(number) < 0)
			 	{
			 		if(negString.equals(""))
			 			negString = number;
			 		else
			 			negString += ("," + number);
			 	}
			 	if(toInt(number) < 1000)
			 		total += toInt(number);
		 	}
         if(!negString.equals(""))
         {
             throw
                     new IllegalArgumentException("Negatives not allowed: " + negString);
         }
     return total;
    }
 }

