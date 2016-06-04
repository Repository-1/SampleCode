package JavaConcepts;

public class constructor
{
	private String acnt;
	private double balance;
	private int num;
	private String Name;
	public constructor()
	{
		System.out.println("empty constructor");
	}
	public constructor(String acnt, double balance, int num, String Name)
	{
		System.out.println("Construtor with parameters" );
		this.acnt=acnt;
	}
	public String getAcnt() {
		return acnt;
	}
	public void setAcnt(String acnt) {
		this.acnt = acnt;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}