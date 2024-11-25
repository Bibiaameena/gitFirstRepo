package interfaces;




public class InheritanceOfInterface implements MyInterface, Child {
	InheritanceOfInterface ihi = new InheritanceOfInterface();

	@Override
	public void Bank() {
		// TODO Auto-generated method stub
		MyInterface.super.Bank();
	}
	
}
