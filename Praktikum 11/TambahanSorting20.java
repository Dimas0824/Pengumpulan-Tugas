public class TambahanSorting20 {
    public static void main(String[] args) {
        String[][] atlit = {
                { "Dimas", "Abdil", "Farhan", "Ciko", "Pasha" }, // badminton
                { "Afifah", "Naufal", "Nanda", "Atabik", "Cindy" }, // tenisMeja
                { "Luthfi", "Ivansyah", "Gabriel", "farrel", "Tio" }, // basket
                { "Haikal", "Innama", "Reika", "Esa", "Taufik" } // voli
        };

        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };

        int n = cabor.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (cabor[j].compareTo(cabor[j + 1]) > 0) {
                    // swap cabor[j+1] and cabor[j]
                    String temp = cabor[j];
                    cabor[j] = cabor[j + 1];
                    cabor[j + 1] = temp;
                }

        for (int i = 0; i < atlit.length; i++) { // perulangan untuk menampilkan cabornya
            System.out.println("Cabang olahraga: " + cabor[i]);
            for (int j = 0; j < atlit[i].length; j++) { // perulangan untuk menampilkan nama setiap atlit yang ikut
                                                        // porseni
                System.out.println("Atlit " + cabor[i] + " ke-" + (j + 1) + " adalah " + atlit[i][j]);
            }
            System.out.println();
        }
    }
}