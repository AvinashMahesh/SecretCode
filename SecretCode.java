import java.util.Scanner;
 
public class SecretCode {
 
public static void  main (String[] args) {
 
int tot = 0;
String one, two ;
boolean b;
Scanner thing = new Scanner (System.in);
System.out.println("Enter 2-12 characters");
String input = thing.next();
b = isValidLength(input);
 
if (b == true)
{
tot = CharToAscii(input);
 
int a = tot;
 
int c = 0;
 
if (getNumDigits(tot) % 2 == 1)
{
tot = tot * 10;
}
 
if(tot <= 4000)
{
tot = tot * 4;
}
 
if(getNumDigits(tot) % 2 == 1)
{
tot = tot / 10;
c = tot;
}
else
{
c = tot;
}
 
int first = tot/100;
int end = tot % 100;
 
if (first <= 65)
{
first = first + 61;
}
if(end <=65)
{
end = end + 61;
}
one = getSecretCode (first);
two = getSecretCode (end);
 
System.out.println("Sum of ascii codes = " + a);
System.out.println("4 Digit Number: " + c);
System.out.println("Secret Code: " + one + two);
}
if(b == false)
{
System.out.println("Invalid ");
}
}
 
public static boolean isValidLength (String s)
{
boolean valid = false;
if(s.length() >= 2 && s.length() <= 12) 
{
valid = true;
}
return valid;
}
 
 
public static int CharToAscii (String s) 
{
int total = 0;
for (int e = 0; e <= s.length() - 1; e++)
{
int value = s.charAt(e);
total = total + value;
}
return total;
}
 
 
public static int getNumDigits (int n)
{
int dig = 0;
while (n > 0)
{
n = n / 10;
dig++;
}
return dig;
}
 
public static String getSecretCode (int num)
{
String ssss = Character.toString((char) num);
return ssss;
}
}
