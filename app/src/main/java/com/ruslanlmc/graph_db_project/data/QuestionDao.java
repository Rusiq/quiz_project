package com.ruslanlmc.graph_db_project.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;

/**
 * Created by Ruslan on 2019-06-14.
 */
@Dao
public interface QuestionDao {


    LiveData<Question> getQuestion();

}
