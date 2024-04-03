package tom.junit;

import java.util.Objects;

public class Money {
	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	
	public int amount() {
		return fAmount;
	}
	
	public String currency() {
		return fCurrency;
	}
	
	public Money add(Money m) {
		return new Money(amount() + m.amount(), currency());
	}
	
	@Override
	public boolean equals(Object objet) {
	    if (this == objet)
	        return true;
	    if (objet == null || getClass() != objet.getClass())
	        return false;
	    Money autre = (Money) objet;
	    return fAmount == autre.fAmount && Objects.equals(fCurrency, autre.fCurrency);
	}

}
