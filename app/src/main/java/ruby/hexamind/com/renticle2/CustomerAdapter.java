package ruby.hexamind.com.renticle2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerViewHolder> {

    CustomerAdapter(Context context){

    }
    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_vh, parent, false);
        return new CustomerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerViewHolder holder, int position) {
        User u = UserDataSource.getInstance().getUsers().get(position);

        holder.fname.setText(String.valueOf(u.fname));
        holder.lname.setText(String.valueOf(u.lname));
        holder.username.setText(String.valueOf(u.username));
    }

    @Override
    public int getItemCount() {
        return UserDataSource.getInstance().getUsers().size();
    }
}
