class Prg8 {
    public static void main(String[] args) {
        int a = 5, b = 5;
        int a1 = 1, b1 = 9;

        for (int r = 1; r <= 5; r++) {
			
			// R
            for (int c = 1; c <= 5; c++) {
                if (c == 1 || r == 1 && c < 5 || r == 3 && c < 5 || r == 2 && c == 5 || r == 4 && c == 3 || r == 5 && c == 4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
			
			// A 
            for (int c = 1; c <= 9; c++) {
                if (c == a || c == b || (r == 3 && c >= 4 && c <= 6))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
			
			 // K
            for (int c = 2; c <= 5; c++) {
                if (c == 2|| r + c == 6 || r == c)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
			
			 // S
            for (int c = 1; c <= 5; c++) {
                if (r == 1 || r == 3 || r == 5 || (r == 2 && c == 1) || (r == 4 && c == 5))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
			
			// H
            for (int c = 1; c <= 5; c++) {
                if (c == 1 || c == 5 || r == 3)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
			
			// A 
            for (int c = 1; c <= 9; c++) {
                if (c == a || c == b || (r == 3 && c >= 4 && c <= 6))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }

            
            a++;
            b--;
			
			//N
			for(int c=1;c<=9;c++){
				if(c==1||c==9)
				 System.out.print(" * ");
                else
                    System.out.print("   ");
			}

            System.out.println();
        }
    }
}