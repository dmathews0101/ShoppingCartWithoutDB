package com.shoppingcart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listviewAdapter extends BaseAdapter {
    Context context;
    ArrayList<ShoppingCart> al_scitems;

    public listviewAdapter(Context context, ArrayList<ShoppingCart> al_scitems){
        this.context = context;
        this.al_scitems = al_scitems;
    }

    @Override
    public int getCount() {
        return al_scitems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.listview_layout,parent,false);
            viewHolder.tv_itemname = (TextView) convertView.findViewById(R.id.nameofitem);
            viewHolder.tv_price = (TextView) convertView.findViewById(R.id.priceofitem);
            viewHolder.tv_quantity = (TextView) convertView.findViewById(R.id.quantity);
            viewHolder.btn_additem = (Button) convertView.findViewById(R.id.addQuantity);
            viewHolder.btn_subtractitem = (Button) convertView.findViewById(R.id.subtractQuantity);
            viewHolder.iv_itemimage = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.tv_itemname.setText(al_scitems.get(position).getItem_name());
        viewHolder.tv_price.setText(al_scitems.get(position).getItem_price());
        viewHolder.tv_quantity.setText(al_scitems.get(position).getItem_quantity());
        viewHolder.iv_itemimage.setImageResource(al_scitems.get(position).getItem_image());

        return convertView;
    }

    private static class ViewHolder{
        TextView tv_itemname;
        TextView tv_price;
        TextView tv_quantity;
        Button btn_additem;
        Button btn_subtractitem;
        ImageView iv_itemimage;
    }
}
