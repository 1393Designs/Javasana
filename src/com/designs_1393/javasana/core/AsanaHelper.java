package com.designs_1393.javasana.core;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.Header;

import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.client.ResponseHandler;
import org.apache.http.impl.client.BasicResponseHandler;

import java.net.URLEncoder;

public class AsanaHelper
{
	private UsernamePasswordCredentials creds;
	private DefaultHttpClient httpclient = new DefaultHttpClient();

	private final String API_BASE = "https://app.asana.com/api/1.0/";

	public AsanaHelper( String APIkey )
	{
		creds = new UsernamePasswordCredentials(APIkey, "");
	}

	public String getWorkspaces()
	{
		try{
			HttpGet httpget = new HttpGet(API_BASE +"workspaces");
			httpget.addHeader( BasicScheme.authenticate(creds, "US-ASCII", false) );

			ResponseHandler<String> responseHandler = new BasicResponseHandler();

			String responseBody = httpclient.execute(httpget, responseHandler);
			return responseBody;
		} catch( Exception e ){ e.printStackTrace(); }

		return "";
	}
}
