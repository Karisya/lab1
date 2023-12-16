package bsu.rfe.java.group8.lab1.Romanova.var16;


public class mainApp {

 public static void main(String[] args) throws Exception {

 NewFood[] breakfast = new NewFood[20];
	 

Potatoes potato=new Potatoes (null);
Cheese ch=new Cheese();
Apple ap=new Apple(null);

 int itemsSoFar = 0;
 for (String arg: args) {
 String[] parts = arg.split("/");
 if (parts[0].equals("Potatoes")) {
  breakfast[itemsSoFar] = new Potatoes(parts[1]);
 }
 else if (parts[0].equals("Cheese"))
 { 
  breakfast[itemsSoFar] = new Cheese();
 }
 else if (parts[0].equals("Apple"))
 { 
  breakfast[itemsSoFar] = new Apple(parts[1]);
 }
 
 itemsSoFar++;
 }
 
 for (NewFood item: breakfast) 
 if (item!=null) {
 item.consume();
 
 if(item.equals(potato)) {
	 Potatoes.count++;
 }
 if(item.equals(ch)) {
	 Cheese.count++;
 } if(item.equals(ap)) {
	 Apple.count++;
 }

 }
 else
 break;

 System.out.println("Съедено сыра: " + Cheese.count);
 System.out.println("Съедено яблок: "+ Apple.count);
 System.out.println("Съедено картошки : "+ Potatoes.count); 
 System.out.println("Всего хорошего!");
 }
 
}

//public class mainApp {
//
// public static void main(String[] args) throws Exception {
//
// NewFood[] breakfast = new NewFood[20];
//
//Potatoes potato=new Potatoes (null);
//Cheese ch=new Cheese();
//Apple ap=new Apple(null);
//
// int itemsSoFar = 0;
// for (String arg: args) {
// String[] parts = arg.split("/");
// if (parts[0].equals("Potatoes")) {
//  breakfast[itemsSoFar] = new Potatoes(parts[1]);
// }
// else if (parts[0].equals("Cheese"))
// { 
//  breakfast[itemsSoFar] = new Cheese();
// }
// else if (parts[0].equals("Apple"))
// { 
//  breakfast[itemsSoFar] = new Apple(parts[1]);
// }
// 
// itemsSoFar++;
// }
// 
// for (NewFood item: breakfast) 
// if (item!=null) {
// item.consume();
// if(item.equals(potato)) {
//	 Potatoes.count++;
// }
// if(item.equals(ch)) {
//	 Cheese.count++;
// } if(item.equals(ap)) {
//	 Apple.count++;
// }
//
// }
// else
// break;
//
// System.out.println("Съедено сыра: " + Cheese.count);
// System.out.println("Съедено яблок: "+ Apple.count);
// System.out.println("Съедено картошки : "+ Potatoes.count); 
// System.out.println("Всего хорошего!");
// }
// 
//}