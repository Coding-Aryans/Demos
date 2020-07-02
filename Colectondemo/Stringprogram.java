package Colectondemo;

public class Stringprogram {

	public static void main(String[] args) {
		 String str = "jan feb";
		 int lenth=str.length();
		 int cont=0;
		 for(int i=0;i<lenth;i++) {
			 
			 if(str.charAt(i)==' ') {
				 cont++;
			 }
		 }
	     
   
   System.out.println(cont);
   
   
              
		
	}

}
