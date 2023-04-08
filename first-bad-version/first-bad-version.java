/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int start = 1;
		int end   = n;
		int mid  = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;

			boolean check = isBadVersion(mid);

			if (check == true) {
				end = mid-1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}