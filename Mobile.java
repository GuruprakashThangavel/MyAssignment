package week1;

public class Mobile {
public static void main(String[] args) {
	 Mobile obj= new Mobile();
	 obj.call();
     obj.document();
     obj.sendmessage();
     obj.sendmessage();
	 
}
public void sendmessage() {
	System.out.println("chart");
}
public void call() {
	System.out.println("make the call");
}
public void document() {
	System.out.println("share the document");
}
public void status() {
	System.out.println("status view");
}
}
