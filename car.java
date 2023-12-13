package week1;

public class car {
public static void main(String[] args) {
	car obj=new car();
	obj.applyBreak();
    obj.handlight();
    obj.applyBreak();
    obj.horn();
	//System.out.println("testleaf");
	
}
public void applyBreak() {
	System.out.println("break is applied");
}
public void horn() {
	System.out.println("press the horn");
}
public void switchonAc() {
	System.out.println("ac on");
}
public void handlight() {
	System.out.println("switch on lightt");
	
}
}
