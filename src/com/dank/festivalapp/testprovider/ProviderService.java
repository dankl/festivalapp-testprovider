package com.dank.festivalapp.testprovider;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.util.Log;

import com.dank.festivalapp.lib.Band;
import com.dank.festivalapp.lib.News;
import com.dank.festivalapp.lib.ProviderServiceBase;

public class ProviderService extends ProviderServiceBase {
	
	public ProviderService() 
	{
		super();
		Log.i("ProviderService", "start TestProvider");
	}

	@Override
	protected String getFestivalName() 
	{
		Resources res = getResources();		
		return res.getString(R.string.app_name);
	}

	/**
	 * download the band index page and parse urls, urls are temporary stored in band description.
	 * @param page
	 */
	@Override
	protected List<Band> getBands() {
		
		List<Band> bands = new ArrayList<Band>();

		bands.add( new Band("BAND 1", "Description 1") );
		bands.add( new Band("BAND 2", "Description 2") );
		bands.add( new Band("BAND 3", "Description 3") );
		bands.add( new Band("BAND 4", "Description 4") );
		bands.add( new Band("BAND 5", "Description 5") );
		bands.add( new Band("BAND 6", "Description 6") );
		
		return bands;
	}
		
	/**
	 * returns a list of all current News for this festival
	 * @return
	 */
	@Override
	protected List<News> getNewsShort() 
	{		
		List<News> newsList = new ArrayList<News>();
		newsList.add( new News( "News 1", "complete News 1") );
		newsList.add( new News( "News 2", "complete News 2") );
		newsList.add( new News( "News 3", "complete News 3") );
		newsList.add( new News( "News 4", "complete News 4") );
		newsList.add( new News( "News 5", "complete News 5") );
		newsList.add( new News( "News 6", "complete News 6") );
		newsList.add( new News( "News 7", "complete News 7") );
		newsList.add( new News( "News 8", "complete News 8") );
				
		return newsList;
	}		
	
	@Override
	protected List<BandGigTime> getRunningOrder() {
		return null;
	}

	
}
