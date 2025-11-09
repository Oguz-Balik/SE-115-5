public class lab6scenario1 {
    public static void main(String[] args) {
       int[] cl = new int[20];
      int x = 0;
      for (int i=0;i<cl.length;i++){
          cl[i]=1000+x;
          x++;
          System.out.println(cl[i]);
      }
      int[] cl2 = new int[42];
      for (int i=0;i<cl.length;i++){
          cl2[i]=cl[i];

      }
      for (int i=0;i<cl2.length;i++){
          cl2[i]=1000+x;
          if (x>19) System.out.println(0);
          else System.out.println(cl2[i]);
      }
    }
}
