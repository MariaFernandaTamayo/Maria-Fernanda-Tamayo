package taller7;

public class punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<=11; i++){
            for(int x=0; x<=10; x++){
                int n=(x)*(i-1);
                if(i==0){
                    if(x==0){System.out.print("* | ");}
                    else{System.out.print(x+"    ");}
                }
                else if(x==0){
                    if(i>=11){System.out.print((i-1)+"| ");}
                    else{System.out.print((i-1)+" | ");}
                }
                else{
                    if(n>=10){System.out.print(n+"   ");}
                    else{System.out.print(n+"    ");}
                }
            }
            if(i==0){System.out.print("\n------------------------------------------------------");}
            System.out.println("");
        }
    }

	

	}


