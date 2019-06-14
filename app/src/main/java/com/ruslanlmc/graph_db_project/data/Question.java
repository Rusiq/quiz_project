package com.ruslanlmc.graph_db_project.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import static com.ruslanlmc.graph_db_project.data.DataQuestionNames.COL_ID;
import static com.ruslanlmc.graph_db_project.data.DataQuestionNames.COL_VALUE;
import static com.ruslanlmc.graph_db_project.data.DataQuestionNames.TABLE_NAME;

/**
 * Created by Ruslan on 2019-06-14.
 */
@Entity(tableName = TABLE_NAME)
public class Question {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = COL_ID)
    private final String mId;

    @NonNull
    @ColumnInfo(name = COL_VALUE)
    private final String mValue;

    public Question(@NonNull String mId, @NonNull String mValue) {
        this.mId = mId;
        this.mValue = mValue;
    }

    @NonNull
    public String getmId() {
        return mId;
    }

    @NonNull
    public String getmValue() {
        return mValue;
    }
}
