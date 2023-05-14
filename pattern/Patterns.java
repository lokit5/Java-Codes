package pattern;

public class Patterns {
    public static void PDnumberPyramid(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for(int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    public static void HollowRectangle(int row ,int col) {

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void invertedRotatedHalfPyramind(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void FloydsTriangle(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

    }
    public static void InvertedHalfPyramidWithNumbers(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void triangle01(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i +j) % 2 == 0) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n) {
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= (n -i)*2; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*i -2; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n ) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n ) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i) * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        public static void numberPyramid(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args)
    {
        diamond(4);
    }
}
