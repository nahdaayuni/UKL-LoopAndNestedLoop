
public class DeretAritmatika_1 {
    public static void main(String[] args) {
 int a=16;
 int b=9;
 int n=20;
 int x;
 int total = 0;
 System.out.println("Deret Aritmatikanya adalah");
 for(int i=15;i<n;i++){ 
    x= a +(15-1) * b;
    a+=b;
             
    System.out.print("suku ke= "+i+" = "+x +"\t");
    total+=x;
    System.out.println();
    }
 
 System.out.println("Jumlah Deret Aritmatikanya adalah "+total);

 }
}

 
