package com.android.toolbarapp1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder>{
    private Context mContext;
    private List<Person> PersonList;

    public PersonAdapter(Context context, List<Person> personList) {
        mContext = context;
        PersonList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View v=inflater.inflate(R.layout.list_item,parent,false);
        return new PersonViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person=PersonList.get(position);
        holder.idTextView.setText(String.valueOf(person.getId()));
        holder.nameTextView.setText(person.getName());
    }

    @Override
    public int getItemCount() {
        return PersonList.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder{
        TextView idTextView;
        TextView nameTextView;
        public PersonViewHolder(View itemView) {
            super(itemView);
            idTextView=itemView.findViewById(R.id.person_id);
            nameTextView =itemView.findViewById(R.id.name);
        }
    }
}
