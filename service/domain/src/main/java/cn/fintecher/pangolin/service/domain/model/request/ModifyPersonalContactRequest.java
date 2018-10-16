package cn.fintecher.pangolin.service.domain.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author : huyanmin
 * @Description : 修改联系人
 * @Date : 2018/9/27.
 */
@Data
public class ModifyPersonalContactRequest {

    @ApiModelProperty(notes = "联系人id")
    private String id;

    @ApiModelProperty(notes = "电话id")
    private String personalPerId;

    @ApiModelProperty(notes = "联系人姓名")
    private String name;

    @ApiModelProperty(notes = "身份证号码")
    private String certificateNo;

    @ApiModelProperty(notes = "关系")
    private String relation;

    @ApiModelProperty(notes = "电话类型")
    private String phoneType;

    @ApiModelProperty(notes = "电话号码")
    private String phoneNo;

    @ApiModelProperty(notes = "备注")
    private String remark;
}
