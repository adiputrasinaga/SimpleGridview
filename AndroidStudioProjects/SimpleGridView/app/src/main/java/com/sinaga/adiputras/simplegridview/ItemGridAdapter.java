package com.sinaga.adiputras.simplegridview;

/**
 * Created by Adiputra S on 13/09/2017.
 */

public class ItemGridAdapter extends BaseAdapter {

    String[] items;
    Context context;

    public ItemGridAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = null;

        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_grid, null);
            holder.imgItem = (ImageView)view.findViewById(R.id.item_img_grid);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }
        Log.d("Item ke "+position,items[position]);
        Picasso.with(context).load(items[position]).placeholder(ContextCompat.getDrawable(context, R.drawable.placeholder))
                .into(holder.imgItem);
        return view;
    }

    static class ViewHolder{
        ImageView imgItem;
    }

}