package market;

import java.time.LocalDate;

public class Vegetable extends Product implements Consumable {

	public Vegetable(String name, Double unitPrice, String unite, Double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unite, stockQuantity, pickingDate, shelfLifeDays);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isRipe() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExpired(LocalDate dateVerification) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LocalDate calculateExpirationDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
