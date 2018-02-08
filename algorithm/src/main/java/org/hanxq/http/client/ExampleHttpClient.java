package org.hanxq.http.client;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ExampleHttpClient {
	
	/**
	 * closeableHttpClient demo
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static void  closeableHttpClient() throws ClientProtocolException, IOException{
		// CloseableHttpClient
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpget = new HttpGet("http://httpbin.org/");
		// 执行了方法
		System.out.println("Executing request " + httpget.getRequestLine());
		
		ResponseHandler<String> reshandle = new ResponseHandler<String>() {
			
			@Override
			public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
				// 状态码
				int status = response.getStatusLine().getStatusCode();
				if (status >= 200 && status < 300) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) : null;
				} 
				return null;
			}
		};
		
		// execute
		String responseBody = httpClient.execute(httpget,reshandle);
		System.out.println("----------------------------------------");
        System.out.println(responseBody);
        httpClient.close();
	} 
	
	
	public static void main(String[] args) throws Exception {
		closeableHttpClient();
	}

}
