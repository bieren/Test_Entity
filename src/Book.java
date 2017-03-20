
public class Book {

	private String name;
	
	/**
	 * 金额
	 */
	private Money money; 
	
	/**
	 * 拥有者
	 */
	private Customer partyRole;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public Customer getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(Customer partyRole) {
		this.partyRole = partyRole;
	}
	
	
	
}
