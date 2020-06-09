package USBAssignment.USBAssignment;

import java.util.Arrays;

public class SortingProblemMain {

	public static void main(String[] args) {
		
		UserTransaction u1 = new UserTransaction(363426328, 646, "CREDIT", "APPROVED");
		UserTransaction u2 = new UserTransaction(575757575, 423424, "DEBIT", "DECLINED");
		UserTransaction u3 = new UserTransaction(454332424, 324234, "CHECK", "PENDING");
		UserTransaction u4 = new UserTransaction(124567, 343, "DEBIT", "APPROVED");
		UserTransaction u5 = new UserTransaction(567778, 232, "CHECK", "DECLINED");
		UserTransaction u6 = new UserTransaction(2425637, 546456, "CREDIT", "PENDING");
		
		
		UserTransaction[] userTransactions  = new UserTransaction[6];
		userTransactions[0] = (u1);
		userTransactions[1] = (u2);
		userTransactions[2] = (u3);
		userTransactions[3] = (u4);
		userTransactions[4] = (u5);
		userTransactions[5] = (u6);
		
		
		Arrays.sort(userTransactions);
		
		System.out.println("-----------Sort by Transaction Id--------------------");
		System.out.println(Arrays.toString(userTransactions));
		
		System.out.println("-----------Sort by Amount--------------------");		
		Arrays.sort(userTransactions,UserTransaction.AmountComparator);
		System.out.println(Arrays.toString(userTransactions));
		
		System.out.println("-----------Sort by Transaction Type--------------------");		
		Arrays.sort(userTransactions,UserTransaction.TransactionTypeComparator);
		System.out.println(Arrays.toString(userTransactions));
		
		System.out.println("-----------Sort by Status--------------------");
		Arrays.sort(userTransactions,UserTransaction.StatusComparator);
		System.out.println(Arrays.toString(userTransactions));
	}

}
