package accessModifier;

public class Access {
	private int privateNum = 10;//accessible in same class
	int defaultNum;
	protected int protectNum;
	public int publicNum;
	int getPrivateNum() {//private can be accessed outside using getter (loophole)
		return this.privateNum;
	}
}
