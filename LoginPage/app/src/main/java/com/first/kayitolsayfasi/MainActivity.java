package com.first.kayitolsayfasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText edtAd, edtSoyad, edtSehir, edtYas;
    private CheckBox checkProgramlama, checkSpor, checkOyun;
    private RadioButton radioE, radioK;
    private Button btnKayit;

    private String edtSAd, edtSSoyad, edtSSehir, edtSYas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAd = (EditText) findViewById(R.id.editTxtAd);
        edtSoyad = (EditText) findViewById(R.id.editTxtSoyad);
        edtSehir = (EditText) findViewById(R.id.editTxtSehir);
        edtYas = (EditText) findViewById(R.id.editTxtYas);

        checkProgramlama = (CheckBox) findViewById(R.id.checkBoxProgramlama);
        checkSpor = (CheckBox) findViewById(R.id.checkBoxSpor);
        checkOyun = (CheckBox) findViewById(R.id.checkBoxOyun);

        radioE = (RadioButton) findViewById(R.id.radioBtnE);
        radioK = (RadioButton) findViewById(R.id.radioBtnK);

    }

    public void btnKayitOl(View v) {
        edtSAd = edtAd.getText().toString();
        edtSSoyad = edtSoyad.getText().toString();
        edtSSehir = edtSehir.getText().toString();
        edtSYas = edtYas.getText().toString();

        if (!TextUtils.isEmpty(edtSAd) && !TextUtils.isEmpty(edtSSoyad) && !TextUtils.isEmpty(edtSSehir) && !TextUtils.isEmpty(edtSYas)) {
            System.out.println("*------ Bilgileriniz ------*");
            System.out.println("Adınız: " + edtSAd);
            System.out.println("Soyadınız: " + edtSSoyad);
            System.out.println("Şehir: " + edtSSehir);
            System.out.println("Yaş: " + edtSYas);

            System.out.println("------ Hobileriniz ------");
            if (checkProgramlama.isChecked())
                System.out.println(checkProgramlama.getText().toString());
            if (checkSpor.isChecked())
                System.out.println(checkSpor.getText().toString());
            if (checkOyun.isChecked())
                System.out.println(checkOyun.getText().toString());


            if (radioE.isChecked())
                System.out.println("Cinsiyetiniz: " + radioE.getText().toString());
            if (radioK.isChecked())
                System.out.println("Cinsiyetiniz: " + radioK.getText().toString());
        } else
            System.out.println("Girilen BilgilerBoş Olamaz.");
    }
}