package ex01_Thread;

public class ThreadCount extends Thread {

	private int count;

	// 1. 생성자를 통해 전달한다
//	public ThreadCount(int count) {
//		this.count = count;
//	}
	// 2. setter을 통해 받는다.
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		try {
			for (int i = count; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("종료");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
