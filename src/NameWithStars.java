public class NameWithStars {
    public static void main (String[] args){
        int n = 10;
        for(int i=0; i<n; i++){
            // S Pattern
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || i==(n-1)/2 || (j==0 && i<(n-1)/2) || (j==n-1 && i>(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // U Pattern
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || (i==n-1 && j>0 && j<n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // M Pattern
            for(int j=0; j<n; j++){
                if(j==0 || j== n-1 || (i==j && i<=(n-1)/2) || (i+j==n-1 && i<(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // A Pattern
            for(int j=0; j<n; j++){
                if(i+j==n-1 || (i==(n-1)/2 && j>=((3*n)/4)-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("");
            for(int j=0; j<n; j++){
                if(i==j || (i==(n-1)/2 && j<=(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // N Pattern
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // T Pattern
            for(int j=0; j<n; j++){
                if(i==0 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("       ");

            // S Pattern
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || i==(n-1)/2 || (j==0 && i<(n-1)/2) || (j==n-1 && i>(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // I Pattern
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // N Pattern
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // G Pattern
            for(int j=0; j<n; j++){
                if((i==0 && j>0 && j<(3*n)/4) || (j==0 && i>0 && i<n-1) || (j==(3*n)/4 && i>0 && i<((n-1)/2)-1) || (i==n-1 && j<(3*n)/4 && j>0) || (j==(3*n)/4 && i>(n-1)/2) || (i==(n-1)/2 && j>(n-1)/2) || (j==n-1 && i>(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // H Pattern
            for(int j=0; j<n; j++){
                if(i==(n-1)/2 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.println();
        }
    }
}
