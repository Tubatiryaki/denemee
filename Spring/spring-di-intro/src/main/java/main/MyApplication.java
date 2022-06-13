package main;

import service.MessageService;
import service.SMSService;

public class MyApplication {

  public static void main(String[] args) {
	  
	 //İnterface kullandığımız için yeni bir message service'e geçiş yapmak çok kolaylaştı. 
	 //Fakat hala hedef MessageService'i kullanmak için concrete sınıf ismini değiştirmek gerekiyor
	 //aşağıdaki kod örneğinde eğeri yeni bir Service kullanka istersek SMSService sınıfını değiştirmek gerekir.
	  //Hala hard coded kısımlar var. Eğer bir config dosyası olsaydı kolay ca değişiklik yapılabilirdi.
	 MessageService theService=new SMSService();
	 System.out.println(theService.sendMessage());
}

}
