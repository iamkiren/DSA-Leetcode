class Solution {
	public int mySqrt(int x) {
		if (x == 0) return 0;
		int start = 1;
		int end   = x;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			long square = (long) mid * mid; // Use long data type to avoid integer overflow
			if (square == x) {
				return mid;
			}

			if (square > x) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return end;
	}
}