package ex01_innerClass;

interface buttonClickListner {
	public void Click();
}

public class AnnonymousExample {
	//내부클래스 Button
	public class Button {
		//interface타입의 변수를 가짐
		//인터페이스의 구현체는 다 들어올 수 있다.
		private buttonClickListner listener;
		
		//멤버변수는 private로 지정하는 일이 많기 때문에 직접 접근하는 것이 불가능하다
		//public으로 된 메서드를 통해 접근을 하는 일이 많다
		//setter & getter로 접근
		
		public void setListener(buttonClickListner listener) {
			this.listener = listener;
		}

		public void Click() {
			if (listener != null) {
				this.listener.Click();
			}
		}
	}

	public static void main(String[] args) {
		//외부클래스의 객체
		AnnonymousExample exam = new AnnonymousExample();
		//내부클래스의 객체(외부클래스의 객체로부터 생성)
		AnnonymousExample.Button button = exam.new Button();
		
		//private라 직접접근이 안됨 (private buttonClickListner listener)
		//setter을 사용해서 받아가지고 private 변수에 넘겨주는 거
		//이 받은 값을 class를 만들어서 호출.
		//하지만 한번만 쓸 거 이기 때문에 이름없는 하나의 class를 생성. (익명클래스)
		button.setListener(new buttonClickListner() {		
			@Override
			public void Click() {
				System.out.println("버튼이 눌렸습니다");
			}
		}); // => 이름이 없는 ButtonClickListenr class의 역할을 한다

		button.Click();
		
	}
}
