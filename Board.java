public class Board<T, P> {
	private Element first; 
	private static int lastNum; 
	
	public class Element { 
		private T box; 
		private P post; 
		private Element next; 
		
		public Element(T box, P post) { 
			this.box = box; 
			this.post = post; 
			this.next = null;
		}
	}
	
	public Board() { 
	this.first = null; 
	this.lastNum = 0; 
	}
	
	public Board(T box) { 
	this.first = new Element(box, 0); 
	this.lastNum = 0; 
	}
	
	public void add(T box) { 
		Element temp = this.first; 
		for (int i = 0; i < this.lastNum; i++) { 
			temp = temp.next; 
		}
		temp.next = new Element(box, this.lastNum + 1); 
		lastNum++; 
	}
	
	public T get(P post) {
		Element temp = this.first; 
		while (!temp.post.equals(post)) { 
			temp = temp.next; 
		}
		return temp.box;		
	}	
}