class Bingo {
    String namaAnjingPeliharaan;

    Bingo(String namaAnjingPeliharaan) {
        this.namaAnjingPeliharaan = namaAnjingPeliharaan;

        for (int x = 0; x < this.namaAnjingPeliharaan.length() + 1; x++) {
            String namaDitampilkan = "";

            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            for (int y = 0; y < 3; y++) {
                namaDitampilkan = "";
                for (int z = 0; z < this.namaAnjingPeliharaan.length(); z++) {
                    if (z <= x - 1) {
                        namaDitampilkan += ("(clap)" + ((z == this.namaAnjingPeliharaan.length() - 1) ? "" : " - "));
                    } else {
                        namaDitampilkan += (this.namaAnjingPeliharaan.charAt(z)+ ((z == this.namaAnjingPeliharaan.length() - 1) ? "" : " - "));
                    }
                }
                System.out.println(namaDitampilkan);
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}