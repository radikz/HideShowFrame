package id.radikz.buttontab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.nex3z.togglebuttongroup.SingleSelectToggleGroup;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameApv;
    FrameLayout frameCrane;
    FrameLayout frameTrailer;

    SingleSelectToggleGroup selectModa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameApv = findViewById(R.id.frame_apv);
        frameCrane  = findViewById(R.id.frame_crane);
        frameTrailer  = findViewById(R.id.frame_trailer);

        selectModa  = findViewById(R.id.group_single_radiobutton);


        selectModa.setOnCheckedChangeListener(new SingleSelectToggleGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SingleSelectToggleGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.choice_apv :

                        frameApv.setVisibility(View.VISIBLE);
                        frameCrane.setVisibility(GONE);
                        frameTrailer.setVisibility(GONE);

                        break;

                    case R.id.choice_crane :

                        //hide and show frame layout
                        frameApv.setVisibility(GONE);
                        frameCrane.setVisibility(View.VISIBLE);
                        frameTrailer.setVisibility(GONE);

                        break;

                    case R.id.choice_trailer :

                        frameApv.setVisibility(GONE);
                        frameCrane.setVisibility(GONE);
                        frameTrailer.setVisibility(View.VISIBLE);

                        break;
                }
            }
        });
    }
}

