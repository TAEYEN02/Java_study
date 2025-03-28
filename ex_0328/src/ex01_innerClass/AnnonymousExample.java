package ex01_innerClass;

interface buttonClickListner {
	public void Click();
}

public class AnnonymousExample {
	public class Button {
		private buttonClickListner listener;

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
		AnnonymousExample exam = new AnnonymousExample();
		AnnonymousExample.Button button = exam.new Button();

		button.setListener(new buttonClickListner() {		
			@Override
			public void Click() {
				System.out.println("버튼이 눌렸습니다");
			}
		}); // => 이름이 없는 ButtonClickListenr class의 역할을 한다

		button.Click();
		
	}
}
