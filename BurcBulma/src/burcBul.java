import java.util.Scanner;

public class burcBul {

	public static void main(String[] args) {
		int month, day;
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Dogdugunuz ay: ");
	        month = input.nextInt();

	        System.out.print("Dogdugunuz gun: ");
	        day = input.nextInt();
	        
	        if((month == 1 && (day>21 && day<=31)) || (month ==2 && (day<=19 && day>0))){
	            System.out.println("Kova burcusunuz");
	        } else if ((month == 2 && (day>19 && day<=29)) || (month ==3 && (day<=20 && day>0))) {
	            System.out.println("Bal�k Burcusunuz");
	        }
	        else if ((month == 3 && (day>20 && day<=31)) || (month ==4 && (day<=20 && day>0))) {
	            System.out.println("Koc Burcusunuz");
	        }
	        else if ((month == 4 && (day>20 && day<=30)) || (month ==5 && (day<=21 && day>0))) {
	            System.out.println("Boga Burcusunuz");
	        }
	        else if ((month == 5 && (day>21 && day<=31)) || (month ==6 && (day<=22 && day>0))) {
	            System.out.println("Ikizler Burcusunuz");
	        }
	        else if ((month == 6 && (day>22 && day<=30)) || (month == 7 && (day<=22 && day>0))) {
	            System.out.println("Yengec Burcusunuz");
	        }
	        else if ((month == 7 && (day>22 && day<=31)) || (month == 8 && (day<=22 && day>0 ))) {
	            System.out.println("Aslan Burcusunuz");
	        }
	        else if ((month == 8 && (day>22 && day<=31)) || (month == 9 && (day<=22 && day>0))) {
	            System.out.println("Basak Burcusunuz");
	        }
	        else if ((month == 9 && (day>22 && day<=30)) || (month == 10 && (day<=22 && day>0))) {
	            System.out.println("Terazi Burcusunuz");
	        }
	        else if ((month == 10 && (day>22 && day<=31)) || (month == 11 && (day<=21 && day>0))) {
	            System.out.println("Akrep Burcusunuz");
	        }
	        else if ((month == 11 && (day>21 && day<=30)) || (month == 12 && (day<=21 && day>0))) {
	            System.out.println("Yay Burcusunuz");
	        }
	        else if ((month == 12 && (day>21 && day<=31)) || (month == 1 && (day<=21 && day>0))) {
	            System.out.println("Oglak Burcusunuz");
	        }else{
	            System.out.println("Lutfen ay degerini 1 - 12 arasinda ve gun degerini 1-31 aral�g�nda giriniz");
	            System.out.print("Dogdugunuz ayi giriniz: ");
	            month = input.nextInt();
	            System.out.print("Dogdugunuz gunu giriniz: ");
	            day = input.nextInt();
	        }
	        

}
}

