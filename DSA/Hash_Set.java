package DSA;
import java.util.*;

// Creating the Hash map data structure Class 
class HashMapImplementation{
	
	// Creating the static class for which we going to make objects
	static class Hash_Map<K , V>{
		
		class Node{
			K key;
			V value;	
			Node(K key , V value){
				this.key = key;
				this.value = value;
			}
		}
		
		private int n ;// Number of Nodes present in the Linked list 
		private int N;// Number of buckets i.e Length of the array
		private LinkedList<Node> bucket[] ;
		
		@SuppressWarnings("unchecked")
		Hash_Map(){
			this.N = 4;
			this.bucket = new LinkedList[N];
			for(int i = 0 ; i < N ; i++) {
				bucket[i]  = new LinkedList<Node>();
			}
		}
		
		private int HashCode(K key) {
			
			int bi  = key.hashCode();
			return bi % N;

		}
		private int searchInLL( K key, int bi) {
			LinkedList<Node> ll = bucket[bi];
			for(int i =0 ; i < ll.size() ; i++) {
				if(ll.get(i).key == key) {
					return i;
				}
			}
			
			return -1;
			
		}
		
		private void rehashing() {
			LinkedList<Node> temp[] = bucket;
			
			bucket = new LinkedList[N * 2];
			
			for(int i =0 ; i < N*2 ; i++) {
				bucket[i] = new LinkedList<>();
			}
			
			for(int j =0 ; j < temp.length ; j++) {
				LinkedList<Node> ll = temp[j];
				for(int i = 0 ; i < ll.size() ; i++) {
					Node node = ll.get(i);
					put(node.key , node.value);
				}
				
			}
			
		} 
		public void put( K key , V value) {
			
			//Obtainig the bi (bucket index ) using the hashCode function
			int bi = HashCode(key);
			
			//for searching the di(data index) present at that Bucket index in that LinkedList
			int di = searchInLL(key , bi);
			
			if(di == -1) {// key is not present
				bucket[bi].add(new Node (key , value));
				n++;// incrementing the value of Nodes
			}
			else {
				
				// if the key is present in the linkedlist
				Node data = bucket[bi].get(di);
				data.value = value;		
			}	
			double labda =(double) n / N ;		
			if(labda > 2.00) {
				rehashing();
			}
		}
		public int getKey(V value) {
			
			return 0;
		}
    }
}

 public class Hash_Set {
	 
	 public static String unionOfSet(int num1[] , int[] num2) {
		 
		 int[] res = new int[num1.length + num2.length];
		 HashSet<Integer> hash1 = new HashSet<>();
		 for(int i : num1) {
			 hash1.add(i);
		 }
		 
		 for(int i : num2) {
			 hash1.add(i);
		 }

		return hash1.toString(); 
	 }
	 
	 public static String intersectionOfSet(int[] num1 , int[] num2) {
		 HashSet<Integer> hash = new  HashSet<>();
		 HashSet<Integer> result = new  HashSet<>();
		 
		 for(int n : num1) {
			 hash.add(n);
		 }
		 for(int i : num2) {
			 if(hash.contains(i)) {
				 result.add(i);
			 }
		 }
		 
		 System.out.println(result.size());
		 return result.toString();
	 }
 	public static void main(String [] args) {
		
//		DSA.HashMapImplementation.Hash_Map<String , Integer> hash = new DSA.HashMapImplementation.Hash_Map<>();
//		hash.put("Muktainagar", 7);
//		hash.put("Jalgaon" , 60);
//		hash.put("Bhusawal", 33);
//		
//		HashSet<Integer> set = new HashSet<>();
//		set.add(4);
//		set.add(5);
//		set.add(8);
//		set.add(6);
//		set.add(7);
//		set.add(9);
//		System.out.println(set);
//		
//		System.out.println(set.contains(1));
//		
//		Iterator<Integer> it = set.iterator();
//		System.out.println(it.hasNext());
//		System.out.print("[");
//		while(it.hasNext()) {
//			System.out.print(it.next());
//			if(it.hasNext()) {
//				
//				System.out.print(" ,");
//			}
//		}
//		System.out.print("]");
//		System.out.println();
//		
//		HashMap<String , Integer> result = new HashMap<>();
//		result.put("Maths", 58);
//		result.put("Physics", 74);
//		result.put("Computer", 99);
//		result.put("Chemistry", 66);
//		
//		if(result.containsKey(74)) {
//			System.out.println(result.getOrDefault(74 ,-1));
//		}
//		System.out.println(result);
//		System.out.println(result.containsValue(56));
//		System.out.println(result.containsKey("Maths"));
//		result.remove("Physics");
//		
//		for(Map.Entry<String , Integer> e : result.entrySet()) {
//			System.out.println(e.getKey() +" "+ e.getValue());
//		}
//		
//		result.remove(66);
//		System.out.println(result);
		
		
		int[] num1 = {1,2,3,4,3,2,5 ,43};
		int[] num2 = {5,4,7,6,43,9};
		
		// Method for Finding the union of to array
		System.out.println(unionOfSet(num1 , num2));
		
		System.out.println(intersectionOfSet(num1,num2));
		
		
		
		
		
    }

}
