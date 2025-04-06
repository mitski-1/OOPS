class A {
void show(String x) 
{
System.out.println("One"); 
}
protected void show(String x, String y)
{
System.out.println("Two"); 
}
public static void main(String[] args){
A a = new A();
a.show("A");
a.show("",""); 
}
}