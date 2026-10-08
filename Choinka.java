
public class Choinka{
	public static void main(String[] args) {
	int długość=Integer.parseInt(args[0]);
	String gwiazdka="*";
	for  (int i=0; i<długość;i++){ 
		System.out.println(gwiazdka);
		gwiazdka=gwiazdka+"*";
		}
	}
}