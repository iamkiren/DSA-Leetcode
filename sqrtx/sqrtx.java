class Solution {
	public int mySqrt(int x) {
		if (x < 2) {
			return x;
		}
		int start = 2, end = x / 2;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			long sq = (long) mid * mid;// Use long data type to avoid integer overflow
			if (sq > x)
				end = mid - 1;
			else if (sq < x)
				start = mid + 1;
			else
				return mid;
		}
		return end;
	}
}