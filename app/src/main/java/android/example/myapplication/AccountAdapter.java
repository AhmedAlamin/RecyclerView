package android.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AccountAdapter extends ArrayAdapter<AccountCell> {

    public AccountAdapter(@NonNull Context context, int resource, @NonNull List<AccountCell> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list_account,parent,false);

        }

        AccountCell currentCell = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.account_name);
        nameText.setText(currentCell.getmAccountName());

        TextView emailText = (TextView) listItemView.findViewById(R.id.account_email);
        emailText.setText(currentCell.getmAccountEmail());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_at_list_item);
        imageView.setImageResource(currentCell.getmImageOfAccount());




        return listItemView;
    }
}
