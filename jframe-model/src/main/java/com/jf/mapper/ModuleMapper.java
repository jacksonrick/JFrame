package com.jf.mapper;

import com.jf.entity.BaseVo;
import com.jf.model.Module;

import java.util.List;

/**
 * ModuleMapper Interface
 * @author rick
 * @version
 */
public interface ModuleMapper {

	List<Module> findByCondition(BaseVo baseVo);

	int update(Module bean);

	int insert(Module bean);

}
