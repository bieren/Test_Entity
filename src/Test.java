import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Test {

	
	
	
	
	
	
	
	
	
	
	
	
	
	@org.junit.Test
	public void test01(){
		
//		System.out.println("11111111111111111");
		
		Customer customer = new Customer();
		
		
		List<Book> books = new ArrayList<>();
//		book.setPartyRole(customer);
		for (int i = 0; i < 5; i++) {
			Money money = new Money();
			money.setAmount(i*1000);
			money.setNuit("分");

			
			Book book = new Book();
			book.setName("三生道诀_"+i);
			book.setMoney(money);	
			books.add(book);
		}
		
		
		Money balance = new Money();
		balance.setNuit("分");
		balance.setAmount(10000000);
		
		
		
		
		
		customer.setBalance(balance);
		customer.setId("1");
		customer.setBooks(books);
		customer.setName("三司使");
		Map<String, Object> map = new HashMap<>();
		map.put("手机号", "13800138000");
		
		
		customer.setOther(map);
		Map<String, Object> map2 =new HashMap<>();
		map2.put("customer", customer);
		Gson gson = new Gson();
		
		String json = gson.toJson(customer);
		
		
		
		System.out.println(customer);
		System.out.println(json);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
