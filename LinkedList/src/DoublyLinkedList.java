
public class DoublyLinkedList {

	Neighbour firstLink;
	Neighbour lastLink;
	
	public boolean insertAfterKeys(String homeOwnerName,int houseNumber,int key){
		Neighbour theNewLink = new Neighbour(homeOwnerName, houseNumber);
		Neighbour currentNeighbour = firstLink;
		
		while(currentNeighbour.houseNumber != key){
			currentNeighbour = currentNeighbour.next;
			
			if(currentNeighbour == null){
				return false;
			}
		}
		if(currentNeighbour == lastLink){
			theNewLink.next = null;
			lastLink = theNewLink;
		}else{
			theNewLink.next = currentNeighbour.next;
			currentNeighbour.next.previous = theNewLink; //??
		}
		
		theNewLink.previous = currentNeighbour;
		currentNeighbour.next = theNewLink;
		return true;		
		
	}
	
	public void insertInFirstPositions(String homeOwnerName,int houseNumber){
		
		Neighbour theNewLink = new Neighbour(homeOwnerName, houseNumber);
		
		if(isEmpty()){
			lastLink = theNewLink;
		}else{
			firstLink.previous = theNewLink;
		}
		
		theNewLink.next = firstLink;
		firstLink = theNewLink;
	}
	
	public void insertInLastPositions(String homeOwnerName,int houseNumber){
		
		Neighbour theNewLink = new Neighbour(homeOwnerName, houseNumber);
		
		if(isEmpty()){
			firstLink = theNewLink;
		}else{
			
			lastLink.next = theNewLink;
			
			theNewLink.previous = lastLink;
			
		}
			lastLink = theNewLink;
		
	}
	
	public boolean isEmpty(){
		return (firstLink == null);
	}
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList DL = new DoublyLinkedList();
		
		DL.insertInFirstPositions("Yogesh", 7);
		DL.insertInFirstPositions("Naik", 8);
		DL.insertInLastPositions("Gowarikar", 9);
		DL.insertInFirstPositions("Yash Chopra", 11);
		
		DL.insertAfterKeys("Amruta Borje", 15, 8);
		DL.display();
	}
	
	public void display(){
		Neighbour theLink = firstLink;
		
		while(theLink != null){
			theLink.display();
			System.out.println("Next Link "+theLink.next);
			theLink = theLink.next;
			
			System.out.println();
		}
	}
	
}

//Class Neighbour
class Neighbour{
	
	String homeOwnerName;
	int houseNumber;
	
	Neighbour previous;
	Neighbour next;
	
	public Neighbour(String homeOwnerName,int houseNumber){
				
		this.homeOwnerName = homeOwnerName;
		this.houseNumber = houseNumber;
	}
	
	public void display(){
		System.out.println(homeOwnerName + ": " + houseNumber +" :" + "private drive");
	}
	
	public String toString(){
		return homeOwnerName;
	}
}