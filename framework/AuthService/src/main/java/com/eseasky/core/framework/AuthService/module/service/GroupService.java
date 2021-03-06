package com.eseasky.core.framework.AuthService.module.service;

import org.springframework.data.domain.Page;

import com.eseasky.core.framework.AuthService.protocol.dto.AddPow2GroupDTO;
import com.eseasky.core.framework.AuthService.protocol.dto.GroupGrantDTO;
import com.eseasky.core.framework.AuthService.protocol.dto.GroupSaveDTO;
import com.eseasky.core.framework.AuthService.protocol.dto.QueryGroupDTO;
import com.eseasky.core.framework.AuthService.protocol.vo.GroupQueryVO;
import com.eseasky.core.framework.AuthService.protocol.vo.GroupSaveVO;
import com.eseasky.core.starters.organization.persistence.entity.OrgUserGranted;
import com.eseasky.protocol.auth.entity.VO.UserGrantInfoVO;


public interface GroupService {

	GroupSaveVO addGroup(GroupSaveDTO groupSaveDTO);

	Page<GroupQueryVO> queryGroup(QueryGroupDTO groupQueryDTO);

	void deletePowerOfGroup(QueryGroupDTO groupUpdateDTO);

	UserGrantInfoVO grantByGroup(GroupGrantDTO groupGrantDTO);

	UserGrantInfoVO transOUGToUGIVO(OrgUserGranted orgUserGranted);

	GroupQueryVO addPowerToGroup(AddPow2GroupDTO addPow2GroupDTO);

	GroupQueryVO deletePowerGroup(AddPow2GroupDTO deleteGroupDTO);

	UserGrantInfoVO rejectByGroup(GroupGrantDTO groupGrantDTO);


}
