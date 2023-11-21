public class App {

    static String kodeBarang, namaBarang, gudang;
    static int jumlahBarang;
    static double hargaBeli, hargaJual;

    static void setValue(String kode, String nama, int jumlah, String gudangBarang, double hargaBeliBarang, double hargaJualBarang) throws MyException
    {
        if(hargaJual < 1 ) {
             throw new MyException("Harga jual kurang dari 0 atau sama dengan 0");
        }

        if (jumlahBarang < 1) {
            throw new MyException("Harus membeli minimal 1 barang");
        }

        kodeBarang = kode;
        namaBarang = nama;
        gudang = gudangBarang;
        jumlahBarang = jumlah;
        hargaBeli = hargaBeliBarang;
        hargaJual = hargaJualBarang;
        
        System.out.println("Kode Barang : " + kodeBarang + ", Nama Barang : " + namaBarang +",Gudang : " + gudang + ", ");
    }
    public static void main(String[] args) throws Exception {
        try {
            setValue("STM01", "Susu Kelapa", 3, "Gudang 1", 23000, 30000);
            setValue("STM02", "Susu Kambing", 0 ,"Gudang 2", 23000, 30000);
            setValue("STM03", "Susu Sapi", 0, "Gudang 3", 23000, 30000);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
