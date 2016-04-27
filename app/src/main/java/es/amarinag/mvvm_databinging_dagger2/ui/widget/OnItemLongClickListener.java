package es.amarinag.mvvm_databinging_dagger2.ui.widget;

import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public interface OnItemLongClickListener<T> {

  boolean onItemLongClick(@NonNull View view, T item);

}