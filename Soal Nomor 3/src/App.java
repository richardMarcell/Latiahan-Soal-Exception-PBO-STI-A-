public class App {

    static String fileName;

    static void bacaFile(String name) throws Exception {
        String[] fileLists = {"File 1", "File 2", "File 3", "File 4", "File 5"};

        boolean fileFound = false;

        for (int i = 0; i < fileLists.length; i++) {
            if (name.equals(fileLists[i])) {
                fileName = name;
                System.out.println("Anda Sudah Membaca File dengan nama: " + fileName);
                fileFound = true;
                break;
            }
        }

        if (!fileFound) {
            throw new NullPointerException("Terjadi Kesalahan!! Anda memberikan Nilai berupa Null");
        }
    }

    public static void main(String[] args) {
        try {
            bacaFile("File 1");
            bacaFile("");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
