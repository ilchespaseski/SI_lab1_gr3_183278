class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
      int a=15;
	  int b=5;
	  int v=0;
	//TODO constructor
           
			 Item (int id, String name, double price) 
			{
				this.id = id;
				strcpy(this.name, name);
				this.price = price;
			}
	//TODO setters and getters
              void setId(int s) {
      id = s;
    }
    
    int getId() {
      return id;
	}
	   void setname(String s) {
       strcpy(name,s);
    }
    
    String getname() {
      return name;
	}
	   void setPrice(int s) {
     price = s;
    }
    
    double getPrice() {
      return price;
	}
  
	double taxReturn () {
		int suma =(price * a / 100) + (price * b /100);
		return suma * a / 100;
	}
}

class Receipt List<Item> {
	int vkupnasuma;
	Receipt(){}
	int iznosnafiskalna(){
		for(int i=0;i<List.elements;i++)
		{
		vkupnasuma+= price;
		}
		return vkupnasuma;
	}
	int ddv {
		return List.taxReturn();
	}
	
}