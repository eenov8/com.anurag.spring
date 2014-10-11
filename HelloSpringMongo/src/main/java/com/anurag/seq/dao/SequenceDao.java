package com.anurag.seq.dao;

import com.anurag.seq.exception.SequenceException;

public interface SequenceDao {

	long getNextSequenceId(String key) throws SequenceException;

}