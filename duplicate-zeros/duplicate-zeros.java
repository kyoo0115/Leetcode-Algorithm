class Solution {
    public static void duplicateZeros(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                q.add(0);
                q.add(0);
            } else {
                q.add(arr[i]);
            }
            Integer first = q.poll();
            arr[i] = first;
        }
    }
}