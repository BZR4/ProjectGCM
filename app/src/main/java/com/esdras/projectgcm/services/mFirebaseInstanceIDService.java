package com.esdras.projectgcm.services;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by esdras on 31/12/16.
 */

public class mFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "InstanceIDService";

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken().toString();
        Log.d(TAG,"Token: "+refreshedToken);

        sendRegistrationToServer(refreshedToken);

    }

    public void sendRegistrationToServer(String token){
        //TODO: Enviar Token ao servidor de aplicativos
    }
}
