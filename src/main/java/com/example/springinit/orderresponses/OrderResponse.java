package com.example.springinit.orderresponses;

public class OrderResponse {
	    private String message;
	    private Boolean status;

	    public OrderResponse(String message, Boolean status) {
	        this.message = message;
	        this.status = status;
	    }

	    public OrderResponse() {
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public Boolean getStatus() {
	        return status;
	    }

	    public void setStatus(Boolean status) {
	        this.status = status;
	    }

	    @Override
	    public String toString() {
	        return "OrderResponse [message=" + message + ", status=" + status + "]";
	    }
}
