// Java Program to Find the Fibonacci Series 
// Recursive Method 
public class FibonacciRecursive { 
 public staƟc void main(String[] args) {
 int n = 10; // Number of terms 
 for (int i = 0; i < n; i++) { 
 System.out.print(fibonacci(i) + " "); 
 } 
 } 
 public staƟc int fibonacci(int n) {
 if (n <= 1) { 
 return n; 
 } 
 return fibonacci(n - 1) + fibonacci(n - 2); 
 } 
} 
// Non-Recursive Method 
public class FibonacciNonRecursive { 
 public staƟc void main(String[] args) {
 int n = 10; // Number of terms 
 int a = 0, b = 1; 
 System.out.print(a + " " + b + " "); 
 for (int i = 2; i < n; i++) { 
 int c = a + b; 
 System.out.print(c + " "); 
 a = b; 
 b = c; 
 } 
 } 
}

// java Program to MulƟply Two Given Matrices
public class MatrixMulƟplicaƟon {
 public staƟc void main(String[] args) {
 int[][] a = { 
 {1, 2, 3}, 
 {4, 5, 6}, 
 {7, 8, 9} 
 }; 
 int[][] b = { 
 {9, 8, 7}, 
 {6, 5, 4}, 
 {3, 2, 1} 
 }; 
 int[][] result = new int[3][3]; 
 for (int i = 0; i < 3; i++) { 
 for (int j = 0; j < 3; j++) { 
 for (int k = 0; k < 3; k++) { 
 result[i][j] += a[i][k] * b[k][j]; 
 } 
 } 
 } 
 System.out.println("Product of matrices:"); 
 for (int[] row : result) { 
 for (int val : row) { 
 System.out.print(val + " "); 
 } 
 System.out.println(); 
 } 
 } 
}

//Java Program to Read a Line of Integers and Display Each Integer and the Sum Using String 
Tokenizer 
import java.uƟl.StringTokenizer;
import java.uƟl.Scanner;
public class IntegerTokenizer { 
 public staƟc void main(String[] args) {
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter a line of integers:"); 
 String line = sc.nextLine(); 
 StringTokenizer st = new StringTokenizer(line); 
 int sum = 0; 
 System.out.println("The integers are:"); 
 while (st.hasMoreTokens()) { 
 int num = Integer.parseInt(st.nextToken()); 
 System.out.println(num); 
 sum += num; 
 } 
 System.out.println("Sum of integers: " + sum); 
 } 
}

// Java Program to Check Whether a Given String is Palindrome or Not 
import java.uƟl.Scanner;
public class PalindromeChecker { 
 public staƟc void main(String[] args) {
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter a string:"); 
 String str = sc.nextLine(); 
 
 if (isPalindrome(str)) { 
 System.out.println(str + " is a palindrome."); 
 } else { 
 System.out.println(str + " is not a palindrome."); 
 } 
 } 
 public staƟc boolean isPalindrome(String str) {
 int leŌ = 0, right = str.length() - 1; 
 while (leŌ < right) {
 if (str.charAt(leŌ) != str.charAt(right)) {
 return false; 
 } 
 leŌ++;
 right--; 
 } 
 return true; 
 } 
}


Applet Programs 
A) Applet Program to Display a Simple Message 
import java.applet.Applet; 
import java.awt.Graphics; 
public class SimpleApplet extends Applet { 
 public void paint(Graphics g) { 
 g.drawString("Hello, World!", 20, 20); 
 } 
} 
B) Applet Program to Compute Factorial Value 
import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.TextField; 
import java.awt.BuƩon;
import java.awt.event.AcƟonEvent;
import java.awt.event.AcƟonListener;
public class FactorialApplet extends Applet implements AcƟonListener {
 TextField input; 
 TextField output; 
 BuƩon computeBuƩon;
 public void init() { 
 input = new TextField(10); 
 output = new TextField(20); 
 computeBuƩon = new BuƩon("Compute Factorial");
 add(input); 
 add(computeBuƩon);
 add(output); 
 computeBuƩon.addAcƟonListener(this);
 }


public void acƟonPerformed(AcƟonEvent e) {
 int num = Integer.parseInt(input.getText()); 
 int factorial = 1; 
 for (int i = 1; i <= num; i++) { 
 factorial *= i; 
 } 
 output.setText("Factorial: " + factorial); 
 } 
}

Java Program to Display the ExcepƟon in a Message Dialog Box
import javax.swing.JOpƟonPane;
public class ExcepƟonDialog {
 public staƟc void main(String[] args) {
 try { 
 int result = 10 / 0; 
 } catch (ArithmeƟcExcepƟon e) {
 JOpƟonPane.showMessageDialog(null, "ExcepƟon: " + e.getMessage(), "Error", 
JOpƟonPane.ERROR_MESSAGE);
 } 
 } 
}




Java Program that Implements a MulƟ-Thread ApplicaƟon that Has Three Threads
public class MulƟThreadExample {
 public staƟc void main(String[] args) {
 Thread thread1 = new Thread(new MyRunnable(), "Thread 1"); 
 Thread thread2 = new Thread(new MyRunnable(), "Thread 2"); 
 Thread thread3 = new Thread(new MyRunnable(), "Thread 3"); 
 thread1.start(); 
 thread2.start(); 
 thread3.start(); 
 } 
} 
class MyRunnable implements Runnable { 
 @Override 
 public void run() { 
 for (int i = 1; i <= 5; i++) { 
 System.out.println(Thread.currentThread().getName() + " - Count: " + i); 
 try { 
 Thread.sleep(1000); 
 } catch (InterruptedExcepƟon e) {
 System.out.println(e.getMessage()); 
 } 
 } 
 } 
}