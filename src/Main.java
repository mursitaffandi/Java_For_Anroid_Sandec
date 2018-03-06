public class Main implements OnResult{

    public static void main(String args[]){
        /*PersegiPanjang persegiPanjang;
        persegiPanjang = new PersegiPanjang(4, 2, this);
        int luasPersegiPanjang = persegiPanjang.getLuas();
        System.out.println(luasPersegiPanjang);*/
        Main dirinyasendiri = new Main();
    }

    public Main() {
        PersegiPanjang persegiPanjang;
        persegiPanjang = new PersegiPanjang(4, 2, this);
        persegiPanjang.getResultLuas();
    }

    @Override
    public void OnSuccess(int result) {
        System.out.println(result);
    }

    @Override
    public void OnFailure(String message) {
        System.out.println(message);
    }
}
