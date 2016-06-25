package xyz.winthanhtike.padc_hartha.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import xyz.winthanhtike.padc_hartha.HarthaApp;
import xyz.winthanhtike.padc_hartha.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private int count = 0;
    private TextView txtBody,txtHead;
    private ImageView imgJoke;
    private Button btnNext,btnBack;
    private int[] imgArray = {R.drawable.joke_1,R.drawable.joke_2,R.drawable.joke_3};
    private String[] textHead = {"အညီအမျှ","အလျှင်မလိုပါ","တိုင်းပြည်ကို ချောက်ထဲမကျအောင် ကယ်လိုက်လို့ပါ"};
    private String[] textBody = {"နောက်တစ်နှစ်ပေါ့\n" +
            "လင်မယား ၂ ယောက်စကားများရန်ဖြစ်ရာမှကွာရှင်းပြတ်ဆဲရန်တရားရုံးတွင်စီစဉ်နေကြသည်\n" +
            "တရားသူကြီး : မင်းတို့မှာကလေး ၃ ယောက်ရှိတာဘယ်လိုခွဲမလဲ?\n" +
            "လင်မယား ၂ ယောက်တွေဝေသွားပြီးမိနစ်အနည်းငယ်ကြာစဉ်းစားကာ 'တရားသူကြီးမင်းခင်ဗျား ကျနော်တို့တစ်နှစ်တာအချိန်အတွင်းနောက်တစ်ယောက်ထပ်မွေးပြီးပြန်လာခဲ့ပါ့မယ်' ဟုပြောလိုက်သည်။\n" +
            "၉ လခန့်ကြာသော် အမြွှာပူးလေးမွေးလေသည်။",
            "ပြေးနေသော ပီတာလေး နောက်ကို ရဲသား တစ်ဦး ပြေးလိုက်နေသည်ကို၊ လမ်းထောင့်တွင်ရပ်နေသော ရဲမှုးကြီး တွေ့သဖြင့် လှမ်းမေးလိုက်သည်။ \n" +
                    "\"ဟေ့ . .ရဲသား . . မင်းဘာလို့ ဟိုကလေး နောက်ကို အတင်း ပြေးလိုက်နေရတာလဲ\"\n" +
                    "\"သူ ကျွန်တော့်ကို . . နောက် ဆယ့်ငါးမိနစ်ကြာရင် ဖင်ကို လာနမ်းလှည့်လို့ ပြောလို့ပါ ရဲမှုးကြီး\"\n" +
                    "\"နောက်ဆယ့်ငါးမိနစ်မှဆို အချိန်ရသားပဲ၊ ဘာလို့ အတင်းပြေးလိုက်နေတာလဲ\"",
            "ဆင်းရဲရာမှ အလွန်ချမ်းသာလာသော သဌေးများကို သတင်းတစ်ခုမှ အင်တာဗျူးသည်။\n" +
                    "U.S သဌေး။ ။ ကျွန်တော် နယူးယောက်ကိုစရောက်တုန်းက တော်တော်ဆင်းရဲတာဗျ။ လက်ထဲမှာ ဆင့် ၅၀ ပဲပါတာနဲ့ ပန်းသီးတစ်လုံးဝယ်တယ်။ ၁ ဒေါ်လာနဲ့ပြန်ရောင်းတယ်။ နောက်ပန်းသီးနှစ်လုံး ဝယ်တယ် ထပ်ရောင်းတယ်\n" +
                    "သတင်းထောက်။ ။ ဒီလိုနဲ့များလာတာပေါ့\n" +
                    "U.S သဌေး။ ။ မဟုတ်ဘူးဗျ ပန်းသီးရောင်းနေရင်း အဒေါ်ဆုံးသွားလို့ ဒေါ်လာတစ်သန်း အမွေရတယ်လေ\n" +
                    "---------------------------------------\n" +
                    "Russia သဌေး။ ။ ကျွန်တော်အခုနေတဲ့ စံအိမ်ကြီးက အရင်က ကျွန်တော် ဒရိုက်ဘာလုပ်ခဲ့တာပေါ့။\n" +
                    "သတင်းထောက်။ ။ အော် ဒရိုက်ဘာဘဝကနေ သဌေးဖြစ်အောင် ဘယ်လိုလုပ်ခဲ့ရလဲ။\n" +
                    "Russia သဌေး။ ။ စံအိမ်ပိုင်ရှင်သဌေးကြီးရဲ့ သမီးနဲ့ညားသွားတယ်လေ"};

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        txtBody = (TextView)view.findViewById(R.id.tv_body);
        txtHead = (TextView)view.findViewById(R.id.tv_head);
        imgJoke = (ImageView)view.findViewById(R.id.img_joke);
        btnNext = (Button)view.findViewById(R.id.btn_next);
        btnBack = (Button)view.findViewById(R.id.btn_back);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                configTextAndImage();

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count--;
                configTextAndImage();

            }
        });

        return view;
    }

    private void configTextAndImage() {

        if (count == 3){

            count = 2;
            Toast.makeText(getActivity(),"End",Toast.LENGTH_SHORT).show();

        }else if(count == -1){

            count = 0;
            Toast.makeText(getActivity(),"Start",Toast.LENGTH_SHORT).show();

        }else{

            txtHead.setText(textHead[count]);
            txtBody.setText(textBody[count]);
            imgJoke.setImageResource(imgArray[count]);

        }

    }

}
