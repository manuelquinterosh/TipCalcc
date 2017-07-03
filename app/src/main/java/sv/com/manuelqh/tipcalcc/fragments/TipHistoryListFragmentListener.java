package sv.com.manuelqh.tipcalcc.fragments;

import sv.com.manuelqh.tipcalcc.models.TipRecord;

/**
 * Created by postgres on 18/2/2017.
 */

public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
