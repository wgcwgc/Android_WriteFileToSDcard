package com.lanchuang.wgc.writefiletosdcard.util;

import android.content.Context;
import android.widget.Toast;

/**
 * ������
 * 
 */
public class MyUtil
{
	/**
	 * ʹ��Toast��ʾ��ʾ��Ϣ
	 * 
	 * @param context
	 * @param text
	 */
	public static void showMsg(Context context , String text )
	{
		Toast.makeText(context ,text ,Toast.LENGTH_SHORT).show();
	}
}
