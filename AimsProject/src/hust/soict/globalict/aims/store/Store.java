package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
	
	private int noDVD = 0;
	private DigitalVideoDisc itemStored[] = new DigitalVideoDisc[100];
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemStored[noDVD] = dvd;
		noDVD++;
		System.out.println( "The disc has been added");
	}
	public void removeDVD(DigitalVideoDisc dvd) {
		int k=0;
		int rmDisc=0;
		for(int i=0; i<noDVD; i++) {
			if(itemStored[i] != dvd) {
				itemStored[k] = itemStored[i];
				k++;
			}else {
				rmDisc++;
				System.out.println("The disc has been removed");
			}
		}
		noDVD-=rmDisc;
	}
}
