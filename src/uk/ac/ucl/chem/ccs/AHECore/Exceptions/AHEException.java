package uk.ac.ucl.chem.ccs.AHECore.Exceptions;

public class AHEException extends Exception {

	public AHEException(String msg){
		super(msg);
	}
	
	public AHEException(){
		super();
	}
	
	public AHEException(Throwable e){
		super(e);
	}
	
}
