package ex05_enum;

public enum OrderStatus {
	ORDERD {
		@Override
		public OrderStatus next() {
			return SHIPPED ;
		}
	}, SHIPPED {
		@Override
		public OrderStatus next() {
			return DELIVERED;
		}
	}, DELIVERED {
		@Override
		public OrderStatus next() {
			return this;
		}
	};

	protected abstract OrderStatus next(); 
}
