package com.ruslanlmc.graph_db_project.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import static com.ruslanlmc.graph_db_project.data.DataAnswerNames.COL_NEXT;
import static com.ruslanlmc.graph_db_project.data.DataAnswerNames.COL_VALUE;
import static com.ruslanlmc.graph_db_project.data.DataAnswerNames.TABLE_NAME;

/**
 * Created by Ruslan on 2019-06-14.
 */
@Entity(tableName = TABLE_NAME)
public class Answer {

    @NonNull
    @ColumnInfo(name = COL_VALUE)
    private final String mValue;

    @NonNull
    @ColumnInfo(name = COL_NEXT)
    private final int mNext;

    public Answer(@NonNull String mValue, int mNext) {
        this.mValue = mValue;
        this.mNext = mNext;
    }

    @NonNull
    public String getmValue() {
        return mValue;
    }

    public int getmNext() {
        return mNext;
    }
}
