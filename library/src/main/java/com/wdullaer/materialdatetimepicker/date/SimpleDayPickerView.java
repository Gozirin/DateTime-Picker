
package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.util.AttributeSet;

/**
 * A DayPickerView customized for {@link SimpleMonthAdapter}
 */
public class SimpleDayPickerView extends DayPickerView {

    public SimpleDayPickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleDayPickerView(Context context, DatePickerController controller) {
        super(context, controller);
    }

    @Override
    public MonthAdapter createMonthAdapter(DatePickerController controller) {
        return new SimpleMonthAdapter(controller);
    }

}
