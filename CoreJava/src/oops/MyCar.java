package oops;

public class MyCar {
    int year;
    String model;
    MyCar(int year,String model){
    	this.year=year;
    	this.model=model;
    }
    public String toString() {
    	return year+" "+model;
    }
	public static void main(String[] args) {
		MyCar audi = new MyCar(2010,"A2");
		System.out.println(audi);
		System.out.println(audi.toString());

	}

}
