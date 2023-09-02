class Solution {

    public  int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums2.length; i++) {
			// if the stack is not empty and the new element is greater than stack's top element, then add this to hashMap 
			while (!stack.empty() && nums2[i] > stack.peek())
				map.put(stack.pop(), nums2[i]);  

			stack.push(nums2[i]);
		}
		
		// if there are elements in the stack for which we didn't find a greater number, map them to -1
		while (!stack.empty())
			map.put(stack.pop(), -1);

		int[] res = new int[nums1.length];
		// copy next greater elements to the output array
		// based on the requirement in nums1
		for (int i = 0; i < nums1.length; i++) {
			res[i] = map.get(nums1[i]);
		}
																				
		return res;
	}
}