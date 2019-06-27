package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatusEnum;

public class OrderEnum {
	
		private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		private Date moment;
		private OrderStatusEnum status;
		
		private Client client;
		private List<OrderItemEnum> items = new ArrayList<>();
		
		public OrderEnum(Date moment, OrderStatusEnum status, Client client) {
			this.moment = moment;
			this.status = status;
			this.client = client;
		}

		public Date getMoment() {
			return moment;
		}

		public void setMoment(Date moment) {
			this.moment = moment;
		}

		public OrderStatusEnum getStatus() {
			return status;
		}

		public void setStatus(OrderStatusEnum status) {
			this.status = status;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public List<OrderItemEnum> getItems() {
			return items;
		}
		
		public void addItem(OrderItemEnum item) {
			items.add(item);
		}

		public void removeItem(OrderItemEnum item) {
			items.remove(item);
		}
		
		public double total() {
			double sum = 0.0;
			for (OrderItemEnum item : items) {
				sum += item.subTotal();
			}
			return sum;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Order moment: ");
			sb.append(sdf.format(moment) + "\n");
			sb.append("Order status: ");
			sb.append(status + "\n");
			sb.append("Client: ");
			sb.append(client + "\n");
			sb.append("Order items:\n");
			for (OrderItemEnum item : items) {
				sb.append(item + "\n");
			}
			sb.append("Total price: $");
			sb.append(String.format("%.2f", total()));
			return sb.toString();
		}
	}

