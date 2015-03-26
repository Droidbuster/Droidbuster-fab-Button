package com.Droidbuster.materialfab;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.Toast;

public class fab_btn extends ImageButton{

	public fab_btn(final Context context, AttributeSet attrs) {
		super(context, attrs);
		
		this.setOnClickListener(new  ImageButton.OnClickListener() {  
            public void onClick(View v)
                     {
            	
                  
                  
                  try{         	    			
						Intent i = new Intent();
						  AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(0.0F, 1.0F);
		                  localAlphaAnimation1.setInterpolator(new DecelerateInterpolator());
		                  localAlphaAnimation1.setDuration(500L);
		                  AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F, 0.0F);
		                  localAlphaAnimation2.setInterpolator(new AccelerateInterpolator());
		                  localAlphaAnimation2.setDuration(500L);
						i.setClassName("com.android.mms", "com.android.mms.ui.ConversationList");
						i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
						v.getContext().startActivity(i);							
  	    		}
  	    		catch(Exception ex){ 
  		            Toast.makeText(context, "Not Installed/Working.",
  		                    Toast.LENGTH_LONG).show(); 	        	    			
  	    		}	
                    }
               });
	}	
}
