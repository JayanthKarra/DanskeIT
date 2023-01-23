package com.ds.behavior.state;
public class Delivered implements PackageState
{
	   //Singleton
    private static Delivered instance = new Delivered();
			
    public static Delivered instance () {
        return instance;
    }
		
	private  Delivered() {	}	

	@Override
	public void updateState(DeliveryContext ctx) {	
	}
}
