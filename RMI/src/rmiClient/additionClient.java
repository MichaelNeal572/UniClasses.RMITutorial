package rmiClient;

import java.rmi.Naming;

public class additionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			additionInterface add=(additionInterface)Naming.lookup("rmi://localhost/Mike");
			System.out.println(add.add(2, 2));
			
		}catch(Exception s) {
			System.out.println(s);
		}
	}

}
