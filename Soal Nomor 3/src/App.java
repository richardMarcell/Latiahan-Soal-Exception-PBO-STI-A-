public class App {


    protected String fileName;



    static void bacaFile(String fileName) throws Exception
    {
        String[] fileLists = {"File 1", "File 2", "File 3", "File 4", "File 5"};

        for(int i = 0; i < fileLists.length; i++) {
            if(fileName == fileLists[i]) {
                System.out.println("Anda Sudah Membaca File dengan nama: " + fileName);
            } else if(fileName == null) {
                throw new Exception("Terjadi Kesalahan!! Anda memberikan Nilai berupa Null");
            } else {
                
            }
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            bacaFile("File 1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
