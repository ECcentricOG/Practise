/* Print Pattern	1 2 3
 * 			1 2 3
 * 			1 2 3           */

class Demo{

	public static void main(String [] args){

		int row = 3;
		int col = 3;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=col;j++){

				System.out.print(j+" ");
			}

			System.out.println();
		}
	}
}
