package org.earnie;


public class Relative {
 
	private String name;

	private Relative spouse;

	private int random;

	private Relative giftee;

	private boolean gifted;
	
	private boolean next = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Relative getSpouse() {
		return spouse;
	}

	public void setSpouse(Relative spouse) {
		this.spouse = spouse;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public Relative getGiftee() {
		return giftee;
	}

	public void setGiftee(Relative giftee) {
		this.giftee = giftee;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Relative [name=" + name + /* ", spouse=" + spouse + */ ", random="
				+ random + ", gifted=" + gifted + ", giftee=" + (giftee == null ? "null" : giftee.name) + "]";
	}

	public Relative(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relative other = (Relative) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
