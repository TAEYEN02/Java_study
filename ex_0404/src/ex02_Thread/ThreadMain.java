package ex02_Thread;

public class ThreadMain {
	public static void main(String[] args) {
	
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		//Runable은 인터페이스로 start메서드가 없어서 새로운 Thread를 만들어서 사용
 		RunableTest t2 = new RunableTest();
		Thread t = new Thread(t2);
		t.start();
		
		for(int i=0; i<10;i++) {
			System.out.println("mian 진행중 "+i);
		}
		
		
	}
}
