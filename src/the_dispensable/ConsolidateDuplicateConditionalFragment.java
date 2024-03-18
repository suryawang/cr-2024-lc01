package the_dispensable;

public class ConsolidateDuplicateConditionalFragment {
	boolean isSpecialDeal() {return true;}
	void validateEmailAddress() {/**/}
	void sendEmail() {/**/}
	private int price;
	double sendEmailPromotion() {
		double total;
		if (isSpecialDeal()) {
			total = price * 0.95;
		} else {
			total = price * 0.98;
		}
		validateEmailAddress();
		sendEmail();
		return total;
	}
}
