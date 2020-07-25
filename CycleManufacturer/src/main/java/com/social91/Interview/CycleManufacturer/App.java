package com.social91.Interview.CycleManufacturer;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



public class App implements CycleCommonAttribute
{
    public static void main( String[] args ) throws ParseException
    {
    	 App ap = new App();
    	 BlockingQueue<EvaluateCost> queue = new ArrayBlockingQueue<>(1000);
    	 ChainAssembly chainAssembly = new ChainAssembly(queue);
    	 Wheels wheels = new Wheels(queue);
    	 Seating seat = new Seating(queue);
    	 Frame frame = new Frame(queue);
    	 HandleBar hbr = new HandleBar(queue);
    	 new Thread((Runnable) frame).start();
         new Thread((Runnable) seat).start();
         new Thread((Runnable) wheels).start();
         new Thread((Runnable) chainAssembly).start();
         new Thread((Runnable) hbr).start();
         long diff = ap.evaluateTime();
         if(diff>9) {
        	 System.out.println(ap.evaluatePrice());
         }
    }

	@Override
	public long evaluateTime() throws ParseException {
		
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
		return diff;
	}

	@Override
	public double evaluatePrice() {
		ChainAssembly chain = null;
		@SuppressWarnings("null")
		double chainPrice = chain.priceEvaluation();
        Frame fr = null;
        @SuppressWarnings("null")
		double framePrice = fr.priceEvaluation();
        HandleBar hbr = null;
        @SuppressWarnings("null")
		double handlePrice = hbr.priceEvaluation();
        Seating st = null;
        @SuppressWarnings("null")
		double seatingPrice = st.priceEvaluation();
        Wheels wh = null;
        @SuppressWarnings("null")
		double wheelPrice = wh.priceEvaluation();
		double totalCost= chainPrice+framePrice+handlePrice+seatingPrice+wheelPrice;
		return totalCost;
	}
}
