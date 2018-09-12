package com.example.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(value = "parking")
public class ParkingResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingResourceApplication.class, args);
	}

	@RequestMapping(value = "/parkingProposalSearch",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BookingProposal>> viewParking()
	{
		List<BookingProposal> bookingProposals = new ArrayList<>();
		BookingProposal bookingProposal = new BookingProposal();
		bookingProposal.setId("a102e229-f43c-4b40-ab06-c152552fff9a");
		bookingProposal.setParkingResourceId("f25fa83e-cb4e-484c-a8cf-8ee72744791f");
		bookingProposal.setAmount("1.38");
		bookingProposal.setCurrency("EUR");
		bookingProposal.setFrom("2018-09-12T06:45:00.390Z");
		bookingProposal.setLatitude("51.88499999999999801048033987171947956085205078125");
		bookingProposal.setLongitude("5.43672000000000021913137970841489732265472412109375");
		bookingProposal.setName("Westluidensepoort");
		bookingProposal.setUntil("2018-09-12T07:45:00.390Z");

		BookingProposal bookingProposal1 = new BookingProposal();
		bookingProposal1.setId("a102e229-f43c-4b40-ab06-c152552fff9a");
		bookingProposal1.setParkingResourceId("f25fa83e-cb4e-484c-a8cf-8ee72744791f");
		bookingProposal1.setAmount("1.38");
		bookingProposal1.setCurrency("EUR");
		bookingProposal1.setFrom("2018-09-12T06:45:00.390Z");
		bookingProposal1.setLatitude("51.88499999999999801048033987171947956085205078125");
		bookingProposal1.setLongitude("5.43672000000000021913137970841489732265472412109375");
		bookingProposal1.setName("Waalkade");
		bookingProposal1.setUntil("2018-09-12T07:45:00.390Z");

		bookingProposals.add(bookingProposal);
		bookingProposals.add(bookingProposal1);

		return ResponseEntity.accepted().body(bookingProposals);
	}

	private class BookingProposal{

		private String id;

		private String name;

		private String parkingResourceId;

		private String description;

		private String pic;

		private String from;

		private String until;

		private String amount;

		private String currency;

		private String latitude;

		private String longitude;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParkingResourceId() {
			return parkingResourceId;
		}

		public void setParkingResourceId(String parkingResourceId) {
			this.parkingResourceId = parkingResourceId;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPic() {
			return pic;
		}

		public void setPic(String pic) {
			this.pic = pic;
		}

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getUntil() {
			return until;
		}

		public void setUntil(String until) {
			this.until = until;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
	}
}
