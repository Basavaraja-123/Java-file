package java;
 public class JavaPattarn{
    public static void main(String args[]){
        String str="Basavaraja N M";
        for (int i=0;i<str.length(); i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.CharAt(j));
            }
            System.out.println();
        }
    }
}