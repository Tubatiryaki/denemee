package junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J06DisplayName {
	
	@Test
	//Test ismi aşağıdaki annnotasyon ile görünmek istediği şekilde değiştirilebilir.
	@DisplayName("Test parseInt() to check if it is throwing for non digit value")
	void testException() {
		String str="Merhaba";
		
		assertThrows(NumberFormatException.class, ()->{
			Integer.parseInt(str);
		});
	}

}
