package programming;


import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

public class lrucache {
	
	static public class LRUcache{
		static Deque<Integer> dq;
		static HashSet<Integer>map;
		static int cache_size;
		LRUcache(int size){
			dq=new LinkedList<Integer>();
			map=new HashSet<Integer>();
			cache_size=size;
		}
		
		public void refer(int x) {
			if(!map.contains(x)) {
				if(dq.size()==cache_size) {
					int last=dq.removeLast();
					map.remove(last);
				}
			}
			else {
				int index=0,i=0;
				Iterator<Integer> itr=dq.iterator();
				while(itr.hasNext()) {
					if(itr.next()==x) {
						index=i;
						break;
					}
					
					i++;
				}
				dq.remove(index);
			}
			dq.push(x);
			map.add(x);
		}
		
		public void display() {
			Iterator<Integer>itr =dq.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		LRUcache cache1=new LRUcache(4);
		cache1.refer(1);
		cache1.refer(2);
		cache1.refer(3);
		cache1.refer(1);
		cache1.refer(4);
		cache1.refer(5);
		cache1.display();
	}
}
