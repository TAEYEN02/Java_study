package ex_0401_ex03_Map;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Order {
	public static void main(String[] args) {
		
//		가장 많이 주문된 상품 구하기
//		각 사용자는 여러 상품을 주문할 수 있으며
//		주문내역은 ArrayList에 문자열 형태로 저장되고
//		"사용자 이름 : 상품이름" 형태로 저장된다
//
//		가장 많이 주문된 상품 이름과 주문 수량을 출력하세요
//		List<String>orders = Arrays.asList(" Alice: TV", "Bob:TV","Alice:Phone","Charlie:TV","David:Tablet","Eve:Phone","Frank:Phone","Alice:Phone");
//
//		결과 Phone = 4
		
		List<String>orders = Arrays.asList("Alice:TV","Bob:TV","Alice:Phone","Charlie:TV","David:Tablet","Eve:Phone","Frank:Phone","Alice:Phone");
		
		HashMap<String, Integer> best = new HashMap<String, Integer>();
		

		for(int i = 0;i<orders.size();i++) {
			String[] product =orders.get(i).split(":");
			if(product.length==2) {
				String p = product[1];
				best.put(p, best.getOrDefault(p, 0)+1);
			}
		}

	    String mostOrderedProduct = null;
        int maxCount = 0;

        for (String key : best.keySet()) { 
            int count = best.get(key);
            if (count > maxCount) {
                mostOrderedProduct = key;
                maxCount = count;
            }
        }
        

        System.out.println("가장 많이 주문된 상품: " + mostOrderedProduct + " = " + maxCount);
		
	
	}
}
