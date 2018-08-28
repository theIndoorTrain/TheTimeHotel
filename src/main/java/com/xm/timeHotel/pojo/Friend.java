package com.xm.timeHotel.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 好友
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Friend extends Model<Friend> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 好友id
     */
    private Integer uid;
    /**
     * 分组id
     */
    private Integer gid;
    /**
     * 状态
     */
    private Integer status;
    
    @TableField(exist=false)
    private User user;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
