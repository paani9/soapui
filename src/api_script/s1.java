package api_script;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class s1 {
	public static void main(String[] args)
	{
		CountryInfoService c=new CountryInfoService();
		CountryInfoServiceSoapType a1=c.getCountryInfoServiceSoap();
		System.out.println(a1.capitalCity("IN"));
		System.out.println(a1.countryFlag("IN"));
	}

}
