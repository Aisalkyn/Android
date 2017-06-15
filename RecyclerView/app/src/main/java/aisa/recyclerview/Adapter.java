package aisa.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by admin on 6/7/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerViewHolder>
{

    public Adapter() {
        //this.records = records;
    }


    @Override// для Layouts
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell, viewGroup, false);
        return new RecyclerViewHolder(v);
    }

    /**
     * Заполнение виджетов View данными из элемента списка с номером i
     */
    @Override
    public void onBindViewHolder(RecyclerViewHolder viewHolder, int i) {
        viewHolder.textView.setText("hello");
        viewHolder.img.setImageResource(R.mipmap.ic_launcher_round);
    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        ImageView img;
        TextView textView;

        public RecyclerViewHolder(View view){
            super(view);
            textView = (TextView)  view.findViewById(R.id.textView);

        }
    }
}
