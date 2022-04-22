class Pair {
    
    int i;
    int val;
   
   public Pair (int val , int i){
       this.val = val;
       this.i = i;
   }
   
}

class StudentComparator implements Comparator<Pair>{
   
   public int compare(Pair s1, Pair s2){
       return  s2.val - s1.val;
   }
   
}

class Solution {
   
   public List<Integer> findClosestElements(int[] arr, int k, int x) {
       
       List<Integer> arrList = new ArrayList<>();
       PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new StudentComparator());
       
       
       for(int i = 0; i < k; i++){
           // System.out.println(Math.abs(arr[i]-x));
             Pair pair = new Pair(Math.abs(arr[i]-x),i);
           pq.add(pair);
           
       }
       
       for(int i = k ; i < arr.length; i++){
           Pair pair = new Pair(Math.abs(arr[i]-x),i);
           
           Pair check = pq.peek();
           
           if(check.val>pair.val){
               pq.poll();
               pq.add(pair);
           }          
       }
       
       
       while(pq.size()>0){
           
           Pair pr = pq.poll();
           
           arrList.add(arr[pr.i]);
           
       }
   
       Collections.sort(arrList);
       return arrList;
       
       
                  
   }
}