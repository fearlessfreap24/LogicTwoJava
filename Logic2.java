// Medium boolean logic puzzles -- if else && || !


public class Logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic2 start = new Logic2();
		Methods1 m1 = new Methods1();
		start.run(m1);
	}

	private void run(Methods1 m1) {

//		int[][] nums1 = { {3, 1, 8}, {3, 1, 9}, {3, 2, 10}, {6, 1, 11}, {7, 1, 11} };
//		for ( int[] nums : nums1 ) {
//			System.out.printf("small = %d, big = %d, goal = %d : %b\n", nums[0], nums[1], nums[2],
//					m1.makeBricks(nums[0], nums[1], nums[2]));
//		}
		
//		int[][] nums2 = { {1, 2, 3}, {3, 2, 3}, {3, 3, 3} };
//		for ( int[] nums : nums2 ) {
//			System.out.printf("a = %d, B = %d, c = %d : %d\n", nums[0], nums[1], nums[2],
//					m1.loneSum(nums[0], nums[1], nums[2]));
//		}
		
//		int[][] nums3 = { {1, 2, 3}, {1, 2, 13}, {1, 13, 2} };
//		for ( int[] nums : nums3 ) {
//			System.out.printf("a = %d, b = %d, c = %d : %d\n", nums[0], nums[1], nums[2],
//					m1.luckySum(nums[0], nums[1], nums[2]));
//		}
		
//		int[][] nums4 = { {1, 2, 3}, {2, 13, 1}, {2, 1, 14} };
//		for ( int[] nums : nums4 ) {
//			System.out.printf("a = %d, b = %d, c = %d : %d\n", nums[0], nums[1], nums[2],
//					m1.noTeenSum(nums[0], nums[1], nums[2]));
//		}
		
//		int[][] nums5 = { {16, 17, 18}, {12, 13, 14}, {6, 4, 4} };
//		for ( int[] nums : nums5 ) {
//			System.out.printf("a = %d, b = %d, c = %d : %d\n", nums[0], nums[1], nums[2],
//					m1.roundSum(nums[0], nums[1], nums[2]));
//		}
		
//		int[][] nums6 = { {1, 2, 10}, {1, 2, 3}, {4, 1, 3}, {10, 10, 8} };
//		for ( int[] nums : nums6 ) {
//			System.out.printf("a = %d, b = %d, c = %d : %b\n", nums[0], nums[1], nums[2],
//					m1.closeFar(nums[0], nums[1], nums[2]));
//		}
		
//		int[][] nums7 = { {19, 21}, {21, 19}, {19, 22}, {1, 2}, {17, 19} };
//		for ( int[] nums : nums7 ) {
//			System.out.printf("a = %d, b = %d : %d\n", nums[0], nums[1],
//					m1.blackjack(nums[0], nums[1]));
//		}
		
//		int[][] nums8 = { {2, 4, 6}, {4, 6, 2}, {4, 6, 3} };
//		for ( int[] nums : nums8 ) {
//			System.out.printf("a = %d, b = %d, c = %d : %b\n", nums[0], nums[1], nums[2], 
//					m1.evenlySpaced(nums[0], nums[1], nums[2]));
//		}
		
		int[][] nums9 = { {4, 1, 9}, {4, 1, 10}, { 4, 1, 7}, {3, 1, 9}, {1, 2, 7}, {6, 1, 10} };
		for ( int[] nums : nums9 ) {
			System.out.printf("small = %d, big = %d, goal = %d : %d\n", nums[0], nums[1], nums[2],
					m1.makeChocolate(nums[0], nums[1], nums[2]));
		}
	}

}
