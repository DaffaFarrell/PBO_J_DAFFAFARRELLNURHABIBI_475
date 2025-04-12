public class mahasiswa {
    public static class Mahasiswa {
        String nama = "Daffa Farrell";
        String nim = "202410370110475";

        public boolean login(String inputNama, String inputNim) {
            return inputNama.equals(nama) && inputNim.equals(nim);
        }

        public void displayInfo() {
            System.out.println("Login berhasil!");
            System.out.println("Nama classmahasiswa.Mahasiswa : " + nama);
            System.out.println("NIM            : " + nim);
        }
    }
}
