public class KonversiWaktu {
    int d, hari, jam, menit, detik;
	public KonversiWaktu(int d)
	{
		this.d=d;
	}
	public KonversiWaktu (){}
	void konversi()
	{
		hari=d/86400;
		jam=(d % 86400)/3600;
		menit=((d % 86400)%3600)/60;
		detik=((d % 86400)%3600)%60;		
	}
	void cetak ()
	{
		System.out.println("Hari		: "+hari);
		System.out.println("Jam	        : "+jam);
		System.out.println("Menit		: "+menit);
		System.out.println("Detik		: "+detik);
	}
}
