package Products;

import java.util.LinkedList;
import java.util.Scanner;


public class Menu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		-----------CLOTHING MALE------------
		
		//Tshirts
		LinkedList<Tshirts> tshirt = new LinkedList<>();
		tshirt.add(new Tshirts("tshirt1", 11,550,5,"Levi's","OverSized","Red"));
		tshirt.add(new Tshirts("tshirt2", 12,780,1,"Van Heusen","OverSized","Blue"));
		tshirt.add(new Tshirts("tshirt3", 13,600,3,"Allen Solly","OverSized","Green"));
		
		
		//Jeans
		LinkedList<Jeans> jeans = new LinkedList<>();
		jeans.add(new Jeans("jeans1", 21, 400, 3, "Pepe Jeans", "Regular Fit", "Dark Blue"));
		jeans.add(new Jeans("jeans2", 22, 1200, 1, "Lee Cooper", "Loose Fit", "Grey"));
		jeans.add(new Jeans("jeans1", 23, 800, 2, "Calvin Klein", "Baggy Fit", "Black"));
		
		
		//Shoes
		LinkedList<Shoes> shoe = new LinkedList<>();
		shoe.add(new Shoes("shoe1", 31, 1100, 1, "Bata", "Sneakers"));
		shoe.add(new Shoes("shoe2", 32, 1500, 3, "Nike", "Loafers"));
		shoe.add(new Shoes("shoe1", 33, 1100, 1, "Puma", "Leathers"));
		
		
		//Tshirts CART
		LinkedList<Tshirts> tCart = new LinkedList<>();
		//Jeans CART
		LinkedList<Jeans> jCart = new LinkedList<>();
		//Shoes CART
		LinkedList<Shoes> sCart = new LinkedList<>();
		
		
		
//		------------CLOTHING FEMALE------------
		
		//Sarees
		LinkedList<Sarees> saree = new LinkedList<>();
		saree.add(new Sarees("saree1",41,2000,2,"Bodhi India","Kanjeevaram","Lavendor"));
		saree.add(new Sarees("saree2",42,2500,1,"Karagiri Sarees","Banarasi","Maroon"));
		saree.add(new Sarees("saree3",43,750,4,"Suta Sarees","Chanderi","Light Pink"));
		
		
		//Kurtis
		LinkedList<Kurtis> kurti = new LinkedList<>();
		kurti.add(new Kurtis("kurti1",51,475,1,"Libas","Anarkali","Pink"));
		kurti.add(new Kurtis("kurti2",52,750,1,"Biba","Long Straight","Light Grey"));
		kurti.add(new Kurtis("kurti3",53,300,2,"Sangria","Flared","Dark Teal"));
		
		//Heels
		LinkedList<Heels> heel = new LinkedList<>();
		heel.add(new Heels("heel1",61,2400,1,"Wandler","Cutout"));
		heel.add(new Heels("heel2",62,2000,1,"Jimmy Choo","Sandals"));
		heel.add(new Heels("heel3",63,300,1,"Zara","Strappy"));
		
		//Sarees Cart
		LinkedList<Sarees> sarCart = new LinkedList<>();
		//Kurtis Cart
		LinkedList<Kurtis> kurCart = new LinkedList<>();
		//Heels Cart
		LinkedList<Heels> helCart = new LinkedList<>();
		
		
//		------------ELECTRONICS------------
		
		//Mobiles
		LinkedList<Mobiles> mobile = new LinkedList<>();
		mobile.add(new Mobiles("iPhone 12",71,50000,1,"Apple","ios",2020));
		mobile.add(new Mobiles("Galaxy s24",72,79000,1,"Samsung","Android",2024));
		mobile.add(new Mobiles("Poco f1",73,15000,1,"Android","Android",2018));
		
		//Laptops
		LinkedList<Laptops> laptop = new LinkedList<>();
		laptop.add(new Laptops("Macbook air ",81,95000,1,"Apple","Mac",2020));
		laptop.add(new Laptops("ROG Strix",82,95000,1,"Asus","Windows",2023));
		laptop.add(new Laptops("TUF ",83,65000,1,"Asus","Windows",2022));
		
		//Cameras
		LinkedList<Cameras> camera = new LinkedList<>();
		camera.add(new Cameras("EOS R6",91,120000,1,"Canon","40fps",2006));
		camera.add(new Cameras("a7",92,125000,1,"Sony","50fps",2020));
		camera.add(new Cameras("Z 6",93,140000,1,"Nikon","60fps",2019));
		
		
		//Mobiles Cart
		LinkedList<Mobiles> mobCart = new LinkedList<>();
		//Laptops Cart
		LinkedList<Laptops> lapCart = new LinkedList<>();
		//Cameras Cart
		LinkedList<Cameras> camCart = new LinkedList<>();
		
		int sign;
		char ch;
		char chr;
		
		
		
		
//		--------( BUYER )--------
		
		
//		Clothing & Electronics
		do {
			System.out.println("Enter 'C/c' for Clothing");
			System.out.println("Enter 'E/e' for Electronics");
			System.out.println("Enter 'Q/q' fro Exit");
			
				
				ch = sc.next().charAt(0);
			
			
			if(ch=='Q'||ch=='q') {
				break;
			}
			
			if(ch=='c'|| ch=='C') {
				
				
				
//				Male & Female
				do {
					System.out.println("Enter 'M/m' for Male ");
					System.out.println("Enter 'F/f' for Female ");
					System.out.println("Enter 'Q/q' fro Exit");
					
					chr = sc.next().charAt(0);
					
					if(chr=='Q'||chr=='q') {
						break;
					}
					
					
//					MALE
					if(chr=='M' || chr=='m') {
						
						
						//Cart
						do {
						System.out.println("   ----MALE CLOTHING----");
						System.out.println("----------MENU----------");
						System.out.println("Enter '1' for list of the products : ");
						System.out.println("Enter '2' for product id search : ");
						System.out.println("Enter '3' for view product between your range : ");
						System.out.println("Enter '4' for Lowest price product : ");
						System.out.println("Enter '5' for Highest price product : ");
						System.out.println("Enter '6' for add Products in cart : ");
						System.out.println("Enter '0' for EXIT");
						sign = sc.nextInt();
							
							if(sign==0) {
								break;
							}
							
							
							
							
				//			LIST OF PRODUCTS
							
							if(sign==1) {
								//Tshirt Loop
								System.out.println("----TSHIRTS----");
								for(int i=0; i<tshirt.size(); i++) {
									System.out.println(tshirt.get(i)+"\n");
								}
								//Jeans Loop
								System.out.println("----JEANS----");
								for(int i=0; i<jeans.size(); i++) {
									System.out.println(jeans.get(i)+"\n");
								}
								//Shoes Loop
								System.out.println("----SHOES----");
								for(int i=0; i<shoe.size(); i++) {
									System.out.println(shoe.get(i)+"\n");
								}
							
								
								
				//			PRODUCT ID
								
							}else if(sign==2) {
								System.out.println("Enter a number for search product by his ID ");
								int idNum = sc.nextInt();
								System.out.println();

								//tshirt id loop
								for(int i=0; i<tshirt.size(); i++) {
									if(tshirt.get(i).getId()==idNum) {
										System.out.println("Tshirts : "+tshirt.get(i)+"\n");
									}
								}
								//jeans id loop
								for(int i=0; i<jeans.size(); i++) {
									if(jeans.get(i).getId()==idNum) {
										System.out.println("Jeans : "+jeans.get(i)+"\n");
									}
								}
								//shoes id loop
								for(int i=0; i<shoe.size(); i++) {
									if(shoe.get(i).getId()==idNum) {
										System.out.println("Shoes : "+shoe.get(i)+"\n");
									}
								}
								System.out.println();
								
								
				//			PRODUCT B/W RANGE 
								
							}else if(sign==3) {
								System.out.print("Enter your starting range Price : ");
								double firstPrice = sc.nextDouble();
								System.out.print("Enter your Highest range Price : ");
								double lastPrice = sc.nextDouble();
								System.out.println();
								
								//Tshirt
								for(int i=0; i<tshirt.size(); i++) {
									if(tshirt.get(i).getPrice() >= firstPrice && tshirt.get(i).getPrice() <= lastPrice ) {
										System.out.println("Tshirts : "+tshirt.get(i));
									}
								}
								//Jeans
								for(int i=0; i<jeans.size(); i++) {
									if(jeans.get(i).getPrice()>=firstPrice && jeans.get(i).getPrice()<=lastPrice) {
										System.out.println("Jeans : "+ jeans.get(i));
									}
								}
								
								//Shoes
								for(int i=0; i<shoe.size(); i++) {
									if(shoe.get(i).getPrice()>=firstPrice && shoe.get(i).getPrice()<=lastPrice ) {
										System.out.println("Shoes : "+ shoe.get(i));
									}
								}
								System.out.println();
								
								
								
				//			LOWEST PRICE PRODUCT	
							}else if(sign==4) {
								
								//Tshirt
								double tp = tshirt.get(0).getPrice();
								Tshirts tDet = tshirt.get(0);
								for(int i=1; i<tshirt.size(); i++) {
									if(tp>tshirt.get(i).getPrice()) {
										tp=tshirt.get(i).getPrice();
										tDet = tshirt.get(i);
									}
								}
								System.out.println();
								System.out.println("* Lowest price Tshirts Details : "+tDet+"\n");
								
								//Jeans
								double jp = jeans.get(0).getPrice();
								Jeans jDet = jeans.get(0);
								for(int i=1; i<jeans.size(); i++) {
									if(jp>jeans.get(i).getPrice()) {
										jp = jeans.get(i).getPrice();
										jDet = jeans.get(i);
									}
								}
								System.out.println("* Lowest price Jeans Details : "+jDet+"\n");
								
								//Shoes
								double sp = shoe.get(0).getPrice();
								Shoes sDet = shoe.get(0);
								for(int i=1; i<shoe.size(); i++) {
									if(sp>shoe.get(i).getPrice()) {
										sp=shoe.get(i).getPrice();
										sDet = shoe.get(i);
									}
								}
								System.out.println("* Lowest price shoes Details : "+sDet+"\n");
								System.out.println();
								
								
								
				//			HIGHEST PRICE PRODUCT
							}else if(sign==5) {
								//Tshirt
								double tp = tshirt.get(0).getPrice();
								Tshirts tDet = tshirt.get(0);
								for(int i=1; i<tshirt.size(); i++) {
									if(tp<tshirt.get(i).getPrice()) {
										tp=tshirt.get(i).getPrice();
										tDet = tshirt.get(i);
									}
								}
								System.out.println();
								System.out.println("* Highest price Tshirts Details : "+tDet+"\n");
								
								//Jeans
								double jp = jeans.get(0).getPrice();
								Jeans jDet = jeans.get(0);
								for(int i=1; i<jeans.size(); i++) {
									if(jp<jeans.get(i).getPrice()) {
										jp = jeans.get(i).getPrice();
										jDet = jeans.get(i);
									}
								}
								System.out.println("* Highest price Jeans Details : "+jDet+"\n");
								
								//Shoes
								double sp = shoe.get(0).getPrice();
								Shoes sDet = shoe.get(0);
								for(int i=1; i<shoe.size(); i++) {
									if(sp<shoe.get(i).getPrice()) {
										sp=shoe.get(i).getPrice();
										sDet = shoe.get(i);
									}
								}
								System.out.println("* Highest price shoes Details : "+sDet+"\n");
								System.out.println();
								
								
								
				//			CART LIST 
							}else if(sign==6) {								


								
								do {
									System.out.println(" For 'Tshirts' press '1'.\n For 'Jeans' press '2'. \n For 'Shoes' press '3'. \n Enter '0' for exit : ");
									int crt = sc.nextInt();
									
									if(crt==0) {
										break;
									}
									
									if(crt==1) {
										//Tshirt Loop
										System.out.println("----TSHIRTS----");
										for(int i=0; i<tshirt.size(); i++) {
											System.out.println((i+1)+". "+tshirt.get(i)+"\n");
										}
										
										do {
											System.out.println("Enter Tshirt number to add in cart : \nEnter '0' for exit. ");
											crt = sc.nextInt();
											
											if(crt==0) {
												break;
											}
											
											if(crt>0 && crt<=tshirt.size()) {
												tCart.add(tshirt.get(crt-1));
											}else {
												System.out.println("Enter Valid input : ");
											}
											
											
										}while(crt!=0);
										
									}else if(crt==2) {
										//Jeans Loop
										System.out.println("----JEANS----");
										for(int i=0; i<jeans.size(); i++) {
											System.out.println((i+1)+". "+jeans.get(i)+"\n");
										}
										
										do {
											System.out.println("Enter Jeans number to add in cart : \nEnter '0' for exit. ");
											crt = sc.nextInt();
											
											if(crt==0) {
												break;
											}
											
											if(crt>0 && crt<=jeans.size()) {
												jCart.add(jeans.get(crt-1));
											}else {
												System.out.println("Enter Valid input : ");
											}
											
											
										}while(crt!=0);
										
										
									}else if(crt==3) {
										//Shoes Loop
										System.out.println("----SHOES----");
										for(int i=0; i<shoe.size(); i++) {
											System.out.println((i+1)+". "+shoe.get(i)+"\n");
										}
										
										do {
											System.out.println("Enter Shoes number to add in cart : \nEnter '0' for exit. ");
											crt = sc.nextInt();
											
											if(crt==0) {
												break;
											}
											
											if(crt>0 && crt<=shoe.size()) {
												sCart.add(shoe.get(crt-1));
											}else {
												System.out.println("Enter Valid input : ");
											}
											
											
										}while(crt!=0);
										
									}else {
										System.out.println("Enter a valid input ");
									}
									
								}while(sign!=0);
								
								
								
							}else {
								System.out.println("Thanks ");
							}
							
						}while(sign!=0);
						
						
						
						
//					FEMALE
					}else if(chr=='F' || chr=='f') {
						do {
							System.out.println("   ----FEMALE CLOTHING----");
							System.out.println("----------MENU----------");
							System.out.println("Enter '1' for list of the products : ");
							System.out.println("Enter '2' for product id search : ");
							System.out.println("Enter '3' for view product between your range : ");
							System.out.println("Enter '4' for Lowest price product : ");
							System.out.println("Enter '5' for Highest price product : ");
							System.out.println("Enter '6' for add Products in cart : ");
							System.out.println("Enter '0' for EXIT");
							sign = sc.nextInt();
								
								if(sign==0) {
									break;
								}
								
								
								
								
					//			LIST OF PRODUCTS
								
								if(sign==1) {
									//Sarees Loop
									System.out.println("----SAREES----");
									for(int i=0; i<saree.size(); i++) {
										System.out.println(saree.get(i)+"\n");
									}
									//Kurtis Loop
									System.out.println("----KURTIS----");
									for(int i=0; i<kurti.size(); i++) {
										System.out.println(kurti.get(i)+"\n");
									}
									//Heels Loop
									System.out.println("----HEELS----");
									for(int i=0; i<heel.size(); i++) {
										System.out.println(heel.get(i)+"\n");
									}
									
									
					//			PRODUCT ID
									
								}else if(sign==2) {
									System.out.println("Enter a number for search product by his ID ");
									int idNum = sc.nextInt();
									System.out.println();

									//tshirt id loop
									for(int i=0; i<saree.size(); i++) {
										if(saree.get(i).getId()==idNum) {
											System.out.println("Sarees : "+saree.get(i)+"\n");
										}
									}
									//jeans id loop
									for(int i=0; i<kurti.size(); i++) {
										if(kurti.get(i).getId()==idNum) {
											System.out.println("Kurtis : "+kurti.get(i)+"\n");
										}
									}
									//shoes id loop
									for(int i=0; i<heel.size(); i++) {
										if(heel.get(i).getId()==idNum) {
											System.out.println("Heels : "+heel.get(i)+"\n");
										}
									}
									System.out.println();
									
									
					//			PRODUCT B/W RANGE 
									
								}else if(sign==3) {
									System.out.print("Enter your starting range Price : ");
									double firstPrice = sc.nextDouble();
									System.out.print("Enter your Highest range Price : ");
									double lastPrice = sc.nextDouble();
									System.out.println();
									
									//Sarees
									for(int i=0; i<saree.size(); i++) {
										if(saree.get(i).getPrice() >= firstPrice && saree.get(i).getPrice() <= lastPrice ) {
											System.out.println("Sarees : "+saree.get(i));
										}
									}
									//Kurtis
									for(int i=0; i<kurti.size(); i++) {
										if(kurti.get(i).getPrice()>=firstPrice && kurti.get(i).getPrice()<=lastPrice) {
											System.out.println("Kurtis : "+ kurti.get(i));
										}
									}
									
									//Heels
									for(int i=0; i<heel.size(); i++) {
										if(heel.get(i).getPrice()>=firstPrice && heel.get(i).getPrice()<=lastPrice ) {
											System.out.println("Shoes : "+ heel.get(i));
										}
									}
									System.out.println();
									
									
									
					//			LOWEST PRICE PRODUCT	
								}else if(sign==4) {
									
									//Sarees
									double tp = saree.get(0).getPrice();
									Sarees tDet = saree.get(0);
									for(int i=1; i<saree.size(); i++) {
										if(tp>saree.get(i).getPrice()) {
											tp=saree.get(i).getPrice();
											tDet = saree.get(i);
										}
									}
									System.out.println();
									System.out.println("* Lowest price Sarees Details : "+tDet+"\n");
									
									//Kurtis
									double jp = kurti.get(0).getPrice();
									Kurtis jDet = kurti.get(0);
									for(int i=1; i<kurti.size(); i++) {
										if(jp>kurti.get(i).getPrice()) {
											jp = kurti.get(i).getPrice();
											jDet = kurti.get(i);
										}
									}
									System.out.println("* Lowest price Kurtis Details : "+jDet+"\n");
									
									//Heels
									double sp = heel.get(0).getPrice();
									Heels sDet = heel.get(0);
									for(int i=1; i<heel.size(); i++) {
										if(sp>heel.get(i).getPrice()) {
											sp=heel.get(i).getPrice();
											sDet = heel.get(i);
										}
									}
									System.out.println("* Lowest price Heels Details : "+sDet+"\n");
									System.out.println();
									
									
									
					//			HIGHEST PRICE PRODUCT
								}else if(sign==5) {
									//Sarees
									double tp = saree.get(0).getPrice();
									Sarees tDet = saree.get(0);
									for(int i=1; i<saree.size(); i++) {
										if(tp<saree.get(i).getPrice()) {
											tp=saree.get(i).getPrice();
											tDet = saree.get(i);
										}
									}
									System.out.println();
									System.out.println("* Highest price Sarees Details : "+tDet+"\n");
									
									//Jeans
									double jp = kurti.get(0).getPrice();
									Kurtis jDet = kurti.get(0);
									for(int i=1; i<kurti.size(); i++) {
										if(jp<kurti.get(i).getPrice()) {
											jp = kurti.get(i).getPrice();
											jDet = kurti.get(i);
										}
									}
									System.out.println("* Highest price Kurtis Details : "+jDet+"\n");
									
									//Heels
									double sp = heel.get(0).getPrice();
									Heels sDet = heel.get(0);
									for(int i=1; i<heel.size(); i++) {
										if(sp<heel.get(i).getPrice()) {
											sp=heel.get(i).getPrice();
											sDet = heel.get(i);
										}
									}
									System.out.println("* Highest price Heels Details : "+sDet+"\n");
									System.out.println();
									
									
									
					//			CART LIST 
								}else if(sign==6) {								


									
									do {
										System.out.println(" For 'Sarees' press '1'.\n For 'Kurtis' press '2'. \n For 'Heels' press '3'. \n Enter '0' for exit : ");
										int crt = sc.nextInt();
										
										if(crt==0) {
											break;
										}
										
										if(crt==1) {
											//Sarees Loop
											System.out.println("----SAREE'S----");
											for(int i=0; i<saree.size(); i++) {
												System.out.println((i+1)+". "+saree.get(i)+"\n");
											}
											
											do {
												System.out.println("Enter Sarees number to add in cart : \nEnter '0' for exit. ");
												crt = sc.nextInt();
												
												if(crt==0) {
													break;
												}
												
												if(crt>0 && crt<=saree.size()) {
													sarCart.add(saree.get(crt-1));
												}else {
													System.out.println("Enter Valid input : ");
												}
												
												
											}while(crt!=0);
											
										}else if(crt==2) {
											//Kurtis Loop
											System.out.println("----KURTIS----");
											for(int i=0; i<kurti.size(); i++) {
												System.out.println((i+1)+". "+kurti.get(i)+"\n");
											}
											
											do {
												System.out.println("Enter Kurtis number to add in cart : \nEnter '0' for exit. ");
												crt = sc.nextInt();
												
												if(crt==0) {
													break;
												}
												
												if(crt>0 && crt<=kurti.size()) {
													kurCart.add(kurti.get(crt-1));
												}else {
													System.out.println("Enter Valid input : ");
												}
												
												
											}while(crt!=0);
											
											
										}else if(crt==3) {
											//Heels Loop
											System.out.println("----HEELS----");
											for(int i=0; i<heel.size(); i++) {
												System.out.println((i+1)+". "+heel.get(i)+"\n");
											}
											
											do {
												System.out.println("Enter Heels number to add in cart : \nEnter '0' for exit. ");
												crt = sc.nextInt();
												
												if(crt==0) {
													break;
												}
												
												if(crt>0 && crt<=heel.size()) {
													helCart.add(heel.get(crt-1));
												}else {
													System.out.println("Enter Valid input : ");
												}
												
												
											}while(crt!=0);
											
										}else {
											System.out.println("Enter a valid input ");
										}
										
									}while(sign!=0);
									
									
									
								}else {
									System.out.println("Thanks ");
								}
								
							}while(sign!=0);
							
							
					}
				
				}while(chr!='q' || chr!='Q');
			
			
				
				
				
			
//			ELECTRONICS 
				
			}else if(ch=='e' || ch=='E') {
			
				
				do {
					
					System.out.println("   ----ELECTRONICS----");
					System.out.println("\t----------MENU----------");
					System.out.println("Enter '1' for list of the products : ");
					System.out.println("Enter '2' for product id search : ");
					System.out.println("Enter '3' for view product between your range : ");
					System.out.println("Enter '4' for Lowest price product : ");
					System.out.println("Enter '5' for Highest price product : ");
					System.out.println("Enter '6' for add Products in cart : ");
					System.out.println("Enter '0' for EXIT");
					sign = sc.nextInt();
						
						if(sign==0) {
							break;
						}
						
						
						
						
			//			LIST OF PRODUCTS
						
						if(sign==1) {
							//Mobiles Loop
							System.out.println("----MOBILES----");
							for(int i=0; i<mobile.size(); i++) {
								System.out.println(mobile.get(i)+"\n");
							}
							//Laptops Loop
							System.out.println("----LAPTOPS----");
							for(int i=0; i<laptop.size(); i++) {
								System.out.println(laptop.get(i)+"\n");
							}
							//Cameras Loop
							System.out.println("----CAMERAS----");
							for(int i=0; i<camera.size(); i++) {
								System.out.println(camera.get(i)+"\n");
							}
							
							
			//			PRODUCT ID
							
						}else if(sign==2) {
							System.out.println("Enter a number for search product by his ID ");
							int idNum = sc.nextInt();
							System.out.println();

							//Mobiles id loop
							for(int i=0; i<mobile.size(); i++) {
								if(mobile.get(i).getId()==idNum) {
									System.out.println("Mobiles : "+mobile.get(i)+"\n");
								}
							}
							//Laptops id loop
							for(int i=0; i<laptop.size(); i++) {
								if(laptop.get(i).getId()==idNum) {
									System.out.println("Laptops : "+laptop.get(i)+"\n");
								}
							}
							//shoes id loop
							for(int i=0; i<camera.size(); i++) {
								if(camera.get(i).getId()==idNum) {
									System.out.println("Cameras : "+camera.get(i)+"\n");
								}
							}
							System.out.println();
							
							
			//			PRODUCT B/W RANGE 
							
						}else if(sign==3) {
							System.out.print("Enter your starting range Price : ");
							double firstPrice = sc.nextDouble();
							System.out.print("Enter your Highest range Price : ");
							double lastPrice = sc.nextDouble();
							System.out.println();
							
							//Mobiles
							for(int i=0; i<mobile.size(); i++) {
								if(mobile.get(i).getPrice() >= firstPrice && mobile.get(i).getPrice() <= lastPrice ) {
									System.out.println("Mobiles : "+mobile.get(i));
								}
							}
							//Laptops
							for(int i=0; i<laptop.size(); i++) {
								if(laptop.get(i).getPrice()>=firstPrice && laptop.get(i).getPrice()<=lastPrice) {
									System.out.println("Laptops : "+ laptop.get(i));
								}
							}
							
							//Cameras
							for(int i=0; i<camera.size(); i++) {
								if(camera.get(i).getPrice()>=firstPrice && camera.get(i).getPrice()<=lastPrice ) {
									System.out.println("Cameras : "+ camera.get(i));
								}
							}
							System.out.println();
							
							
							
			//			LOWEST PRICE PRODUCT	
						}else if(sign==4) {
							
							//Mobiles
							double tp = mobile.get(0).getPrice();
							Mobiles tDet = mobile.get(0);
							for(int i=1; i<mobile.size(); i++) {
								if(tp>mobile.get(i).getPrice()) {
									tp=mobile.get(i).getPrice();
									tDet = mobile.get(i);
								}
							}
							System.out.println();
							System.out.println("* Lowest price Mobile Details : "+tDet+"\n");
							
							//Jeans
							double jp = laptop.get(0).getPrice();
							Laptops jDet = laptop.get(0);
							for(int i=1; i<laptop.size(); i++) {
								if(jp>laptop.get(i).getPrice()) {
									jp = laptop.get(i).getPrice();
									jDet = laptop.get(i);
								}
							}
							System.out.println("* Lowest price Laptop Details : "+jDet+"\n");
							
							//Shoes
							double sp = camera.get(0).getPrice();
							Cameras sDet = camera.get(0);
							for(int i=1; i<camera.size(); i++) {
								if(sp>camera.get(i).getPrice()) {
									sp=camera.get(i).getPrice();
									sDet = camera.get(i);
								}
							}
							System.out.println("* Lowest price Camera Details : "+sDet+"\n");
							System.out.println();
							
							
							
			//			HIGHEST PRICE PRODUCT
						}else if(sign==5) {
							//Mobiles
							double tp = mobile.get(0).getPrice();
							Mobiles tDet = mobile.get(0);
							for(int i=1; i<mobile.size(); i++) {
								if(tp<mobile.get(i).getPrice()) {
									tp=mobile.get(i).getPrice();
									tDet = mobile.get(i);
								}
							}
							System.out.println();
							System.out.println("* Highest price Mobile Details : "+tDet+"\n");
							
							//Laptops
							double jp = laptop.get(0).getPrice();
							Laptops jDet = laptop.get(0);
							for(int i=1; i<laptop.size(); i++) {
								if(jp<laptop.get(i).getPrice()) {
									jp = laptop.get(i).getPrice();
									jDet = laptop.get(i);
								}
							}
							System.out.println("* Highest price Laptop Details : "+jDet+"\n");
							
							//Cameras
							double sp = camera.get(0).getPrice();
							Cameras sDet = camera.get(0);
							for(int i=1; i<camera.size(); i++) {
								if(sp<camera.get(i).getPrice()) {
									sp=camera.get(i).getPrice();
									sDet = camera.get(i);
								}
							}
							System.out.println("* Highest price Camera Details : "+sDet+"\n");
							System.out.println();
							
							
							
			//			CART LIST 
						}else if(sign==6) {								


							
							do {
								System.out.println(" For 'Mobiles' press '1'.\n For 'Laptops' press '2'. \n For 'Cameras' press '3'. \n Enter '0' for exit : ");
								int crt = sc.nextInt();
								
								if(crt==0) {
									break;
								}
								
								if(crt==1) {
									//Mobiles Loop
									System.out.println("----MOBILES----");
									for(int i=0; i<mobile.size(); i++) {
										System.out.println((i+1)+". "+mobile.get(i)+"\n");
									}
									
									do {
										System.out.println("Enter Mobile number to add in cart : \nEnter '0' for exit. ");
										crt = sc.nextInt();
										
										if(crt==0) {
											break;
										}
										
										if(crt>0 && crt<=mobile.size()) {
											mobCart.add(mobile.get(crt-1));
										}else {
											System.out.println("Enter Valid input : ");
										}
										
										
									}while(crt!=0);
									
								}else if(crt==2) {
									//Laptops Loop
									System.out.println("----LAPTOPS----");
									for(int i=0; i<laptop.size(); i++) {
										System.out.println((i+1)+". "+laptop.get(i)+"\n");
									}
									
									do {
										System.out.println("Enter Laptops number to add in cart : \nEnter '0' for exit. ");
										crt = sc.nextInt();
										
										if(crt==0) {
											break;
										}
										
										if(crt>0 && crt<=laptop.size()) {
											lapCart.add(laptop.get(crt-1));
										}else {
											System.out.println("Enter Valid input : ");
										}
										
										
									}while(crt!=0);
									
									
								}else if(crt==3) {
									//Cameras Loop
									System.out.println("----CAMERAS----");
									for(int i=0; i<camera.size(); i++) {
										System.out.println((i+1)+". "+camera.get(i)+"\n");
									}
									
									do {
										System.out.println("Enter Cameras number to add in cart : \nEnter '0' for exit. ");
										crt = sc.nextInt();
										
										if(crt==0) {
											break;
										}
										
										if(crt>0 && crt<=camera.size()) {
											camCart.add(camera.get(crt-1));
										}else {
											System.out.println("Enter Valid input \n");
										}
										
										
									}while(crt!=0);
									
								}else {
									System.out.println("Enter a valid input \n");
								}
								
							}while(sign!=0);
							
							
							
						}else {
							System.out.println("Enter valid input \n");
						}
						
					}while(sign!=0);
				
				
				
			}else {
				System.out.println("Enter valid input \n");
			}
			
		
			
		}while(ch!='q' || ch!='Q');
		
		System.out.println("\n Thank you , visit again \n");
		System.out.println("\t----Cart List----");
		
		
		double allTotal =0;
		
		
//		---------CLOTHING--------
		
		
//		MALE
		double totalPriceT = 0;
		double totalPriceJ = 0;
		double totalPriceS = 0;
		
		System.out.println("\n----Male----");
		//Tshirts Total Price 
		for(int i=0; i<tCart.size(); i++) {
			System.out.println(tCart.get(i));
			totalPriceT += tCart.get(i).calculateTotal();
		}
		
		//Jeans Total Price
		for(int i=0; i<jCart.size(); i++) {
			System.out.println(jCart.get(i));
			totalPriceJ += jCart.get(i).calculateTotal();
		}
		//Shoes Total Price 
		for(int i=0; i<sCart.size(); i++) {
			System.out.println(sCart.get(i));
			totalPriceS += sCart.get(i).calculateTotal();
		}
		
		System.out.println("Total Tshirts Price : "+totalPriceT);
		System.out.println("Total Jeans Price : "+totalPriceJ);
		System.out.println("Total Shoes Price : "+totalPriceS);
		
		
//		FEMALE
		
		double totalPriceSar = 0;
		double totalPriceKur = 0;
		double totalPriceHel = 0;
	
		System.out.println("\n----Female----");
		//Sarees Total Price 
		for(int i=0; i<sarCart.size(); i++) {
			System.out.println(sarCart.get(i));
			totalPriceSar += sarCart.get(i).calculateTotal();
		}
		
		//Kurtis Total Price
		for(int i=0; i<kurCart.size(); i++) {
			System.out.println(kurCart.get(i));
			totalPriceKur += kurCart.get(i).calculateTotal();
		}
		//Heels Total Price 
		for(int i=0; i<helCart.size(); i++) {
			System.out.println(helCart.get(i));
			totalPriceHel += helCart.get(i).calculateTotal();
		}
		
		System.out.println("Total Sarees Price : "+totalPriceSar);
		System.out.println("Total Kurtis Price : "+totalPriceKur);
		System.out.println("Total Heels Price : "+totalPriceHel);
		
		
//		---------ELECTRONICS--------
		
		double totalPriceMob =0;
		double totalPriceLap =0;
		double totalPriceCam =0;
		
		
		System.out.println("\n----Electronics----");
		//Mobiles Total Price
		for(int i=0; i<mobCart.size(); i++) {
			System.out.println(mobCart.get(i));
			totalPriceMob = mobCart.get(i).calculateTotal();
		}
		
		//Laptops Total Price
		for(int i=0; i<lapCart.size(); i++) {
			System.out.println(lapCart.get(i));
			totalPriceLap = lapCart.get(i).calculateTotal();
		}
		
		//Cameras Total Price
		for(int i=0; i<camCart.size(); i++) {
			System.out.println(camCart.get(i));
			totalPriceCam = camCart.get(i).calculateTotal();
		}
		
		System.out.println("Total Mobiles Price : "+totalPriceMob);
		System.out.println("Total Laptops Price : "+totalPriceLap);
		System.out.println("Total Cameras Price : "+totalPriceCam);
		
		
//		----TOTAL----
		System.out.println("\n--------Total Amount---------\n");
		double disTotal =0;
		allTotal = totalPriceT+totalPriceJ+totalPriceS+totalPriceSar+totalPriceKur+totalPriceHel+totalPriceMob+totalPriceLap+totalPriceCam;
		System.out.println("Total Amount : "+allTotal);
		if(allTotal>200000) {
			disTotal = allTotal -(allTotal*0.2);
		}else {
			disTotal = 0;
		}
		System.out.println("Total Amount after 20% discount : "+disTotal);
		
		
		
		
		sc.close();
		
	}
	
	
}
