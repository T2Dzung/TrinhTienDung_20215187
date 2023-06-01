package hust.soict.globalict.aims;
import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.store.Store;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS:");
		System.out.println("----------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options:");
		System.out.println("----------------------");
		System.out.println("1. See a media's detail");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("----------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options:");
		System.out.println("----------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store store = new Store();
//		
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//				"Animation", "Roger Allers", 87, 19.95f);
//		anOrder.addDigitalVideoDisc(dvd1);
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
//				"Science Fiction", "George Lucas", 87, 24.95f);
//		anOrder.addDigitalVideoDisc(dvd2);
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//				"Animation", 18.99f);
//		anOrder.addDigitalVideoDisc(dvd3);
//		
//		anOrder.removeDigitalVideoDisc(dvd1);
//		
//		System.out.println("Total Cost is: ");
//		System.out.printf("%.2f", anOrder.totalCost());
		
		String choice;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			showMenu();
			choice = scanner.next();
			switch (choice) {
				case "1": {
					while (true) {
						store.print();
						storeMenu();
						choice = scanner.next();
						switch(choice) {
							case "1": {
								System.out.println("Enter title of media: ");
								scanner.nextLine();
								String title = scanner.nextLine();
								Media media = store.searchByTitle(title);
								if (media == null) {
									System.out.println("Media doesn't exist.");
								}
								else {
									System.out.println("Media: ");
									System.out.println(media.toString());
									while (true) {
										mediaDetailsMenu();
										choice = scanner.next();
										switch(choice) {
											case "1":{
												anOrder.addMedia(media);
											}
											case "2":{
												if (media instanceof Book) {
													System.out.println("Book cannot be played.");
												}
												else if (media instanceof CompactDisc){
													((CompactDisc)media).play();
												}
												else {
													((DigitalVideoDisc)media).play();
												}
											}
											case "0": {
												break;
											}				
										}
									}			
								}
							}
							case "2": {
								System.out.println("Enter the title: ");
								scanner.nextLine();
								String title = scanner.nextLine();
								Media media = store.searchByTitle(title);
								if (media == null) {
									System.out.println("Media does not exist.");
								}
								else {
									anOrder.addMedia(media);
								}
							}
							case "3": {
								System.out.println("Enter the title: ");
								scanner.nextLine();
								String title = scanner.nextLine();
								Media media = store.searchByTitle(title);
								if (media == null) {
									System.out.println("Media does not exist.");
								}
								else {
									if (media instanceof Book) {
										System.out.println("Book cannot be played.");
									}
									else if (media instanceof CompactDisc){
										((CompactDisc)media).play();
									}
									else {
										((DigitalVideoDisc)media).play();
									}
								}
							}
							case "4": {
								anOrder.print();
							}
							case "0": {
								break;
							}
						}
					}
				}
				case "2": {
					while (true) {
						System.out.println("1. Add    2. Remove    0. Exit");
						choice = scanner.next();
						switch(choice) {
							case "1": {
								System.out.println("Enter the type of media (book/cd/dvd): ");
								String type = scanner.next();
								if ( type=="book" || type=="dvd" || type=="cd") {
									String title;
									String category;
									float cost; 
									System.out.println("Enter title: ");
									title = scanner.nextLine();
									System.out.println("Enter category: ");
									category = scanner.nextLine();
									System.out.println("Enter cost: ");
									cost = scanner.nextFloat();
									scanner.nextLine();
									
									if (type == "book") {
										System.out.println("Enter the number of authors: ");
										int no = scanner.nextInt();
										scanner.nextLine();
										Book book = new Book(title, category, cost);							
										while (no>0) {
											System.out.println("Enter author: ");
											String author = scanner.nextLine();
											book.addAuthor(author);
											no--;
										}
										store.addMedia(book);
									}
									else if (type=="dvd") {
										System.out.println("Enter the director: ");
										String director = scanner.nextLine();
										System.out.println("Enter length: ");
										int length = scanner.nextInt();
										scanner.nextLine();
										DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
										store.addMedia(dvd);
									}
									else {
										System.out.println("Enter length: ");
										int length = scanner.nextInt();
										System.out.println("Enter the director: ");
										String director = scanner.nextLine();
										System.out.println("Enter the artist: ");
										String artist = scanner.nextLine();
										System.out.println("Enter the number of tracks: ");
										int num = scanner.nextInt();
										scanner.nextLine();
										CompactDisc cd = new CompactDisc(title,category,director,length,cost,artist);
										while (num>0) {
											System.out.println("Enter track title: ");
											String trackTitle = scanner.nextLine();
											System.out.println("Enter track length: ");
											int trackLength = scanner.nextInt();
											scanner.nextLine();
											cd.addTrack(new Track(trackTitle, trackLength));
											num--;
										}
										store.addMedia(cd);
										
									}
							}
							}
							case "2": {
								String title;
								System.out.println("Enter title: ");
								title = scanner.nextLine();
								
								store.removeMedia(store.searchByTitle(title));
							}
							case "0": {
								break;
							}
						}
					}
				}
				case "3": {
					while (true) {
						cartMenu();
						choice = scanner.next();
						switch (choice) {
							case "1": {
								while (true) {
									System.out.println("1. By id     2. By title");
									choice = scanner.next();
									switch(choice) {
										case "1": {
											System.out.println("Enter the id: ");
											int id = scanner.nextInt();
											scanner.nextLine();
											anOrder.searchById(id);
											break;
										}
										case "2": {
											System.out.println("Enter the title: ");
											scanner.nextLine();
											String title = scanner.nextLine();
											anOrder.searchByTitle(title);
											break;
										}
									}
								}
							}
							case "2": {
								while (true) {
									System.out.println("1. By id     2. By title");
									choice = scanner.next();
									switch(choice) {
										case "1": {
											anOrder.sortByTitle();
											anOrder.print();
											break;
										}
										case "2": {
											anOrder.sortByCost();
											anOrder.print();
											break;
										}
									}
								}
							}
							case "3": {
								System.out.println("Enter the title: ");
								scanner.nextLine();
								String title = scanner.nextLine();
								Media media = anOrder.findByTitle(title);
								if (media == null) {
									System.out.println("Media does not exist.");
								}
								else {
									anOrder.removeMedia(media);
								}
							}
							case "4": {
								System.out.println("Enter the title: ");
								scanner.nextLine();
								String title = scanner.nextLine();
								Media media = anOrder.findByTitle(title);
								if (media == null) {
									System.out.println("Media does not exist.");
								}
								else {
									if (media instanceof Book) {
										System.out.println("Book cannot be played.");
									}
									else if (media instanceof CompactDisc){
										((CompactDisc)media).play();
									}
									else {
										((DigitalVideoDisc)media).play();
									}
								}
							}
							case "5": {
								System.out.println("Your order has been placed.");
								anOrder.delete();
							}	
							case "0": {
								break;
							}					
						}
					}
				}		
				case "0": {
					break;
				}
			}
		}
	}
}
