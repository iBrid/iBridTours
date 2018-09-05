package com.example.android.ibridtours;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(Activity context, ArrayList<Content> contents) {
        super(context, 0, contents);
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Content currentContent = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.text_view);
        nameTextView.setText(currentContent.getName());

        TextView detailTextView = listItemView.findViewById(R.id.text_view2);
        detailTextView.setText(currentContent.getDetails());

        ImageView iconView = listItemView.findViewById(R.id.image);
        if (currentContent.imageAvailable()) {
            iconView.setImageResource(currentContent.getImages());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
