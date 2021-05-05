import java.util.Scanner;

public class InterfaceTest {
	public static void main(String[] args) {
		//Payment pmnt = new Payment(); //interface cannot be instantiated
		int choice=0;
		do	{		 
			System.out.println("Payment Choice");
			System.out.println("1. Pay via Cheque");System.out.println("2. Pay via Cash");
			System.out.println("3. Pay via NEFT");	System.out.println("4. Pay via Gpay");
			System.out.println("5. Exit");	System.out.println("Enter choice ");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();	Payment pmnt = null;
			switch(choice)
			{
				case 1:	pmnt = new ChequePayment();	break;
				case 2:	pmnt = new CashPayment();	break;
				case 3:	pmnt = new NEFTPayment();	break;
				case 4:	pmnt = new GPayment();		break;
				case 5: break;	default: System.out.println("Invalid choice");
			}
			if(pmnt!=null) pmnt.pay(); 
		}while (choice!=5);
		/*pmnt.pay(); //this line remains the same!!! if u observe
		//pmnt.findGooglePayee(); <-- not possible at all
		if(pmnt instanceof GPayment) { //casting with care
			GPayment gpay = (GPayment) pmnt; //this is a blind casting
										 //its a high risk
			gpay.findGooglePayee(); //only child handle can call it
			gpay.pay();
		}
		else 
			System.out.println("its not pointing to gpayment");
		*/
		System.out.println("End of main");
	}
}
interface Payment {//is a PURE TYPE 
	void pay(); //by default it is public and abstract | public abstract void pay();
}
class ChequePayment implements Payment {
	public void pay() {
		System.out.println("Writing the payee on the cheque....");
		System.out.println("Writing the amount on the cheque....");
		System.out.println("Signing the cheque....with date");
	}
	public void crossTheCheque() {
		System.out.println("Crossing the cheque for safety...");
	}
}
class CashPayment implements Payment {
	public void pay() {
		System.out.println("Counting the cash denominations....");
		System.out.println("Totalling all the denominations....");
		System.out.println("Paying the cash....");
	}
	public void checkFaceCurrency() {
		System.out.println("Checking fake currencies...");
	}
}
class NEFTPayment implements Payment { //National Electronic Fund Transfer
	public void pay() {
		System.out.println("Searching/Adding the beneficiery....");
		System.out.println("Sending amount to the beneficiery....");
		System.out.println("Enetring OTP to fund transfer........");
	}
	public void checkBeneficiery() {
		System.out.println("Checking beneficiery....");
	}
}
class GPayment implements Payment
{
	public void pay() {
		System.out.println("Paying via google payment system....");
	}
	public void findGooglePayee() {
		System.out.println("Finding google payee....");
	}
}
