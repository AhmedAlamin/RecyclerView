package android.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AccountCell> accountCells = new ArrayList<AccountCell>();

        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));
        accountCells.add(new AccountCell("Ahmed Mohamed","Engahmedegypto@gmail.com",R.drawable.donut));
        accountCells.add(new AccountCell("Mohamed Ali","MohamedAli@gmail.com",R.drawable.kitkat));

        AccountAdapter accountAdapter = new AccountAdapter(this,0,accountCells);

        ListView listView = (ListView)findViewById(R.id.main_List_of_accounts);
        listView.setAdapter(accountAdapter);












    }
}