package lab10.builder;

import java.util.ArrayList;

public class House {

	// TODO: write optional and mandatory facilities to have in a house

	//mandatory
	private String location = "";
	private int floors;
	private int rooms;
	private int surface;

	//optional
	private String electronics = "";
	private String pool = "";
	private String security = "";




	// TODO: complete the private constructor
	private House(HouseBuilder builder) {
		this.location = builder.location;
		this.floors = builder.floors;
		this.rooms = builder.rooms;
		this.surface = builder.surface;
		this.electronics = builder.electronics;
		this.pool = builder.pool;
		this.security = builder.security;
	}

	// TODO: generate getters

	public String getLocation() {
		return location;
	}

	public int getFloors() {
		return floors;
	}

	public int getRooms() {
		return rooms;
	}

	public int getSurface() {
		return surface;
	}

	public String getElectronics() {
		return electronics;
	}

	public String getPool() {
		return pool;
	}

	public String getSecurity() {
		return security;
	}




	// TODO: override toString method


	@Override
	public String toString() {
		return "House{" +
				"location='" + location + '\'' +
				", floors=" + floors +
				", rooms=" + rooms +
				", surface=" + surface +
				", electronics='" + electronics + '\'' +
				", pool='" + pool + '\'' +
				", security='" + security + '\'' +
				'}';
	}

	public static class HouseBuilder {

		// TODO: write same facilities

		//mandatory
		private String location = "";
		private int floors;
		private int rooms;
		private int surface;

		//optional
		private String electronics = "";
		private String pool = "";
		private String security = "";


		// TODO: complete the house builder constructor only with the mandatory facilities
		public HouseBuilder(String location, int floors, int rooms, int surface) {
			this.floors = floors;
			this.rooms = rooms;
			this.surface = surface;
		}

		// TODO: add the optional facilities in a builder design

		public HouseBuilder electronics(String electronics){
			this.electronics = electronics;
			return this;
		}

		public HouseBuilder pool(String pool){
			this.pool = pool;
			return this;
		}

		public HouseBuilder security(String security){
			this.security = security;
			return this;
		}


		// TODO: complete the final build method
		public House build() {

			return new House(this);
		}

		// TODO: test functionality in a Main class
	}
}
