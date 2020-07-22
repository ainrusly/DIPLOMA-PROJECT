#include<iostream>
#include<string>
#include<iomanip>
#include<fstream>
using namespace std;

struct waiterInfo 
	{ //STRUCT1
		char name[5][10] = {"MANIS","ELLISHA","AIN","SYIFAA","SARAH"};
		int workersID[5] = {980625, 990111, 981002, 980821, 980521};
		int passWord[5] = {1231, 1232, 1233, 1234, 1235};
	} waiter;


void waiterLogin (int&status, int& index) //FUNCTION WAITER LOGIN
	{	
		int workID, pass;
		int  found=0;
	
		while(found!=1)
		{
			cout<<endl;
			cout<<"\t\t\t\t\t\tSTAFF LOGIN"<<endl;
			cout<<"\t\t\t\t\t\t-----------"<<endl;
			cout<<endl;
	
			cout<<"\t\t\t\t\t\t-----------"<<endl;
			cout<<"\t\t\t\t\t\tID: ";
			cin>>workID;
		
			cout<<"\t\t\t\t\t\t-----------"<<endl;
			cout<<"\t\t\t\t\t\tPASS: ";
			cin>>pass;
			cout<<"\t\t\t\t\t\t-----------"<<endl;	
	
			for(int i=0; i<5; i++)
			{ 
				if (workID==waiter.workersID[i])
				index=i;
		  		{
		   			if (pass==waiter.passWord[index])
		   			found=1;
		   		}
			}
		
					if (found==1)
						{
							system("cls");
							cout<<"\t\t\t\t\tVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV"<<endl;
   							cout<<endl;
   							cout<<"\t\t\t\t\t\tLOGIN SUCCESSFUL!!!"<<endl;
   							cout<<endl;
   							cout<<"\t\t\t\t\tVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV"<<endl;
   							cout<<endl;
   							cout<<"\t\t\t\t\t\tHELLO "<<waiter.name[index]<<" !"<<endl;
   	 						cout<<endl;
							status=1;	
						}	
					else
	 					{ 
	 						cout<<endl;
							cout<<"\t\t\tLOGIN ERROR! PLEASE TRY AND LOGIN AGAIN...."<<endl;
							cout<<endl;
	     					status=0;
						}	
    	} 	      
	}


void displayMenu ()//FUNCTION DISPLAY MENU
	{
		cout<<"============================================================================"<<endl;
		cout<<"\t\t\tWELCOME TO ITALIANO RESTAURANT"<<endl;
		cout<<"\t\t\tPLEASE PROCEED WITH YOUR ORDER\t\t"<<endl;
		cout<<"============================================================================"<<endl;
		cout<<endl;
	
		cout<<endl;
		cout<<"\t\t=====\t\t\t\t\t\t========="<<endl;
		cout<<"\t\tMENU\t\t\t\t\t\tPRICE(RM)"<<endl;
		cout<<"\t\t=====\t\t\t\t\t\t========="<<endl;
		cout<<endl;
	
		cout<<"A.BURGER\t\t\t\t\t\t\t\t\t\t"<<endl;
		cout<<"\t1. CHEESE BURGER\t\t\t\t\t12.00\t\t\t"<<endl;
		cout<<"\t2. CHICKEN BURGER\t\t\t\t\t11.00\t\t\t"<<endl;
		cout<<"\t3. BEEF BURGER\t\t\t\t\t\t12.50\t\t\t"<<endl;
		cout<<endl;
	
		cout<<"B.SPAGHETTI\t\t\t\t\t\t\t\t\t\t\t"<<endl;
		cout<<"\t1. AGLIO OLIO\t\t\t\t\t\t13.00\t\t\t\t\t"<<endl;
		cout<<"\t2. BOLOGNESE\t\t\t\t\t\t12.50\t\t\t\t"<<endl;
		cout<<"\t3. CARBONARA\t\t\t\t\t\t12.50\t\t\t\t"<<endl;
		cout<<endl;
		
		cout<<"C.PIZZA (REGULAR ONLY)\t\t\t\t\t"<<endl;
		cout<<"\t1. HAWAIIAN\t\t\t\t\t\t15.00\t\t\t\t\t"<<endl;
		cout<<"\t2. PEPPERONI\t\t\t\t\t\t15.50\t\t\t\t\t"<<endl;
		cout<<"\t3. TUNA\t\t\t\t\t\t\t14.00\t\t\t\t"<<endl;
		cout<<endl;
	
		cout<<"D. ADD-ONS\t\t\t\t\t"<<endl;
		cout<<"\t1. FRENCH FRIES\t\t\t\t\t\t5.00\t\t\t"<<endl;
		cout<<"\t2. EXTRA CHEESE\t\t\t\t\t\t2.00\t\t\t"<<endl;
		cout<<"\t3. CHICKEN WINGS - 6 pieces (4. ORIGINAL/ 5. SPICY)\t8.00\t\t"<<endl;
		cout<<endl;
	
		cout<<"E. BEVERAGES\t\t\t\t\t"<<endl;
		cout<<"\t1. PEPSI\t\t\t\t\t\t3.00\t\t\t"<<endl;
		cout<<"\t2. MILO ICED\t\t\t\t\t\t3.00\t\t\t"<<endl;
		cout<<"\t3. ICED LEMON TEA\t\t\t\t\t3.00\t\t\t"<<endl;
		cout<<endl;
	} 


void customerName (char custName[]) 
	{
		cout<<endl;
   		cout<<custName<<"'s ORDER "<<endl; 
	}
   	   
       		
float menuOrder  (int index, char custName[]) 
	{
  		char choice;
  		int qtty, typeA, typeB, typeC, typeD, typeE, typeF, orderCount;
  		char answer='N';
  		float netPrice=0, price, change, gstPrice, amountpaid ;
  		int count, i, countOrder=0;
  		int flavour;
  		
		ofstream outMenu;
  		outMenu.open("receiptItaliano.txt");
  		
  		outMenu<<"\t\t\t\tTHIS IS YOUR OFFICIAL RECEIPT"<<endl;
  		outMenu<<"\t\t\t======ITALIANO RESTAURANT RECEIPT======\t\t\t"<<endl;
  		outMenu<<"\t\t\t\tCONTACT NO : 03-55555555"<<endl;
  		outMenu<<"\t\t\tJALAN ITALY, 8/14 SEKSYEN 8 ARAU PERLIS 45082"<<endl;
  		outMenu<<"\t\t-------------------\t\t----------\t\t----------"<<endl;
  	    outMenu<<"\t\t\tSET\t\t\t QUANTITY\t\t  PRICE"<<endl;
        outMenu<<"\t\t-------------------\t\t----------\t\t----------"<<endl;  	

  	while(answer!='Y')
	  {
		{
		
			cout<<endl;
    		cout<<"PLEASE ENTER YOUR CHOICE [ A.BURGER | B.SPAGHETTI |C.PIZZA | D.ADD_ONS | E.DRINKS ] :";
    		cin>>choice;
    		count++;
    		cout<<endl;

    		switch (choice)
		 		{
					case 'A': 
						{
						 	cout<<"YOU HAVE CHOSEN BURGER MENU. PLEASE ENTER TYPE (1.CHEESE | 2.CHICKEN | 3.BEEF) :";
		       			 	cin>>typeA;
		       			 	cout<<endl;
		       			
		        			 if (typeA==1)
		         				{
		         		 			cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
		          					price=16.20;
									netPrice+=(price*qtty);
									countOrder++;
									outMenu<<"\t\tCHEESE BURGER\t\t\t    "<<qtty<<"\t\t        RM 12.00"<<endl;
								}
		          	 	
				 			else if (typeA==2)	
		          			 	{
		          					cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
		   							price=15.50;
		   							netPrice+=(price*qtty);
									countOrder++;
									outMenu<<"\t\tCHICKEN BURGER\t\t\t    "<<qtty<<"\t\t        RM 11.00"<<endl;
								}	
		          		
		       			   	else if (typeA==3)		
		         		 		{
		          					cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
		       						price=15.90;
		       						netPrice+=(price*qtty);
									countOrder++;
									outMenu<<"\t\tBEEF BURGER\t\t\t    "<<qtty<<"\t\t        RM 12.50"<<endl;
								}
		        		  	else			
		       					cout<<"INVALID TYPE!"<<endl;}
		          
		       			break;
		       			   
		          
	            	case 'B': 
	           			{
	            			cout<<"YOU HAVE CHOSEN SPAGHETTI MENU. PLEASE ENTER TYPE [ 1.AGLIO OLIO | 2.BOLOGNESE | 3.CARBONARA ] : ";
	            			cin>>typeB;
	            			cout<<endl;
						
	               	 	 	if (typeB==1)
	               	   			{
	               	  	  			cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
	               	  	  			price=13.00;
	               	  	  			netPrice+=(price*qtty);	            
									countOrder++;
									outMenu<<"\t\tAGLIO OLIO SPAGHETTI\t\t    "<<qtty<<"\t\t\tRM 13.00"<<endl;
								}
								
	               	  		else if (typeB==2)	 
	               	  			{
	               	  	   	    	cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
	               	  	        	price=12.50;
	               	  	        	netPrice+=(price*qtty);
							    	countOrder++;
							    	outMenu<<"\t\tBOLOGNESE SPAGHETTI\t\t    "<<qtty<<"\t\t\tRM 12.50"<<endl;
								}
							    
	               	        else if (typeB==3)	 
	               	        	{
	               	   		  		cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
	               	  				price=12.50;
	               	  				netPrice+=(price*qtty);
									countOrder++;
									outMenu<<"\t\tCARBONARA SPAGHETTI\t\t    "<<qtty<<"\t\t\tRM 12.50"<<endl;
								}
	               	 		else
								 cout<<"INVALID TYPE!"<<endl;}
								 
						break;
	               
	    			case 'C': 
					 	{	
					 		cout<<endl;
					 		cout<<"YOU HAVE CHOSEN PIZZA MENU (REGULAR ONLY). PLEASE ENTER TYPE [ 1.HAWAIIAN | 2.PEPPERONI | 3.TUNA ] : ";
	             			cin>>typeC;
	             			cout<<endl;
	             		 
	               	 	if(typeC==1)
	               	  		{
	               	  			cout<<"QUANTITY OF ITEM : ";
    							cin>>qtty;
								price=11.00;
	               	   	  		netPrice+=(price*qtty);
						  		countOrder++;
						  		outMenu<<"\t\tHAWAIIAN PIZZA\t\t\t    "<<qtty<<"\t\t        RM 15.00"<<endl;
						  	}
	               	
					 	else if(typeC==2)
                        	{ 
                   				cout<<"QUANTITY OF ITEM : ";
    							cin>>qtty;
	               	  	 		price=12.00;
	               	  			netPrice+=(price*qtty);
							 	countOrder++;
						 		outMenu<<"\t\tPEPPERONI PIZZA\t\t\t    "<<qtty<<"\t\t        RM 15.50"<<endl;
						 	}
	               	
	               	 	else if(typeC==3)
	               	  		{
	               	  			cout<<"QUANTITY OF ITEM : ";
    							cin>>qtty;
	               			  	price=9.00;
	               	  			netPrice+=(price*qtty);
							 	countOrder++;
						 		outMenu<<"\t\tTUNA PIZZA\t\t\t    "<<qtty<<"\t\t        RM 14.00"<<endl;
							}
	               	  	
	               	  	else
	               	  		cout<<"INVALID TYPE!"<<endl;}
	               	break;
	
      		   case 'D' : 
      		   			{
				 		    cout<<"YOU HAVE CHOSEN ADD-ONS MENU. PLEASE ENTER TYPE [ 1.FRENCH FRIES | 2.EXTRA CHEESE | 3.CHICKEN WINGS-12PCS (4.ORI || 5.SPICY) ] : ";
                 		    cin>>typeD;
                 		    cout<<endl;
                 		   
                 			if (typeD==1)
                 			   {
                    				cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
                    				price=5.00;
                    				netPrice+=(price*qtty);
									countOrder++;
									outMenu<<"\t\tFRENCH FRIES\t\t\t    "<<qtty<<"\t\t        RM 5.00"<<endl;
								}

                  			else if(typeD==2)	
                  				{
                  		       		cout<<"QUANTITY OF ITEM : ";
    								cin>>qtty;
                    	       		price=2.00;
                    	       		netPrice+=(price*qtty);
							   		countOrder++;
							   		outMenu<<"\t\tEXTRA CHEESE\t\t\t    "<<qtty<<"\t\t        RM 2.00"<<endl;
								}
						
                			else if(typeD==3)
                        		{
                    				cout<<"CHOOSE (4.ORIGINAL || 5.SPICY) : ";
                    				cin>>flavour;
									countOrder++;
									outMenu<<endl;
									outMenu<<"\t\tCHICKEN WINGS"<<endl;
                    		
                    				if (typeF==4)
                    				{
                    					cout<<"QUANTITY OF ITEM : ";
    									cin>>qtty;
									 	price=8.00;
										netPrice+=(price*qtty);
									 	countOrder++;
									 	outMenu<<"\t\t\tORIGINAL FLAVOUR\t\t       "<<qtty<<"\t\T        RM 8.00"<<endl;
									}
                    		
                    				else if (typeF==5);
		                   	 	   	{
                    			     	cout<<"QUANTITY OF ITEM : ";
    									cin>>qtty;
                    	   			  	price=8.00;
                    	   			 	netPrice+=(price*qtty);
                    	   			  	countOrder++;
                    	   			  	outMenu<<"\t\t\tSPICY FLAVOUR\t\t    "<<qtty<<"\t\t        RM 8.00"<<endl;
									}
                       		 }
                   			 else
                    			cout<<"INVALID TYPE!"<<endl;}
                    	break;
                    
       		  	case 'E': 
				 		{ 
						 	cout<<"YOU HAVE CHOSEN DRINKS MENU. PLEASE ENTER TYPE [ 1.PEPSI | 2.MILO | 3.ICED LEMON TEA ] : ";
                 		  	cin>>typeE;
                 		  	cout<<endl;
                 		  
            			  	if(typeE==1)
            		       	{	
                 		  		cout<<"QUANTITY OF ITEM : ";
    							cin>>qtty;
                		   		price=3.00;
                		   		netPrice+=(price*qtty);
								countOrder++;
								outMenu<<"\t\tPEPSI\t\t\t            "<<qtty<<"\t\t\tRM 3.00"<<endl;
							}
                   	 
                 		  	else if(typeE==2)
                   	 		{ 
                   	 			cout<<"QUANTITY OF ITEM : ";
    							cin>>qtty;
                   	  		 	price=3.00;
                   	  		 	netPrice+=(price*qtty);
							 	countOrder++;
							 	outMenu<<"\t\tMILO ICED\t\t            "<<qtty<<"\t\t        RM 3.00"<<endl;
							}
                   	                    			 
						 	else if(typeE==3)
                   			{
                   			  	cout<<"QUANTITY OF ITEM : ";
    							cin>>qtty;
                   	  			price=3.00;
                   	  		    netPrice+=(price*qtty);
								countOrder++;
								outMenu<<"\t\tICED LEMON TEA\t\t\t    "<<qtty<<"\t                RM 3.00"<<endl;
							}
                   	  	
                        	else
					         	cout<<"INVALID TYPE!"<<endl;
								cout<<endl;}
                   	    break;
                   	    
       				default : cout<<"\t\t..............SORRY OUR RESTAURANT DOES NOT OFFER THAT MENU........."<<endl;
            		break;
		  		}
			 
			 //GST COUNTING
			 
			 	gstPrice=netPrice*0.06+netPrice;
		     
		        cout<<endl;
		    	cout<<"DO YOU WANT TO STOP ORDER? PLEASE ENTER ['Y'-(YES) TO STOP 'N'- (NO) TO CONTINUE] : ";
            	cin>>answer;
           	 	cout<<endl;
            	cout<<endl;
			}
			  
		}
		
		system("cls");
		  cout<<endl;
		  cout<<"====================================================================================="<<endl;
		  cout<<"------------------------------------PAYMENT------------------------------------------"<<endl;
		  cout<<"====================================================================================="<<endl;
		  cout<<endl;
		  cout<<setiosflags(ios::fixed|ios::showpoint)<<setprecision(2)<<"\t\tTOTAL PRICE = RM "<<netPrice<<endl;
		  cout<<endl;
		  cout<<setiosflags(ios::fixed|ios::showpoint)<<setprecision(2)<<"\t\tPRICE INCLUDES GST = RM "<<gstPrice<<endl; 
		  cout<<endl;
		  cout<<">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"<<endl;
		  cout<<endl;
		  cout<<"\t\t>>>>>ENTER THE AMOUNT YOU WANT TO PAY  = RM ";
		  cin>>amountpaid;
		  
		  
		  outMenu<<endl;
		  outMenu<<"========================================================================================"<<endl;
		  outMenu<<setiosflags(ios::fixed|ios::showpoint)<<setprecision(2)<<"Total Price = RM "<<netPrice<<endl;
		  outMenu<<setiosflags(ios::fixed|ios::showpoint)<<setprecision(2)<<"Price includes GST = RM "<<gstPrice<<endl; 
	
		  change=amountpaid-gstPrice;
		  outMenu<<setiosflags(ios::fixed|ios::showpoint)<<setprecision(2)<<"Amount paid = RM "<<amountpaid<<endl;
		  outMenu<<setiosflags(ios::fixed|ios::showpoint)<<setprecision(2)<<"Your change = RM "<<change<<endl;
		  outMenu<<endl;  
		  outMenu<<"\t~~~~~~Thank You "<<custName<<" for dining at Italiano Restaurant~~~~~~"<<endl;
		  outMenu<<"\t\t\tYou were served by "<<waiter.name[index]<<endl;
		  
		  outMenu.close();
	}
  

int main()
	{
   		char waiterName;
   		char custName[100];
   		char choice;
   		int qtty, status, index;
   		float price;
   	
   		ofstream outFile;
   		outFile.open("receiptItaliano.txt");
  
	   	waiterLogin(status,index);
   	
   		if (status==1)
   		{  	
   			cout<<"\t\t\t\t\tENTER CUSTOMER'S NAME: ";
   			cin>>ws;
   			cin.getline(custName,100);
   	
   			customerName (custName);
   	   	
   			displayMenu ();
   			menuOrder (index,custName);
   	
	   		system("cls");
		}
	outFile.close();
	}


	

