package commentme.hk.com.elntern.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Edgar on 28.02.2018.
 */

public class ToastUtils {
    public static void showToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
