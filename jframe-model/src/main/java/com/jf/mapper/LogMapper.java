package com.jf.mapper;

import com.jf.entity.BaseVo;
import com.jf.model.Log;

import java.util.List;
import java.util.Map;

/**
 * LogMapper Interface
 * @date 2016年08月29日 上午 11:15:12
 * @author jfxu
 */
public interface LogMapper {

	List<Log> findByCondition(BaseVo baseVo);

	int findCountAll();

	List<Map<String, Object>> findOldLog(Integer monthAgo);

	int insert(Log bean);

	int deleteOldLog(Integer monthAgo);

}