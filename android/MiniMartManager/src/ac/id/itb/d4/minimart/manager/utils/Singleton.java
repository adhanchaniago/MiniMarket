package ac.id.itb.d4.minimart.manager.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Singleton {
	
	private String baseURL;
	private String username;
	private String password;
	private static Singleton singleton;
	
	public Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public String getBaseURL(){
		return baseURL;
	}
	
	public void setBaseURL(String url){
		this.baseURL = url;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String pwd){
		this.password = pwd;
	}
	
	public String getDefaultPreferences(Context activity, String key) {
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(activity);
		String result = sharedPreferences.getString(key, null);
		return result;
	}
	
	public String getStringPreferences(Context ctx, String key) {
		SharedPreferences sharedPreferences = ctx.getSharedPreferences("SESSION", 0);
		String result = sharedPreferences.getString(key, null);
		return result;
	}
	
}
