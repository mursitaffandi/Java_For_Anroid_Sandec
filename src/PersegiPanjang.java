public class PersegiPanjang {
    String warna = "merah";
    int panjang;
    int lebar;
    OnResult onResult;

    public PersegiPanjang(int panjang, int lebar, OnResult onResult) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.onResult = onResult;
    }

    public PersegiPanjang(String warna, int panjang, int lebar) {
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
    }

   public int getLuas(){
       return this.panjang * this.lebar;
   }

   private static void printPanjang(){
       System.out.println("printPanjang");
   }

   public void getResultLuas(){
        int luas = this.panjang * this.lebar;
        onResult.OnSuccess(luas);
        onResult.OnFailure("lancar lancar aja");
   }
}
