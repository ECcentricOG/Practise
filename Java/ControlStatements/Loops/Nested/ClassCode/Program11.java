/*	*	*
 *	*	*
 *	*   	*            */

class Demo{

	public static void main(String [] args){

		int n = 3;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n;j++){

				if(j==1 || j==3){

					System.out.print("* ");
				}else{

					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
