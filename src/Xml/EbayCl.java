package Xml;

public class EbayCl {
	private String seller_name;
    private String seller_rating;
    private String payment_types;
    private String shipping_info;
    private String current_bid;
    private String time_left;
    private String bidder_name;
    private String bidder_rating;
    private String location;
    private String description;

    
    public EbayCl(String seller_name,String description)
    {
    	this.setSeller_name(seller_name);
    	this.setDescription(description);
    	}

    public EbayCl(String seller_name,String seller_rating,
     String payment_types,
     String shipping_info,
    String current_bid,
    String time_left,
     String bidder_name,
     String bidder_rating, String location, String description) 
    {
    	this.setSeller_name(seller_name);
        this.setSeller_rating(seller_rating);
        this.setPayment_types(payment_types);
        this.setShipping_info(shipping_info);
        this.setCurrent_bid(current_bid);
        this.setTime_left(time_left);
        this.setBidder_name(bidder_name);
        this.setBidder_rating(bidder_rating);
        this.setLocation(location);
        this.setDescription(description);
    }

	public String getSeller_rating() {
		return seller_rating;
	}

	public void setSeller_rating(String seller_rating) {
		this.seller_rating = seller_rating;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getPayment_types() {
		return payment_types;
	}

	public void setPayment_types(String payment_types) {
		this.payment_types = payment_types;
	}

	public String getShipping_info() {
		return shipping_info;
	}

	public void setShipping_info(String shipping_info) {
		this.shipping_info = shipping_info;
	}

	public String getCurrent_bid() {
		return current_bid;
	}

	public void setCurrent_bid(String current_bid) {
		this.current_bid = current_bid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBidder_rating() {
		return bidder_rating;
	}

	public void setBidder_rating(String bidder_rating) {
		this.bidder_rating = bidder_rating;
	}

	public String getBidder_name() {
		return bidder_name;
	}

	public void setBidder_name(String bidder_name) {
		this.bidder_name = bidder_name;
	}

	public String getTime_left() {
		return time_left;
	}

	public void setTime_left(String time_left) {
		this.time_left = time_left;
	}
	//@Override
	  //  public String toString() {
	    //        return "<" + seller_name + ", " + description+ seller_name + ", " + description+seller_name + ", " + description+seller_name + ", " + description+seller_name + ", " + description+">";
	    //}
}