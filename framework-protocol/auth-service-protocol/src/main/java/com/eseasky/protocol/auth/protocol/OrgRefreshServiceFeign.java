package com.eseasky.protocol.auth.protocol;

import com.eseasky.core.starters.feign.wrapper.config.Feign;
import com.eseasky.global.entity.ResultModel;
import com.eseasky.protocol.auth.entity.DTO.OrgRefreshDTO;
import com.eseasky.protocol.auth.entity.VO.OrgSaveVO;
import feign.Headers;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author admin_z by 2019/12/25
 * @ClassName OrgRefreshServiceFeign
 */
@Feign(serviceName = "AppService")
public interface OrgRefreshServiceFeign {

//    @RequestLine("POST /refreshOrg")
    @RequestMapping(value="/refreshOrg",method= RequestMethod.POST,consumes = "application/json")
    @Headers({"Content-Type: application/json","Accept: application/json"})
    public ResultModel<OrgSaveVO> orgRefresh(@RequestBody OrgRefreshDTO orgRefreshDTO);
}
