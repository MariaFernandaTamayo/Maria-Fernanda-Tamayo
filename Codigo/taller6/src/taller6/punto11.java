package taller6;

public class punto11 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int x = 4;
        for(int i=1; i <=x; i++){
            System.out.println("");
            for(int j=1; j<=i;j++){
                System.out.print(j+"");  
            }
        }
        for(int i=x-1; i >=x; i--){
        	System.out.println("");
            for(int j=1; j<=i;j++){
                System.out.print(j+"");
            }
        }
	}

}
