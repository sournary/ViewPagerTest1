package com.example.sournary.viewpagertest1;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sournary on 03/07/2017.
 */

public class MainViewPagerAdapter extends PagerAdapter {

    private int[] pagers = {1, 2, 3, 4, 5};

    @Override
    public int getCount() {
        return pagers.length;
    }

    /**
     * Xác định xem pager View có liên kết với object hay ko.
     * trả về bởi instantiateItem(ViewGroup, int)
     *
     * @param view:   Page View để kiểm tra sự liên kết với object
     * @param object: Object để kiểm tra sự liên kết với view
     * @return: true nếu view liên kết với đói tượng object.
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    /**
     * Create the page for the given position.
     * The adapter is responsible for adding the view to the container given here,
     * although it only must ensure this is done by the time it returns from finishUpdate(ViewGroup).
     *
     * @param container: The containing View in which the page will be shown.
     * @param position:  The page position to be instantiated.
     * @return: Returns an Object representing the new page.
     * This does not need to be a View, but can be some other container of the page.
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_view_pager, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_number_page);
        String p = pagers[position] + "";
        textView.setText(p);

        container.addView(view);
        return view;
    }

    /**
     * Called when the host view is attempting to determine if an item's position has changed.
     * Returns POSITION_UNCHANGED if the position of the given item has not changed or
     * POSITION_NONE if the item is no longer present in the adapter.
     * The default implementation assumes that items will never change position and always returns POSITION_UNCHANGED.
     *
     * @param object: Object representing an item, previously returned by a call to instantiateItem(View, int).
     * @return: object's new position index from [0, getCount()), POSITION_UNCHANGED if the object's position has not changed,
     * or POSITION_NONE if the item is no longer present.
     */
    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    /**
     * Remove a page for the given position. The adapter is responsible for removing the view from its container,
     * although it only must ensure this is done by the time it returns from finishUpdate(ViewGroup).
     *
     * @param container: The containing View from which the page will be removed.
     * @param position:  The page position to be removed.
     * @param object:    The same object that was returned by instantiateItem(View, int).
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
