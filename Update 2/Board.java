public class Board<T> {
	private Element first; 
	private static int numOfElmt; 
	
	public class Element { 
		private T box; 
		private int post; 
		private Element next; 
		
		public Element(T box, int post) { 
			this.box = box; 
			this.post = post; 
			this.next = null;
		}
	}
	
	public Board() { 
	this.first = null; 
	this.numOfElmt = 0; 
	}
	
	public void add(T box) { 
		if (this.first == null) { 
			this.first = new Element(box, 1); 
		}
		else {
			Element temp = this.first; 
			for (int i = 0; i < this.numOfElmt - 1; i++) { 
				temp = temp.next; 
			}
		temp.next = new Element(box, this.numOfElmt);
		}
	numOfElmt++; 
	}
	
	public T get(int post) {
		Element temp = this.first; 
		for (int i = 0; i < post; i++) { 
			temp = temp.next; 
		}
		return temp.box;		
	}	
}
