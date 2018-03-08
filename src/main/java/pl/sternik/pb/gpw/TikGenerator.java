package pl.sternik.pb.gpw;

import java.util.Iterator;

public class TikGenerator implements Iterable<Tik>{

	private int numberOfTicksToGenerate = 0;
	private String tickName;
	
	public TikGenerator(String name, int numberOfTicks) {
		super();
		this.numberOfTicksToGenerate = numberOfTicks;
		this.tickName = name;
	}
	
	@Override
	public Iterator<Tik> iterator() {
		
		return new Iterator<Tik>() {
			int current = 0;
			
			@Override
			public Tik next() {
				current++;
				return new Tik(tickName, Math.random() * 100);
			}
			
			@Override
			public boolean hasNext() {
				return current < numberOfTicksToGenerate;
			}
		};
	}
	
	public static void main(String[] args) {

		TikGenerator c = new TikGenerator("Bogdanka", 5);
		for (Tik tik : c) {
			System.out.println(tik);
		}
		
	}
}
