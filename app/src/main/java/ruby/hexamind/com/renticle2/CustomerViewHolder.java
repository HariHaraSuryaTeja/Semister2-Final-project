package ruby.hexamind.com.renticle2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ruby.hexamind.com.renticle2.R;

public class CustomerViewHolder extends RecyclerView.ViewHolder {
    public TextView fname, lname, username;
    public CustomerViewHolder(@NonNull View itemView) {
        super(itemView);
        fname=itemView.findViewById(R.id.fname);
        lname=itemView.findViewById(R.id.lname);
        username=itemView.findViewById(R.id.username);
    }
}
