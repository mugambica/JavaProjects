
public class InstrumentTest {
	public static void main(String[] args) {
	//instance of abstract class is not possible
	//	MusicalInstrument mi= new MusicalInstrument();
	//but reference variable of abstract class is possible!!!!
		
		Guitar myGuitar = new Guitar();
		myGuitar.use();
		myGuitar.tuneStrings();
		myGuitar.pluck();
		myGuitar.play();
		System.out.println("---------------");
		Violin myVio = new Violin();
		myVio.use();
		myVio.tuneStrings();
		myVio.bowing();
		myVio.play();
		
		//as u walk upward it will restrict the scope 
		//of the object
		
		//as u walk downward it will expand the scope
		//of the object
		
		Violin mi = myVio;
		mi.use();
		mi.play();
		mi.tuneStrings();
		//mi.pluck();
		mi.bowing();
	}
}
abstract class A
{
	abstract void fun();
}
class B extends A
{
	void fun() {
		
	}

}

abstract class Instrument // which will be an interface in future example
{
	abstract void use(); //3
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play(); //2
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings(); //1
}
class Guitar extends StringBasedMusicalInstrument
{
	//now it is compulsory / mandatory for Guitar to fulfill above incomplete contracts
	void use() { System.out.println("Using guitar ...");}
	void play() { System.out.println("Playing guitar ...");}
	void tuneStrings() { System.out.println("tuning guitar strings..."); }
	void pluck() { System.out.println("Plucking guitar strings...");} //exclusive method
}

class Violin extends StringBasedMusicalInstrument
{
	//now it is compulsory / mandatory for Guitar to fulfill above incomplete contracts
	void use() { System.out.println("Using Violin ...");}
	void play() { System.out.println("Playing Violin ...");}
	void tuneStrings() { System.out.println("tuning Violin strings..."); }
	void bowing() { System.out.println("Bowing Violin strings...");} //exclusive method
}
