package com.yk.custom.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferencesUtil {
	private static Editor saveEditor;
	private static SharedPreferences saveInfo;

	public SharedPreferencesUtil(Context context) {
		if (saveInfo == null && context != null) {
			saveInfo = context.getSharedPreferences("cmcc_omp",
					Context.MODE_PRIVATE);
			saveEditor = saveInfo.edit();
		}
	}

	/**
	 * 用户名
	 * 
	 * @return
	 */
	public String getUserName() {
		return saveInfo.getString("username", "****");
	}

	public void saveUserName(String userName) {
		saveEditor.putString("username", "****");
		saveEditor.commit();
	}

	/**
	 * 记住密码
	 * 
	 * @param startDate
	 */
	public void savePassWord(String str) {
		saveEditor.putString("password", str);
		saveEditor.commit();
	}

	/**
	 * 获取是否记住密码
	 * 
	 * @return
	 */
	public String getPassWord() {
		return saveInfo.getString("password", "0");
	}

	/**
	 * 记住是否是第一次，1是第一次，否则不是第一次
	 * 
	 * @param startDate
	 */
	public void saveIsFirst(String str) {
		saveEditor.putString("isfirst", str);
		saveEditor.commit();
	}

	/**
	 * 获取是否是第一次进入应用
	 * 
	 * @return
	 */
	public String getIsFirst() {
		return saveInfo.getString("isfirst", "1");
	}

	public String getString(String str) {
		return saveInfo.getString(str, "");
	}

	public void saveString(String key, String values) {
		saveEditor.putString(key, values);
		saveEditor.commit();
	}

	public String getUpdateType() {
		return saveInfo.getString("updatetype", "1");
	}

	/**
	 * 获取gps时间
	 * 
	 * @return
	 */
	public String getgpstime() {
		return saveInfo.getString("gpstime", "-1");
	}

	/**
	 * 城市名
	 * 
	 * @return
	 */
	public String getcityname() {
		return saveInfo.getString("cityname", "");
	}

	/**
	 * 经度
	 * 
	 * @return
	 */
	public String getLongitude() {
		return saveInfo.getString("gps_Longitude", "");
	}

	/**
	 * 纬度
	 * 
	 * @return
	 */
	public String getLatitude() {
		return saveInfo.getString("gps_Latitude", "");
	}

	/**
	 * 缩放等级
	 * 
	 * @return
	 */
	public String getzoonlevel() {
		return saveInfo.getString("zoom", "-1");
	}

	/**
	 * 查询gps保存的标记
	 */
	public String getgpsquerysaveflag(String ls_save) {

		return saveInfo.getString(ls_save, "0");
	}

	/**
	 * 获取用户名标记
	 * 
	 * @return
	 */
	public long getdownuserflag() {

		return saveInfo.getLong("downuser_flag", 0);
	}

	public void saveLong(String key, long values) {
		saveEditor.putLong(key, values);
		saveEditor.commit();
	}
}
