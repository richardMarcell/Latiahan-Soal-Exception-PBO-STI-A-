public class App {

    static String kodeBarang, namaBarang, gudang;
    static int jumlahBarang;
    static double hargaBeli, hargaJual;

    static void setValue(String kode, String nama, int jumlah, String gudangBarang, double hargaBeliBarang, double hargaJualBarang) {
        try {
            if (hargaJualBarang < 1 && jumlah > 0) {
                throw new MyException("Harga jual kurang dari 0 atau sama dengan 0");
            }

            if (jumlah < 1 && hargaJualBarang > 0) {
                throw new MyException("Barang yang dibeli memiliki kuantitas kurang dari 1");
            }

            if (hargaJualBarang < 1 && jumlah < 1) {
                throw new MyException("Barang yang dibeli memiliki kuantitas kurang dari 1 dan Harga jual kurang dari 0 atau sama dengan 0");
            }

            kodeBarang = kode;
            namaBarang = nama;
            gudang = gudangBarang;
            jumlahBarang = jumlah;
            hargaBeli = hargaBeliBarang;
            hargaJual = hargaJualBarang;

            System.out.println("Kode Barang : " + kodeBarang + ", Nama Barang : " + namaBarang + ", Gudang : " + gudang + ", Jumlah Barang: " + jumlahBarang + ", Harga Beli: " + hargaBeli + ", dan Harga Jual: " + hargaJual);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Jika Semua Kondisi Terpenuhi
        setValue("STM01", "Susu Kelapa", 3, "Gudang 1", 23000, 30000);

        // Jika Jumlah Harga Jual Barang Kurang Dari 0
        setValue("STM02", "Susu Kambing", 3, "Gudang 2", 23000, 0);

        // Jika Jumlah Barang Kurang Dari 0
        setValue("STM03", "Susu Apel", 0, "Gudang 3", 24000, 20000);

        // Jika Jumlah dan Harga Jual Barang Kurang dari 0
        setValue("STM03", "Susu Kambing", 0, "Gudang 4", 24000, 0);
    }
}
