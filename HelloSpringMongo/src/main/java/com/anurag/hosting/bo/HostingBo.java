package com.anurag.hosting.bo;

import com.anurag.seq.exception.SequenceException;

public interface HostingBo {

	void save(String name) throws SequenceException;

}