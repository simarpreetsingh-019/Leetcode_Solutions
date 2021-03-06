class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Because from and to is between 0 and 1000. Idea is to store counts in an array of size 1001.
        int lengthOfTrip[] = new int[1001];
        for (int trip[] : trips){
            lengthOfTrip[trip[1]] += trip[0]; // Increment when passenger is on board
            lengthOfTrip[trip[2]] -= trip[0]; // decrement when they depart
        }
		// Count total passenger for each bus top
        int carLoad = 0;
        // we have the count array, we perform a line sweep from 0 to 1000 and track its total
        for (int i = 0; i < 1001; i++){
            carLoad += lengthOfTrip[i];
			// Reject when the car is overloaded somewhere
            if(carLoad > capacity) return false;
        }

        return true; // Accept only if all trip is safe
    }
}

// class Solution {
//     public boolean carPooling(int[][] trips, int capacity) {
//         int[] highway = new int[1001];
        
//         for(int trip[] : trips)
//         {
//             highway[trip[1]] += trip[0];
//             highway[trip[2]] -= trip[0];
//         }
        
//         for(int i =1; i<= last_loc; i++)
//         {
//             highway[i] += highway[i-1];
//             if(highway[i] > capacity)
//             {
//                 return false;
//             }
//         }
//         return true;
        
//     }
// }