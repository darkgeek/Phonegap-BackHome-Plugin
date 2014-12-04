package edu.hdu.darkgeek.cordova.backhome;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

/**
 * A phonegap plugin to send your app to background by starting home activity.
 * Adapted from http://stackoverflow.com/questions/17826122/send-application-to-background-mode-when-back-button-is-pressed-in-phonegap
 *
 * @Author http://stackoverflow.com/users/777265/dpa99c (Original version, Thanks!)
 * @Author https://github.com/darkgeek (This version, with a bit tweeks for cordova 4.1.2)
 */ 
public class BackHome extends CordovaPlugin {

    private static final String LOG_TAG = "BackHomePlugin";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("goHome".equals(action)) {
            try {               
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                this.cordova.getActivity().startActivity(i);

            } catch (Exception e) {
                Log.e(LOG_TAG, "Exception occurred: ".concat(e.getMessage()));
                return false;
            }
            callbackContext.success();
            return true;
        }
        Log.e(LOG_TAG, "Called invalid action: "+action);
        return false;  
    }
}
