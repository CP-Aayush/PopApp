package com.example.popapp.code_redeem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.popapp.R;

public class Redeem extends AppCompatActivity {

    TextView tnc,howToRedeem,createLogin,termsNConditions,tncDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);



//        String codeName = "New50\n";
//        String getCashback= "Get 50% cashback upto Rs. 100 on your first regular service \n";
//        String tnc= "T&Cs Apply* \n";
//        String howToRedeem = "How to Redeem ? \n";
//        String createLogin = "Create/Login to your Mekvahan account. Select the service want to avail, Payment and choose your service Type in the transaction amount, in the next step use promo code NEW50 on App, complete the transaction to avail the cashback  \n";
//        String termsNConditions = "Terms and Conditions";
//        String tncDetails = "Valid on successful Service/Bill Payments done till 31th October 2019. Applicable for New users only. No minimum transaction only Valid only Once per New User/Credit/Debit Card/Mobile Number. Cashback will be credited to your Mekcoins Wallet which can be redeemed within 365 days from the date of credit and is non transferable Not Valid for Add Cash Transactions and transactions done via Mekvahan Balance Offer is not applicable on virtual/prepaid/temporary/international cards NEW50 Promo Code has to be applied to avail cashback offer. We reserve the right to end/modify any or all offers at our discretion without any prior notice. For all other queries please email support@mekvahan.com . We reserve the right to restrict cashback for any account with suspicious behavior or invalid details/credentials. Mekvahan has the right to ask for documents to prove his/her identity for any account.";

    }
    public void showPopup(View view) {

        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        LayoutInflater layoutInflater = getLayoutInflater();
        View dialogView = layoutInflater.inflate(R.layout.popup, null);
        alertDialog.setView(dialogView);
        alertDialog.setCancelable(true);

        dialogView.findViewById(R.id.ok_button)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

        alertDialog.show();
    }
}
