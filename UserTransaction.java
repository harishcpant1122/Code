package USBAssignment.USBAssignment;

import java.util.Comparator;

public class UserTransaction implements Comparable<UserTransaction>{
	
	private int transactionId;
	private int amount;
	private String transactionType;
	private String status;
	
	public UserTransaction(int transactionId, int amount, String transactionType, String status) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		this.status =status;		
	}
	

	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	@Override
	public int compareTo(UserTransaction o) {
		return this.transactionId-o.transactionId;
	}
	
	
	public static Comparator<UserTransaction> AmountComparator = new Comparator<UserTransaction>() {
        @Override
        public int compare(UserTransaction u1, UserTransaction u2) {
            return u1.getAmount() - u2.getAmount();
        }
    };
    
    public static Comparator<UserTransaction> TransactionTypeComparator = new Comparator<UserTransaction>() {
        @Override
        public int compare(UserTransaction u1, UserTransaction u2) {
            return u1.getTransactionType().compareTo(u2.getTransactionType());
        }
    };
    
    
    public static Comparator<UserTransaction> StatusComparator = new Comparator<UserTransaction>() {
        @Override
        public int compare(UserTransaction u1, UserTransaction u2) {
            return u1.getStatus().compareTo(u2.getStatus());
        }
    };
    
	@Override
	public String toString() {
		String toString = "[TransactionId=" + this.transactionId + ", amount=" + this.amount + ", Transaction Type=" + this.transactionType + ", Status=" +
                this.status + "]";
		return toString;
	}
}


