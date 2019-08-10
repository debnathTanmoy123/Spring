package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInterest implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method m, Object[] param) throws Throwable {
		System.out.println("new calculate class new calc interest ");
		return null;
	}

}
