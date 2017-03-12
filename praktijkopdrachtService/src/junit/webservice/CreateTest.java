package junit.webservice;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DefaultNamespace.CrudZonnepaneelSOAPBindingImpl;

public class CreateTest {


	@Test
	public void test() throws RemoteException {
		CrudZonnepaneelSOAPBindingImpl impl = new CrudZonnepaneelSOAPBindingImpl();
		
		String test = "";
		
		test = impl.createZP(12345678, "3344rg");
		
		boolean b = false;
		
		if(test.equals("list created")){
			b =  true;
		}
		assertTrue(b);
		
	}

}
