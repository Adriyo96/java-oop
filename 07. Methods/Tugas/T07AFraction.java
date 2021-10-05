// File: T07AFraction.java
public class T07AFraction {
    // bagian ide/ algoritma
    
    /* Method untuk menambahkan pecahan 1 dan pecahan 2 */
    static int[] sumFraction(int e1, int d1, int e2, int d2) {
      int es, ds, pmbagi;
      es = e1 * d2 + e2 * d1;
      ds = d1 * d2;
      pmbagi = fpb(es, ds);
      es = es / pmbagi;
      ds = ds / pmbagi;
      int[] sum = {es, ds};
      return sum;
    }
  
    /* Method untuk mengalikan pecahan 1 dengan pecahan 2*/
    static int[] productFraction(int e1, int d1, int e2, int d2) {
      int ep, dp;
      ep = e1 * e2;
      dp = d1 * d2;
      int pmbagi = fpb(ep, dp);
      ep = ep / pmbagi;
      dp = dp / pmbagi;
      int[] product = {ep, dp};
      return product;
    }
  
    /* Method untuk mencetak pecahan ke terminal */
    static void printFraction(int[] fraction) {
      System.out.printf("%d / %d\n", fraction[0], fraction[1]); 
    }
  
    /* Method untuk mencari fpb pembilang dan penyebut */
    static int fpb(int e, int d) {
      int fpb = 1;
      for (int i = 1; i <= e && i <= d; i++) {
        if (e % i == 0 && d % i == 0)
          fpb = i;
      }
      return fpb;
    }
  
    public static void main(String[] args) {
      // method utama untuk melaukan testcase
      int[] satu = sumFraction(1, 2, 2, 3);
      printFraction(satu);
      int[] dua = sumFraction(1, 3, 3, 4);
      printFraction(dua);
      int[] tiga = productFraction(1, 2, 2, 3);
      printFraction(tiga);
      int[] empat = productFraction(1, 4, 2, 3);
      printFraction(empat);
  
      // int[] solusiOptimal = sumFraction(1, 2, 1, 2);
      // printFraction(solusiOptimal);
    }
  }
