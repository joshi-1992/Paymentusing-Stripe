package Stripe.Payment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import java.util.HashMap;
import java.util.Map;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.Token;
import com.stripe.exception.StripeException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws StripeException
    {
    	
       // System.out.println( "Hello World!" );
        Stripe.apiKey = "sk_test_foVYUwHCgg9CQaXxEpsVjaLu";
        
        
       Map < String, Object > customerParameter = new HashMap < String, Object > ();
        customerParameter.put("email","vishaljoshi7574@gmail.com");
         Customer newCustomer  = Customer.create(customerParameter);  
         System.out.println( newCustomer.getId()); 
       
  /*      Customer a  = Customer.retrieve("cus_EMP1l66ctBUsUn"); // adding card details and payment for the customer using token 
        
        Map < String, Object > cardParam = new HashMap < String, Object > ();
        cardParam.put("number","4242424242424242");
        cardParam.put("exp_month","12");
        cardParam.put("exp_year","2025");
        cardParam.put("cvc","123");
        
        Map < String, Object > tokenParam = new HashMap < String, Object > ();
        tokenParam.put("card",cardParam);
        
        Token token  = Token.create(tokenParam); 
        
        Map < String, Object > source = new HashMap < String, Object > ();
        source.put("source",token.getId());
        
        a.getSources().create(source);
        
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(token));
        
       
        
    /*    Map < String, Object > chargeParam = new HashMap < String, Object > ();
        chargeParam.put("amount","200");
        chargeParam.put("currency","usd");
        chargeParam.put("source",token.getId()); // we used tokenid instant of customer id   
        
        Charge.create(chargeParam); */
        
  /*      Map < String, Object > chargeParam = new HashMap < String, Object > ();
        chargeParam.put("amount","200");
        chargeParam.put("currency","usd");
        chargeParam.put("source",token.getId()); // we used tokenid instant of customer id   
        
        Charge.create(chargeParam); */
        
        
        
      /*  Map < String, Object > cardParam = new HashMap < String, Object > ();
        cardParam.put("number","4242424242424242");
        cardParam.put("exp_month","12");
        cardParam.put("exp_year","2023");
        cardParam.put("cvc","123");
        
        Map < String, Object > tokenParam = new HashMap < String, Object > ();
        tokenParam.put("card",cardParam);
        
        Token token  = Token.create(tokenParam); 
        
        Map < String, Object > source = new HashMap < String, Object > ();
        source.put("source",cus_EMP1l66ctBUsUn); // using  this for multiple payment to same user account 
        
        a.getSources().create(source); */
        
       
     /*   Map < String, Object > chargeParam = new HashMap < String, Object > ();
        chargeParam.put("amount","500");
        chargeParam.put("currency","usd");
        chargeParam.put("customer",a.getId()); // we can use tokenid instant of customer id but tokenid use for only one time  
        
        Charge.create(chargeParam); */
        
        
	/*	Gson gson =new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(a)); */
         
    }
    }
    
