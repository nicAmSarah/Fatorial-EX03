package fatorialEx3;

public class FatorialView {
	
	public FatorialView() {
		
	}
	
	public int fatCalculo (int fat) {
		if (fat == 0 || fat == 1) {
			return 1;
		}
		
		return fat * fatCalculo(fat - 1 );
	}

	
}
