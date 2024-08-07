package MethodOverloading;

public class MethodOverloading {
	
	//MethodOverloading
	//Poly(Many)+morphism(forms): Complile time polymarphism (Static binding)
	
	
	
	public void search(int applno) {
		System.out.println("search application number:  " + applno);
	}
	
	public void search(int applno, String indication) {
		
	}
	
	public void search(int applno, String indication, String applprop) {
		
	}

	public static void main(String[] args) {
		
		MethodOverloading MOV = new MethodOverloading();
		MOV.search(10);            //Call by Value/Argument
		

	}

}
