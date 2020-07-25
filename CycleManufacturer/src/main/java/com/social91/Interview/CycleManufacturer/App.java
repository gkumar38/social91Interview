package com.social91.Interview.CycleManufacturer;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;


/**
 * Hello world!
 *
 */
public class App implements CycleCommonAttribute
{
    public static void main( String[] args )
    {
        
        
        
    }

	@Override
	public void evaluateTime() throws ParseException {
		
		String startTime = "01/01/2016";
		Date endTime = new Date();
		String end   = endTime.toString();
		SimpleDateFormat sdf = new SimpleDateFormat(startTime);
		SimpleDateFormat sdf1 = new SimpleDateFormat(end);
		Date dateObj1 = sdf.parse(startTime);
		Date dateObj2 = sdf1.parse(end);
		
		long diff = dateObj2.getMonth() - dateObj1.getMonth();
		if(diff>9) {
			startTime = end;
		}
	}

	@Override
	public double evaluatePrice() {
		ChainAssembly chain = new ChainAssembly();
		double chainPrice = chain.priceEvaluation();
        Frame fr = new Frame();
        double framePrice = fr.priceEvaluation();
        HandleBar hbr = new HandleBar();
        double handlePrice = hbr.priceEvaluation();
        Seating st = new Seating();
        double seatingPrice = st.priceEvaluation();
        Wheels wh = new Wheels();
        double wheelPrice = wh.priceEvaluation();
		double totalCost= chainPrice+framePrice+handlePrice+seatingPrice+wheelPrice;
		return totalCost;
	}
}
