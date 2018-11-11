
package chainPattern;

public class DivNumbers implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationwanted() == "div") {
			//System.out.println((requests.getNumber1() + "/" + requests.getNumber2() + "=" + (requests.getNumber1() / requests.getNumber2())));
			return (requests.getNumber1() / requests.getNumber2());
			}
		else {
			System.out.print("Only add, sub, multiply, div will be accepted");
		}
		return 0;
	}

}