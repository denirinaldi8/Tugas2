public class mahasiswa {
	public String nama;


	public void kuliah () {
		System.out.println ("Kuliah");
	}

	public static void main (String[] args) {
		mahasiswa rendy = new mahasiswa();

		rendy.nama = "Rendy Firmasnyah";
		rendy.kuliah();
		System.out.println (rendy.nama);
	}
}