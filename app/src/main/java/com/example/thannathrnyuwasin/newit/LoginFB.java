package com.example.thannathrnyuwasin.newit;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.StringTokenizer;

import es.dmoral.toasty.Toasty;

public class LoginFB extends AppCompatActivity {

        private LoginButton login_button;
        private CallbackManager callbackManager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_fb);
            FacebookSdk.sdkInitialize(this);
            callbackManager = CallbackManager.Factory.create();

            login_button = (LoginButton) findViewById(R.id.login_button);
            login_button.setReadPermissions(Arrays.asList("user_photos", "email", "public_profile"));
            login_button.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                @Override
                public void onSuccess(LoginResult loginResult) {
                    Toasty.success(LoginFB.this, "Success " + loginResult.getAccessToken().getUserId(), Toast.LENGTH_SHORT).show();
                    Bundle parameters = new Bundle();
                    parameters.putString("fields", "id,name,last_name,link,email,picture");
                    GraphRequest request = GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                        @Override
                        public void onCompleted(JSONObject jsonObject, GraphResponse graphResponse) {
                            try {
                                String str_email = jsonObject.getString("email");
                                Toasty.info(LoginFB.this, str_email, Toast.LENGTH_LONG).show();

                                /*Intent LoginFB = new Intent(com.example.thannathrnyuwasin.newit.LoginFB.this,Tabbar_main.class);
                                startActivity(LoginFB);*/

                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginFB.this);
                                builder.setTitle("Login Success");
                                builder.setMessage("การล็อกอินสำเร็จ ยินดีต้อนรับ");
                                builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){

                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fbgo = new Intent(LoginFB.this,Tabbar_main.class);
                                        startActivity(fbgo);

                                    }
                                });
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            Log.i("user", jsonObject.toString());
                        }
                    });
                    request.setParameters(parameters);
                    request.executeAsync();


                }

                @Override
                public void onCancel() {

                }

                @Override
                public void onError(FacebookException error) {

                }
            });
        }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode,resultCode,data);

    }
    }
